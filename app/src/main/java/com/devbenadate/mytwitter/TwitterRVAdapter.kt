package com.devbenadate.mytwitter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomnavigation.BottomNavigationItemView

class TwitterRVAdapter(var twitterList: List<tweet>):
    RecyclerView.Adapter<twitterViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): twitterViewHolder {
        var itemView=LayoutInflater.from(parent.context).inflate(R.layout.tweet_list_item,parent,false)
        return twitterViewHolder(itemView)

    }

    override fun onBindViewHolder(holder: twitterViewHolder, position: Int) {
        var currenttweet=twitterList.get(position)
        holder.tvName.text=currenttweet.name
        holder.tvAbout.text=currenttweet.about
        holder.tvmessage.text=currenttweet.message
        holder.tvlike.text=currenttweet.like
        holder.tvshare.text=currenttweet.share
        holder.tvretweet.text=currenttweet.retweet



    }

    override fun getItemCount(): Int {
        return twitterList.size

    }
}
class twitterViewHolder(itemView: View):
    RecyclerView.ViewHolder(itemView){
    var tvName= itemView.findViewById<TextView>(R.id.tvName)
    var tvAbout= itemView.findViewById<TextView>(R.id.tvAbout)
    var tvmessage= itemView.findViewById<TextView>(R.id.tvmessage)
    var tvlike= itemView.findViewById<TextView>(R.id.tvlike)
    var tvshare= itemView.findViewById<TextView>(R.id.tvshare)
    var tvretweet= itemView.findViewById<TextView>(R.id.tvretweet)

}


