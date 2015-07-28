package com.example.waqas.populatelistview;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get The Refference Of Button
        Button btnShowAnimal=(Button)findViewById(R.id.butttonShow);


        // Set OnClick Listener on  button  and start AnimalListActivity when clicked on Button
        btnShowAnimal.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub

                /// Create Intent for AnimalListActivity and Start The Activity
                Intent intentAnimalList = new Intent(getApplicationContext(), ShowListActivity.class);
                startActivity(intentAnimalList);
            }
        });
    }
    }



