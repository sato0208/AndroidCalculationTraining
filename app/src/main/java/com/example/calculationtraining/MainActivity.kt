package com.example.calculationtraining

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        選択肢を入れるためのarrayadaptorをセット
        val arrayAdapter = ArrayAdapter<int>(this, android.R.layout.simple_spinner_item)
//        arrayAdapter.add(10)
//        arrayAdapter.add(20)
//        arrayAdapter.add(30)

        val arrayAdapter = ArrayAdapter.createFromResource(this, R.array.number_of_question,android.R.layout.simple_spinner_item)
        spinner.adapter = arrayAdapter
        val onClickListener: Any = button.setOnClickListener {
//      「スタート」ボタンを押したら

//            選択したアイテムをゲットする
            val numberOfQuestion: Int = spinner.selectedItem.toString().toInt()
            //       Todo １． テスト画面を開く(Spinnerから選んだ問題数を渡す）
            val intent = Intent(this.@ MainActivity, TestActivity::class.java)
            intent.putExtra("numberOfQuestion",numberOfQuestion)
            startActivity(intent)
        }
    }
}