package com.example.recyclerviewanimations.animationThree

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.recyclerviewanimations.R
import com.example.recyclerviewanimations.utils.provideMockedList
import kotlinx.android.synthetic.main.fragment_animation_three.*

class AnimationThreeFragment : Fragment(R.layout.fragment_animation_three) {

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)
    rvAnimationThree.adapter = AnimationThreeAdapter(provideMockedList())
  }
}