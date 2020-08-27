package com.kenildoshi.toasterlibrary

import android.content.Context
import android.widget.Toast




class ToastMsg {

//    fun ToastMsg() {}

    fun st(context: Context, message: String) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }

    fun lt(context: Context, message: String) {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show()
    }

}