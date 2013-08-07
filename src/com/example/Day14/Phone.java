package com.example.Day14;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Administrator on 13-8-7.
 */
public class Phone extends Activity {

    private EditText number;
    private Button button;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.phone);
        init();
        setCall();
    }

    private void init(){

        number = (EditText) findViewById(R.id.number);
        button = (Button) findViewById(R.id.phone);
    }

    private void setCall(){
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_CALL);
                Uri data = Uri.parse("tel:" + number.getText().toString());
                intent.setData(data);
                startActivity(intent);
            }
        });
    }
}