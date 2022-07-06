package com.bedirhandroid.mobile2automation.util

import android.app.Activity
import android.content.Context
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Toast
import com.bedirhandroid.mobile2automation.models.NewModels
import com.google.gson.GsonBuilder
import java.io.InputStream

class Util

fun showMessage(context: Context, message: String) {
    Toast.makeText(context,message, Toast.LENGTH_LONG).show()
}
//TODO: HideKeyboard

fun Context.hideKeyboard(view: View) {
    val inputMethodManager = getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
    inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0)
}

fun Context.jsonToDataClassModel(file: Int): NewModels {
    val input : InputStream =  resources.openRawResource(file)
    val b = ByteArray(input.available())
    input.read(b)

    val json = String(b)

    GsonBuilder().create()
    return GsonBuilder().create().fromJson(json, NewModels::class.java)
}