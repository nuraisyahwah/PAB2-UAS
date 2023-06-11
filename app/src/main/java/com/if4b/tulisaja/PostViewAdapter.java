//7
package com.if4b.tulisaja;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.if4b.tulisaja.databinding.PostItemBinding;

import java.util.ArrayList;
import java.util.List;

public class PostViewAdapter extends RecyclerView.Adapter<PostViewAdapter.ViewHolder> {
    private List<Post> data = new ArrayList<>();

    public void setData(List<Post> data){
        this.data = data;
        notifyDataSetChanged();
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(PostItemBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        int pos = holder.getAdapterPosition();
        Post post = data.get(pos);
        holder.postItemBinding.tvUsername.setText(post.getUsername());
        holder.postItemBinding.tvContent.setText(post.getContent());
        holder.postItemBinding.tvCreatedDate.setText(post.getCreate_date());

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private PostItemBinding postItemBinding;
        public ViewHolder(@NonNull PostItemBinding itemView) {
            super(itemView.getRoot());
            postItemBinding=itemView;
        }
    }

}
