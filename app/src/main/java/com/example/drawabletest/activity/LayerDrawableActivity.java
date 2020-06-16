package com.example.drawabletest.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.drawabletest.R;
import com.example.drawabletest.adapter.DrawableTestAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * 不同的Drawable放置在不同的层从而达到一种叠加后的效果
 */
public class LayerDrawableActivity extends AppCompatActivity {

    private static final String TAG = "ZY.LayerDrawableActivity";
    private List<DrawableTestAdapter.Bean> mList = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layer_drawable);
        initData();
        initView();
    }

    private void initView() {
        RecyclerView recyclerView = findViewById(R.id.activity_layer_drawable_rv);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));
        recyclerView.setAdapter(new DrawableTestAdapter(mList));
    }

    private void initData() {

        mList.add(new DrawableTestAdapter.Bean("common", R.drawable.layer_list_common));
        mList.add(new DrawableTestAdapter.Bean("common", R.drawable.layer_list_common, 1));
        mList.add(new DrawableTestAdapter.Bean("size", R.drawable.layer_list_common_size));
        mList.add(new DrawableTestAdapter.Bean("size", R.drawable.layer_list_common_size,1));

        mList.add(new DrawableTestAdapter.Bean("输入框背景", R.drawable.layer_list_text_background));
        mList.add(new DrawableTestAdapter.Bean("输入框背景", R.drawable.layer_list_text_background,1));
        mList.add(new DrawableTestAdapter.Bean("输入框背景", R.drawable.ycy));
        mList.add(new DrawableTestAdapter.Bean("输入框背景", R.drawable.ycy,1));

    }
}