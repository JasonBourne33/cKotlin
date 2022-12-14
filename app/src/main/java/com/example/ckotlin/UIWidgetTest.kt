package com.example.ckotlin

import android.app.AlertDialog
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_uiwidget_test.*

class UIWidgetTest : BaseActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_uiwidget_test)
        button.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.button -> {
//                val inputText = editText.text.toString()
//                Toast.makeText(this, inputText, Toast.LENGTH_SHORT).show()
//
//                imageView.setImageResource(R.drawable.shulai)
//
//                if (pb.visibility == View.VISIBLE) {
//                    pb.visibility = View.GONE
//                } else {
//                    pb.visibility = View.VISIBLE
//                }

                AlertDialog.Builder(this).apply {
                    setTitle("this is dialog")
                    setMessage("something important")
                    setCancelable(false)
                    setPositiveButton("OK") { dialog, witch ->
                    }
                    setNegativeButton("Cancel") { dialog, which ->
                    }
                    show()
                }
            }
//            R.id.btn_changeImage -> {
//                imageView.setImageResource(R.drawable.shulai)
//            }
//            R.id.btn_progressBar -> {
//                if (pb.visibility == View.VISIBLE) {
//                    pb.visibility = View.GONE
//                } else {
//                    pb.visibility = View.VISIBLE
//                }
//            }
        }
    }
}