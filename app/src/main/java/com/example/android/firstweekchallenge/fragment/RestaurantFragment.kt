package com.example.android.firstweekchallenge.fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.add
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.example.android.firstweekchallenge.MovieViewModel
import com.example.android.firstweekchallenge.R

/**
 * Created by nampham on 4/26/21.
 */
class RestaurantFragment : Fragment() {
    private lateinit var movieViewModel: MovieViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val btnFavorite = view.findViewById<Button>(R.id.favorite)
        val btntop = view.findViewById<Button>(R.id.top)
        val btnTopRate = view.findViewById<Button>(R.id.toprate)
        val btnNowPlaying = view.findViewById<Button>(R.id.nowplaying)

        childFragmentManager.commit {
            setReorderingAllowed(true)
            replace<TopFragment>(R.id.nav_host_fragment, "Top")
            addToBackStack(null)
        }

        btnFavorite.setOnClickListener {
            childFragmentManager.commit {
                setReorderingAllowed(true)
                replace<FavFragment>(R.id.nav_host_fragment)
            }
        }

        btntop.setOnClickListener {
            childFragmentManager.commit {
                setReorderingAllowed(true)
                replace<TopFragment>(R.id.nav_host_fragment)
            }
        }
        btnTopRate.setOnClickListener {
            childFragmentManager.commit {
                setReorderingAllowed(true)
                replace<TopRatedFragment>(R.id.nav_host_fragment)
            }
        }

        btnNowPlaying.setOnClickListener {
            childFragmentManager.commit {
                setReorderingAllowed(true)
                replace<NowPlayingFragment>(R.id.nav_host_fragment)
            }
        }
    }
}