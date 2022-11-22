package com.example.ckotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast

class FirstAcitivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.first_layout)
        Log.d("FirstActivity","Task id is $taskId")
        val button1: Button =findViewById(R.id.button1)
        button1.setOnClickListener{
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
//            Toast.makeText(this,"click button 1",Toast.LENGTH_SHORT).show()
        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.add_item-> Toast.makeText(this,"you clicked add",Toast.LENGTH_SHORT).show()
            R.id.remove_item-> Toast.makeText(this,"you clicked remove",Toast.LENGTH_SHORT).show()
        }
        return super.onOptionsItemSelected(item)
    }
}