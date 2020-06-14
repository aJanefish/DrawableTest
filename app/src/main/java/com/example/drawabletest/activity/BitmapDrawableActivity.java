package com.example.drawabletest.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;

import com.example.drawabletest.R;
import com.example.drawabletest.adapter.DrawableTestAdapter;

import java.util.ArrayList;
import java.util.List;

public class BitmapDrawableActivity extends AppCompatActivity {

    private static final String TAG = "ZY.BitmapDrawable";
    private List<DrawableTestAdapter.Bean> mList = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bitmap_drawable);
        initData();
        initView();
    }

    private void initView() {
        RecyclerView recyclerView = findViewById(R.id.activity_bitmap_drawable_rv);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));
        Drawable ss1 = getDrawable(R.drawable.bitmap_drawable_test01);
        Drawable ss2 = getDrawable(R.drawable.bitmap_drawable_test01);

        recyclerView.setAdapter(new DrawableTestAdapter(mList));
        Log.d(TAG, "" + ss1);
        Log.d(TAG, "" + ss2);
    }

    private void initData() {
        mList.add(new DrawableTestAdapter.Bean("普通展示", R.drawable.bitmap_drawable_test01));
        mList.add(new DrawableTestAdapter.Bean("antialias", R.drawable.bitmap_drawable_test101));
        mList.add(new DrawableTestAdapter.Bean("dither", R.drawable.bitmap_drawable_test201));
        mList.add(new DrawableTestAdapter.Bean("filter", R.drawable.bitmap_drawable_test301));
        mList.add(new DrawableTestAdapter.Bean("gravity=\"bottom\"", R.drawable.bitmap_drawable_test401));
        mList.add(new DrawableTestAdapter.Bean("gravity top", R.drawable.bitmap_drawable_test403));
        mList.add(new DrawableTestAdapter.Bean("gravity left", R.drawable.bitmap_drawable_test404));
        mList.add(new DrawableTestAdapter.Bean("gravity right", R.drawable.bitmap_drawable_test405));
        mList.add(new DrawableTestAdapter.Bean("gravity center", R.drawable.bitmap_drawable_test402));
        mList.add(new DrawableTestAdapter.Bean("gravity center_vertical", R.drawable.bitmap_drawable_test406));
        mList.add(new DrawableTestAdapter.Bean("gravity center_horizontal", R.drawable.bitmap_drawable_test407));

        mList.add(new DrawableTestAdapter.Bean("gravity fill", R.drawable.bitmap_drawable_test408));
        mList.add(new DrawableTestAdapter.Bean("gravity fill_horizontal", R.drawable.bitmap_drawable_test409));
        mList.add(new DrawableTestAdapter.Bean("gravity fill_vertical", R.drawable.bitmap_drawable_test410));

        mList.add(new DrawableTestAdapter.Bean("gravity top|left", R.drawable.bitmap_drawable_test411));
        mList.add(new DrawableTestAdapter.Bean("gravity bottom|right", R.drawable.bitmap_drawable_test412));

        mList.add(new DrawableTestAdapter.Bean("gravity tileMode=\"repeat\"", R.drawable.bitmap_drawable_test413));
        mList.add(new DrawableTestAdapter.Bean("gravity tileMode=\"mirror\"", R.drawable.bitmap_drawable_test414));
        mList.add(new DrawableTestAdapter.Bean("gravity tileMode=\"clamp\"", R.drawable.bitmap_drawable_test415));

        mList.add(new DrawableTestAdapter.Bean("test", R.drawable.bitmap_drawable_test405));
    }
}