package com.google.testairplaneencyclopedia.civil;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.google.testairplaneencyclopedia.R;

public class Boeing737OriginalActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView b737original_1;
    ImageView b737original_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boeing737_original);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        b737original_1 = (ImageView) findViewById(R.id.b737original_1);
        b737original_2 = (ImageView) findViewById(R.id.b737original_2);

        b737original_1.setOnClickListener(this);
        b737original_2.setOnClickListener(this);
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
        if (view.getId() == b737original_1.getId()) {
            fade();}
        else if (view.getId()==b737original_2.getId()){
            fade();}
    }

    private void fade() {
        b737original_1.animate().alpha(1f-b737original_1.getAlpha()).setDuration(5);
        b737original_2.animate().alpha(1f-b737original_2.getAlpha()).setDuration(5);

    }
}
