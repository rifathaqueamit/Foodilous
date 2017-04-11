package com.rha.foodilous;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        //getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        //int id = item.getItemId();

        //noinspection SimplifiableIfStatement
       // if (id == R.id.action_settings) {
        //    return true;
        //}

        //return super.onOptionsItemSelected(item);
        return false;
    }

    //Functions related to the buttons
    public void Show_Recipes(View V)
    {
        Intent I = new Intent(this, food_recipes.class);
        startActivity(I);
    }

    public void Show_Healthy_Foods(View V)
    {
        Intent I = new Intent(this, healthy_foods.class);
        startActivity(I);
    }

    public void Show_Unhealthy_Foods(View V)
    {
        Intent I = new Intent(this, unhealthy_foods.class);
        startActivity(I);
    }

    public void Show_Foods_Calories(View V)
    {
        Intent I = new Intent(this, food_calories.class);
        startActivity(I);
    }

    public void Show_BMI_Calculator(View V)
    {
        Intent I = new Intent(this, bmi_calculator.class);
        startActivity(I);
    }


    public void Exit_Program(View V)
    {
        finish();
        System.exit(0);
    }

}
