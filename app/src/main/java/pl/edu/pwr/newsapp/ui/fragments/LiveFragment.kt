package pl.edu.pwr.newsapp.ui.fragments

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
    }

    var videoView: VideoView?= null

    var mediaController: MediaController?= null

//    videoView = findViewById<View>(R.id.videoView) as VideoView?
//
//    if(mediaController == null){
//        mediaController = MediaController(this)
//        mediaController!!setAnchorView(this.videoView)
//    }
//
//    videoView!!.setMediaController(mediaController)
//    videoView!!.setVideoURI(Uri.parse("android.resource://" + packageName + "/" + R.raw.abc))
//    videoView!!.requestFocus()
//    videoView!!.start()
//    videoView!!.setOnCompletionListener {
//        Toast.makeText(applicationContext, "Video End", Toast.LENGTH_LONG).show()
//    }
//
//    videoView!!.setOnErrorListener { mediaPlayer, i, i2 ->
//        Toast.makeText(applicationContext, "Error", Toast.LENGTH_LONG).show()
//        false
//    }
}