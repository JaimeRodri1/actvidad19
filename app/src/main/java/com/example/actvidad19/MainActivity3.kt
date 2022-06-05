package com.example.actvidad19

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity3 : AppCompatActivity() {
    private var Porta: WebView?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        Porta = findViewById(R.id.portal)
        Porta?.webChromeClient = object : WebChromeClient(){
        }
        Porta?.webViewClient = object : WebViewClient(){
        }
        Porta?.clearCache(false)
        Porta?.settings?.javaScriptEnabled
        Porta?.loadUrl("https://estudiantes.ugb.edu.sv/Login?ReturnUrl=%2F")
    }
}