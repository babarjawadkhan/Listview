package com.example.babarkhan.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listitems = (ListView) findViewById(R.id.list_items);

        final String[] items = new String[] {"babar","jawad","jawad","jawad","jawad","jawad",
                "jawad","jawad","jawad","jawad","jawad","jawad","jawad","jawad"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,items);

        listitems.setAdapter(adapter);
        listitems.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(MainActivity.this,items[position],Toast.LENGTH_SHORT).show();
            }
        });



    }
}
