package com.linfeng.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by zmy on 2017/6/12.
 */
public class DisplayMessageActivity extends Activity{
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        Intent intent=getIntent();
        String message=intent.getStringExtra("EXTRA_MESSAGE");
        TextView textView=(TextView)findViewById(R.id.show_message);
        textView.setText(message);
    }
}
