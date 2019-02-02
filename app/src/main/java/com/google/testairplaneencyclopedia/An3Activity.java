package com.google.testairplaneencyclopedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class An3Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView an3_1;
    ImageView an3_2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_an3);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        }
        an3_1 = (ImageView) findViewById(R.id.an3_1);
        an3_2 = (ImageView) findViewById(R.id.an3_2);


        an3_1.setOnClickListener(this);
        an3_2.setOnClickListener(this);

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
        if (view.getId() == an3_1.getId()) {
            fade();}
        else if (view.getId()==an3_2.getId()){
            fade();}
    }

    private void fade() {
        an3_1.animate().alpha(1f-an3_1.getAlpha()).setDuration(5);
        an3_2.animate().alpha(1f-an3_2.getAlpha()).setDuration(5);
    }
}
