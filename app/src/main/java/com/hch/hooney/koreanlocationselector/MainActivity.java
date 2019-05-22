package com.hch.hooney.koreanlocationselector;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    private final String TAG = MainActivity.class.getSimpleName();

    private Spinner area1, area2;
    private String s_area, s_area2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init() {
        area1 = findViewById(R.id.main_area_spinner);
        area1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String s_select = area1.getItemAtPosition(position).toString();
                Log.i(TAG, "Selected Area : " + s_select);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                s_area = "전국";
            }
        });

        area2 = findViewById(R.id.main_area_spinner2);
    }
}
