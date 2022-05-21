package com.syedhashirayub.quizapp

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowInsets
import android.view.WindowManager
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        @Suppress("DEPRECATION")
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            window.insetsController?.hide(WindowInsets.Type.statusBars())
        } else {
            window.setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN
            )
        }
       // val name  = name_input.editableText.toString()
       // Toast.makeText(this,"name is $name", Toast.LENGTH_LONG).show()
      //  val button:Button=findviewbyid<Button>(R.id.btn_start)

       btn_start.setOnClickListener{
           if(name_input.text.toString().isEmpty()){
               Toast.makeText(this, "Please enter your name", Toast.LENGTH_SHORT).show()
           }else{
               val intent = Intent(this,QuizQuestionActivity::class.java)
               intent.putExtra(Constants.USER_NAME,name_input.text.toString())
               startActivity(intent)
               finish()
           }
       }

    }
}