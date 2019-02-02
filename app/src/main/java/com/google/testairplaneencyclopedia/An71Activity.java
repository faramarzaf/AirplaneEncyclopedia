package com.google.testairplaneencyclopedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class An71Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView an71_1;
    ImageView an71_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_an71);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        an71_1 = (ImageView) findViewById(R.id.an71_1);
        an71_2 = (ImageView) findViewById(R.id.an71_2);

        an71_1.setOnClickListener(this);
        an71_2.setOnClickListener(this);
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
        if (view.getId() == an71_1.getId()) {
            fade();}
        else if (view.getId()==an71_2.getId()){
            fade();}
    }

    private void fade() {
        an71_1.animate().alpha(1f-an71_1.getAlpha()).setDuration(5);
        an71_2.animate().alpha(1f-an71_2.getAlpha()).setDuration(5);
    }
}
