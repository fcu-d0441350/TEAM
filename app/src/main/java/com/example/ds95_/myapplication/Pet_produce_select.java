package com.example.ds95_.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Pet_produce_select extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pet_produce_select);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Button btn1=(Button)findViewById(R.id.button3);
        Button btn2=(Button)findViewById(R.id.button4);
        btn1.setOnClickListener(p1);
        btn2.setOnClickListener(p2);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
    private View.OnClickListener p1=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Uri uri =Uri.parse("https://www.google.com.tw/search?q=%E5%AF%B5%E7%89%A9%E5%9C%96%E6%A1%88%E8%83%B8%E7%AB%A0&rlz=1C1CHZL_zh-TWTW743TW743&oq=%E5%AF%B5%E7%89%A9&aqs=chrome.2.69i59l3j69i57j0l2.6075j0j7&sourceid=chrome&ie=UTF-8");
            Intent intent=new Intent();
            intent.setAction(Intent.ACTION_VIEW);
            intent.setData(uri);
            startActivity(intent);
        }
    };
    private View.OnClickListener p2=new View.OnClickListener() {
        @Override
        public void onClick(View v) {

        }
    };
}
