package com.example.zetshop

import android.os.Bundle
import android.view.LayoutInflater
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.zetshop.databinding.ActivitySaqlanganBinding

class SaqlanganActivity : AppCompatActivity() {
    lateinit var binding: ActivitySaqlanganBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
      binding=ActivitySaqlanganBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.navButton.setOnItemSelectedListener {
            when(it.itemId) {


                R.id.menuBir ->
                    {
supportFragmentManager.beginTransaction().replace(R.id.fragmentcontiner,
    SavsaqlanganFragment()).commit()

                        return@setOnItemSelectedListener true

                }


                R.id.menuIkki ->{
                    supportFragmentManager.beginTransaction().replace(R.id.fragmentcontiner,
                        SavsaqlanmaganFragment()).commit()

                    return@setOnItemSelectedListener true

                }
                else ->{

                    return@setOnItemSelectedListener true
                }
            }
        }
        }
}