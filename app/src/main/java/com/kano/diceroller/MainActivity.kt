package com.kano.diceroller

import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.text.SpannableString
import android.text.Spanned
import android.text.style.QuoteSpan
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      btnnum.setOnClickListener {
          var x:Int=edtnum.text.toString().toInt()
          if (x >= 30){
              //hello world
          }

      }





        val string = SpannableString("Hello World")
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
            string.setSpan(QuoteSpan(Color.GREEN, 20, 40), 0, string.length, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        }

        val string2 = SpannableString("Hello World")
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
            string2.setSpan(QuoteSpan(), 0, string.length, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        }
        textView.text = string

        textView2.text = string2
    }
}
