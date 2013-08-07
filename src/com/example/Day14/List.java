package com.example.Day14;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Administrator on 13-8-7.
 */
public class List extends Activity {

    private ListView listView;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        listView = (ListView) findViewById(R.id.list);
        String[] list = {"Java","C++","Oracle","SQL"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,list);

        listView.setAdapter(adapter);

    }
}