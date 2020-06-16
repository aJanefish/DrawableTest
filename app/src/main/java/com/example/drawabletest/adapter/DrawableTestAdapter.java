package com.example.drawabletest.adapter;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.ScaleDrawable;
import android.graphics.drawable.TransitionDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.drawabletest.R;

import java.util.ArrayList;
import java.util.List;

public class DrawableTestAdapter extends RecyclerView.Adapter<DrawableTestAdapter.Holder> {

    private List<Bean> mList = new ArrayList();

    public DrawableTestAdapter(List<Bean> list) {
        mList.addAll(list);
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
        TextView textView1;

        public Holder(@NonNull View itemView) {
            super(itemView);
            imageView1 = itemView.findViewById(R.id.drawable_test_item_im1);
            textView1 = itemView.findViewById(R.id.drawable_test_item_des1);
        }

        public void onBind(Bean bean) {
            mBean = bean;
            imageView1.setBackground(null);
            imageView1.setImageDrawable(null);
            Drawable drawable = itemView.getContext().getResources().getDrawable(bean.testId);
            if (drawable instanceof TransitionDrawable) {
                if (bean.type == 0) {
                    imageView1.setBackground(drawable);
                    ((TransitionDrawable) drawable).startTransition(1000);
                } else if (bean.type == 1) {
                    imageView1.setImageDrawable(drawable);
                    ((TransitionDrawable) drawable).startTransition(1000);
                }
            } else if (drawable instanceof ScaleDrawable) {
                if (bean.type == 0) {
                    imageView1.setBackground(drawable);
                } else if (bean.type == 1) {
                    imageView1.setImageDrawable(drawable);
                }
                ((ScaleDrawable) drawable).setLevel(1);
            } else {
                if (bean.type == 0) {
                    drawable.setLevel(bean.level);
                    imageView1.setBackground(drawable);
                } else if (bean.type == 1) {
                    imageView1.setImageDrawable(drawable);
                    imageView1.setImageLevel(bean.level);
                }
            }
            textView1.setText(drawable.getClass().getSimpleName() + "\n" + bean.des +
                    "\n[" + imageView1.getWidth() + "," + imageView1.getHeight() + "]" +
                    "\n[" + drawable.getIntrinsicWidth() + "," + drawable.getIntrinsicHeight() + "]" +
                    "");
        }

    }

    public static class Bean {
        private String des;
        int testId;
        int type = 0;
        int level;

        public Bean(String des, int testId) {
            this.des = des;
            this.testId = testId;
        }

        public Bean(String des, int testId, int type) {
            this.des = des;
            this.testId = testId;
            this.type = type;
        }

        public Bean(String des, int testId, int type, int level) {
            this.des = des;
            this.testId = testId;
            this.type = type;
            this.level = level;
        }
    }

}
