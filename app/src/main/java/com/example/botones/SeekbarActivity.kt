package com.example.botones

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import com.example.botones.databinding.ActivityMainBinding
import com.example.botones.databinding.ActivitySeekbarBinding

class SeekbarActivity : AppCompatActivity() {
    private lateinit var b: ActivitySeekbarBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivitySeekbarBinding.inflate(layoutInflater)
        setContentView(b.root)
        b.sbVolumen.setOnSeekBarChangeListener(object :
        SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seek: SeekBar?, progress: Int, fromUser: Boolean) {
                b.tvVolumen.text= seek?.progress.toString().plus("/100")
            }
            override fun onStartTrackingTouch(p0: SeekBar?) {
            }
            override fun onStopTrackingTouch(p0: SeekBar?) {
            }
        })
    }
}