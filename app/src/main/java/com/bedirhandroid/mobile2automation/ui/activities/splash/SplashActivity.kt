package com.bedirhandroid.mobile2automation.ui.activities.splash

import android.animation.ObjectAnimator
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.ViewTreeObserver
import android.view.animation.AnticipateInterpolator
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.core.animation.doOnEnd
import com.bedirhandroid.mobile2automation.R
import com.bedirhandroid.mobile2automation.databinding.ActivitySplashBinding
import com.bedirhandroid.mobile2automation.ui.activities.main.MainActivity
import es.dmoral.toasty.Toasty
import java.time.Duration
import java.time.Instant

class SplashActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.apply {
            Toast.makeText(this@SplashActivity, "Developed by Bedirhandroid", Toast.LENGTH_SHORT).show()
            ivSplash.playAnimation()
            val intent = Intent(this@SplashActivity, MainActivity::class.java)
            startActivity(intent)
            finish()

        }

    }
}