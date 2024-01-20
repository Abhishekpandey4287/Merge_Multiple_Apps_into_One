package com.example.android

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi

class GithubActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_githubactivity)
        val github = findViewById<WebView>(R.id.webView1)
        openGithub(github)
    }
    @RequiresApi(Build.VERSION_CODES.O)
    private fun  openGithub (a : WebView) {
        a.webViewClient = WebViewClient()
        a.apply {
            settings.javaScriptCanOpenWindowsAutomatically = true
            settings.javaScriptEnabled = true
            settings.allowContentAccess = true
            settings.safeBrowsingEnabled = true
            loadUrl("https://github.com/Abhishekpandey4287")
        }
    }
}