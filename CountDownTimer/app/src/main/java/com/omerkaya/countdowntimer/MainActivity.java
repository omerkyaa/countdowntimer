package com.omerkaya.countdowntimer;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);

        new CountDownTimer(10000,1000){
      //mili saniye olduğu için böyle yazılır. 10 saniye sayacak ve saniyede 1 aralığında sayacak.

            @Override
            public void onTick(long millisUntilFinished) {
                textView.setText("Left: " + millisUntilFinished / 1000);
                //1000'e böldük çünkü mili saniye olarak değil de saniye olarak göstersin diye.

            }

            @Override
            public void onFinish() {
                //saniye bitince napayım diyor onu yazmalıyız.
                //aşağıdakini yaparsak altta uyarı mesajı verir.

                Toast.makeText(getApplicationContext(), "Done!", Toast.LENGTH_LONG).show();
                
            //sonunda ne yazmasını istiyorsak aşağıya onu yazabiliriz.
                textView.setText("Finished!");


            }
        }.start();


    }
}