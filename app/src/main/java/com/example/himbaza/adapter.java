package com.example.himbaza;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class adapter extends RecyclerView.Adapter<adapter.MyViewHolder>  {

    private List<Cantique>mCantiqueList;
    private Cantique cant;
    private Context mContext;
    private OnItemListener mOnitemListener;

    public interface OnItemListener{
        void onItemClick(int position);
    }
    public adapter(List<Cantique> cantiqueList, Context mContext,OnItemListener OnitemListener) {
        this.mCantiqueList = cantiqueList;
        this.mContext = mContext;
        this.mOnitemListener = OnitemListener;
    }

    public void setCantiqueList(List<Cantique> cantiqueList) {
        mCantiqueList = cantiqueList;
        notifyDataSetChanged();
    }




    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_song,parent,false);
       return new MyViewHolder(v,mOnitemListener);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        final Cantique cantique = mCantiqueList.get(position);
        holder.title.setText(cantique.getmTitle());

        holder.container.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(mContext,NoteActivity.class);
                intent.putExtra(Cantique.Cantique_EXTRA,cantique);
                mContext.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return mCantiqueList.size();
    }


    public static class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title;
        public LinearLayout container;
        OnItemListener mOnItemListener;
        private final Context context;

        public MyViewHolder(@NonNull View itemView,OnItemListener onitemListener) {
            super(itemView);
            context = itemView.getContext();
            title = itemView.findViewById(R.id.title);
            container= itemView.findViewById(R.id.container);
            mOnItemListener =  onitemListener;

        }


    }





    }
