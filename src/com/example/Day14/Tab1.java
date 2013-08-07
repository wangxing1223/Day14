package com.example.Day14;

import android.app.Activity;
import android.app.TabActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TabHost;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 13-8-7.
 */
public class Tab1 extends TabActivity implements TabHost.TabContentFactory{
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TabHost th = getTabHost();
        th.addTab(th.newTabSpec("all").setIndicator("所有通话记录").setContent(this));
        th.addTab(th.newTabSpec("ok").setIndicator("已接来电").setContent(this));
        th.addTab(th.newTabSpec("cancel").setIndicator("未接来电").setContent(this));
    }

    @Override
    public View createTabContent(String tag) {
        ListView listView = new ListView(this);
        List<String> list = new ArrayList<String>();
        list.add(tag);
        if(tag.equals("all")){
            list.add("Zhangsan");
            list.add("Lisi");
            list.add("Wangwu");
            list.add("Zhaoliu");
        }else if(tag.equals("ok")){
            list.add("Lisi");
            list.add("Wangwu");
            list.add("Zhaoliu");
        }
        else if(tag.equals("cancel")){
            list.add("Zhangsan");
        }
        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_checked,list);
        listView.setAdapter(adapter);
        return listView;
    }
}