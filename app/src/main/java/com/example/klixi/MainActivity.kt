package com.example.klixi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import com.example.klixi.viewmodel.KlixiViewModel

class MainActivity : ComponentActivity() {
    private val viewModel: KlixiViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            KlixiCounterScreen(viewModel = viewModel)
        }}
        }
