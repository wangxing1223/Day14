package com.example.Day14;

import android.app.Activity;
import android.app.TabActivity;
import android.os.Bundle;
import android.widget.Toast;

/**
 * Created by Administrator on 13-8-7.
 */
public class Two extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.two);
        Toast .makeText(this,getIntent().getAction(),Toast.LENGTH_LONG).show();
    }
}