package com.example.newsapp.fragment.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.newsapp.R
import com.example.newsapp.adapter.VerAdapter
import com.example.newsapp.util.ObjectList

class BookmarkFragment : Fragment(R.layout.fragment_bookmark_fragmetn) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews(view)

    }

    private fun initViews(view: View) {
        val verAdapter = VerAdapter()
        verAdapter.submitList(ObjectList.verImageList())
        val recyclerView: RecyclerView = view.findViewById(R.id.recyclerView)
        recyclerView.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = verAdapter
        }
    }
}