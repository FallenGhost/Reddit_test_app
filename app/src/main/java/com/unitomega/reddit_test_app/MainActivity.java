package com.unitomega.reddit_test_app;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;


import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG_POSTS = "children";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Thread thread = new Thread(new Runnable() {

            @Override
            public void run() {
                try  {
                    init();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        thread.start();
    }


    private void init(){

        JSONArray children;
        JSON_parser jParser = new JSON_parser();
        JSONObject json = jParser.getJSONFromUrl(URLS.BASE_URL);
            try {
                children = json.getJSONArray("children");
                final ArrayList<Post> posts = new ArrayList<>();
                for(int i = 0; i < children.length(); i++){
                    JSONObject c = children.getJSONObject(i);

                    posts.add(new Post(
                            c.getString("title"),
                            c.getString("author"),
                            c.getString("date_updated"),
                            c.getString("thumbnail"),
                            c.getString("id"),
                            c.getString("score"),
                            c.getString("num_comments"),
                            c.getString("permalink")
                    ));
                }

                ListView listView = (ListView) findViewById(R.id.listView);
                Post_adapter customListAdapter = new Post_adapter(MainActivity.this, R.layout.card_layout_main, posts);
                listView.setAdapter(customListAdapter);

                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String postURL = posts.get(position).getPermalink();
                        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.reddit.com" + postURL));
                        startActivity(browserIntent);
                    }
                });
            } catch (JSONException e) {
                    e.printStackTrace();
                }

    }
}
