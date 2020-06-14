package com.example.drawabletest.adapter;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.drawabletest.R;
import com.example.drawabletest.activity.BitmapDrawableActivity;

import java.util.ArrayList;
import java.util.List;

public class BitmapDrawableAdapter extends RecyclerView.Adapter<BitmapDrawableAdapter.Holder> {

    private List<Bean> mList = new ArrayList();

    public BitmapDrawableAdapter() {
        mList.add(new Bean("普通展示", "antialias", R.drawable.bitmap_drawable_test01,R.drawable.bitmap_drawable_test101));
        mList.add(new Bean("普通展示", "dither", R.drawable.bitmap_drawable_test01,R.drawable.bitmap_drawable_test201));
        mList.add(new Bean("普通展示", "filter", R.drawable.bitmap_drawable_test01,R.drawable.bitmap_drawable_test301));
        mList.add(new Bean("普通展示", "gravity bottom", R.drawable.bitmap_drawable_test01,R.drawable.bitmap_drawable_test401));
        mList.add(new Bean("普通展示", "gravity top", R.drawable.bitmap_drawable_test01,R.drawable.bitmap_drawable_test403));
        mList.add(new Bean("普通展示", "gravity left", R.drawable.bitmap_drawable_test01,R.drawable.bitmap_drawable_test404));
        mList.add(new Bean("普通展示", "gravity right", R.drawable.bitmap_drawable_test01,R.drawable.bitmap_drawable_test405));
        mList.add(new Bean("普通展示", "gravity center", R.drawable.bitmap_drawable_test01,R.drawable.bitmap_drawable_test402));
        mList.add(new Bean("普通展示", "gravity center_vertical", R.drawable.bitmap_drawable_test01,R.drawable.bitmap_drawable_test406));
        mList.add(new Bean("普通展示", "gravity center_horizontal", R.drawable.bitmap_drawable_test01,R.drawable.bitmap_drawable_test407));

        mList.add(new Bean("普通展示", "gravity fill", R.drawable.bitmap_drawable_test01,R.drawable.bitmap_drawable_test408));
        mList.add(new Bean("普通展示", "gravity fill_horizontal", R.drawable.bitmap_drawable_test01,R.drawable.bitmap_drawable_test409));
        mList.add(new Bean("普通展示", "gravity fill_vertical", R.drawable.bitmap_drawable_test01,R.drawable.bitmap_drawable_test410));

        mList.add(new Bean("普通展示", "gravity top|left", R.drawable.bitmap_drawable_test01,R.drawable.bitmap_drawable_test411));
        mList.add(new Bean("普通展示", "gravity bottom|right", R.drawable.bitmap_drawable_test01,R.drawable.bitmap_drawable_test412));

        mList.add(new Bean("普通展示", "gravity tileMode=\"repeat\"", R.drawable.bitmap_drawable_test01,R.drawable.bitmap_drawable_test413));
        mList.add(new Bean("普通展示", "gravity tileMode=\"mirror\"", R.drawable.bitmap_drawable_test01,R.drawable.bitmap_drawable_test414));
        mList.add(new Bean("普通展示", "gravity tileMode=\"clamp\"", R.drawable.bitmap_drawable_test01,R.drawable.bitmap_drawable_test415));

        mList.add(new Bean("test", "test", R.drawable.bitmap_drawable_test405,R.drawable.bitmap_drawable_test405));
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.drawable_test_item, parent, false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        holder.onBind(mList.get(position));
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public static class Holder extends RecyclerView.ViewHolder {

        private Bean mBean;
        ImageView imageView1;
        ImageView imageView2;
        TextView textView1;
        TextView textView2;

        public Holder(@NonNull View itemView) {
            super(itemView);
            imageView1 = itemView.findViewById(R.id.drawable_test_item_im1);
            textView1 = itemView.findViewById(R.id.drawable_test_item_des1);
            imageView2 = itemView.findViewById(R.id.drawable_test_item_im2);
            textView2 = itemView.findViewById(R.id.drawable_test_item_des2);
        }

        public void onBind(Bean bean) {
            mBean = bean;

            Drawable drawable = itemView.getContext().getResources().getDrawable(bean.commonId);
            //imageView1.setImageDrawable(drawable);
            imageView1.setBackground(drawable);
            Drawable drawable1 = itemView.getContext().getResources().getDrawable(bean.testId);
            //imageView2.setImageDrawable(drawable1);
            imageView2.setBackground(drawable1);

            textView1.setText(bean.des1 + "\n[" + imageView1.getWidth() + "," + imageView1.getHeight() + "]");
            textView2.setText(bean.des2 + "\n[" + imageView2.getWidth() + "," + imageView2.getHeight() + "]");
        }

    }

    public static class Bean {

        private String des1;
        private String des2;
        int commonId;
        int testId;

        public Bean(String des1, String des2, int commonId, int testId) {
            this.des1 = des1;
            this.des2 = des2;
            this.commonId = commonId;
            this.testId = testId;
        }
    }

}
