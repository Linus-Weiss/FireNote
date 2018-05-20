package com.sunilson.firenote.presentation.shared.singletons

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import org.apache.commons.codec.binary.Hex
import org.apache.commons.codec.digest.DigestUtils
import java.io.UnsupportedEncodingException
import java.security.NoSuchAlgorithmException
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class LocalSettingsManager @Inject constructor(context: Context) {

    private val sharedPrefs: SharedPreferences = context.getSharedPreferences("prefs", Context.MODE_PRIVATE)

    fun setCategoryVisiblity(id: String, visibility: Int) {
        val editor = sharedPrefs.edit()
        editor.putInt(id, visibility)
        editor.commit()
    }

    fun setColorVisibility(color: Int, visibility: Int) {
        val editor = sharedPrefs.edit()
        editor.putInt(color.toString(), visibility)
        editor.commit()
    }

    fun setSortingMethod(sortingMethod: String) {
        val editor = sharedPrefs.edit()
        editor.putString("mainElementSorting", sortingMethod)
        editor.commit()
    }

    fun setMasterPassword(password: String) {
        val editor = sharedPrefs.edit()
        editor.putString("masterPassword", password)
        editor.commit()
    }

    fun getMasterPassword() = sharedPrefs.getString("masterPassword", "");
    fun getSortingMethod() = sharedPrefs.getString("mainElementSorting", null)
    fun getColorVisibility(color: Int) = sharedPrefs.getInt(color.toString(), -1)
    fun getCategoryVisibility(category: String) = sharedPrefs.getInt(category, -1)
    fun getSHA1Hash(masterPasswordHash: String): String = String(Hex.encodeHex(DigestUtils.sha1(masterPasswordHash)))

}