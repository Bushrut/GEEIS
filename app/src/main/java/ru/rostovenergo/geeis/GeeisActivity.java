package ru.rostovenergo.geeis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class GeeisActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geeis);
    }

    public void onClickStart(View view) {
        Intent intentStart = new Intent(this, CalculationActivity.class);
        startActivity(intentStart);
    }
}
