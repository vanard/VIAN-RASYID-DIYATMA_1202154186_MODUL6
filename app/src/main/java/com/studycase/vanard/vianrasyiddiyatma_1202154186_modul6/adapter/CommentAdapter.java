package com.studycase.vanard.vianrasyiddiyatma_1202154186_modul6.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.studycase.vanard.vianrasyiddiyatma_1202154186_modul6.R;
import com.studycase.vanard.vianrasyiddiyatma_1202154186_modul6.model.Comment;

import java.util.ArrayList;

/**
 * Created by vanard on 31/03/18.
 */

public class CommentAdapter extends RecyclerView.Adapter<CommentAdapter.ViewHolder> {
    Context context;
    ArrayList<Comment> comments;

    public CommentAdapter(Context context, ArrayList<Comment> comments) {
        this.context = context;
        this.comments = comments;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.layout_comment, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final Comment comment = comments.get(position);

        holder.mUsername.setText(comment.getUsername());
        holder.mComment.setText(comment.getComment());
        holder.ava.setImageResource(R.drawable.ic_account_circle_24dp);
    }

    @Override
    public int getItemCount() {
        return comments.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        //variable
        TextView mUsername;
        TextView mComment;
        ImageView ava;

        public ViewHolder(View itemView) {
            super(itemView);
            //bind data
            mUsername = itemView.findViewById(R.id.tv_username);
            mComment = itemView.findViewById(R.id.tv_comment);
            ava = itemView.findViewById(R.id.img_ava);
        }
    }
}
