package com.example.Day14;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

/**
 * Created by Administrator on 13-8-7.
 */
public class ProcessBar1 extends Activity {

    private Button b1;
    private Button b2;
    private Button b3;
    private Button b4;
    private ProgressBar pb = null;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.processbar);
//        showDialog(0);

        b1 = (Button) findViewById(R.id.show);
        b2 = (Button) findViewById(R.id.hide);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setProgressBarIndeterminateVisibility(true);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setProgressBarIndeterminateVisibility(false);
            }
        });

        pb = (ProgressBar)findViewById(R.id.pb);
        b3 = (Button)findViewById(R.id.b3);
        b4 = (Button)findViewById(R.id.b4);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pb.incrementProgressBy(10);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pb.incrementProgressBy(-10);
            }
        });



    }


//    protected Dialog onCreateDialog(int id) {
//        ProgressDialog dialog = new ProgressDialog(this);
//        dialog.setTitle("进度条对话框");
//        dialog.setIndeterminate(true);
//        dialog.setMessage("程序正在加载请稍后");
//        dialog.setCancelable(true);
//        return dialog;
//    }

}