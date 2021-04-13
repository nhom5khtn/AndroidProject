package com.task1.thirdweekchallenge

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.task1.thirdweekchallenge.databinding.ActivityProfileBinding

class ProfileActivity : AppCompatActivity() {

    private lateinit var binding : ActivityProfileBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView (this,R.layout.activity_profile);

        binding.button.setOnClickListener{
            binding.tvemail.text=binding.edtemail.text.toString.trim()
            binding.tvname.text=binding.........
            binding.tvphone.text=binding...............
        }
        binding.datastore = DataStore("kimquyentran16101999@gmail.com", "tran thi kim quyen", "0123456789")
    }
}

