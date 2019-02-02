package com.google.testairplaneencyclopedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class Boeing777Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView b777_1;
    ImageView b777_2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boeing777);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        b777_1= (ImageView) findViewById(R.id.b777_1);
        b777_2= (ImageView) findViewById(R.id.b777_2);

        b777_1.setOnClickListener(this);
        b777_2.setOnClickListener(this);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }


    @Override
    public void onClick(View view) {
        if (view.getId() == b777_1.getId()) {
            fade();}
        else if (view.getId()==b777_2.getId()){
            fade();}
    }

    private void fade() {
        b777_1.animate().alpha(1f-b777_1.getAlpha()).setDuration(5);
        b777_2.animate().alpha(1f-b777_2.getAlpha()).setDuration(5);
    }
}
