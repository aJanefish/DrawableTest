package com.example.drawabletest.adapter;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.drawabletest.R;
import com.example.drawabletest.activity.BitmapDrawableActivity;
import com.example.drawabletest.activity.ClipDrawableActivity;
import com.example.drawabletest.activity.InsetDrawableActivity;
import com.example.drawabletest.activity.LayerDrawableActivity;
import com.example.drawabletest.activity.LevelListDrawableActivity;
import com.example.drawabletest.activity.NinePatchDrawableActivity;
import com.example.drawabletest.activity.ScaleDrawableActivity;
import com.example.drawabletest.activity.ShapeDrawableActivity;
import com.example.drawabletest.activity.StateListDrawableActivity;
import com.example.drawabletest.activity.TransitionDrawableActivity;

import java.util.ArrayList;
import java.util.List;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.MainHolder> {

    private List<MainBean> mList = new ArrayList();

    public MainAdapter() {
        mList.add(new MainBean("BitmapDrawable", BitmapDrawableActivity.class));
        mList.add(new MainBean("NinePatchDrawable", NinePatchDrawableActivity.class));
        mList.add(new MainBean("ShapeDrawable", ShapeDrawableActivity.class));
        mList.add(new MainBean("LayerDrawable", LayerDrawableActivity.class));
        mList.add(new MainBean("StateListDrawable", StateListDrawableActivity.class));
        mList.add(new MainBean("LevelListDrawable", LevelListDrawableActivity.class));
        mList.add(new MainBean("TransitionDrawable", TransitionDrawableActivity.class));
        mList.add(new MainBean("InsetDrawable", InsetDrawableActivity.class));
        mList.add(new MainBean("ScaleDrawable", ScaleDrawableActivity.class));
        mList.add(new MainBean("ClipDrawable", ClipDrawableActivity.class));
    }

    @NonNull
    @Override
    public MainHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_main_item, parent, false);
        return new MainHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MainHolder holder, int position) {
        holder.onBind(mList.get(position));
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public static class MainHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private final TextView mTitle;
        private MainBean mMainBean;

        public MainHolder(@NonNull View itemView) {
            super(itemView);
            mTitle = itemView.findViewById(R.id.activity_main_item_title);
            itemView.setOnClickListener(this);
        }

        public void onBind(MainBean mainBean) {
            if (mainBean == null) {
                return;
            }
            mMainBean = mainBean;
            mTitle.setText(mMainBean.mTitle);
        }

        @Override
        public void onClick(View v) {
            itemView.getContext().startActivity(new Intent(itemView.getContext(), mMainBean.aClass));
        }
    }

    public static class MainBean {

        private String mTitle;
        private Class aClass;

        public MainBean(String mTitle, Class aClass) {
            this.mTitle = mTitle;
            this.aClass = aClass;
        }
    }

}
