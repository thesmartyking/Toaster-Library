package com.kenildoshi.toasterlibrary

import android.content.Context
import android.widget.Toast




class ToastMsg {

    fun ToastMsg() {}

    fun st(c: Context, message: String) {
        Toast.makeText(c, message, Toast.LENGTH_SHORT).show()
    }

    fun lt(c: Context, message: String) {
        Toast.makeText(c, message, Toast.LENGTH_LONG).show()
    }

}