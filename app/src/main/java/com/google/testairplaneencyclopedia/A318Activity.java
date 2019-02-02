package com.google.testairplaneencyclopedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class A318Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView a318_1;
    ImageView a318_2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a318);

        if (getSupportActionBar()!= null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        a318_1 = (ImageView) findViewById(R.id.a318_1);
        a318_2 = (ImageView) findViewById(R.id.a318_2);

        a318_1.setOnClickListener(this);
        a318_2.setOnClickListener(this);

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

        if (view.getId() == a318_1.getId()) {
            fade();}
        else if (view.getId()==a318_2.getId()){
            fade();}

    }

    private void fade() {
        a318_1.animate().alpha(1f-a318_1.getAlpha()).setDuration(5);
        a318_2.animate().alpha(1f-a318_2.getAlpha()).setDuration(5);
    }
}
