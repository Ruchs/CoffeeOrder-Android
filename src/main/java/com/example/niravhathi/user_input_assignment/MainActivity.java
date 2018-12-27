package com.example.niravhathi.user_input_assignment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    TextView quantityValue_TextView, priceValue_TextView;
    Button order_Button;
    int numberOfCoffees = 0, priceOfCoffee = 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        quantityValue_TextView = (TextView) findViewById(R.id.quantityValue_TextView);
        priceValue_TextView = (TextView) findViewById(R.id.priceValue_TextView);
        order_Button = (Button) findViewById(R.id.order_Button);
    }

    public void submitOrder(View view) {
        Toast.makeText(getApplicationContext(), "Order taken successfully", Toast.LENGTH_LONG).show();
        numberOfCoffees = 0;
        setQuantity(numberOfCoffees);
        setPrice(numberOfCoffees * priceOfCoffee);
    }

    public void setQuantity(int numberOfCoffees) {
        quantityValue_TextView.setText("" + numberOfCoffees);
    }

    public void setPrice(int priceOfCoffee) {
        priceValue_TextView.setText(NumberFormat.getCurrencyInstance().format(priceOfCoffee));
    }

    public void incrementOfQuantity(View view) {
        numberOfCoffees += 1;
        setQuantity(numberOfCoffees);
        setPrice(numberOfCoffees * priceOfCoffee);
    }

    public void decrementOfQuantity(View view) {
        if (numberOfCoffees > 0)
            numberOfCoffees -= 1;
        setQuantity(numberOfCoffees);
        setPrice(numberOfCoffees * priceOfCoffee);
    }
}
