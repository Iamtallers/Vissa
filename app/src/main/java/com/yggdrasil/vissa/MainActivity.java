package com.yggdrasil.vissa;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.net.URL;


public class MainActivity extends Activity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }



    public void onClickBegin (View view) {
        CountryExpertLogic pickURL = new CountryExpertLogic();

        Spinner countriesA = findViewById(R.id.countriesA);
        Spinner countriesB = findViewById(R.id.countriesB);


        String selectB = String.valueOf(countriesB.getSelectedItem());
        String selectA = String.valueOf(countriesA.getSelectedItem());

        if (selectB.equals(selectA)) {
            TextView myText = findViewById(R.id.ActivityOneTextTwo);
            myText.setText("You cant pick the same country");

        } else {


            String useLink = pickURL.selectUrl(selectB, selectA);


            TextView myText = findViewById(R.id.ActivityOneTextTwo);
            myText.setText(useLink);

            try{

                URL url = new URL(useLink);
//

            }catch (Exception e)
            {
                myText.setText("The Uri conversion failed");

            }
            finally{
                myText.setText("we are here! adadf");
            }



        }

    }





}
