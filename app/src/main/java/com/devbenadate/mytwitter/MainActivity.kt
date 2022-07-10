package com.devbenadate.mytwitter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.devbenadate.mytwitter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displaytwitt()
}
fun displaytwitt() {
    var person1 =
        tweet("Mercy Aineamani", "I am a web developer at microsoft", "43", "5", "67", "9")
    var person2 = tweet("Jenet Kamashaba", "I am  UI/UX Designer at microsoft", "6", "7", "8", "2")
    var person3 =
        tweet("Ahumuza Dallen", "I am a Sinior developer at microsoft", "65", "7", "6", "2")
    var person4 =
        tweet("Muhwezi Babra", "I am a Backend developer at microsoft", "9", "34", "82", "5")
    var person5 =
        tweet("Tumushabe Sarah", "I am a frontend developer at microsoft", "8", "1", "6", "10")
    var tweetList = listOf(person1, person2, person3, person4, person5)

    var Adapter = TwitterRVAdapter(tweetList)
    binding.rvtweet.layoutManager = LinearLayoutManager(this)
    binding.rvtweet.adapter = Adapter

}
}