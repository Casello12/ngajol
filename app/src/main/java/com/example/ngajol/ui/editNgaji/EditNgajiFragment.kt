package com.example.ngajol.ui.editNgaji

import android.opengl.Visibility
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.ngajol.R
import com.example.ngajol.databinding.FragmentEditNgajiBinding


class EditNgajiFragment : Fragment() {

    private lateinit var binding : FragmentEditNgajiBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentEditNgajiBinding.inflate(layoutInflater, container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    private fun navigate(){
        binding.kuotaLayout.visibility = View.INVISIBLE
    }


}