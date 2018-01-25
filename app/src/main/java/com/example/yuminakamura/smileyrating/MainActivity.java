package com.example.yuminakamura.smileyrating;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.hsalf.smilerating.SmileRating;

import static android.R.attr.level;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SmileRating smileRating = (SmileRating)findViewById(R.id.smile_rating);
        smileRating.setOnSmileySelectionListener(new SmileRating.OnSmileySelectionListener() {
            @Override
            public void onSmileySelected(int smiley, boolean reselected) {
                // reselected is false when user selects different smiley that previously selected one
                // true when the same smiley is selected.
                // Except if it first time, then the value will be false.
                switch (smiley) {
                    case SmileRating.BAD:
                        Toast.makeText(MainActivity.this, "BAD", Toast.LENGTH_SHORT);
                        break;
                    case SmileRating.GOOD:
                        Toast.makeText(MainActivity.this, "GOOD", Toast.LENGTH_SHORT);
                        break;
                    case SmileRating.GREAT:
                        Toast.makeText(MainActivity.this, "GREAT", Toast.LENGTH_SHORT);
                        break;
                    case SmileRating.OKAY:
                        Toast.makeText(MainActivity.this, "OKAY", Toast.LENGTH_SHORT);
                        break;
                    case SmileRating.TERRIBLE:
                        Toast.makeText(MainActivity.this, "TERRIBLE", Toast.LENGTH_SHORT);
                        break;
                }
            }
        });
        smileRating.setOnSmileySelectionListener(new SmileRating.OnSmileySelectionListener() {
            @Override
            public void onSmileySelected(int smiley, boolean reselected) {
                Toast.makeText(MainActivity.this,"Selected rating " + level, Toast.LENGTH_SHORT);
            }
        });
    }
}