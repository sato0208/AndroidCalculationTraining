package com.example.calculationtraining

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_test.*





class TestActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)
        //Todo テスト画面が開いたら
//        Todo １．前の問題から渡された問題数を画面に表示させる
        val bundle: = intent.extras
        val numberOfQuestion = bundle.getInt("numberOfQuestion")
        textViewRemaining.text = numberOfQuestion.toString()

        //Todo 「こたえ合わせ」ボタンが押されたら
        buttonCheck.setOnClickListener {  }
        //Todo 「もどる」ボタンが押されたら
        buttonBack.setOnClickListener {

            answerCheck()

        }
        //Todo 電卓ボタンが押されたら
        button0.setOnClickListener(this)
        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
        button5.setOnClickListener(this)
        button6.setOnClickListener(this)
        button6.setOnClickListener(this)
        button8.setOnClickListener(this)
        button9.setOnClickListener(this)
        buttonC.setOnClickListener(this)
        buttonMinus.setOnClickListener(this)

    //       一問目を出す
        question()
    }
    // Todo 問題が出されたら（questionメソッド）
    //    問題を処理するメソッド

    private fun question() {
        TODO("Not yet implemented")
    }
    //Todo こたえあわせ処理（answerCheckメソッド）
    //    答え合わせ処理をするメソッド
    private fun answerCheck() {
        TODO("Not yet implemented")
    }
    //    ボタンが押されたときの処理
    override fun onClick(p0: View?) {
        TODO("Not yet implemented")
    }
}

