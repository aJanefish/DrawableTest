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
 * ClipDrawable 对应于<clip></>标签
 * 它可以根据当前的等级来剪裁另一个drawable
 * 剪裁方向可以通过：
 */
public class ClipDrawableActivity extends AppCompatActivity {


    private static final String TAG = "ZY.ClipDrawableActivity";
    private List<DrawableTestAdapter.Bean> mList = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clip_drawable);
        initData();
        initView();
    }

    private void initView() {
        RecyclerView recyclerView = findViewById(R.id.drawable_test_rv);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));
        recyclerView.setAdapter(new DrawableTestAdapter(mList));
    }

    private void initData() {
        addData("clip_center", R.drawable.clip_center);
        addData("clip_top", R.drawable.clip_top);
        addData("clip_bottom", R.drawable.clip_bottom);
        addData("clip_Left", R.drawable.clip_left);
        addData("clip_Right", R.drawable.clip_right);
    }

    private void addData(String tag, int drawableId) {
        mList.add(new DrawableTestAdapter.Bean(tag + "_10000", drawableId, 0, 10000));
        mList.add(new DrawableTestAdapter.Bean(tag + "_10000", drawableId, 1, 10000));
        mList.add(new DrawableTestAdapter.Bean(tag + "_8000", drawableId, 0, 8000));
        mList.add(new DrawableTestAdapter.Bean(tag + "_8000", drawableId, 1, 8000));
        mList.add(new DrawableTestAdapter.Bean(tag + "_5000", drawableId, 0, 5000));
        mList.add(new DrawableTestAdapter.Bean(tag + "_5000", drawableId, 1, 5000));
        mList.add(new DrawableTestAdapter.Bean(tag + "_3000", drawableId, 0, 3000));
        mList.add(new DrawableTestAdapter.Bean(tag + "_3000", drawableId, 1, 3000));
        mList.add(new DrawableTestAdapter.Bean(tag + "_1000", drawableId, 0, 1000));
        mList.add(new DrawableTestAdapter.Bean(tag + "_1000", drawableId, 1, 1000));
    }

}