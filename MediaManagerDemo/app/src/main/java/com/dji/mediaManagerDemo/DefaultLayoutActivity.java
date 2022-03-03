package com.dji.mediaManagerDemo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import dji.keysdk.ProductKey;
import dji.ux.widget.FPVWidget;

public class DefaultLayoutActivity extends AppCompatActivity implements View.OnClickListener{

    private Button mMediaManagerBtn;
    private FPVWidget fpvWidget;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_default_layout);
        mMediaManagerBtn = (Button)findViewById(R.id.btn_mediaManager);
        fpvWidget = findViewById(R.id.fpv_widget);
        mMediaManagerBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_mediaManager) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        fpvWidget.updateWidget(ProductKey.create(ProductKey.MODEL_NAME));
    }
}
