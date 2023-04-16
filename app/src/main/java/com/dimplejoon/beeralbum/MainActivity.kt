package com.dimplejoon.beeralbum

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /* Tip
            constraint =>   contentを比例的に配置(proportional)
        */

        // 1. 画面がクリックされたことをプログラムが認識
        val yebisuImage = findViewById<ImageView>(R.id.yebisu)

        yebisuImage.setOnClickListener {

            Toast.makeText(this, "yebisuを選択しました", Toast.LENGTH_LONG).show()

            // 2. 画面がクリックされたら、次画面に遷移し、写真を拡大させて見せる

            val intent = Intent(this, YebisuActivity::class.java)
            startActivity(intent)
        }

        //３. yebisu以外の処理も行う

        val newcastleImage = findViewById<ImageView>(R.id.newcastle)

        newcastleImage.setOnClickListener {

            Toast.makeText(this, "Newcastleを選択しました", Toast.LENGTH_LONG).show()

            val intent = Intent(this, NewcastleActivity::class.java)
            startActivity(intent)

        }

        val santoryImage = findViewById<ImageView>(R.id.santory)

        santoryImage.setOnClickListener {

            Toast.makeText(this, "サントリーを選択しました", Toast.LENGTH_LONG).show()

            val intent = Intent(this, SantoryActivity::class.java)
            startActivity(intent)

        }

        val kirinImage = findViewById<ImageView>(R.id.kirin)

        kirinImage.setOnClickListener {

            Toast.makeText(this, "キリンを選択しました", Toast.LENGTH_LONG).show()

            val intent = Intent(this, KirinActivity::class.java)
            startActivity(intent)

        }

        val paulanerImage = findViewById<ImageView>(R.id.paulaner)

        paulanerImage.setOnClickListener {

            Toast.makeText(this, "paulanerを選択しました", Toast.LENGTH_LONG).show()

            val intent = Intent(this, PaulanerActivity::class.java)
            startActivity(intent)

        }

        val becksImage = findViewById<ImageView>(R.id.becks)

        becksImage.setOnClickListener {

            Toast.makeText(this, "becksを選択しました", Toast.LENGTH_LONG).show()

            val intent = Intent(this, BecksActivity::class.java)
            startActivity(intent)

        }

        val duvelImage = findViewById<ImageView>(R.id.duvel)

        duvelImage.setOnClickListener {

            Toast.makeText(this, "duvelを選択しました", Toast.LENGTH_LONG).show()

            val intent = Intent(this, DuvelActivity::class.java)
            startActivity(intent)

        }

    }


}