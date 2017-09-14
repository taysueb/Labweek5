package com.egco428.labweek5

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        submitBtn.setOnClickListener{
            var intent = Intent(this, passwordActivity::class.java)
            intent.putExtra("input1",userText.text.toString())
            intent.putExtra("input2",passText.text.toString())
            startActivity(intent)
        }

        cancelBtn.setOnClickListener{
            userText.setText("")
            passText.setText("")
        }
    }




}
