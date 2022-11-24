package com.example.ckotlin

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second.*


class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)


        Log.d("SecondActivity","Task id is $taskId")
        button2.setOnClickListener{
            val intent=Intent(this,ThirdActivity::class.java)
            startActivity(intent)

        }
    }
}