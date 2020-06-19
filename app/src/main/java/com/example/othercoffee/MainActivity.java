/**
 * IMPORTANT: Make sure you are using the correct package name.
 * This example uses the package name:
 * package com.example.android.justjava
 * If you get an error when copying this code into Android studio, update it to match teh package name found
 * in the project's AndroidManifest.xml file.
 **/
package com.example.othercoffee;
import java.text.NumberFormat;
import java.util.zip.Inflater;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

/**
 * This app displays an order form to order coffee.
 */

public class MainActivity extends AppCompatActivity {
    int quantity = 0;
    String mensaje;
    private int menu_main_activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        message(17, "San Francisco");
    }

    /**
     * This method is called when the order button is clicked.
     */

    public void submitOrder(View view) {

        int result = calculatePrice(quantity, 10);
        mensaje = "Total $ " + result;
        TextView quantityTextView = (TextView) findViewById(R.id.price_text_view);
        quantityTextView.setText("" + mensaje);
    }

    public void submitIncrement(View view) {
        quantity +=  1;
        displayquantity(quantity);
    }

    public void submitDecrement(View view) {
        if (quantity > 0){
            quantity -=  1;
            displayquantity(quantity);
        }
    }

    /**
     * This method displays the given quantity value on the screen.
     */

    private void displayquantity(int number) {

        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);

    }
    private String message(int temperature, String cityName){
       return "Welcome to "+cityName+" where the temperature is: "+temperature+" °F";
    }

    /**
     * This method displays the given price on the screen.
     */

    private int calculatePrice(int number, int price) {
         int total =  number * price;
        return total;
    }

}