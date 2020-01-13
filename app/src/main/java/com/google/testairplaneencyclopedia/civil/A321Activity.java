package com.google.testairplaneencyclopedia.civil;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.google.testairplaneencyclopedia.R;

public class A321Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView a321_1;
    ImageView a321_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a321);
        if (getSupportActionBar()!= null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        a321_1 = (ImageView) findViewById(R.id.a321_1);
        a321_2 = (ImageView) findViewById(R.id.a321_2);

        a321_1.setOnClickListener(this);
        a321_2.setOnClickListener(this);

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
        if (view.getId() == a321_1.getId()) {
            fade();}
        else if (view.getId()==a321_2.getId()){
            fade();}

    }

    private void fade() {

        a321_1.animate().alpha(1f-a321_1.getAlpha()).setDuration(5);
        a321_2.animate().alpha(1f-a321_2.getAlpha()).setDuration(5);
    }


}
