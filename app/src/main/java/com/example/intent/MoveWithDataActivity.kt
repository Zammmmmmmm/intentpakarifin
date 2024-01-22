package com.example.Intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.DatePicker
import android.widget.ImageView
import android.widget.TextView
import com.example.intent.R

class MoveWithDataActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move_with_data)

        val tvDataReceived: TextView =
            findViewById(R.id.tv_data_recevied)

        val imageView:ImageView = findViewById(R.id.imageView)
        val name = intent.getStringExtra(EXTRA_NAME)
        val age = intent.getIntExtra(EXTRA_AGE, 0)
        val  imageResId = intent.getIntExtra(EXTRA_GAMBAR, R.drawable.img)

        imageView.setImageResource(imageResId)
        val text = "name : $name\nYour Age : $age"
        tvDataReceived.text = text
    }
    companion object {
        const val EXTRA_AGE = "extra_age"
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_GAMBAR = "extra_img"
    }
}