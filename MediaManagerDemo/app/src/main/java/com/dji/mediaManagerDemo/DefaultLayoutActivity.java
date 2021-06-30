package com.dji.mediaManagerDemo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import dji.common.airlink.PhysicalSource;
import dji.common.product.Model;

public class DefaultLayoutActivity extends AppCompatActivity implements View.OnClickListener{

    private Button mMediaManagerBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_default_layout);
        mMediaManagerBtn = (Button)findViewById(R.id.btn_mediaManager);
        mMediaManagerBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_mediaManager) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
    }
}
