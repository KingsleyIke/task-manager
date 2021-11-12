package com.kingstek.taskmanager

import android.content.Context
import android.content.SharedPreferences


class IntroManager(context: Context) {
    var pref: SharedPreferences
    var editor: SharedPreferences.Editor
    var context: Context

    fun setFirst(isFirst: Boolean) {
        editor.putBoolean("check", isFirst)
        editor.commit()
    }

    fun Check(): Boolean {
        return pref.getBoolean("check", true)
    }

    init {
        this.context = context
        pref = context.getSharedPreferences("first", 0)
        pref.edit().also { editor = it }
    }
}