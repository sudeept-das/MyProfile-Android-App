package com.example.admin.myprofile

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    var photo: ImageView? = null
    var eduButton: Button? = null
    var workButton: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.homescreen)
        photo = findViewById(R.id.profilePhoto)
         photo?.setOnClickListener({
            var clickIntent = Intent(this@MainActivity, ProfilePhoto::class.java)
            startActivity(clickIntent)
        })
        eduButton = findViewById(R.id.Education)
        eduButton?.setOnClickListener({
            var clickIntent = Intent(this@MainActivity, Education::class.java)
            startActivity(clickIntent)
        })
        workButton = findViewById(R.id.workExperience)
        workButton?.setOnClickListener({
            var clickIntent = Intent(this@MainActivity, WorkExperience::class.java)
            startActivity(clickIntent)
        })

    }
}
