package com.egco428.labweek5

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_password.*

class passwordActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_password)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        var myUser = hashMapOf<String, String>("username" to "taysueb", "password" to "tayzasmarty6")

        val bundle = intent.extras
        var user: String = ""
        var pass: String = ""
        if (bundle != null) {
            user = bundle.getString("input1")
            pass = bundle.getString("input2")

        }
        if (myUser["username"].equals(user) && myUser["password"].equals(pass)) {
            userr.text = user
            passw.text = pass
        }else{
            finish()
        }
    }
}
