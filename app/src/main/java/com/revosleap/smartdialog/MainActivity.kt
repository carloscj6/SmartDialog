package com.revosleap.smartdialog

import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import com.revosleap.smartdialogdl.SmartDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val dialog = SmartDialog(this@MainActivity)

        btnShowDialog.setOnClickListener {
            dialog.showProgress("Doing Something", false)
            val handler = Handler()
            handler.postDelayed({
                dialog.changeProgress("Please wait", false)
                val handler1 = Handler()
                handler1.postDelayed({
                    dialog.hideProgress("Done, Am dismissible now")
                }, 2000)
            }, 5000)
        }
    }
}
