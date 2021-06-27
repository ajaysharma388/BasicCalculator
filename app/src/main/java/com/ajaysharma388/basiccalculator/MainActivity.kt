package com.ajaysharma388.basiccalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnAdd: Button = findViewById(R.id.btnAdd)
        var btnSub: Button = findViewById(R.id.btnSub)
        var btnMul: Button = findViewById(R.id.btnMul)
        var btnDiv: Button = findViewById(R.id.btnDiv)


        var btn1: Button = findViewById(R.id.inp1)
        var btn2: Button = findViewById(R.id.inp2)
        var btn3: Button = findViewById(R.id.inp3)
        var btn4: Button = findViewById(R.id.inp4)
        var btn5: Button = findViewById(R.id.inp5)
        var btn6: Button = findViewById(R.id.inp6)
        var btn7: Button = findViewById(R.id.inp7)
        var btn8: Button = findViewById(R.id.inp8)
        var btn9: Button = findViewById(R.id.inp9)
        var btn0: Button = findViewById(R.id.inp0)
        var btnC: Button = findViewById(R.id.btnC)
        var btnEq: Button = findViewById(R.id.btnEq)

        var data: EditText = findViewById(R.id.data)

        var isPlus : Boolean = false
        var isSub : Boolean = false
        var isMul : Boolean = false
        var isDiv : Boolean = false
        var isReset : Boolean = false

        var prevField : TextView = findViewById(R.id.prevField)

        var inpVar1 : Int = 0
        var inpVar2 : Int = 0
        data.setText("0")

        btn1.setOnClickListener {
            val tmp:Int = data.text.toString().toInt()
            if(tmp == 0) data.setText("1")
            else data.append("1")
        }

        btn2.setOnClickListener {
            val tmp:Int = data.text.toString().toInt()
            if(tmp == 0) data.setText("2")
            else data.append("2")
        }

        btn3.setOnClickListener {
            val tmp:Int = data.text.toString().toInt()
            if(tmp == 0) data.setText("3")
            else data.append("3")
        }

        btn4.setOnClickListener {
            val tmp:Int = data.text.toString().toInt()
            if(tmp == 0) data.setText("4")
            else data.append("4")
        }

        btn5.setOnClickListener {
            val tmp:Int = data.text.toString().toInt()
            if(tmp == 0) data.setText("5")
            else data.append("5")
        }

        btn6.setOnClickListener {
            val tmp:Int = data.text.toString().toInt()
            if(tmp == 0) data.setText("6")
            else data.append("6")
        }

        btn7.setOnClickListener {
            val tmp:Int = data.text.toString().toInt()
            if(tmp == 0) data.setText("7")
            else data.append("7")
        }

        btn8.setOnClickListener {
            val tmp:Int = data.text.toString().toInt()
            if(tmp == 0) data.setText("8")
            else data.append("8")
        }

        btn9.setOnClickListener {
            val tmp:Int = data.text.toString().toInt()
            if(tmp == 0) data.setText("9")
            else data.append("9")
        }

        btn0.setOnClickListener {
            val tmp:Int = data.text.toString().toInt()
            if(tmp != 0) data.append("0")
        }

        btnAdd.setOnClickListener {
            inpVar1 = data.text.toString().toInt()
            isPlus = true
            data.setText("0")
            prevField.setText("${inpVar1} + ")
        }

        btnSub.setOnClickListener {
            inpVar1 = data.text.toString().toInt()
            isSub = true
            data.setText("0")
            prevField.setText("${inpVar1} - ")
        }

        btnMul.setOnClickListener {
            inpVar1 = data.text.toString().toInt()
            isMul = true
            data.setText("0")
            prevField.setText("${inpVar1} * ")
        }

        btnDiv.setOnClickListener {
            inpVar1 = data.text.toString().toInt()
            isDiv = true
            data.setText("0")
            prevField.setText("${inpVar1} / ")
        }

        btnC.setOnClickListener {
            data.setText("0")
            isReset = true
            prevField.setText("")
        }

        btnEq.setOnClickListener {
            inpVar2 = data.text.toString().toInt()
            prevField.setText("")
            if(isPlus == true) {
                data.setText("${inpVar1 + inpVar2}")
                isPlus = false
            } else if(isSub == true) {
                data.setText("${inpVar1 - inpVar2}")
                isSub = false
            } else if(isMul == true) {
                data.setText("${inpVar1 * inpVar2}")
                isMul = false
            } else if(isDiv == true) {
                data.setText("${inpVar1 / inpVar2}")
                isDiv = false
            } else {
                data.setText("0")
                inpVar1 = 0
                inpVar2 = 0
                isPlus = false
                isDiv = false
                isMul = false
                isSub = false
                isReset = false
            }
        }
    }
}