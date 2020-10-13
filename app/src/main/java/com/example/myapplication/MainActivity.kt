package com.example.myapplication
import android.content.IntentSender
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Range
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatDelegate
import androidx.core.view.children
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    var igrok:Boolean = true
    fun Nazh(view:View)
    {
        if(igrok==true)
        {
            (view as Button).text = "X"
            igrok=!igrok;
        }
        else if(igrok==false)
        {
            (view as Button).text = "O"
            igrok=!igrok;
        }
        (view as Button).isClickable=false;
        Naz2();
    }
    fun Nazh2(view: View)
    {
        val btns = arrayOf(btnFour,btnSix,btnEight,btnThird,btnSecond,btnFirst,btnSeven,btnNine,btnFive)
        for(n in btns)
        {
            n.text=""
            n.isClickable = true;
        }
        textView.text = ""
        igrok=!igrok
    }

    fun Naz2()
    {
        var arr: Array<Array<Int>> = Array(3, { Array(3, {0}) })
        var s:Int = 0
        var sum:Int = 0
        val btns = arrayOf(btnFour,btnSix,btnEight,btnThird,btnSecond,btnFirst,btnSeven,btnNine,btnFive)
        for(n1 in 0..2)
        {
            for(n in 0..2)
            {
                if(btns[n1*3+n].text=="O")
                {
                    arr[n1][n]=1;
                }
                else if(btns[n1*3+n].text=="X")
                {
                    arr[n1][n]=5;
                }
            }
        }

        for(n1 in 0..2)
        {
            sum=0;
            s=0;
            for (n in 0..2)
            {
                s+=arr[n][n1]
                sum+=arr[n][n]
            }
            if(s==15||sum==15)
            {
                textView.text = "Крестики выиграли"
            }
            else if(s==3||sum==3)
            {
                textView.text = "Нолики выиграли"
            }
        }
        for(n1 in 0..2)
        {
            s=0;
            for (n in 0..2)
            {
                s+=arr[n1][n]
            }
            if(s==15)
            {
                textView.text = "Крестики выиграли"
            }
            else if(s==3)
            {
                textView.text = "Нолики выиграли"
            }
        }
        if(arr[0][2]+arr[1][1]+arr[2][0]==15)
        {
            textView.text = "Крестики выиграли"
        }
        else if(arr[0][2]+arr[1][1]+arr[2][0]==3)
        {
            textView.text = "Нолики выиграли"
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_AUTO)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}