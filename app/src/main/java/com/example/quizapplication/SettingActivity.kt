package com.example.quizapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import com.example.quizapplication.databinding.ActivitySettingBinding

class SettingActivity : AppCompatActivity() {

    private val spinnerItems = arrayOf("5","10","15","20","25","30")

    private lateinit var binding: ActivitySettingBinding

    var QUIZ_QUANTITY = "com.example.settingactivitytransdata.QUANTITY"



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySettingBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        //Spinnerの取得
        val spinner = findViewById<Spinner>(R.id.spinner)

        //Adapterの生成
        val arrayAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, spinnerItems)

        //選択肢の各項目のレイアウト
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        //AdapterをSpinnerのAdapterとして設定
        spinner.adapter = arrayAdapter

        binding.button.setOnClickListener {
            val intent = Intent(application, MainActivity::class.java)
            intent.putExtra("QUIZ_QUANTITY", intent)
            startActivity(intent)
        }


    }



}