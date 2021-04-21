package com.example.android.firstweekchallenge.ui.view

import android.annotation.SuppressLint
import android.database.DatabaseUtils
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.android.firstweekchallenge.R
import com.example.android.firstweekchallenge.data.RestaurantAdapter
import com.example.android.firstweekchallenge.data.getData
import com.example.android.firstweekchallenge.databinding.ActivityListrestaurantBinding
import com.example.android.firstweekchallenge.databinding.ActivitySignupBinding
import com.example.android.firstweekchallenge.ui.viewmodel.InfoViewModel
import com.example.android.firstweekchallenge.ui.viewmodel.MainViewModelFactory
import com.example.android.firstweekchallenge.ui.viewmodel.RestaurantViewModel
import java.net.URL

class ListRestaurantActivity : AppCompatActivity() {
//    Button btnload;
//    ImageView imageview;
//    String URL = "https://images.foody.vn/res/g4/33760/prof/s640x400/foody-mobile-du-mien-garden-mb-jp-309-635785114907746480.jpg"
    
    private lateinit var binding:ActivityListrestaurantBinding
    private lateinit var viewModel:RestaurantViewModel
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_listrestaurant)
        viewModel = ViewModelProvider(this).get(RestaurantViewModel::class.java)

        val adapter = RestaurantAdapter()
        binding.rcList.adapter = adapter
        adapter.data = getData()
        
//        btnload = (Button) findViewById(R.id.btnload)
//        imageview = (ImageView) findViewById(R.id.imageview)
//        btnload.setOnClickListener(new View.OnClickListener()) {
//            public void onClick(View view) {
//                Glide.with(applicationContext()).load(URL).into(imageView);
//            }
//        }
        val recyclerView = findViewById<RecyclerView>(R.id.imageview)
        val imageview = ImageView(this)
        val image1 =
            "https://images.foody.vn/res/g4/33760/prof/s640x400/foody-mobile-du-mien-garden-mb-jp-309-635785114907746480.jpg"
        if(image1 !== null){
            Glide.with(this)
                .load(image1)
                .into(imageview)
        }else{
            imageview.setImageResource(R.drawable.ic_launcher_background)
        }

        val image2 =
            "https://images.foody.vn/res/g1/978/prof/s180x180/foody-mobile-countryhouse-jpg-246-635683259648435945.jpg"
        if(image2 !== null){
            Glide.with(this)
                .load(image2)
                .into(imageview)
        }else{
            imageview.setImageResource(R.drawable.ic_launcher_background)
        }

        val image3 = "https://images.foody.vn/res/g9/82801/prof/s640x400/foody-upload-api-foody-mobile-gi4-jpg-181001160804.jpg"
        if(image2 !== null){
            Glide.with(this)
                .load(image2)
                .into(imageview)
        }else{
            imageview.setImageResource(R.drawable.ic_launcher_background)
        }

        val image4 = "https://images.foody.vn/res/g15/149154/prof/s640x400/foody-upload-api-foody-mobile-4-190111100956.jpg"
        val image5 = "https://images.foody.vn/res/g20/194867/prof/s640x400/foody-mobile-9zbk996o-jpg-112-636143635496125338.jpg"
        val image6 = "https://images.foody.vn/res/g3/25656/prof/s640x400/foody-mobile-city-house-jpg-354-636133373358973749.jpg"
        val image7 = "https://images.foody.vn/res/g7/66844/prof/s640x400/foody-mobile-bpzy3ni3-jpg-841-636143721820688231.jpg"
        val image8 = "https://images.foody.vn/res/g4/33645/prof/s640x400/foody-mobile-bayef6n3-jpg-308-636023635570133301.jpg"
        val image9 = "https://images.foody.vn/res/g26/252442/prof/s640x400/foody-mobile-12-jpg-323-636148043123028599.jpg"
        val image10 = "https://images.foody.vn/res/g2/12513/prof/s640x400/foody-mobile-oasis-cafe-tp-hcm.jpg"
        val image11 = "https://images.foody.vn/res/g20/199622/prof/s640x400/201652411519-mobile-foody-logo-2-640x400.jpg"
        val image12 = "https://images.foody.vn/res/g66/651063/prof/s640x400/foody-mobile-11090821_80492442289-251-636277684533992519.jpg"
    }

}



