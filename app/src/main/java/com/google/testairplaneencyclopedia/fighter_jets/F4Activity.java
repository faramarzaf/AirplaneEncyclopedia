package com.google.testairplaneencyclopedia.fighter_jets;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.google.testairplaneencyclopedia.R;

public class F4Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView f4_1;
    ImageView f4_2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_f4);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        f4_1 = (ImageView) findViewById(R.id.f4_1);
        f4_2 = (ImageView) findViewById(R.id.f4_2);


        f4_1.setOnClickListener(this);
        f4_2.setOnClickListener(this);


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
        if (view.getId() == f4_1.getId()) {
     fade();}
        else if (view.getId()==f4_2.getId()){
            fade();}

    }

    private void fade() {
        f4_1.animate().alpha(1f-f4_1.getAlpha()).setDuration(10);
        f4_2.animate().alpha(1f-f4_2.getAlpha()).setDuration(10);

    }

}