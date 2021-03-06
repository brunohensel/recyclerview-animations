package com.example.recyclerviewanimations.animationOne

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.recyclerviewanimations.R
import com.example.recyclerviewanimations.utils.provideMockedList
import kotlinx.android.synthetic.main.fragment_animation_one.*

class AnimationOneFragment : Fragment(R.layout.fragment_animation_one) {

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)
    rvAnimationOne.adapter = AnimationOneAdapter(provideMockedList())
  }
}