package com.example.Day14;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

/**
 * Created by Administrator on 13-8-7.
 */
public class Data extends Activity {

    private TextView tv1,tv2;
    private Button b1,b2;
    private int year,month,today,hour,minute;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.data);
        setinit();
        Calendar c = Calendar.getInstance();
        year = c.get(Calendar.YEAR);
        month = c.get(Calendar.MONTH)+1;
        today = c.get(Calendar.DATE);
        hour = c.get(Calendar.HOUR);
        minute = c.get(Calendar.MINUTE);
        tv1.setText("现在的日期是：" + year + "年" + month + "月" + today + "日");
        tv2.setText("现在的时间是：" + hour + "时" + minute + "分" );

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog(0);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog(1);
            }
        });
    }


    protected Dialog onCreateDialog(int id) {
        if(id==0){
            return new DatePickerDialog(this,new DatePickerDialog.OnDateSetListener(){
                public void onDateSet(DatePicker arg0, int arg1, int arg2,
                                      int arg3) {
                    year = arg1;
                    month = arg2;
                    today = arg3;
                    tv1.setText("现在的日期是："+year+"年 "+month+"月"+today+"日");
                }},year,month,today
        );
        }
        else{
            return new TimePickerDialog(this,new TimePickerDialog.OnTimeSetListener(){
                public void onTimeSet(TimePicker view, int hourOfDay, int minuteNow) {
                    hour = hourOfDay;
                    minute = minuteNow;
                    tv2.setText("现在的时间是："+hour+"时"+minute+"分");
                }},hour,minute,false);
        }

    }


    private void setinit() {

        b1 = (Button) findViewById(R.id.data1);
        b2 = (Button) findViewById(R.id.time2);
        tv1 = (TextView) findViewById(R.id.data);
        tv2 = (TextView) findViewById(R.id.time);
    }


}