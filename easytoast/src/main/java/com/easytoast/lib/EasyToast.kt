package com.easytoast.lib

import android.content.Context
import android.widget.Toast
class EasyToast {
    fun showToast(c: Context?, message: String?) {
        Toast.makeText(c, message, Toast.LENGTH_SHORT).show()
    }
}