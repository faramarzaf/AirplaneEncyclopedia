package com.google.testairplaneencyclopedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class An70Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView an70_1;
    ImageView an70_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_an70);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        an70_1 = (ImageView) findViewById(R.id.an70_1);
        an70_2 = (ImageView) findViewById(R.id.an70_2);

        an70_1.setOnClickListener(this);
        an70_2.setOnClickListener(this);
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
        if (view.getId() == an70_1.getId()) {
            fade();}
        else if (view.getId()==an70_2.getId()){
            fade();}
    }

    private void fade() {
        an70_1.animate().alpha(1f-an70_1.getAlpha()).setDuration(5);
        an70_2.animate().alpha(1f-an70_2.getAlpha()).setDuration(5);
    }
}
