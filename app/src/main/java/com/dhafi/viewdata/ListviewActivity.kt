package com.dhafi.viewdata

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.ArrayAdapter
import com.dhafi.viewdata.databinding.ActivityListviewBinding
import java.util.Arrays

class ListviewActivity : AppCompatActivity() {
    private lateinit var binding: ActivityListviewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListviewBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var dataArray: Array<String> =
            resources.getStringArray(R.array.jurusan)
        Arrays.sort(dataArray)
        var adapter = ArrayAdapter(this,
            android.R.layout.simple_list_item_1, dataArray)
        binding.listView.adapter = adapter
    }
}