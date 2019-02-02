package com.google.testairplaneencyclopedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class An132Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView an132_1;
    ImageView an132_2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_an132);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        an132_1= (ImageView) findViewById(R.id.an132_1);
        an132_2= (ImageView) findViewById(R.id.an132_2);

        an132_1.setOnClickListener(this);
        an132_2.setOnClickListener(this);
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
        if (view.getId() == an132_1.getId()) {
            fade();}
        else if (view.getId()==an132_2.getId()){
            fade();}
    }

    private void fade() {
        an132_1.animate().alpha(1f-an132_1.getAlpha()).setDuration(5);
        an132_2.animate().alpha(1f-an132_2.getAlpha()).setDuration(5);}
}
