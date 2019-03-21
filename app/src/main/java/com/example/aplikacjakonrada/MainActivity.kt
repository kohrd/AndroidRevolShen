package com.example.aplikacjakonrada

import android.content.Intent
import android.content.Intent.ACTION_VIEW
import android.graphics.Color
import android.net.Uri
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
            buttonYes.setBackgroundColor(Color.WHITE);
            var message = Toast.makeText(applicationContext, "Dziękuję! masz zdjecie kosmosu", Toast.LENGTH_SHORT); // chmurkla z informacją
            message.show();
            var solarSystemPicture = "https://i.ytimg.com/vi/libKVRa01L8/maxresdefault.jpg";
            var showSolarSystem = Intent(ACTION_VIEW, Uri.parse(solarSystemPicture)); // ACTION_VIEW - pokaz dane Intent to intencja komunikacja miedzy aktywnosciami
            startActivity(showSolarSystem);

        }

        buttonNo.setOnClickListener{
            buttonYes.setText("Tu Cię mam!")
            buttonYes.setBackgroundColor(Color.RED);
            buttonNo.setText("teraz nie działa")
            buttonNo.setBackgroundColor(Color.BLACK);
            var message = Toast.makeText(applicationContext, "Kocham słonie!!", Toast.LENGTH_SHORT);
            message.show();

            var elephantAdress = "https://i.ytimg.com/vi/8H1DgY-U7zE/maxresdefault.jpg";
            var showElephantPicture = Intent(ACTION_VIEW, Uri.parse(elephantAdress)); // ACTION_VIEW - pokaz dane Intent to intencja komunikacja miedzy aktywnosciami
            startActivity(showElephantPicture);

        }

    }
}
