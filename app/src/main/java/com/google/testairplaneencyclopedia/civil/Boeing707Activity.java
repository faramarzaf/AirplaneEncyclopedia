package com.google.testairplaneencyclopedia.civil;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.google.testairplaneencyclopedia.R;

public class Boeing707Activity extends AppCompatActivity implements View.OnClickListener {

ImageView b707_1;
    ImageView b707_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boeing707);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        b707_1= (ImageView) findViewById(R.id.b707_1);
        b707_2= (ImageView) findViewById(R.id.b707_2);

        b707_1.setOnClickListener(this);
        b707_2.setOnClickListener(this);

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
        if (view.getId() == b707_1.getId()) {
            fade();}
        else if (view.getId()==b707_2.getId()){
            fade();}
    }

    private void fade() {
        b707_1.animate().alpha(1f-b707_1.getAlpha()).setDuration(5);
        b707_2.animate().alpha(1f-b707_2.getAlpha()).setDuration(5);
        
    }
}
