package com.gralliams.aboutme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button).setOnClickListener { addNickName(it) }
    }

    private fun addNickName(it: View?) {
        val nickname = findViewById<EditText>(R.id.nickname_edit)
        val nicknameDisplay = findViewById<TextView>(R.id.nickname_text)

        nicknameDisplay.text = nickname.text
        nickname.visibility = View.INVISIBLE
        nicknameDisplay.visibility = View.VISIBLE
    }
}
