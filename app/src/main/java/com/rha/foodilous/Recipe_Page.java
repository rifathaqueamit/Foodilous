package com.rha.foodilous;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;


public class Recipe_Page extends AppCompatActivity {

    //Using Intent Extra functions to pass data from one Activity to another
    //Data keywords
    //Img = contains INT data which is the Drawable ID for the required food image
    //N = the title of the food (string)
    //Dta = contains the recipe text (string)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe__page);

        Intent I = getIntent();
        ImageView V = (ImageView)findViewById(R.id.Recipe_View);
        TextView Tt = (TextView)findViewById(R.id.Recipe_View_Title);
        TextView Tr = (TextView)findViewById(R.id.Recipe_View_Text);

        V.setImageDrawable(getResources().getDrawable(I.getIntExtra("Img", 0)));
        Tt.setText(I.getStringExtra("N"));
        Tr.setText(I.getStringExtra("Dta"));

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
      //  getMenuInflater().inflate(R.menu.menu_recipe__page, menu);
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

       // return super.onOptionsItemSelected(item);
        return false;
    }
}
