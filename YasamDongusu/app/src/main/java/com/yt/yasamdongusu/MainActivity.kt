package com.yt.yasamdongusu

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.yt.yasamdongusu.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)

        enableEdgeToEdge()
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        println("oncreate calistiirlidi")
    }

    override fun onStart() {
        super.onStart()
        println("onstart aktif")
    }

    override fun onResume() {
        super.onResume()
        println("onresume aktif")
    }

    override fun onPause() {
        super.onPause()
        println("onpause aktif")
    }

    override fun onStop() {
        super.onStop()
        println("onstop aktif")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("ondetsroy aktif")
    }
    fun sonrakiSayfa(view:View){
        val intent= Intent(this,SecondActivity::class.java)
        val kullanici_girdisi=binding.editText.text.toString()
        intent.putExtra("isim",kullanici_girdisi)
        startActivity(intent)

       // val kullanici_girdisi=binding.editText.toString()
        //binding.textView.text="isim:${kullanici_girdisi}"
    }


}
