package com.rha.foodilous;

import android.content.Context;
import android.content.Intent;
import android.database.DataSetObserver;
import android.media.Image;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Filter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class food_recipes extends AppCompatActivity {

    ArrayAdapter adapter;

    //Add food recipes to a class ArrayList then using ListAdapter, it is shown to a ListView
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_recipes);

        final ListView myListView = (ListView) findViewById(R.id.List_Recipes);
        final ArrayList<Recipe> Fixed_Recipes = new ArrayList<Recipe>();
        Fixed_Recipes.add(new Recipe("Chicken Rezala",
                "Recipe Servings\n" +
                ":\t8\n" +
                "Recipe Cook Time\n" +
                ":\t1 Hour\n" +
                "..................................................................\n" +
                "Murg Rezala is a chicken curry popular in Bengal. A dinner party piece of chicken in yoghurt, coconut, cream and cashew nut paste, finished with silver leaf. Goes best with roomali roti\n\n" +
                "Ingredients\n" +
                "1 kg boneless chicken cubes \n" +
                "\n" +
                "300 gm white onions \n" +
                "\n" +
                "20 gm ginger \n" +
                "\n" +
                "20 gm garlic \n" +
                "\n" +
                "12 green cardamoms \n" +
                "\n" +
                "5 gm white pepper powder \n" +
                "\n" +
                "20 gm desiccated coconut \n" +
                "\n" +
                "50 gm cashewnuts \n" +
                "\n" +
                "250 gm curd \n" +
                "\n" +
                "150 gm khoya\n" +
                "\n" +
                "250 gm ghee\n" +
                "\n" +
                "2 drops kewra jal\n" +
                "\n" +
                "2 drops mitha ittr\n" +
                "\n" +
                "2 silver leaves \n" +
                "\n" +
                "Salt to taste\n\n\n\n" +
                "Method\n" +
                "Wash and clean chicken pieces. Blanch in a pan of boiling water, remove the scum, drain and keep aside. \n" +
                "\n" +
                "Extract the juice of ginger and garlic and keep aside. \n" +
                "\n" +
                "Grind separately onions, cashew nuts and coconut to a fine paste. \n" +
                "\n" +
                "In a heavy bottomed pan place the chicken, pour enough water to cover, add salt, green cardamoms and bring to boil, then simmer. \n" +
                "\n" +
                "When the chicken is half cooked, add the ground onions and the ginger-garlic juice. Cook until dry. \n" +
                "\n" +
                "Then add ghee and the beaten curd, fry till the meat is dry.\n" +
                "\n" +
                "Add the nut paste and coconut and fry for 2 to 3 minutes, taking care that the masala does not brown. \n" +
                "\n" +
                "Then add white pepper and 1 cup of water, or enough for a thick gravy. Simmer for a while. \n" +
                "\n" +
                "Remove from fire add kewra jal, mitha ittr and mashed khoya. Blend well. \n" +
                "\n" +
                "Finally add the cream. \n" +
                "\n" +
                "Serve hot garnished with silver leaf. ",R.drawable.chicken_rezala));
        Fixed_Recipes.add(new Recipe("Beef Vhuna","Serves 4-6\n" +
                "\n" +
                "Ingredients:\n" +
                "\n" +
                "2 medium onions, peeled and finely chopped\n" +
                "2.5cm (1 inch) piece fresh ginger root, peeled and grated\n" +
                "4 cloves of garlic, peeled and crush\n" +
                "1 teaspoon (5ml) salt\n" +
                "2 teaspoons (10ml) chilli powder\n" +
                "1 teaspoon (5ml) ground cumin\n" +
                "2 teaspoons (10ml) ground coriander\n" +
                "1/4 teaspoon (1ml) ground turmeric\n" +
                "900g (2 lb) lean beef, cut into 2.5cm (1 inch) cubes\n" +
                "3 tablespoons (45ml) cooking oil\n" +
                "3 green cardamom pods, lightly crushed\n" +
                "1/2 teaspoon (2.5ml) black peppercorns\n" +
                "2 fresh green chillies, finely chopped\n" +
                "3/4 cup (180ml or 6 fl oz) water\n" +
                "2 medium tomatoes, finely chopped\n" +
                "2 tablespoons (30ml) tamarind paste\n" +
                "1-3 tablespoons (15-45ml) lemon juice (3 tablespoons of you like a sour curry)\n" +
                "2 tablespoons (30ml) finally chopped fresh coriander\n" +
                "\n" +
                "Method:\n" +
                "\n" +
                "Add the onions, fresh ginger, garlic, salt, chilli powder, cumin, coriander, turmeric and beef to a large bowl, mix well, cover and leave for 60 minutes.\n" +
                "\n" +
                "Heat the cooking oil in a large frying pan or saucepan (you need one with a lid) over a medium to high heat. Add the cardamom pods and black peppercorns and fry for 3 minutes, stirring a few times.\n" +
                "\n" +
                "Add the beef and its marinade, mix well and sauté for 4-6 minutes until the beef browns, turning often. Add the chillies and water, mix well, bring the ingredients to a simmer, reduce the heat, cover and simmer for 60 minutes, stirring often\n" +
                "(add a little more water if the curry becomes too dry).\n" +
                "\n" +
                "Add the chopped tomatoes, mix well, increase the heat to high and cook uncovered for 10 minutes, stirring all the time (add a little more water if the curry becomes too dry).\n" +
                "\n" +
                "Add the tamarind paste and lemon juice. Mix well followed by fresh coriander. Once done serve hot with rice.",R.drawable.beef_vhuna));
        Fixed_Recipes.add(new Recipe("Illish Dopeyazi","Ingredients\n" +
                "\n" +
                "Ilish (Hilsha) Fish 1 - Ground Mustard Paste 3 tbsp - Red Chili Powder 1 tsp - Turmeric Powder 1 tsp - Onion (chopped) 4 - Salt - as needed - Cooking Oil - 1/4 cup\n" +
                "\n\n" +
                "Method\n" +
                "\n" +
                "Make a fine paste of ground mustard and green chilies. Heat oil in a frying pan and add onions. Sauté until onions get brown color. Add all the masala and the mustard paste. Stir fry for some minutes, add 1/3 cup of warm water (or more) and then add fish pieces. Mix thoroughly and cook in low heat until fish is tender, extra water is vaporized, and the oil gets separated.Note: You may also bake shorshe ilish. You have to mix all the masala and oil with fish pieces before you start baking. If you don't have Hilsha fish, you may try this recipe with Salmon.",R.drawable.illisih_dopeyazi));
        Fixed_Recipes.add(new Recipe("Muri Makha","Preparation Time : 16-20 minutes\n" +
                "Cooking time : 0-5 minutes\n" +
                "Servings : 4\n\n" +
                "\n"+"Ingredients\n" +
                "Puffed rice (kurmura/murmura) 2 cups\n" +
                "Onion chopped 1 medium\n" +
                "Sprouted black Bengal gram (kala chana) boiled1/4 cup\n" +
                "Cucumber 1/2 inch pieces 1 small\n" +
                "Tomato 1/2 inch pieces 1 small\n" +
                "Green chillies chopped 2\n" +
                "Roasted peanuts skinned 2 tablespoons\n" +
                "Fresh coriander leaves chopped 2 tablespoons\n" +
                "Mustard oil taken from a pickle2 tablespoons\n" +
                "Fresh coconut sliced thinly for garnish\n" +
                "For masala\n" +
                "Red chilli powder 1/2 tablespoon\n" +
                "Black salt (kala namak) 1 teaspoon\n" +
                "Roasted cumin powder 1 tablespoon\n" +
                "Chaat masala 1 teaspoo\n\n\n" +
                "Method\n" +
                "Step 1\n" +
                "In large bowl combine puffed rice, onion, sprouted chana, cucumber, tomato, green chillies, peanuts, coriander leaves and toss to mix well.Step 2\n" +
                "Add mustard oil and jhaal muri masala and toss again to mix well. Serve immediately garnished with sliced coconut." ,R.drawable.muri_makha));
        Fixed_Recipes.add(new Recipe("Mango Chatni","Ingredients\n" +
                "4 pounds fresh mangos, ripe but not too soft, peeled\n" +
                "3 tablespoons vegetable oil\n" +
                "1 teaspoon chile flakes\n" +
                "2 1/2 cups medium dice red onion\n" +
                "1/4 cup minced fresh ginger\n" +
                "1 cup small dice red bell pepper\n" +
                "8 ounces unsweetened pineapple juice\n" +
                "4 ounces cider vinegar\n" +
                "1/2 cup brown sugar\n" +
                "1 1/2 tablespoons curry powder\n" +
                "Kosher salt and fresh ground white pepper\n" +
                "1/2 cup raisins or golden raisins\n" +
                "1/2 cup toasted, roughly chopped macadamia nuts\n" +
                "\n" +
                "\n" +
                "Cut the mango flesh away from the pit. The pit is shaped similar to an obelisk, so you'll end up with 2 large pieces and 2 smaller pieces from each mango. Roughly chop the flesh.\n" +
                "\n" +
                "In a saute pan heat the oil and add the chile flakes. Be careful not to burn the chile, just toast to flavor the oil. Add the onions and sweat until soft. Add the ginger and bell pepper and saute for 1 to 2 minutes. Finally add the mango and cook for 1 more minute.\n" +
                "\n" +
                "In a separate bowl, combine the pineapple juice, vinegar, sugar, and curry powder. Add this mixture to the pan. Stir to combine. Bring the mixture to a bare simmer and reduce for about 30 minutes, stirring frequently. Season with salt and pepper. Add the raisins and the nuts and transfer to another container over an ice bath. I used a mild yellow curry powder, but if you want it hotter go for red.\n" +
                "\n"
                ,R.drawable.mango_chatni));
        Fixed_Recipes.add(new Recipe("Chingri Vorta","Ingredients:\n" +
                "1/2 lb large shrimp, peeled, deveined and tails off\n" +
                "salt, pepper and olive oil\n" +
                "3/4 lb string beans, stems off\n" +
                "zest of 1 lemon\n" +
                "1 tsp lemon juice\n" +
                "1/2 cup cilantro, roughly chopped\n" +
                "1/4 chopped yellow onion\n" +
                "1 tbsp mustard oil \n" +
                "1/2 tsp salt (or to taste)\n" +
                "2 green chilis, roughly chopped \n" +
                "Method:\n" +
                "This is unconventional, but it’s the only way I cook shrimp: toss shrimp with 1/4 tsp salt, 1/8 tsp pepper and 2 tbsp extra virgin olive oil. Spread onto a baking sheet and roast in a 400 degree F oven for 7 minutes.\n" +
                "Next boil some water in a large pot. Once it comes to a full boil, add 1 tsp salt and add the green beans. It should take 5 minutes to cook through. Drain, chop roughly and add to food processor.\n" +
                "Add the remaining ingredients to the food processor and blend to combine. Serve with rice.",R.drawable.chingri_vorta));
        adapter = new ArrayAdapter(this, R.layout.recipe_item, Fixed_Recipes) {

            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                View V = convertView;

                if (convertView == null) {
                    LayoutInflater vi = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                    V = vi.inflate(R.layout.recipe_item, null);
                }

                TextView T = (TextView) V.findViewById(R.id.Recipe_Text);
                T.setText(Fixed_Recipes.get(position).Food_Name);

                ImageView I = (ImageView)V.findViewById(R.id.Recipe_Image);
                I.setImageDrawable(this.getContext().getResources().getDrawable(Fixed_Recipes.get(position).Resource_Name));
                return V;
            }
        };

        ListAdapter L = (ListAdapter)adapter;
        myListView.setAdapter(L);

        //On click listener to handle on click events for ListView items
        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Recipe R = Fixed_Recipes.get(position);
                Intent I = new Intent(getBaseContext(), Recipe_Page.class);
                I.putExtra("Img", R.Resource_Name);
                I.putExtra("Dta", R.Recipe);
                I.putExtra("N", R.Food_Name);
                startActivity(I);
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        //getMenuInflater().inflate(R.menu.menu_food_recipes, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        //int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        //if (id == R.id.action_settings) {
        //    return true;
        //}

        //return super.onOptionsItemSelected(item);
        return false;
    }
}
