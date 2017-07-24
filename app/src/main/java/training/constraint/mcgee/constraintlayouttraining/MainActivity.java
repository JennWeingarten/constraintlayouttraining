package training.constraint.mcgee.constraintlayouttraining;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    Button exercise1;
    Button exercise2;
    Button exercise3;
    Button exercise4;
    Button exercise5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        exercise1 = findViewById(R.id.exercise1);
        exercise1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Exercise1.class));
            }
        });
        exercise2 = findViewById(R.id.exercise2);
        exercise2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Exercise2.class));
            }
        });
        exercise3 = findViewById(R.id.exercise3);
        exercise3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Exercise3.class));
            }
        });
        exercise4 = findViewById(R.id.exercise4);
        exercise4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Exercise4.class));
            }
        });
        exercise5 = findViewById(R.id.exercise5);
        exercise5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Exercise5.class));
            }
        });
    }

}
