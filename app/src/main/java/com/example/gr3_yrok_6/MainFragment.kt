package com.example.gr3_yrok_6

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.gr3_yrok_6.databinding.FragmentMainBinding

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class MainFragment : Fragment() {

    private lateinit var binding: FragmentMainBinding
    private var list = arrayListOf<Main>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(layoutInflater)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadData()
        val adapter = MainAdapter(list, this::onClick)
        binding.frMain.adapter = adapter
    }

    private fun onClick(position: Int) {
        requireActivity().supportFragmentManager.beginTransaction()
            .replace(R.id.fr_main, PlaylistFtagment()).addToBackStack(null)
            .commit()
    }

    private fun loadData() {
        list.add(
            Main(
                "Now playing",
                "Не сегодня",
                "Ulukmanapo",
                "https://static.wixstatic.com/media/d7e3bd0b8acc406393d8752fedd77c2b.jpg/v1/fill/w_920,h_1139,al_c,q_85,usm_0.66_1.00_0.01,enc_auto/d7e3bd0b8acc406393d8752fedd77c2b.jpg"
            )
        )
    }
}