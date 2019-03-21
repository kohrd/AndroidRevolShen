package com.example.aplikacjakonrada

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        R.id.mainLayout dostep po klasie R i po id
        buttonYes.setOnClickListener{
            buttonYes.setText("Działa");
            buttonYes.setBackgroundColor(Color.BLUE);
            var message = Toast.makeText(applicationContext, "Dziękuję!", Toast.LENGTH_SHORT); // chmurkla z informacją
            message.show();
        }

        buttonNo.setOnClickListener{
            buttonYes.setText("Tu Cię mam!")
            buttonYes.setBackgroundColor(Color.RED);
            buttonNo.setText("teraz nie działa")
            buttonNo.setBackgroundColor(Color.YELLOW);
            var message = Toast.makeText(applicationContext, "Kocham słonie!!", Toast.LENGTH_SHORT);
            message.show();
        }

    }
}
