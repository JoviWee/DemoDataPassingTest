package sg.edu.rp.c346.id20008787.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView tvAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvAnswer = findViewById(R.id.textView);
        Intent intentReceived = getIntent();
        int value = intentReceived.getIntExtra("value", -1);
        char Cvalue = intentReceived.getCharExtra("Value", 'z');
        double Dvalue = intentReceived.getDoubleExtra("Value", 00.00);
        tvAnswer.setText(" Integer value received is " + value +"\n Char Value received is " + Cvalue +
                "\n Double value received is " + Dvalue);



    }
}