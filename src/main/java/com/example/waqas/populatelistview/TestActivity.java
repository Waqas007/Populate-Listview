package com.example.waqas.populatelistview;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by Waqas on 5/26/2015.
 */
public class TestActivity extends Activity {

    TextView tv ;

    public void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.testactivity);

        tv = (TextView) findViewById(R.id.textView1);

       String pos=getIntent().getExtras().getString("pos");
        tv.setText(pos);
    }
}