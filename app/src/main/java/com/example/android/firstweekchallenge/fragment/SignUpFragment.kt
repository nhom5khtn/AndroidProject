package com.example.android.firstweekchallenge.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.example.android.firstweekchallenge.R
import com.example.android.firstweekchallenge.data.DataStore

class SignUpFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.sign_up_fragment,container,false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val button = view.findViewById<Button>(R.id.btnSignUp)

        button.setOnClickListener {
            parentFragmentManager.commit {
                setReorderingAllowed(true)
                replace<LogInFragment>(R.id.fragment_container_view)
                addToBackStack(null)
            }
        }

}
//class SignUpFragment : Fragment() {
//
//    override fun onCreateView(
//        inflater: LayoutInflater,
//        container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        val view = inflater.inflate(R.layout.sign_up_fragment,container,false)
//        return view
//    }
//
//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//
//        val button = view.findViewById<Button>(R.id.btnSignUp)
//
//        val edtEmail = view.findViewById<EditText>(R.id.edtEmail)
//        val edtFullName = view.findViewById<EditText>(R.id.edtFullName)
//        val edtPassword = view.findViewById<EditText>(R.id.edtPassword)
//
//        button.setOnClickListener {
//
//            if (edtFullName.text.trim().toString().isEmpty()) {
//                edtFullName.error = "enter full name please!";
//            }
//            if (edtEmail.text.trim().toString().isEmpty()) {
//                edtEmail.error = "enter email please!";
//            }
//            if (edtPassword.text.trim().toString().isEmpty()) {
//                edtPassword.error = "enter password please!";
//            }
//
//            if (edtFullName.text.trim().toString() != "" && edtEmail.text.trim().toString() != "" && edtPassword.text.trim().toString() != ""){
//
//                DataStore.fullName = edtFullName.text.trim().toString()
//                DataStore.email = edtEmail.text.trim().toString()
//                DataStore.password = edtPassword.text.trim().toString()
//                Toast.makeText(activity?.applicationContext, "successful sign up!", Toast.LENGTH_SHORT).show()
//
//                parentFragmentManager.commit {
//                    setReorderingAllowed(true)
//                    replace<LogInFragment>(R.id.frag_container_view)
//                    addToBackStack(null)
//                }
//
//            }else{
//                Toast.makeText(activity?.applicationContext, "please try again!", Toast.LENGTH_SHORT).show()
//            }
//        }
//    }
//
}