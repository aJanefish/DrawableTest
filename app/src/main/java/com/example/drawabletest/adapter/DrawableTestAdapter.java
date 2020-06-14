package com.example.drawabletest.adapter;

import android.graphics.drawable.Drawable;
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

            Drawable drawable = itemView.getContext().getResources().getDrawable(bean.testId);
            //imageView1.setImageDrawable(drawable);
            imageView1.setBackground(drawable);
            textView1.setText(drawable.getClass().getSimpleName() + "\n" + bean.des +
                    "\n[" + imageView1.getWidth() + "," + imageView1.getHeight() + "]" +
                    "\n[" + drawable.getIntrinsicWidth() + "," + drawable.getIntrinsicHeight() + "]" +
                    "");
        }

    }

    public static class Bean {
        private String des;
        int testId;

        public Bean(String des, int testId) {
            this.des = des;
            this.testId = testId;
        }
    }

}
