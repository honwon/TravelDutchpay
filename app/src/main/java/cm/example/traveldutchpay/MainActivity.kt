package cm.example.traveldutchpay

import android.content.Context
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.InputMethodManager
import androidx.appcompat.app.AlertDialog
import cm.example.traveldutchpay.R
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.IllegalStateException
import java.lang.Math.E
import java.text.NumberFormat

class fight{

}

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        loadData()


        button.setOnClickListener {
            CloseKeyboard()
            val builder = AlertDialog.Builder(this)
            builder.setMessage("정말 지우시겠습니까?")
                .setPositiveButton("예",
                    DialogInterface.OnClickListener { dialog, id ->
                        t1.text = null
                        t2.text = null
                        t3.text = null
                        t4.text = null
                        t5.text = null
                        t6.text = null
                        t7.text = null
                        t8.text = null
                        t9.text = null
                        t10.text = null
                        t11.text = null
                        t12.text = null
                        t13.text = null
                        t14.text = null
                        t15.text = null
                        t16.text = null
                        t17.text = null
                        t18.text = null
                        t19.text = null
                        t20.text = null
                        t21.text = null
                        tt1.text = null
                        result.text = null
                        saveData(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,"")

                    })
                .setNegativeButton("아니오",
                    DialogInterface.OnClickListener { dialog, id ->
                        // User cancelled the dialog
                    })
            // Create the AlertDialog object and return it
            builder.create().show()

        }



        background.setOnClickListener{
            CloseKeyboard()
        }





        letGo.setOnClickListener {
            CloseKeyboard()
            val a1 = t1.text.toString().toIntOrNull()?:0
            val a2 = t2.text.toString().toIntOrNull()?:0
            val a3 = t3.text.toString().toIntOrNull()?:0
            val a4 = t4.text.toString().toIntOrNull()?:0
            val a5 = t5.text.toString().toIntOrNull()?:0
            val a6 = t6.text.toString().toIntOrNull()?:0
            val a7 = t7.text.toString().toIntOrNull()?:0
            val a8 = t8.text.toString().toIntOrNull()?:0
            val a9 = t9.text.toString().toIntOrNull()?:0
            val a10 = t10.text.toString().toIntOrNull()?:0
            val a11 = t11.text.toString().toIntOrNull()?:0
            val a12 = t12.text.toString().toIntOrNull()?:0
            val a13 = t13.text.toString().toIntOrNull()?:0
            val a14 = t14.text.toString().toIntOrNull()?:0
            val a15 = t15.text.toString().toIntOrNull()?:0
            val a16 = t16.text.toString().toIntOrNull()?:0
            val a17 = t17.text.toString().toIntOrNull()?:0
            val a18 = t18.text.toString().toIntOrNull()?:0
            val a19 = t19.text.toString().toIntOrNull()?:0
            val a20 = t20.text.toString().toIntOrNull()?:0
            val a21 = t21.text.toString().toIntOrNull()?:0
            val n = tt1.text.toString().toIntOrNull()?:0
            var sum = a1+a2+a3+a4+a5+a6+a7+a8+a9+a10+a11+a12+a13+a14+a15+a16+a17+a18+a19+a20+a21
            if (n==0) {
                result.text = "잘못된 계산입니다."
                tt1.text= null
                val n = tt1.text.toString().toIntOrNull()?:0
            } else {
                var aaa = sum/n
                var num = Math.ceil(aaa.toDouble() / 100) * 100
                var nu = num.toInt()
                var nus = NumberFormat.getIntegerInstance().format(nu)


                when (nu) {
                    0 -> result.text = "다른 값을 입력해주세요."
                    100 -> result.text = "잘못된 계산입니다."
                    else -> result.text = "한 명당 ${nus}원 입니다."
                }
            }
            saveData(a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12,a13,a14,a15,a16,a17,a18,a19,a20,a21,n,result.text.toString())


        }



    }

    open fun saveData(A1: Int ,A2:Int,A3:Int,A4:Int,A5:Int, A6:Int, A7:Int, A8:Int, A9:Int, A10:Int,
                      A11:Int, A12:Int, A13:Int, A14:Int, A15:Int, A16:Int, A17:Int, A18:Int, A19:Int, A20:Int,
                      A21:Int,N:Int, H :String) {
        val pref = this.getPreferences(0)
        val editor = pref.edit()
        editor.putInt("_O1",A1)
        editor.putInt("_O2",A2)
        editor.putInt("_O3",A3)
        editor.putInt("_O4",A4)
        editor.putInt("_O5",A5)
        editor.putInt("_O6",A6)
        editor.putInt("_O7",A7)
        editor.putInt("_O8",A8)
        editor.putInt("_O9",A9)
        editor.putInt("_O10",A10)
        editor.putInt("_O11",A11)
        editor.putInt("_O12",A12)
        editor.putInt("_O13",A13)
        editor.putInt("_O14",A14)
        editor.putInt("_O15",A15)
        editor.putInt("_O16",A16)
        editor.putInt("_O17",A17)
        editor.putInt("_O18",A18)
        editor.putInt("_O19",A19)
        editor.putInt("_O20",A20)
        editor.putInt("_O21",A21)
        editor.putInt("_PEOPLE",N)
        editor.putString("_STR",H)
        editor.apply()
    }
    open fun loadData(){
        val pref = this.getPreferences(0)
        val c1 =  pref.getInt("_O1",0)
        val c2 = pref.getInt("_O2",0)
        val c3 =  pref.getInt("_O3",0)
        val c4 =  pref.getInt("_O4",0)
        val c5 =  pref.getInt("_O5",0)
        val c6 =  pref.getInt("_O6",0)
        val c7 =  pref.getInt("_O7",0)
        val c8 =  pref.getInt("_O8",0)
        val c9 =  pref.getInt("_O9",0)
        val c10 =  pref.getInt("_O10",0)
        val c11 =  pref.getInt("_O11",0)
        val c12 =  pref.getInt("_O12",0)
        val c13 =  pref.getInt("_O13",0)
        val c14 =  pref.getInt("_O14",0)
        val c15 =  pref.getInt("_O15",0)
        val c16 =  pref.getInt("_O16",0)
        val c17 =  pref.getInt("_O17",0)
        val c18 =  pref.getInt("_O18",0)
        val c19 =  pref.getInt("_O19",0)
        val c20 =  pref.getInt("_O20",0)
        val c21 =  pref.getInt("_O21",0)
        val p1 =  pref.getInt("_PEOPLE",0)
        val rr = pref.getString("_STR","")

        if (c1!=0){t1.setText(c1.toString())}
        if (c2!=0){t2.setText(c2.toString())}
        if (c3!=0){t3.setText(c3.toString())}
        if (c4!=0){t4.setText(c4.toString())}
        if (c5!=0){t5.setText(c5.toString())}
        if (c6!=0){t6.setText(c6.toString())}
        if (c7!=0){t7.setText(c7.toString())}
        if (c8!=0){t8.setText(c8.toString())}
        if (c9!=0){t9.setText(c9.toString())}
        if (c10!=0){t10.setText(c10.toString())}
        if (c11!=0){t11.setText(c11.toString())}
        if (c12!=0){t12.setText(c12.toString())}
        if (c13!=0){t13.setText(c13.toString())}
        if (c14!=0){t14.setText(c14.toString())}
        if (c15!=0){t15.setText(c15.toString())}
        if (c16!=0){t16.setText(c16.toString())}
        if (c17!=0){t17.setText(c17.toString())}
        if (c18!=0){t18.setText(c18.toString())}
        if (c19!=0){t19.setText(c19.toString())}
        if (c20!=0){t20.setText(c20.toString())}
        if (c21!=0){t21.setText(c21.toString())}
        if (p1 != 0){tt1.setText(p1.toString())}
        if (rr != ""){result.setText(rr.toString())}



    }
    override fun onRestart() {
        loadData()
        super.onRestart()
    }

    override fun onStop() {
        val a1 = t1.text.toString().toIntOrNull()?:0
        val a2 = t2.text.toString().toIntOrNull()?:0
        val a3 = t3.text.toString().toIntOrNull()?:0
        val a4 = t4.text.toString().toIntOrNull()?:0
        val a5 = t5.text.toString().toIntOrNull()?:0
        val a6 = t6.text.toString().toIntOrNull()?:0
        val a7 = t7.text.toString().toIntOrNull()?:0
        val a8 = t8.text.toString().toIntOrNull()?:0
        val a9 = t9.text.toString().toIntOrNull()?:0
        val a10 = t10.text.toString().toIntOrNull()?:0
        val a11 = t11.text.toString().toIntOrNull()?:0
        val a12 = t12.text.toString().toIntOrNull()?:0
        val a13 = t13.text.toString().toIntOrNull()?:0
        val a14 = t14.text.toString().toIntOrNull()?:0
        val a15 = t15.text.toString().toIntOrNull()?:0
        val a16 = t16.text.toString().toIntOrNull()?:0
        val a17 = t17.text.toString().toIntOrNull()?:0
        val a18 = t18.text.toString().toIntOrNull()?:0
        val a19 = t19.text.toString().toIntOrNull()?:0
        val a20 = t20.text.toString().toIntOrNull()?:0
        val a21 = t21.text.toString().toIntOrNull()?:0
        val n = tt1.text.toString().toIntOrNull()?:0

        saveData(a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12,a13,a14,a15,a16,a17,a18,a19,a20,a21,n,result.text.toString())
        super.onStop()
    }


    open fun CloseKeyboard()
    {
        var view = this.currentFocus

        if(view != null)
        {
            val inputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0)
        }
    }


}
