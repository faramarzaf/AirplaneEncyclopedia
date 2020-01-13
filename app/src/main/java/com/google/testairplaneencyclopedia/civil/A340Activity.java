package com.google.testairplaneencyclopedia.civil;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.google.testairplaneencyclopedia.R;

public class A340Activity extends AppCompatActivity implements View.OnClickListener {

    ImageView a340_1;
    ImageView a340_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a340);

        if (getSupportActionBar()!= null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        a340_1 = (ImageView) findViewById(R.id.a340_1);
        a340_2 = (ImageView) findViewById(R.id.a340_2);

        a340_1.setOnClickListener(this);
        a340_2.setOnClickListener(this);

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
        if (view.getId()==a340_1.getId()){fade();}
        else if (view.getId()==a340_2.getId()){fade();}
    }

    private void fade() {
        a340_1.animate().alpha(1f-a340_1.getAlpha()).setDuration(5);
        a340_2.animate().alpha(1f-a340_2.getAlpha()).setDuration(5);
    }
}
