package com.google.testairplaneencyclopedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class An2Activity extends AppCompatActivity implements View.OnClickListener {
    ImageView an2_1;
    ImageView an2_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_an2);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        an2_1 = (ImageView) findViewById(R.id.an2_1);
        an2_2 = (ImageView) findViewById(R.id.an2_2);

        an2_1.setOnClickListener(this);
        an2_2.setOnClickListener(this);
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
        if (view.getId() == an2_1.getId()) {
            fade();}
        else if (view.getId()==an2_2.getId()){
            fade();}

    }

    private void fade() {
        an2_1.animate().alpha(1f-an2_1.getAlpha()).setDuration(5);
        an2_2.animate().alpha(1f-an2_2.getAlpha()).setDuration(5);
    }
}
