package com.rha.foodilous;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.telephony.PhoneNumberUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;

import java.text.NumberFormat;


public class bmi_calculator extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi_calculator);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
       // getMenuInflater().inflate(R.menu.menu_bmi_calculator, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
       // int id = item.getItemId();

        //noinspection SimplifiableIfStatement
      //  if (id == R.id.action_settings) {
       //     return true;
       // }

       // return super.onOptionsItemSelected(item);
        return false;
    }

    //To check if a string is numeric
    private boolean isNumeric(String str)
    {
        try
        {
            double d = Float.parseFloat(str);
        }
        catch(NumberFormatException nfe)
        {
            return false;
        }
        return true;
    }

    //To process the caluclation of BMI
    private float Process_BMI (float weight, float height) {

        return (float) (weight * 4.88 / (height * height));
    }


    //Show the BMI text
    public void Calculate_BMI(View V)
    {
        EditText W = (EditText)findViewById(R.id.Weight_Text);
        EditText H = (EditText)findViewById(R.id.Height_Text);

        String W_T, H_T;
        W_T = W.getText().toString();
        H_T = H.getText().toString();

        float val_w, val_h;

        if (W_T != "")
        {
            if (H_T != "")
            {
                if (isNumeric(W_T) == true && isNumeric(H_T) == true)
                {
                    val_w = Float.parseFloat(W_T);
                    val_h = Float.parseFloat(H_T);

                    if (val_h > 0f)
                    {
                        float BMI = Process_BMI(val_w, val_h);
                        TextView T2 = (TextView)findViewById(R.id.Result);
                        T2.setText("Your BMI : " + BMI);

                        ScrollView S = (ScrollView)findViewById(R.id.Scroll_View);
                        S.fullScroll(ScrollView.FOCUS_UP);
                    }
                }
            }
        }
    }
}
