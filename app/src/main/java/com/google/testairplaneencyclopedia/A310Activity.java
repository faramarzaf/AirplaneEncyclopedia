package com.google.testairplaneencyclopedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class A310Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView a310_2;
    ImageView a310_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a310);

        if (getSupportActionBar()!= null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        a310_2 = (ImageView) findViewById(R.id.a310_2);
        a310_1 = (ImageView) findViewById(R.id.a310_1);

        a310_1.setOnClickListener(this);
        a310_2.setOnClickListener(this);

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
        if (view.getId() == a310_1.getId()) {
            fade();}
        else if (view.getId()==a310_2.getId()){
            fade();}
    }


    private void fade() {
        a310_1.animate().alpha(1f-a310_1.getAlpha()).setDuration(5);
        a310_2.animate().alpha(1f-a310_2.getAlpha()).setDuration(5);

    }
}
