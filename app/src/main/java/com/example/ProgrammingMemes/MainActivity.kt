package com.example.ProgrammingMemes

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun moveon (view: View){
        imageView2.setImageResource(R.drawable.meme2)
    }
    fun goback (view: View){
        imageView2.setImageResource((R.drawable.meme1))
    }

}