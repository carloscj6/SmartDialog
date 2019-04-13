package com.revosleap.smartdialogdl.callbacks

import android.view.View

interface SmartButtonClicked {
    val positiveButtonClicked:View.OnClickListener?

    val negativeButtonClicked:View.OnClickListener?

    val neutralButtonClicked:View.OnClickListener?
}