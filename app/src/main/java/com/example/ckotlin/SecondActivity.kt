package com.example.ckotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log



class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        Log.d("SecondActivity","Task id is $taskId")
//        button2.
    }
}