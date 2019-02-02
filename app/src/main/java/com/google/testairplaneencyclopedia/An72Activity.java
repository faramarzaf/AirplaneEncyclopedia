package com.google.testairplaneencyclopedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class An72Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView an72_1;
    ImageView an72_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_an72);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        an72_1 = (ImageView) findViewById(R.id.an72_1);
        an72_2 = (ImageView) findViewById(R.id.an72_2);

        an72_1.setOnClickListener(this);
        an72_2.setOnClickListener(this);
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
        if (view.getId() == an72_1.getId()) {
            fade();}
        else if (view.getId()==an72_2.getId()){
            fade();}
    }

    private void fade() {
        an72_1.animate().alpha(1f-an72_1.getAlpha()).setDuration(5);
        an72_2.animate().alpha(1f-an72_2.getAlpha()).setDuration(5);
    }
}
