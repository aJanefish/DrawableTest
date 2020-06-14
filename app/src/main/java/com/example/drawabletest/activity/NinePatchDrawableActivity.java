package com.example.drawabletest.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.drawabletest.R;
import com.example.drawabletest.adapter.DrawableTestAdapter;

import java.util.ArrayList;
import java.util.List;

public class NinePatchDrawableActivity extends AppCompatActivity {
    private static final String TAG = "ZY.NinePatchDrawable";
    private List<DrawableTestAdapter.Bean> mList = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nine_patch_drawable);
        initData();
        initView();
    }

    private void initView() {
        RecyclerView recyclerView = findViewById(R.id.activity_nine_patch_drawable_rv);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));
        recyclerView.setAdapter(new DrawableTestAdapter(mList));
    }

    private void initData() {
        mList.add(new DrawableTestAdapter.Bean("common", R.drawable.nine_patch_bitmap_common));
        mList.add(new DrawableTestAdapter.Bean("antialias", R.drawable.nine_patch_bitmap_antialias));
        mList.add(new DrawableTestAdapter.Bean("dither", R.drawable.nine_patch_bitmap_dither));
        mList.add(new DrawableTestAdapter.Bean("filter", R.drawable.nine_patch_bitmap_filter));
        mList.add(new DrawableTestAdapter.Bean("gravity=\"bottom\"", R.drawable.nine_patch_bitmap_bottom));
        mList.add(new DrawableTestAdapter.Bean("gravity top", R.drawable.nine_patch_bitmap_top));
        mList.add(new DrawableTestAdapter.Bean("gravity left", R.drawable.nine_patch_bitmap_left));
        mList.add(new DrawableTestAdapter.Bean("gravity right", R.drawable.nine_patch_bitmap_right));
        mList.add(new DrawableTestAdapter.Bean("gravity center", R.drawable.nine_patch_bitmap_center));
        mList.add(new DrawableTestAdapter.Bean("gravity center_vertical", R.drawable.nine_patch_bitmap_center_vertical));
        mList.add(new DrawableTestAdapter.Bean("gravity center_horizontal", R.drawable.nine_patch_bitmap_center_horizontal));

        mList.add(new DrawableTestAdapter.Bean("gravity fill", R.drawable.nine_patch_bitmap_fill));
        mList.add(new DrawableTestAdapter.Bean("gravity fill_horizontal", R.drawable.nine_patch_bitmap_fill_horizontal));
        mList.add(new DrawableTestAdapter.Bean("gravity fill_vertical", R.drawable.nine_patch_bitmap_fill_vertical));

        mList.add(new DrawableTestAdapter.Bean("gravity top|left", R.drawable.nine_patch_bitmap_top_left));
        mList.add(new DrawableTestAdapter.Bean("gravity bottom|right", R.drawable.nine_patch_bitmap_bottom_right));

        mList.add(new DrawableTestAdapter.Bean("gravity tileMode=\"repeat\"", R.drawable.nine_patch_bitmap_tilemode_repeat));
        mList.add(new DrawableTestAdapter.Bean("gravity tileMode=\"mirror\"", R.drawable.nine_patch_bitmap_tilemode_mirror));
        mList.add(new DrawableTestAdapter.Bean("gravity tileMode=\"clamp\"", R.drawable.nine_patch_bitmap_tilemode_clamp));

        mList.add(new DrawableTestAdapter.Bean("test", R.drawable.nine_patch_bitmap_common));
    }
}