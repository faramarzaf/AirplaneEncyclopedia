package com.google.testairplaneencyclopedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class A330Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView a330_1;
    ImageView a330_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a330);

        if (getSupportActionBar()!= null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        a330_1 = (ImageView) findViewById(R.id.a330_1);
        a330_2 = (ImageView) findViewById(R.id.a330_2);

        a330_1.setOnClickListener(this);
        a330_2.setOnClickListener(this);
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
        if (view.getId() == a330_1.getId()) {
            fade();}
        else if (view.getId()==a330_2.getId()){
            fade();}
    }

    private void fade() {

        a330_1.animate().alpha(1f-a330_1.getAlpha()).setDuration(5);
        a330_2.animate().alpha(1f-a330_2.getAlpha()).setDuration(5);
    }


}
