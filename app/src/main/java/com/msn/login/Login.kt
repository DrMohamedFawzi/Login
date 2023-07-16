package com.msn.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputType
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Login : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val usernameInput = findViewById<EditText>(R.id.Name)
        val passwordInput = findViewById<EditText>(R.id.Password)
        passwordInput.inputType = InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_PASSWORD

        val Login= findViewById<Button>(R.id.log)

        Login.setOnClickListener {
            val username = usernameInput.text.toString()
            val password = passwordInput.text.toString()

            if (username == "احمد" && password == "1234") {
                // اسم المستخدم وكلمة المرور صحيحة
                Toast.makeText(this, "تم تسجيل الدخول بنجاح!", Toast.LENGTH_SHORT).show()

                // الانتقال إلى الصفحة التي ترحب بالمستخدم
                val welcomeIntent = Intent(this, WelcomeActivity::class.java)
                startActivity(welcomeIntent)
            } else {
                // اسم المستخدم أو كلمة المرور غير صحيحة
                Toast.makeText(this, "اسم المستخدم أو كلمة المرور غير صحيحة!", Toast.LENGTH_SHORT).show()

                // الانتقال إلى صفحة أخرى لإعلام المستخدم بالخطأ
                val errorIntent = Intent(this, ErrorActivity::class.java)
                startActivity(errorIntent)
            }
        }
    }
}