package com.example.recipieapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.security.Key;

public class Recipe extends AppCompatActivity {
    private TextView mRecipeName;
    private TextView mRecipeIngredients;
    private TextView mRecipeMethodTitle;
    private TextView mRecipe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);

        mRecipeName=(TextView)findViewById(R.id.text_recipe);
        mRecipeIngredients=(TextView)findViewById(R.id.ingredients);
        mRecipeMethodTitle=(TextView)findViewById(R.id.method);
        mRecipe=(TextView)findViewById(R.id.recipe);

        Intent intent=getIntent();
        String Title=intent.getExtras().getString("RecipeName");
        String Ingredients=intent.getExtras().getString("RecipeIngredients");
        String Method=intent.getExtras().getString("RecipeMethodTitle");
        String Recipe=intent.getExtras().getString("Recipe");

        mRecipeName.setText(Title);
        mRecipeIngredients.setText(Ingredients);
        mRecipeMethodTitle.setText(Method);
        mRecipe.setText(Recipe);
    }
}