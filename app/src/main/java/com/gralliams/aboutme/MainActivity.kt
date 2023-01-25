package com.gralliams.aboutme

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.databinding.DataBindingUtil
import com.gralliams.aboutme.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val aboutMe = AboutMe()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        // Sets value to binding variable in xml file
        binding.aboutMe = aboutMe

        binding.button.setOnClickListener {
            addNickName(it)
            // Hide the keyboard.
            val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(it.windowToken, 0)
        }
    }

    private fun addNickName(it: View?) {
        binding.apply {
//            nicknameText.text = nicknameEdit.text
//            Sets value to myName.nickName variable in xml file
            aboutMe?.nickName = nicknameEdit.text.toString()
            aboutMe?.myName = nameEdit.text.toString()
            aboutMe?.school = schoolEdit.text.toString()
            aboutMe?.hobby = hobbyEdit.text.toString()

            invalidateAll()
            nicknameEdit.visibility = View.INVISIBLE
            nameEdit.visibility = View.INVISIBLE
            schoolEdit.visibility = View.INVISIBLE
            hobbyEdit.visibility = View.INVISIBLE
            button.visibility = View.GONE
            bioScroll.visibility = View.VISIBLE
        }
    }
}
