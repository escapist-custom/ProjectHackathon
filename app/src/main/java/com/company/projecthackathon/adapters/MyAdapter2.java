package com.company.projecthackathon.adapters;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.company.projecthackathon.R;
import com.company.projecthackathon.activities.RouteDescriptionActivity;
import com.company.projecthackathon.databinding.ItemBinding;
import com.company.projecthackathon.views.Item;

import java.util.List;

public class MyAdapter2 extends RecyclerView.Adapter<MyAdapter2.ViewHolder> {

    ItemBinding binding;
    private final List<Item> data;

    public MyAdapter2(List<Item> data) {
        this.data = data;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        //View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.leaderboards_item, parent, false);
        binding = ItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);

        return new ViewHolder(binding.getRoot());
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final Item state = data.get(position);
        holder.route_picture.setImageResource(state.getRoute_picture_resource());
        holder.title.setText(state.getTitle());
        holder.love_button.setImageResource(state.heart_picture_resource);
        holder.description.setText(state.getDescription());
        holder.item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), RouteDescriptionActivity.class);
                holder.item.getContext().startActivity(intent);
            }
        });

        holder.love_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(state.isLiked) {
                    state.setHeart_picture_resource(R.drawable.love);
                    holder.love_button.setImageResource(state.heart_picture_resource);
                } else {
                    state.setHeart_picture_resource(R.drawable.heart_clicked);
                    holder.love_button.setImageResource(state.heart_picture_resource);
                }
                state.addToFavourites();
            }
        });

    }

    @Override
    public int getItemCount() {
        int a ;

        if(data != null && !data.isEmpty()) {
            a = data.size();
        }
        else {
            a = 0;
        }
        return a;
    }


    static class ViewHolder extends RecyclerView.ViewHolder {
        final ImageView route_picture;
        final ImageView love_button;
        final TextView title, description;
        final RelativeLayout item;
        ViewHolder(View view){
            super(view);
            route_picture = view.findViewById(R.id.route_picture);
            love_button = view.findViewById(R.id.love_button);
            title = view.findViewById(R.id.title);
            description = view.findViewById(R.id.description);
            item = view.findViewById(R.id.item);
        }
    }

}
