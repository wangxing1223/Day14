package com.example.Day14;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;

/**
 * Created by Administrator on 13-8-7.
 */
public class one extends Activity {

    private AutoCompleteTextView autoCompleteTextView;
//    private EditText editText;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.one);

        autoCompleteTextView = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView);
//        editText = (EditText) findViewById(R.id.editText);

        String[] list = {"Android 开发" ,"Android 手机","Android Market","Android SDK"};

        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,list);
        autoCompleteTextView.setAdapter(adapter);


    }
}