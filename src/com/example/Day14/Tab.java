package com.example.Day14;

import android.app.Activity;
import android.app.TabActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TabHost;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 13-8-7.
 */
public class Tab extends TabActivity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TabHost th = getTabHost();
        LayoutInflater lif  = LayoutInflater.from(this);
        lif.inflate(R.layout.tab,th.getTabContentView(),true);
        th.addTab(th.newTabSpec("all").setIndicator("所有通话记录").setContent(R.id.all));
        th.addTab(th.newTabSpec("ok").setIndicator("已接来电").setContent(R.id.ok));
        th.addTab(th.newTabSpec("cancel").setIndicator("未接来电").setContent(R.id.cancel));
    }
}

