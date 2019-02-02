package com.google.testairplaneencyclopedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class Boeing747_8Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView b747_8i;
    ImageView b747_8ii;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boeing747_8);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        b747_8i = (ImageView) findViewById(R.id.b747_8i);
        b747_8ii = (ImageView) findViewById(R.id.b747_8ii);

        b747_8i.setOnClickListener(this);
        b747_8ii.setOnClickListener(this);
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
        if (view.getId() == b747_8i.getId()) {
            fade();}
        else if (view.getId()==b747_8ii.getId()){
            fade();}
    }

    private void fade() {
        b747_8i.animate().alpha(1f-b747_8i.getAlpha()).setDuration(5);
        b747_8ii.animate().alpha(1f-b747_8ii.getAlpha()).setDuration(5);
    }
}
