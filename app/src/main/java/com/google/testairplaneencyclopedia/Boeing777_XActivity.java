package com.google.testairplaneencyclopedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class Boeing777_XActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView b777x_1;
    ImageView b777x_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boeing777_x);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        b777x_1= (ImageView) findViewById(R.id.b777x_1);
        b777x_2= (ImageView) findViewById(R.id.b777x_2);

        b777x_1.setOnClickListener(this);
        b777x_2.setOnClickListener(this);
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
        if (view.getId() == b777x_1.getId()) {
            fade();}
        else if (view.getId()==b777x_2.getId()){
            fade();}
    }

    private void fade() {
        b777x_1.animate().alpha(1f-b777x_1.getAlpha()).setDuration(5);
        b777x_2.animate().alpha(1f-b777x_2.getAlpha()).setDuration(5);
    }
}
