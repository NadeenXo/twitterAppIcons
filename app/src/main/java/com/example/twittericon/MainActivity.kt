package com.example.twittericon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        Glide.with(this@MainActivity)
//            .load("https://drive.google.com/file/d/1WyxFMU2Qnc_zBpSZLHJGkQOSdUgb48l9/view?usp=drive_link")
//            .circleCrop()
//            .into(findViewById(R.id.iv_remote))
        Glide.with(this@MainActivity)
            .load("https://drive.google.com/uc?export=download&id=1WyxFMU2Qnc_zBpSZLHJGkQOSdUgb48l9")
            .circleCrop()
            .into(findViewById(R.id.iv_remote));


        Glide.with(this@MainActivity)
            .load("https://drive.google.com/uc?export=download&id=1CGKF_ZBWbHcP9oFll4hISG2PoX1WaRrr")
            .circleCrop()
            .into(findViewById(R.id.iv_remote3))

        Glide.with(this@MainActivity)
            .load("https://drive.google.com/uc?export=download&id=16nJMZswp5RwJGilX3LlUoxut_yaZdZdZ")
            .circleCrop()
            .into(findViewById(R.id.iv_remote2))

        Glide.with(this@MainActivity)
            .load("https://drive.google.com/uc?export=download&id=153t8abVhUdVAi6GscV_LPAwzUwD1p7R6")
            .circleCrop()
            .into(findViewById(R.id.iv_remote4))
    }
}