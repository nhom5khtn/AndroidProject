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

class LogInFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.log_in_fragment,container,false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val button = view.findViewById<Button>(R.id.btnLogin)
        val _button = view.findViewById<Button>(R.id.btnSignUp)

        button.setOnClickListener {
            parentFragmentManager.commit {
                setReorderingAllowed(true)
                replace<RestaurantFragment>(R.id.fragment_container_view)
                addToBackStack(null)
            }
        }

        _button.setOnClickListener {
            parentFragmentManager.commit {
                setReorderingAllowed(true)
                replace<SignUpFragment>(R.id.fragment_container_view)
                addToBackStack(null)
            }
        }

    }
}

//class LogInFragment : Fragment() {
//
//    override fun onCreateView(
//        inflater: LayoutInflater,
//        container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        val view = inflater.inflate(R.layout.log_in_fragment, container, false)
//        return view
//    }
//
//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//
//        val button = view.findViewById<Button>(R.id.btnLogin)
//        val _button = view.findViewById<Button>(R.id.btnSignUp)
//
//        val edtEmail = view.findViewById<EditText>(R.id.edtEmail)
//        val edtPassword = view.findViewById<EditText>(R.id.edtPassword)
//
//        button.setOnClickListener {
//
//            if (edtEmail.text.trim().toString().isEmpty()) {
//                edtEmail.error = "enter email please!";
//            }
//            if (edtPassword.text.trim().toString().isEmpty()) {
//                edtPassword.error = "enter password please!";
//            }
//            if (edtEmail.text.trim().toString() == DataStore.email && edtPassword.text.trim()
//                    .toString() == DataStore.password
//            ) {
//                Toast.makeText(activity?.applicationContext,
//                    "successful login!",
//                    Toast.LENGTH_SHORT).show()
//
//                parentFragmentManager.commit {
//                    setReorderingAllowed(true)
//                    replace<RestaurantFragment>(R.id.frag_container_view)
//                    addToBackStack(null)
//                }
//
//                //finish()
//            } else {
//                Toast.makeText(activity?.applicationContext,
//                    "please try again!",
//                    Toast.LENGTH_SHORT).show()
//            }
//
//
//        }
//
//        _button.setOnClickListener {
//            parentFragmentManager.commit {
//                setReorderingAllowed(true)
//                replace<SignUpFragment>(R.id.frag_container_view)
//                addToBackStack(null)
//            }
//        }
//
//    }
//}