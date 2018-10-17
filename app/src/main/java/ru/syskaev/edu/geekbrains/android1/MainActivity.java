package ru.syskaev.edu.geekbrains.android1;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(R.string.weather_app);
        TextView helloField = findViewById(R.id.hello_world);
        helloField.setText(getHelloText());
    }

    private String getHelloText() {
        Resources resources = getResources();
        String hello_target = resources.getString(R.string.hello_target);
        int currentHour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
        String helloType;
        if ( 5 <= currentHour && currentHour < 12 )
            helloType = resources.getString(R.string.morning_hello);
        else if ( 12 <= currentHour && currentHour < 18 )
            helloType = resources.getString(R.string.afternoon_hello);
        else if ( 18 <= currentHour && currentHour < 21 )
            helloType = resources.getString(R.string.afternoon_hello);
        else
            helloType = resources.getString(R.string.afternoon_hello);
        return helloType + ", " + hello_target + "!";
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return false;
    }

}
