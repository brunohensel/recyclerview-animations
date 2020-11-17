package com.example.recyclerviewanimations.animationOne

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.recyclerviewanimations.R
import kotlinx.android.synthetic.main.fragment_animation_one.*

class AnimationOneFragment : Fragment(R.layout.fragment_animation_one) {
private lateinit var listOfItem: ArrayList<Int>

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    listOfItem = arrayListOf()
    listOfItem.add(1)
    listOfItem.add(2)
    listOfItem.add(3)
    listOfItem.add(4)
    listOfItem.add(5)
    listOfItem.add(6)
    listOfItem.add(7)
    listOfItem.add(8)
    listOfItem.add(9)
    listOfItem.add(10)
    listOfItem.add(11)
    listOfItem.add(12)
    listOfItem.add(13)
    listOfItem.add(14)
    listOfItem.add(15)
  }

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)
    rvAnimationOne.adapter = AnimationOneAdapter(listOfItem)
  }
}