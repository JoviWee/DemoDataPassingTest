package sg.edu.rp.c346.id20008787.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button buttonPassInteger;
    Button buttonPassChar;
    TextView tvDouble;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonPassInteger = findViewById(R.id.buttonPassInteger);
        buttonPassChar = findViewById(R.id.buttonPassChar);
        tvDouble = findViewById(R.id.tvDouble);

        buttonPassInteger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("Value", 1);
                startActivity(intent);
            }
        });

        buttonPassChar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("Value", 'a');
                startActivity(intent);
            }
        });

        tvDouble.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("Value", 99.99);
                startActivity(intent);
            }
        });

    }
}