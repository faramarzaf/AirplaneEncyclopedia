package com.google.testairplaneencyclopedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class Boeing767Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView b767_1;
    ImageView b767_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boeing767);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        b767_1 = (ImageView) findViewById(R.id.b767_1);
        b767_2 = (ImageView) findViewById(R.id.b767_2);

        b767_1.setOnClickListener(this);
        b767_2.setOnClickListener(this);
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
        if (view.getId() == b767_1.getId()) {
            fade();}
        else if (view.getId()==b767_2.getId()){
            fade();}
    }

    private void fade() {
        b767_1.animate().alpha(1f-b767_1.getAlpha()).setDuration(5);
        b767_2.animate().alpha(1f-b767_2.getAlpha()).setDuration(5);
    }
}
