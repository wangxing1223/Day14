package com.example.Day14;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Administrator on 13-8-7.
 */
public class Action extends Activity {

    private Button button;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.action);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent intent = new Intent(Action.this,Two.class);
                Intent intent = new Intent();
                intent.setAction("Action");
                startActivity(intent);
            }
        });

    }
}