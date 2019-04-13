package com.revosleap.smartdialogdl

import android.content.Context
import android.graphics.Color
import android.graphics.Typeface
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.view.View
import android.view.Window
import kotlinx.android.synthetic.main.smart_dialog.*

class SmartDialog(dialogContext: Context) : AlertDialog(dialogContext) {

    override fun onCreate(savedInstanceState: Bundle?) {
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        super.onCreate(savedInstanceState)
        window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        setContentView(R.layout.smart_dialog)


    }

    /**
     * @param onClickListener
     * Show positive button and pass its onClickListener
     */
    fun onPositiveButtonClicked(onClickListener: View.OnClickListener?) {
        if (onClickListener != null) {
            buttonPositive?.visibility = View.VISIBLE
            buttonPositive?.setOnClickListener(onClickListener)
        }
    }

    /**
     * @param onClickListener
     * Show negative button and pass its onClickListener
     */

    fun onNegativeButtonClicked(onClickListener: View.OnClickListener?) {
        if (onClickListener != null) {
            buttonNegative?.visibility = View.VISIBLE
            buttonNegative?.setOnClickListener(onClickListener)
        }
    }

    /**
     * @param onClickListener
     *  Show neutral button and pass its onClickListener
     */

    fun onNeutralButtonClicked(onClickListener: View.OnClickListener?) {
        if (onClickListener != null) {
            buttonNeutral?.visibility = View.VISIBLE
            buttonNeutral?.setOnClickListener(onClickListener)
        }

    }

    /**
     * @param typeface
     * pass typeface for body text. eg Monospace
     */

    fun bodyTypeface(typeface: Typeface) {
        textViewInfo?.typeface = typeface
    }

    /**
     * @param info
     * info to show after hiding the progressbar
     */

    fun hideProgress(info: String) {
        progressBar.visibility = View.GONE
        textViewInfo.visibility = View.VISIBLE
        textViewInfo.text = info
        setCancelable(true)
    }

    /**
     * @param title The dialog title
     * @param cancelable make dialog cancelable
     */

    fun showProgress(title: String, cancelable: Boolean) {
        this.show()
        textViewTitle.text = title
        progressBar.visibility = View.VISIBLE
        textViewInfo.visibility = View.GONE
        setCancelable(cancelable)

    }

    /**
     * @param title
     * Change the progress and give the dialog new title
     * @param cancelable
     * make dialog cancelable
     */
    fun changeProgress(title: String,cancelable: Boolean) {
        textViewTitle.text = title
        setCancelable(cancelable)
    }

}