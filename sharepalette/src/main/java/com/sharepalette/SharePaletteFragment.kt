package com.sharepalette

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.sharepalette.databinding.ShareFragmentBinding

class SharePaletteFragment: Fragment(R.layout.share_fragment) {
    private lateinit var binding: ShareFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = ShareFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        with(binding){
            shareButton.setOnClickListener {
                // Share Activity Contract
            }
        }
        super.onViewCreated(view, savedInstanceState)
    }
}