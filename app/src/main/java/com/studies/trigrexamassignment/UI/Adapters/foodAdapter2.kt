package com.studies.trigrexamassignment.UI.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.studies.trigrexamassignment.R
import com.studies.trigrexamassignment.UI.Models.foodModel1
import com.studies.trigrexamassignment.UI.Models.foodModel2

class foodAdapter2(val context: Context, val list:List<foodModel2>): RecyclerView.Adapter<foodAdapter2.myviewholder>() {


    class myviewholder(itemview: View): RecyclerView.ViewHolder(itemview){
        val foodImage2=itemview.findViewById<ImageView>(R.id.foodImage2)
        val foodCompany=itemview.findViewById<TextView>(R.id.foodCompany)
        val foodName=itemview.findViewById<TextView>(R.id.foodName)
        val rating=itemview.findViewById<TextView>(R.id.rating)
        val time=itemview.findViewById<TextView>(R.id.time)





    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myviewholder {
        val view= LayoutInflater.from(context).inflate(R.layout.food_itemview2,parent,false)
        return myviewholder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: myviewholder, position: Int) {
        val currentitem= list.get(position)
        holder.foodName.text=currentitem.foodname
        holder.foodImage2.setImageResource(currentitem.image)
        holder.foodCompany.text=currentitem.companyname
        holder.rating.text="${currentitem.rating}/5"
        holder.time.text=currentitem.time
    }
}