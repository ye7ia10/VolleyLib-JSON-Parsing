package com.example.volley;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CreatureAdapter extends RecyclerView.Adapter<CreatureAdapter.CreatureViewHodler>{

    private Context context;
    private List<Creature> creatureList;

    public CreatureAdapter(Context context, List<Creature> creatureList) {
        this.context = context;
        this.creatureList = creatureList;
    }

    @NonNull
    @Override
    public CreatureViewHodler onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.item,viewGroup,false);
        return new CreatureViewHodler(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CreatureViewHodler creatureViewHodler, int i) {
        Creature creature = creatureList.get(i);
        Picasso.get().load(creature.getPhoto()).into(creatureViewHodler.img);
        creatureViewHodler.name.setText(creature.getName());
        creatureViewHodler.likes.setText(creature.getLikes());
    }

    @Override
    public int getItemCount() {
        return creatureList.size();
    }

    public class  CreatureViewHodler extends RecyclerView.ViewHolder{
        public ImageView img = itemView.findViewById(R.id.img);
        public TextView name = itemView.findViewById(R.id.txtName);
        public TextView likes = itemView.findViewById(R.id.NumLikes);
        public CreatureViewHodler(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.img);
            name = itemView.findViewById(R.id.txtName);
            likes = itemView.findViewById(R.id.NumLikes);
        }
    }
}
