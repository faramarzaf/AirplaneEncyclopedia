package com.google.testairplaneencyclopedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class Boeing757Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView b757_1;
    ImageView b757_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boeing757);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        b757_1 = (ImageView) findViewById(R.id.b757_1);
        b757_2 = (ImageView) findViewById(R.id.b757_2);

        b757_1.setOnClickListener(this);
        b757_2.setOnClickListener(this);
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
        if (view.getId() == b757_1.getId()) {
            fade();}
        else if (view.getId()==b757_2.getId()){
            fade();}
    }

    private void fade() {
        b757_1.animate().alpha(1f-b757_1.getAlpha()).setDuration(5);
        b757_2.animate().alpha(1f-b757_2.getAlpha()).setDuration(5);
    }
}
