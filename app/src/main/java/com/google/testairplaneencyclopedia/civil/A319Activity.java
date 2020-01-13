package com.google.testairplaneencyclopedia.civil;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.google.testairplaneencyclopedia.R;

public class A319Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView a319_1;
    ImageView a319_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a319);

        if (getSupportActionBar()!= null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        a319_1 = (ImageView) findViewById(R.id.a319_1);
        a319_2 = (ImageView) findViewById(R.id.a319_2);

        a319_1.setOnClickListener(this);
        a319_2.setOnClickListener(this);
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
        if (view.getId() == a319_1.getId()) {
            fade();}
        else if (view.getId()==a319_2.getId()){
            fade();}
    }

    private void fade() {
        a319_1.animate().alpha(1f-a319_1.getAlpha()).setDuration(5);
        a319_2.animate().alpha(1f-a319_2.getAlpha()).setDuration(5);
    }
}
