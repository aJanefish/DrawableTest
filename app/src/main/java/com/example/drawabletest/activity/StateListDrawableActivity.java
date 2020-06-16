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
 * StateListDrawable对应于<selector></selector>标签
 * 他表示Drawable的集合，每个Drawable都对应着View的一种状态，这样系统会根据View的状态来选择合适的Drawable
 * 主要用来设置可点击View的背景，比如Button
 */
public class StateListDrawableActivity extends AppCompatActivity {

    private static final String TAG = "ZY.StateListDrawableActivity";
    private List<DrawableTestAdapter.Bean> mList = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_state_list_drawable);
        initData();
        initView();
    }

    private void initView() {
        RecyclerView recyclerView = findViewById(R.id.drawable_test_rv);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));
        recyclerView.setAdapter(new DrawableTestAdapter(mList));
    }

    private void initData() {

        mList.add(new DrawableTestAdapter.Bean("common", R.drawable.selector_commom));
        mList.add(new DrawableTestAdapter.Bean("common", R.drawable.selector_commom, 1));

        mList.add(new DrawableTestAdapter.Bean("selector_constant_size_true", R.drawable.selector_constant_size_true));
        mList.add(new DrawableTestAdapter.Bean("selector_constant_size_true", R.drawable.selector_constant_size_true, 1));

        mList.add(new DrawableTestAdapter.Bean("selector_constant_size_false", R.drawable.selector_constant_size_false));
        mList.add(new DrawableTestAdapter.Bean("selector_constant_size_false", R.drawable.selector_constant_size_false, 1));

        mList.add(new DrawableTestAdapter.Bean("test", R.drawable.ycy9));
        mList.add(new DrawableTestAdapter.Bean("test", R.drawable.ycy9, 1));
    }
}