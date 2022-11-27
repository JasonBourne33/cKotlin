package com.example.ckotlin

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second.*


class SecondActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)


        Log.d("SecondActivity","Task id is $taskId")
        button2.setOnClickListener{
            val intent=Intent(this,ThirdActivity::class.java)
            startActivity(intent)

        }
    }

    companion object{
        fun actionStart(context: Context,data1: String, data2: String){
//            val intent=Intent(context,SecondActivity::class.java)
//            intent.putExtra("param1",data1)
//            intent.putExtra("param2",data2)
//            context.startActivity(intent)
            val intent=Intent(context,SecondActivity::class.java).apply {
                putExtra("param1",data1)
                putExtra("param2",data2)
            }
            context.startActivity(intent)
        }
    }
}