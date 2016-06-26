package ru.rostovenergo.geeis;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class CalculationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculation);

    }

    public void onClickCalculation(View view) {
        TextView constItem = (TextView) findViewById(R.id.text_field_constant_item);
        double constantItem = Double.parseDouble(constItem.getText().toString());

        TextView aImpulse = (TextView) findViewById(R.id.text_field_amout_impulse);
        double amountimpulse = Double.parseDouble(aImpulse.getText().toString());

        TextView aTime = (TextView) findViewById(R.id.text_field_amout_time);
        double amountTime = Double.parseDouble(aTime.getText().toString());
        double resultCalculation = amountimpulse * 3600 / (constantItem*amountTime);

        System.out.println(resultCalculation);
    }

}
