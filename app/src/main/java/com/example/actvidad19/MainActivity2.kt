package com.example.actvidad19

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient


class MainActivity2 : AppCompatActivity() {
    private var Canva: WebView?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        Canva = findViewById(R.id.canvas)
        Canva?.webChromeClient = object : WebChromeClient(){
        }
        Canva?.webViewClient = object : WebViewClient(){
        }
        Canva?.clearCache(false)
        Canva?.settings?.javaScriptEnabled
        Canva?.loadUrl("https://ugb.instructure.com/login/canvas")
    }
}