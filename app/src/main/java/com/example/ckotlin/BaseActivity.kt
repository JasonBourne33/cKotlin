package com.example.ckotlin

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity

open class BaseActivity :AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("BaseActivity",javaClass.simpleName)
        doSomething()
        ActivityBox.addActivity(this)
    }


    open fun onClick(v: View?) {}
}