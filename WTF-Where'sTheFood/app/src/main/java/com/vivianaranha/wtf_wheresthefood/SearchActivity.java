package com.vivianaranha.wtf_wheresthefood;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class SearchActivity extends AppCompatActivity {


    public void search(View view) {
        Intent resultsIntents = new Intent(this, ResultsActivity.class);

        startActivity(resultsIntents);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
    }


}
