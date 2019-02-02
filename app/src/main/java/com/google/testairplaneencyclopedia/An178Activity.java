package com.google.testairplaneencyclopedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class An178Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView an178_1;
    ImageView an178_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_an178);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        an178_1 = (ImageView) findViewById(R.id.an178_1);
        an178_2 = (ImageView) findViewById(R.id.an178_2);

        an178_1.setOnClickListener(this);
        an178_2.setOnClickListener(this);
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
        if (view.getId() == an178_1.getId()) {
            fade();}
        else if (view.getId()==an178_2.getId()){
            fade();}
    }

    private void fade() {
        an178_1.animate().alpha(1f-an178_1.getAlpha()).setDuration(5);
        an178_2.animate().alpha(1f-an178_2.getAlpha()).setDuration(5); }
}
