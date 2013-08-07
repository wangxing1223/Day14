package com.example.Day14;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */

    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        init();
        setOne();
        setTwo();
        setAction();
        setPhone();
        setCall();
        setTab();
        setProcessbar1();
        setList();
        setData();
    }

    private void init(){
        button1 = (Button) findViewById(R.id.one);
        button2 = (Button) findViewById(R.id.two);
        button3 = (Button) findViewById(R.id.action);
        button4 = (Button) findViewById(R.id.phone);
        button5 = (Button) findViewById(R.id.Call);
        button6 = (Button) findViewById(R.id.tab);
        button7 = (Button) findViewById(R.id.processbar);
        button8 = (Button) findViewById(R.id.list);
        button9 = (Button) findViewById(R.id.data);
    }

    private void setProcessbar1() {
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent  intent = new Intent(MyActivity.this,ProcessBar1.class);
                startActivity(intent);
            }
        });

    }
    private void setList() {
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent  intent = new Intent(MyActivity.this,List.class);
                startActivity(intent);
            }
        });

    }
    private void setData() {
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent  intent = new Intent(MyActivity.this,Data.class);
                startActivity(intent);
            }
        });

    }

    private void setCall() {

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent  intent = new Intent(MyActivity.this,Phone.class);
                startActivity(intent);
            }
        });

    }

    private void setTab() {
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent  intent = new Intent(MyActivity.this,Tab1.class);
                startActivity(intent);
            }
        });

    }
    private void setOne() {
        init();
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent  intent = new Intent(MyActivity.this,one.class);
                startActivity(intent);
            }
        });
    }
    private void setPhone() {
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent  intent = new Intent();
                intent.setAction(Intent.ACTION_GET_CONTENT);
                intent.setType("vnd.android.cursor.item/phone");
                startActivity(intent);
            }
        });

    }
    private void setTwo() {
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent  intent = new Intent(MyActivity.this,Two.class);
                startActivity(intent);
        };

    });
    }
    private void setAction() {
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent  intent = new Intent(MyActivity.this,Action.class);
                startActivity(intent);
            }
        });

    }
}
