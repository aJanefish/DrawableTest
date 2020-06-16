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
        mList.add(new DrawableTestAdapter.Bean("clip_common", R.drawable.clip_common));
        mList.add(new DrawableTestAdapter.Bean("clip_common", R.drawable.clip_common, 1));
    }
}