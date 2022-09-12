package com.example.jetpacknavigation.screens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.jetpacknavigation.RootActivity
import com.example.jetpacknavigation.R
import com.example.jetpacknavigation.databinding.FragmentNewsBinding
import kotlin.random.Random

class NewsFragment : Fragment(R.layout.fragment_news) {

    private lateinit var binding: FragmentNewsBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentNewsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.detailsButton.setOnClickListener {
            findNavController().navigate(
                R.id.action_newsFragment_to_detailsFragment,
                //        //first approach in code:
                bundleOf(RootActivity.NEWS_DETAILS_KEY to "Some news ${Random.nextInt()}")
            )
            //        //another approach: add arguments in nav graph
        }
    }
}