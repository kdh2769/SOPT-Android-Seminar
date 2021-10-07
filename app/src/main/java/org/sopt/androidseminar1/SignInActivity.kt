package org.sopt.androidseminar1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import org.sopt.androidseminar1.databinding.SignInBinding

class SignInActivity : AppCompatActivity() {
    private lateinit var  binding : SignInBinding // 고정적인 Class 값은 아니다.
                                                        // activity_main -> ActivityMain


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = SignInBinding.inflate(layoutInflater) // layoutInflater : xml을 불러주는 정도
        setContentView(binding.root) // setContentView : xml을 그려주는 함수

        val intent = Intent(this, SignUpActivity::class.java)



        // toast
        binding.button.setOnClickListener{
            Toast.makeText(this, "000 님 환영합니다", Toast.LENGTH_SHORT).show()

            startActivity(intent)
        }

        setContentView(binding.root)
    }
}