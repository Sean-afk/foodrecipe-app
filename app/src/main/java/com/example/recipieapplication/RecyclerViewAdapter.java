package com.example.recipieapplication;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyHolder>implements Filterable {
    private Context mContext;
    private List<Recipies> mData;
    private List<Recipies> mDataFull;

    public RecyclerViewAdapter(Context mContext,List<Recipies> mData) {
        this.mContext=mContext;
        this.mData=mData;
        this.mDataFull=new ArrayList<>(mData);
    }


    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        LayoutInflater layoutInflater=LayoutInflater.from(mContext);
        View view=layoutInflater.inflate(R.layout.cardview_recipe,viewGroup,false);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull  final MyHolder myholder, final int i) {
        Recipies recipies=mData.get(i);
        myholder.recipeTitle.setText(recipies.getRecipeName());
        myholder.image_recipe_thumbnail.setImageResource(recipies.getThumbnail());
        myholder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(mContext,Recipe.class);
                intent.putExtra("Name",mData.get(i).getRecipeName());
                intent.putExtra("Ingredients",mData.get(i).getRecipeIngredients());
                intent.putExtra("MethodTitle",mData.get(i).getRecipeMethodTitle());
                intent.putExtra("Recipe",mData.get(i).getRecipe());
                intent.putExtra("Thumbnail",mData.get(i).getThumbnail());
                 mContext.startActivity(intent);

            }
        });

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }


    public class MyHolder extends RecyclerView.ViewHolder {
        TextView recipeTitle;
        CardView cardView;
        ImageView image_recipe_thumbnail;

        public MyHolder(@NonNull View itemView) {
            super(itemView);

            recipeTitle= (TextView)itemView.findViewById(R.id.text_recipe);
            image_recipe_thumbnail=(ImageView)itemView.findViewById(R.id.recipe_image_id);
            cardView=(CardView)itemView.findViewById(R.id.cardview_id);
        }
    }

    @Override
    public Filter getFilter() {
        return dataFilter;
    }
    private Filter dataFilter= new Filter() {
        @Override
        protected FilterResults performFiltering(CharSequence constraint) {
           List<Recipies> filteredList=new ArrayList<>();
           if(constraint.toString().isEmpty()){
               filteredList.addAll(mDataFull);
           }
           else{
               for (Recipies item: mDataFull) {
                   String filterPattern=constraint.toString().toLowerCase().trim();
                   if (item.getRecipeName().toLowerCase().contains(filterPattern)) {
                       filteredList.add(item);
                   }
               }
           }

           FilterResults results=new FilterResults();
           results.values=filteredList;
           return results;

        }

        @Override
        protected void publishResults(CharSequence constraint, FilterResults results) {
            mData.clear();
            mData.addAll((Collection<? extends Recipies>) results.values);
            notifyDataSetChanged();

        }
    };
}
