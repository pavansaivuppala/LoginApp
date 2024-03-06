package com.example.fragmentdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioGroup
import androidx.fragment.app.Fragment
import com.example.fragmentdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initView()
        changeFragment(LoginFragment())
    }

    private fun initView() {
        binding.signUpMain.setOnClickListener() {
            changeFragment(SignUpFragment())
            binding.signUpMain.text = "SIGN UP"

        }
        binding.arrowback.setOnClickListener(){
            changeFragment(LoginFragment())
            binding.signUpMain.text = "SIGN IN"

        }
    }

        fun changeFragment(fragment: Fragment) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, fragment).commit()
        }

}