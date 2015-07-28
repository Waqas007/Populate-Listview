package com.example.waqas.populatelistview;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Waqas on 5/26/2015.
 */
public class ShowListActivity extends Activity {

    ArrayList<String> showArrayList;
    ArrayList<String> namesArray;

    public void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.name_listview);

        ListView listView = (ListView) findViewById(R.id.listViewShow);
        showArrayList = new ArrayList<String>();

        getAnimalNames();

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,showArrayList);


        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedAnimal=showArrayList.get(position);

                Intent i = new Intent(getApplicationContext(),
                       TestActivity.class);


                i.putExtra("pos", selectedAnimal);
                startActivity(i);

               /* Toast.makeText(getApplicationContext(), "Animal Selected : " + selectedAnimal, Toast.LENGTH_LONG).show();

                if(selectedAnimal == showArrayList.get(position) ) {
                    Intent intentAnimalList = new Intent(getApplicationContext(), TestActivity.class);
                    startActivity(intentAnimalList);
                }
                else {
                    Toast.makeText(getApplicationContext(), "Not exist Animal Selected : ", Toast.LENGTH_LONG).show();
                }*/
            }
        });
    }

    void getAnimalNames()
    {
        showArrayList.add("DOG");
        showArrayList.add("CAT");
        showArrayList.add("HORSE");
        showArrayList.add("ELEPHANT");
        showArrayList.add("LION");
        showArrayList.add("COW");
        showArrayList.add("MONKEY");
        showArrayList.add("DEER");
        showArrayList.add("RABBIT");
        showArrayList.add("BEER");
        showArrayList.add("DONKEY");
        showArrayList.add("LAMB");
        showArrayList.add("GOAT");


    }
}
