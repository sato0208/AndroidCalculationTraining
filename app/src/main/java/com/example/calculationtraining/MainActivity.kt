package com.example.calculationtraining

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

//    Todo 「スタート」ボタンを押したら
//    Todo １． テスト画面を開く(Spinnerから選んだ問題数を渡す）

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
//            次の画面にいく選択した問題数を渡す
        }
    }
}