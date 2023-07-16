package com.msn.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.logging.Handler

class MainActivity : AppCompatActivity() {
    private val delayDuration: Long = 6000 // 5 seconds

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val handler = android.os.Handler()

        handler.postDelayed({
            // تنفيذ الانتقال إلى الواجهة الأخرى هنا
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
            finish() // اختياري: إغلاق الواجهة الحالية إذا لم تكن بحاجة إليها
        }, delayDuration)
    }
}