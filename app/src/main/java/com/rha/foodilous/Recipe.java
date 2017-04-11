package com.rha.foodilous;

import android.graphics.drawable.Drawable;

/**
 * Created by Dell on 24-Sep-15.
 */
public class Recipe {
    //A class that contains food recipe informations
    public String Food_Name;
    public String Recipe;
    public int Resource_Name;
    public Recipe(String Name, String Data, int Res)
    {
        Food_Name = Name;
        Recipe = Data;
        Resource_Name = Res;
    }
}
