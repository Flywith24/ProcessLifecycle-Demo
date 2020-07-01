package com.flywith24.processlifecycle_demo

import android.content.Intent
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    fun click(view: View) {
        startActivity(Intent(this, MainActivity::class.java))
        Log.i("TAG", "是否在前台: ${App.isForeground}")
    }
}