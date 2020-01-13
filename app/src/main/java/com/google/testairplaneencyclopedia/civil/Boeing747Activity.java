package com.google.testairplaneencyclopedia.civil;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.google.testairplaneencyclopedia.R;

public class Boeing747Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView b747_1;
    ImageView b747_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boeing747);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        b747_1 = (ImageView) findViewById(R.id.b747_1);
        b747_2 = (ImageView) findViewById(R.id.b747_2);

        b747_1.setOnClickListener(this);
        b747_2.setOnClickListener(this);
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
        if (view.getId() == b747_1.getId()) {
            fade();}
        else if (view.getId()==b747_2.getId()){
            fade();}
    }

    private void fade() {
        b747_1.animate().alpha(1f-b747_1.getAlpha()).setDuration(5);
        b747_2.animate().alpha(1f-b747_2.getAlpha()).setDuration(5);
    }
}
