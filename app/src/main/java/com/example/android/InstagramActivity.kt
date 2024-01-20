package com.example.android

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi

class InstagramActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_instagram)
        val instagram  = findViewById<WebView>(R.id.webView2)
        openInstagram(instagram)
    }
    @RequiresApi(Build.VERSION_CODES.O)
    private fun  openInstagram (a : WebView) {
        a.webViewClient = WebViewClient()
        a.apply {
            settings.javaScriptCanOpenWindowsAutomatically = true
            settings.javaScriptEnabled = true
            settings.allowContentAccess = true
            settings.safeBrowsingEnabled = true
            loadUrl("https://www.instagram.com/abhishekpandey4287__official/")
        }
    }
}