package com.studies.trigrexamassignment.UI.Adapters

import android.content.Context
import android.content.Intent
import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.DataSource
import com.bumptech.glide.load.engine.GlideException
import com.bumptech.glide.request.RequestListener
import com.bumptech.glide.request.target.Target
import com.studies.trigrexamassignment.R
import com.studies.trigrexamassignment.UI.Models.foodModel1


class foodAdapter(val context: Context, val list:List<foodModel1>): RecyclerView.Adapter<foodAdapter.myviewholder>() {


    class myviewholder(itemview: View): RecyclerView.ViewHolder(itemview){
        val foodImage=itemview.findViewById<ImageView>(R.id.foodImage)
        val foodName=itemview.findViewById<TextView>(R.id.foodName)



    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myviewholder {
        val view= LayoutInflater.from(context).inflate(R.layout.food_itemview,parent,false)
        return myviewholder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: myviewholder, position: Int) {
        val currentitem= list.get(position)
     holder.foodName.text=currentitem.title
        holder.foodImage.setImageResource(currentitem.image)
    }
}