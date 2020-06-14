package com.example.drawabletest.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;

import com.example.drawabletest.R;
import com.example.drawabletest.adapter.BitmapDrawableAdapter;

public class BitmapDrawableActivity extends AppCompatActivity {

    private static final String TAG = "ZY.BitmapDrawable";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bitmap_drawable);
        initView();
    }

    private void initView() {
        RecyclerView recyclerView = findViewById(R.id.activity_bitmap_drawable_rv);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));
        recyclerView.setAdapter(new BitmapDrawableAdapter());
        Drawable ss1 = getDrawable(R.drawable.bitmap_drawable_test01);
        Drawable ss2 = getDrawable(R.drawable.bitmap_drawable_test01);
        Log.d(TAG, "" + ss1);
        Log.d(TAG, "" + ss2);
    }
}