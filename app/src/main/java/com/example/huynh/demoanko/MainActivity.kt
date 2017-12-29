package com.example.huynh.demoanko

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import org.jetbrains.anko.setContentView

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    MainUI().setContentView(this)
  }
}
