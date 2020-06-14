package com.example.drawabletest.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.drawabletest.R;
import com.example.drawabletest.adapter.DrawableTestAdapter;

import java.util.ArrayList;
import java.util.List;

public class ShapeDrawableActivity extends AppCompatActivity {

    private static final String TAG = "ZY.NinePatchDrawable";
    private List<DrawableTestAdapter.Bean> mList = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shape_drawable);
        initData();
        initView();
    }

    private void initView() {
        RecyclerView recyclerView = findViewById(R.id.activity_shape_drawable_rv);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));
        recyclerView.setAdapter(new DrawableTestAdapter(mList));
    }

    private void initData() {
        mList.add(new DrawableTestAdapter.Bean("common", R.drawable.ycy));
        mList.add(new DrawableTestAdapter.Bean("矩形(rectangle)", R.drawable.shape_rectangle_common));
        mList.add(new DrawableTestAdapter.Bean("矩形-带圆角-四个圆角相同", R.drawable.shape_rectangle_corners));
        mList.add(new DrawableTestAdapter.Bean("矩形-带圆角-四个圆角不同相同", R.drawable.shape_rectangle_corners_diff));
        mList.add(new DrawableTestAdapter.Bean("矩形-颜色渐变", R.drawable.shape_rectangle_gradient));
        mList.add(new DrawableTestAdapter.Bean("矩形-描边", R.drawable.shape_rectangle_stroke));
        mList.add(new DrawableTestAdapter.Bean("矩形-空白", R.drawable.shape_rectangle_padding));
        mList.add(new DrawableTestAdapter.Bean("矩形-大小", R.drawable.shape_rectangle_size));

        mList.add(new DrawableTestAdapter.Bean("椭圆(oval)", R.drawable.shape_oval_common));

        mList.add(new DrawableTestAdapter.Bean("横线(line)", R.drawable.shape_line_common));
        mList.add(new DrawableTestAdapter.Bean("圆环(ring)", R.drawable.shape_ring_common));
    }
}