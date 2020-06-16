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
 * LevelListDrawable对应于标签<level-list></level-list> 表示一个Drawable的集合
 * 集合中的么一个Drawable都有一个等级的概念
 * 根据不同的等级，会切换到不同的Drawable
 */
public class LevelListDrawableActivity extends AppCompatActivity {

    private static final String TAG = "ZY.LevelListDrawableActivity";
    private List<DrawableTestAdapter.Bean> mList = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_list_drawable);
        initData();
        initView();
    }

    private void initView() {
        RecyclerView recyclerView = findViewById(R.id.drawable_test_rv);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));
        recyclerView.setAdapter(new DrawableTestAdapter(mList));
    }

    private void initData() {

        mList.add(new DrawableTestAdapter.Bean("level_list_common", R.drawable.level_list_common, 0, 1));
        mList.add(new DrawableTestAdapter.Bean("level_list_common", R.drawable.level_list_common, 0, 11));
        mList.add(new DrawableTestAdapter.Bean("level_list_common", R.drawable.level_list_common, 1, 1));
        mList.add(new DrawableTestAdapter.Bean("level_list_common", R.drawable.level_list_common, 1, 11));


        mList.add(new DrawableTestAdapter.Bean("common", R.drawable.ycy));
        mList.add(new DrawableTestAdapter.Bean("common", R.drawable.ycy, 1));
    }
}