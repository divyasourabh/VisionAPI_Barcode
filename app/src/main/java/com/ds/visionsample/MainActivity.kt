package com.ds.visionsample

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.ds.visionsample.barcodereader.BarCodeScannerActivity
import com.ds.visionsample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.btnScanNow.setOnClickListener { Log.d("Test123", "Hello worls")
            openScanner()}
    }

    fun openScanner () {
        val intent = Intent(this, BarCodeScannerActivity::class.java)
                startActivity(intent)
    }
}