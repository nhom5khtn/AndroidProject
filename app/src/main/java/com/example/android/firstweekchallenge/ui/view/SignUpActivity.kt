package com.example.android.firstweekchallenge.ui.view

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.android.firstweekchallenge.R
import com.example.android.firstweekchallenge.data.Account
import com.example.android.firstweekchallenge.data.DataStore
import com.example.android.firstweekchallenge.databinding.ActivitySignupBinding
import com.example.android.firstweekchallenge.ui.viewmodel.InfoViewModel
import com.example.android.firstweekchallenge.ui.viewmodel.MainViewModelFactory

class SignUpActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySignupBinding
    private lateinit var infoViewModel: InfoViewModel
    private lateinit var viewModelFactory: MainViewModelFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_signup)
        val intent = Intent(this, LogInAcitvity::class.java)
        setupViewModel()
        setupObserver()

        binding.apply {
            btnSignUp.setOnClickListener {

                //Check validation the filled information
                var invalidFlag:Boolean = false;
                val emailPattern = "[a-zA-Z0-9._-]+@[a-zA-Z0-9-]+\\.[a-zA-Z.]{2,18}".toRegex();
                val passwordPattern1 = "[a-z]{8,32}".toRegex()
                val passwordPattern2 = "[!|@|#|$|%|^|&|*|(|)|-|_|+|=]".toRegex()
                val passwordPattern3 = "[A-Z]".toRegex()
                val passwordPattern4 = "[0-9]".toRegex()
                if(emailPattern.matches(edtEmail.text.trim().toString())){
                    invalidFlag = false;
                }

                else {
                    edtEmail.setError("The email is invalid");
                    invalidFlag = true;
                }

                if(passwordPattern1.containsMatchIn(edtPassword.text.trim().toString())
                    &&passwordPattern2.containsMatchIn(edtPassword.text.trim().toString())
                    &&passwordPattern3.containsMatchIn(edtPassword.text.trim().toString())
                    &&passwordPattern4.containsMatchIn(edtPassword.text.trim().toString())){
                    invalidFlag = false;
                }
                else{
                    edtPassword.setError("The password is invalid");
                    invalidFlag = true;
                }

                if (edtFullName.text.trim().toString().isNullOrEmpty()) {
                    edtFullName.setError("enter full name please!");
                }
                if (edtEmail.text.trim().toString().isNullOrEmpty()) {
                    edtEmail.setError("enter email please!");
                }
                if (edtPassword.text.trim().toString().isNullOrEmpty()) {
                    edtPassword.setError("enter password please!");
                }

                if (edtFullName.text.trim().toString() != "" && edtEmail.text.trim().toString() != "" && edtPassword.text.trim().toString() != "" && invalidFlag == false){

                    DataStore.fullName = edtFullName.text.trim().toString()
                    DataStore.email = edtEmail.text.trim().toString()
                    DataStore.password = edtPassword.text.trim().toString()
                    Toast.makeText(applicationContext, "successful sign up!", Toast.LENGTH_SHORT).show()
                    startActivity(intent)
                    //finish()
                }else{
                    val alertDialogBuilder = android.app.AlertDialog.Builder(this@SignUpActivity)
                    alertDialogBuilder.setMessage("failed sign up!")
                    alertDialogBuilder.setPositiveButton("OK") { dialog: DialogInterface,
                                                                 which: Int ->
                        Toast.makeText(applicationContext, "please try again!", Toast.LENGTH_SHORT).show()
                    }
                    alertDialogBuilder.show()
                }
            }}
    }

    fun onClickEdtEmail(view: View) {
        infoViewModel.setEmail(binding.edtEmail.text.toString())
    }
    fun onClickEdtFullName(view: View) {
        infoViewModel.setFullName(binding.edtFullName.text.toString())

    }
    fun onClickEdtPassword(view: View) {
        infoViewModel.password.value = binding.edtPassword.text.toString()
    }

    private fun setupViewModel() {
        val account = Account("","","")
        viewModelFactory = MainViewModelFactory(account, "")
        infoViewModel = ViewModelProvider(this, viewModelFactory).get(InfoViewModel::class.java)
    }

    private fun setupObserver() {
        infoViewModel.account.observe(this, {
            binding.edtEmail.setText(it.email)
            binding.edtFullName.setText(it.fullName)
        })
        infoViewModel.password.observe(this, {
            binding.edtPassword.setText(it)
        })
    }
//    override fun onStart() {
//        super.onStart()
//        Log.e("SignUpActivity", "sign up activity - on start")
//    }
//
//    override fun onResume() {
//        super.onResume()
//        Log.e("SignUpActivity", "sign up activity - on Resume")
//    }
//
//    override fun onPause() {
//        super.onPause()
//        Log.e("SignUpActivity", "sign up activity - on Pause")
//    }
//
//    override fun onStop() {
//        super.onStop()
//        Log.e("SignUpActivity", "sign up activity - on Stop")
//    }
//
//    override fun onDestroy() {
//        super.onDestroy()
//        Log.e("SignUpActivity", "sign up activity - on Destroy")
//    }
}