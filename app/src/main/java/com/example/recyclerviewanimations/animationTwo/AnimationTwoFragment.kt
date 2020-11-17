package com.example.recyclerviewanimations.animationTwo

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.recyclerviewanimations.R
import com.example.recyclerviewanimations.utils.provideMockedList
import kotlinx.android.synthetic.main.fragment_animation_two.*

class AnimationTwoFragment : Fragment(R.layout.fragment_animation_two) {

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)
    rvAnimationTwo.adapter = AnimationTwoAdapter(provideMockedList())
  }
}