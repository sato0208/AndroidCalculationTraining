package com.example.calculationtraining

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_test.*
import kotlinx.android.synthetic.main.activity_test.buttonCheck


class TestActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)
        //テスト画面が開いたら
//        １．前の問題から渡された問題数を画面に表示させる
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
//        Todo １．「もどる」ボタンを使えなくする
        buttonBack.isEnabled = false
//        Todo ２．「こたえ合わせ」ボタンと電卓ボタンを使えるようにする
        buttonCheck.isEnabled = true
        button0.isEnabled = true
        button1.isEnabled = true
        button2.isEnabled = true
        button3.isEnabled = true
        button4.isEnabled = true
        button5.isEnabled = true
        button6.isEnabled = true
        button7.isEnabled = true
        button8.isEnabled = true
        button9.isEnabled = true
        buttonMinus.isEnabled = true
        buttonC.isEnabled = true


//        Todo ３．問題の２つの数字を１~100からランダムに設定して表示
//        Todo ４．計算方法を「+」「-」からランダムに設定して表示
//        Todo ５．前の問題で入力した自分のこたえを消す
//        Todo ６．〇・×画像を見えないようにする
//
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

