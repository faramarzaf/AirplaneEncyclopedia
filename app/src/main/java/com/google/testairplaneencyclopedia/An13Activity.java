package com.google.testairplaneencyclopedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class An13Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView an13_1;
    ImageView an13_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_an13);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        an13_1 = (ImageView) findViewById(R.id.an13_1);
        an13_2 = (ImageView) findViewById(R.id.an13_2);

        an13_1.setOnClickListener(this);
        an13_2.setOnClickListener(this);
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
        if (view.getId() == an13_1.getId()) {
            fade();}
        else if (view.getId()==an13_2.getId()){
            fade();}
    }

    private void fade() {
        an13_1.animate().alpha(1f-an13_1.getAlpha()).setDuration(5);
        an13_2.animate().alpha(1f-an13_2.getAlpha()).setDuration(5);

    }
}
