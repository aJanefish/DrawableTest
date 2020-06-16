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
 * InsetDrawable对应于<inset></>标签
 * 它可以将其他Drawable内嵌到自己当中
 * ，并可以在四周留出一定间隙，
 */
public class InsetDrawableActivity extends AppCompatActivity {

    private static final String TAG = "ZY.InsetDrawableActivity";
    private List<DrawableTestAdapter.Bean> mList = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inset_drawable);
        initData();
        initView();
    }

    private void initView() {
        RecyclerView recyclerView = findViewById(R.id.drawable_test_rv);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));
        recyclerView.setAdapter(new DrawableTestAdapter(mList));
    }

    private void initData() {
        mList.add(new DrawableTestAdapter.Bean("common", R.drawable.inset_commom));
        mList.add(new DrawableTestAdapter.Bean("common", R.drawable.inset_commom, 1));
    }
}