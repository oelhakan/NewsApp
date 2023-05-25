package pl.edu.pwr.newsapp.ui.fragments

import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.MediaController
import android.widget.Toast
import android.widget.VideoView
import androidx.fragment.app.Fragment
import pl.edu.pwr.newsapp.R
import pl.edu.pwr.newsapp.ui.NewsActivity
import pl.edu.pwr.newsapp.ui.NewsViewModel

class LiveFragment : Fragment(R.layout.fragment_live) {

    lateinit var viewModel: NewsViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = (activity as NewsActivity).viewModel

        val videoView = view.findViewById<VideoView>(R.id.videoView)
        val videoPath = "android.resource://${requireActivity().packageName}/${R.raw.video}"

        val videoUri = Uri.parse(videoPath)
        videoView.setVideoURI(videoUri)

        val mediaController = MediaController(requireContext())
        mediaController.setAnchorView(videoView)
        videoView.setMediaController(mediaController)

        videoView.start()
    }
}