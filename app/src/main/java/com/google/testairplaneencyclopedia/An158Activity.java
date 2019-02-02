package com.google.testairplaneencyclopedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class An158Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView an158_1;
    ImageView an158_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_an158);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        an158_1= (ImageView) findViewById(R.id.an158_1);
        an158_2= (ImageView) findViewById(R.id.an158_2);

        an158_1.setOnClickListener(this);
        an158_2.setOnClickListener(this);
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
        if (view.getId() == an158_1.getId()) {
            fade();}
        else if (view.getId()==an158_2.getId()){
            fade();}
    }

    private void fade() {
        an158_1.animate().alpha(1f-an158_1.getAlpha()).setDuration(5);
        an158_2.animate().alpha(1f-an158_2.getAlpha()).setDuration(5);
    }
}
