package com.example.ckotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_uiwidget_test.*

class UIWidgetTest : BaseActivity(),View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_uiwidget_test)
        button.setOnClickListener(this)

    }

    override fun onClick(v: View?){
        when(v?.id){
            R.id.button->{
                val inputText=editText.text.toString()
                Toast.makeText(this,inputText,Toast.LENGTH_SHORT).show()
            }
            R.id.btn_changeImage->{

            }
        }
    }
}