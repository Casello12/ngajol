package com.example.ngajol.ui.createNgaji

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.ngajol.R
import com.example.ngajol.databinding.FragmentCreateNgajiBinding

class CreateNgajiFragment : Fragment() {

    private lateinit var binding : FragmentCreateNgajiBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCreateNgajiBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navigate()
    }

    private fun navigate() {
        binding.backBtn.setOnClickListener {
            findNavController().popBackStack()
        }
        binding.btnAdd.setOnClickListener {
            val toJadwal = CreateNgajiFragmentDirections.actionCreateNgajiFragmentToJadwalSholatFragment()
            findNavController().navigate(toJadwal)
        }
    }

}