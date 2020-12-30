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

        mRecipeName = findViewById(R.id.text_recipe);
        mRecipeIngredients = findViewById(R.id.ingredients);
        mRecipeMethodTitle = findViewById(R.id.method);
        mRecipe = findViewById(R.id.recipe);

        String Title = getIntent().getStringExtra("Name");
        String Ingredients =getIntent().getStringExtra ("Ingredients");
        String MethodTitle = getIntent().getStringExtra("MethodTitle");
        String Recipe = getIntent().getStringExtra("Recipe");

        mRecipeName.setText(Title);
        mRecipeIngredients.setText(Ingredients);
        mRecipeMethodTitle.setText(MethodTitle);
        mRecipe.setText(Recipe);

    }
}
