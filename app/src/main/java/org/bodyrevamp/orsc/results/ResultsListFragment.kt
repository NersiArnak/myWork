package org.bodyrevamp.orsc.results

import android.annotation.SuppressLint
import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import org.bodyrevamp.orsc.trainings.TrainingListItem
import org.bodyrevamp.orsc.databinding.FragmentResultsListBinding

class ResultsListFragment : Fragment() {

    private var _binding: FragmentResultsListBinding? = null
    private val binding get() = _binding!!

    private lateinit var pref: SharedPreferences

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentResultsListBinding.inflate(inflater, container, false)
        return binding.root
    }
}