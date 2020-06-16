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
 * InsetDrawable对应于<scale></>标签
 * 它会根据自己的等级将指定的Drawable缩放到一定的比例
 */
public class ScaleDrawableActivity extends AppCompatActivity {
    private static final String TAG = "ZY.ScaleDrawableActivity";
    private List<DrawableTestAdapter.Bean> mList = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scale_drawable);
        initData();
        initView();
    }

    private void initView() {
        RecyclerView recyclerView = findViewById(R.id.drawable_test_rv);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));
        recyclerView.setAdapter(new DrawableTestAdapter(mList));
    }

    private void initData() {
        mList.add(new DrawableTestAdapter.Bean("scale_common_10", R.drawable.scale_common_10));
        mList.add(new DrawableTestAdapter.Bean("scale_common_10", R.drawable.scale_common_10, 1));

        mList.add(new DrawableTestAdapter.Bean("scale_common_25", R.drawable.scale_common_25));
        mList.add(new DrawableTestAdapter.Bean("scale_common_25", R.drawable.scale_common_25, 1));

        mList.add(new DrawableTestAdapter.Bean("scale_common_50", R.drawable.scale_common_50));
        mList.add(new DrawableTestAdapter.Bean("scale_common_50", R.drawable.scale_common_50, 1));

        mList.add(new DrawableTestAdapter.Bean("scale_common_75", R.drawable.scale_common_75));
        mList.add(new DrawableTestAdapter.Bean("scale_common_75", R.drawable.scale_common_75, 1));

        mList.add(new DrawableTestAdapter.Bean("scale_common_95", R.drawable.scale_common_95));
        mList.add(new DrawableTestAdapter.Bean("scale_common_95", R.drawable.scale_common_95, 1));
    }
}