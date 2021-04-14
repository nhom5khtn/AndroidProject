package com.example.android.firstweekchallenge.ui.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.TextView
import com.example.android.firstweekchallenge.R

class OnboardingOneActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding_one)

        val btn = findViewById<ImageButton>(R.id.btn1)
        val v1 = findViewById<View>(R.id.view1)
        val v2 = findViewById<View>(R.id.view2)
        val text1 = findViewById<TextView>(R.id.textView4)
        val text2 = findViewById<TextView>(R.id.textView5)

        btn.setOnClickListener(){
            val intent = Intent(this@OnboardingOneActivity, OnboardingTwoActivity::class.java)
            startActivity(intent)
        }
    }
}