package com.example.recyclerviewanimations.animationThree

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewanimations.R
import kotlinx.android.synthetic.main.item_animation.view.*

class AnimationThreeAdapter(private val dataSet: List<Int>) :
  RecyclerView.Adapter<AnimationThreeAdapter.ViewHolder>() {

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
    return ViewHolder(
      LayoutInflater.from(parent.context).inflate(R.layout.item_animation, parent, false)
    )
  }

  override fun onBindViewHolder(holder: ViewHolder, position: Int) {
    holder.cardView.animation =
      AnimationUtils.loadAnimation(holder.itemView.context, R.anim.animation_three)
  }

  override fun getItemCount(): Int = dataSet.size

  inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val cardView: CardView = view.cardView
  }
}