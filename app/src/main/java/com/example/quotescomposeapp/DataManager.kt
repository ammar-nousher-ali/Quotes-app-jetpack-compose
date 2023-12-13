package com.example.quotescomposeapp

import android.content.Context
import com.example.quotescomposeapp.models.Quote

object DataManager {

    var data = emptyArray<Quote>()

    fun loadAssetFromFile(context: Context) {

        val inputStream = context.assets.open("quotes.json")
        val size : Int = inputStream.available()
        val buffer = ByteArray(size)
        inputStream.read(buffer)
        inputStream.close()
        val json = String(buffer,Charsets.UTF_8)

    }
}