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
 * TransitionDrawable对应于<transition></>标签，它用于实现两个Drawable之间的淡入淡出效果
 */
public class TransitionDrawableActivity extends AppCompatActivity {

    private static final String TAG = "ZY.TransitionDrawableActivity";
    private List<DrawableTestAdapter.Bean> mList = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transition_drawable);
        initData();
        initView();
    }

    private void initView() {
        RecyclerView recyclerView = findViewById(R.id.drawable_test_rv);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));
        recyclerView.setAdapter(new DrawableTestAdapter(mList));
    }

    private void initData() {
        mList.add(new DrawableTestAdapter.Bean("common", R.drawable.transition_commom));
        mList.add(new DrawableTestAdapter.Bean("common", R.drawable.transition_commom, 1));
        mList.add(new DrawableTestAdapter.Bean("common", R.drawable.transition_commom));
        mList.add(new DrawableTestAdapter.Bean("common", R.drawable.transition_commom, 1));
        mList.add(new DrawableTestAdapter.Bean("common", R.drawable.transition_commom));
        mList.add(new DrawableTestAdapter.Bean("common", R.drawable.transition_commom, 1));
        mList.add(new DrawableTestAdapter.Bean("common", R.drawable.transition_commom));
        mList.add(new DrawableTestAdapter.Bean("common", R.drawable.transition_commom, 1));
        mList.add(new DrawableTestAdapter.Bean("common", R.drawable.transition_commom));
        mList.add(new DrawableTestAdapter.Bean("common", R.drawable.transition_commom, 1));
        mList.add(new DrawableTestAdapter.Bean("common", R.drawable.transition_commom));
        mList.add(new DrawableTestAdapter.Bean("common", R.drawable.transition_commom, 1));
        mList.add(new DrawableTestAdapter.Bean("common", R.drawable.transition_commom));
        mList.add(new DrawableTestAdapter.Bean("common", R.drawable.transition_commom, 1));
        mList.add(new DrawableTestAdapter.Bean("common", R.drawable.transition_commom));
        mList.add(new DrawableTestAdapter.Bean("common", R.drawable.transition_commom, 1));
    }
}