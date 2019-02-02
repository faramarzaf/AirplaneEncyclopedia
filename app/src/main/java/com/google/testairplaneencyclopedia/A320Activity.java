package com.google.testairplaneencyclopedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class A320Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView a320_1;
    ImageView a320_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a320);

        if (getSupportActionBar()!= null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        a320_1= (ImageView) findViewById(R.id.a320_1);
        a320_2= (ImageView) findViewById(R.id.a320_2);

        a320_1.setOnClickListener(this);
        a320_2.setOnClickListener(this);

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
        if (view.getId() == a320_1.getId()) {
            fade();}
        else if (view.getId()==a320_2.getId()){
            fade();}
    }

    private void fade() {
        a320_1.animate().alpha(1f-a320_1.getAlpha()).setDuration(5);
        a320_2.animate().alpha(1f-a320_2.getAlpha()).setDuration(5);

    }
}
