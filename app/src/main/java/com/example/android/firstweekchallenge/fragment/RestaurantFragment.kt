package com.example.android.firstweekchallenge.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.add
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.example.android.firstweekchallenge.R

/**
 * Created by nampham on 4/26/21.
 */
class RestaurantFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val btn2 = view.findViewById<Button>(R.id.button2)
        childFragmentManager.commit {
            setReorderingAllowed(true)
            add<TopFragment>(R.id.nav_host_fragment)
        }
        btn2.setOnClickListener {
            childFragmentManager.commit {
                setReorderingAllowed(true)
                replace<FavFragment>(R.id.nav_host_fragment)
                addToBackStack(null)
            }
        }
    }
}