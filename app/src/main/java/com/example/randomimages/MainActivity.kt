package com.example.randomimages

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.bumptech.glide.Glide
import com.example.randomimages.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val list = arrayListOf(
            "https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885__480.jpg",
            "https://thumbs.dreamstime.com/b/silhouette-man-jumping-over-cliff-sunset-background-jump-gap-hill-business-concept-ideasundown-sunrise-74726082.jpg",
            "https://cdn.pixabay.com/photo/2016/09/19/22/46/lake-1681485__480.jpg",
            "https://img.theculturetrip.com/wp-content/uploads/2017/07/seealpsee-1943805_1280.jpg",
            "https://media.cntraveler.com/photos/59bb6a56e35d8f08044a32cf/master/w_2048,h_1536,c_limit/Rakotzbrucke-GettyImages-538162756.jpg"
        )

        with(binding) {
            submitBtn.setOnClickListener {
                list.add(urlEt.text.toString())
                Log.e("bzz", "is added$list")
                urlEt.setText("")
            }
            randomBtn.setOnClickListener {
                Glide.with(applicationContext).load(list.random()).into(randomIv)
            }
        }
    }
}