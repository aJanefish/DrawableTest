package com.example.drawabletest.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;

import com.example.drawabletest.R;
import com.example.drawabletest.adapter.DrawableTestAdapter;

import java.util.ArrayList;
import java.util.List;

public class BitmapDrawableActivity extends AppCompatActivity {

    private static final String TAG = "ZY.BitmapDrawable";
    private List<DrawableTestAdapter.Bean> mList = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bitmap_drawable);
        initData();
        initView();
    }

    private void initView() {
        RecyclerView recyclerView = findViewById(R.id.activity_bitmap_drawable_rv);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));
        Drawable ss1 = getDrawable(R.drawable.bitmap_drawable_common);
        Drawable ss2 = getDrawable(R.drawable.bitmap_drawable_common);

        recyclerView.setAdapter(new DrawableTestAdapter(mList));
        Log.d(TAG, "" + ss1);
        Log.d(TAG, "" + ss2);
    }

    private void initData() {
        mList.add(new DrawableTestAdapter.Bean("common", R.drawable.bitmap_drawable_common));
        mList.add(new DrawableTestAdapter.Bean("common", R.drawable.bitmap_drawable_common, 1));
        mList.add(new DrawableTestAdapter.Bean("alpha_30", R.drawable.bitmap_drawable_alpha_30));
        mList.add(new DrawableTestAdapter.Bean("alpha_30", R.drawable.bitmap_drawable_alpha_30,1));
        mList.add(new DrawableTestAdapter.Bean("alpha_50", R.drawable.bitmap_drawable_alpha_50));
        mList.add(new DrawableTestAdapter.Bean("alpha_50", R.drawable.bitmap_drawable_alpha_50,1));
        mList.add(new DrawableTestAdapter.Bean("alpha_80", R.drawable.bitmap_drawable_alpha_80));
        mList.add(new DrawableTestAdapter.Bean("alpha_80", R.drawable.bitmap_drawable_alpha_80,1));
        mList.add(new DrawableTestAdapter.Bean("antialias", R.drawable.bitmap_drawable_antialias));
        mList.add(new DrawableTestAdapter.Bean("antialias", R.drawable.bitmap_drawable_antialias,1));
        mList.add(new DrawableTestAdapter.Bean("dither", R.drawable.bitmap_drawable_dither));
        mList.add(new DrawableTestAdapter.Bean("dither", R.drawable.bitmap_drawable_dither,1));
        mList.add(new DrawableTestAdapter.Bean("filter", R.drawable.bitmap_drawable_filter));
        mList.add(new DrawableTestAdapter.Bean("filter", R.drawable.bitmap_drawable_filter,1));
        mList.add(new DrawableTestAdapter.Bean("gravity=\"bottom\"", R.drawable.bitmap_drawable_bottom));
        mList.add(new DrawableTestAdapter.Bean("gravity=\"bottom\"", R.drawable.bitmap_drawable_bottom,1));
        mList.add(new DrawableTestAdapter.Bean("gravity top", R.drawable.bitmap_drawable_top));
        mList.add(new DrawableTestAdapter.Bean("gravity top", R.drawable.bitmap_drawable_top,1));
        mList.add(new DrawableTestAdapter.Bean("gravity left", R.drawable.bitmap_drawable_left));
        mList.add(new DrawableTestAdapter.Bean("gravity left", R.drawable.bitmap_drawable_left,1));
        mList.add(new DrawableTestAdapter.Bean("gravity right", R.drawable.bitmap_drawable_right));
        mList.add(new DrawableTestAdapter.Bean("gravity right", R.drawable.bitmap_drawable_right,1));
        mList.add(new DrawableTestAdapter.Bean("gravity center", R.drawable.bitmap_drawable_center));
        mList.add(new DrawableTestAdapter.Bean("gravity center", R.drawable.bitmap_drawable_center,1));
        mList.add(new DrawableTestAdapter.Bean("gravity center_vertical", R.drawable.bitmap_drawable_center_vertical));
        mList.add(new DrawableTestAdapter.Bean("gravity center_vertical", R.drawable.bitmap_drawable_center_vertical,1));
        mList.add(new DrawableTestAdapter.Bean("gravity center_horizontal", R.drawable.bitmap_drawable_center_horizontal));
        mList.add(new DrawableTestAdapter.Bean("gravity center_horizontal", R.drawable.bitmap_drawable_center_horizontal,1));

        mList.add(new DrawableTestAdapter.Bean("gravity fill", R.drawable.bitmap_drawable_fill));
        mList.add(new DrawableTestAdapter.Bean("gravity fill", R.drawable.bitmap_drawable_fill,1));
        mList.add(new DrawableTestAdapter.Bean("gravity fill_horizontal", R.drawable.bitmap_drawable_fill_horizontal));
        mList.add(new DrawableTestAdapter.Bean("gravity fill_horizontal", R.drawable.bitmap_drawable_fill_horizontal,1));
        mList.add(new DrawableTestAdapter.Bean("gravity fill_vertical", R.drawable.bitmap_drawable_fill_vertical));
        mList.add(new DrawableTestAdapter.Bean("gravity fill_vertical", R.drawable.bitmap_drawable_fill_vertical,1));

        mList.add(new DrawableTestAdapter.Bean("gravity top|left", R.drawable.bitmap_drawable_top_left));
        mList.add(new DrawableTestAdapter.Bean("gravity top|left", R.drawable.bitmap_drawable_top_left,1));
        mList.add(new DrawableTestAdapter.Bean("gravity bottom|right", R.drawable.bitmap_drawable_bottom_right));
        mList.add(new DrawableTestAdapter.Bean("gravity bottom|right", R.drawable.bitmap_drawable_bottom_right,1));

        mList.add(new DrawableTestAdapter.Bean("gravity tileMode=\"repeat\"", R.drawable.bitmap_drawable_tilemode_repeat));
        mList.add(new DrawableTestAdapter.Bean("gravity tileMode=\"repeat\"", R.drawable.bitmap_drawable_tilemode_repeat,1));
        mList.add(new DrawableTestAdapter.Bean("gravity tileMode=\"mirror\"", R.drawable.bitmap_drawable_tilemode_mirror));
        mList.add(new DrawableTestAdapter.Bean("gravity tileMode=\"mirror\"", R.drawable.bitmap_drawable_tilemode_mirror,1));
        mList.add(new DrawableTestAdapter.Bean("gravity tileMode=\"clamp\"", R.drawable.bitmap_drawable_tilemode_clamp));
        mList.add(new DrawableTestAdapter.Bean("gravity tileMode=\"clamp\"", R.drawable.bitmap_drawable_tilemode_clamp,1));

        mList.add(new DrawableTestAdapter.Bean("test", R.drawable.bitmap_drawable_right));
    }
}