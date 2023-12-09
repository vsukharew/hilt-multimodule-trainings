package vsukharew.multimodule.main_menu

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint
import vsukharew.multimodule.main_menu.databinding.FragmentMainMenuBinding

@AndroidEntryPoint
internal class MainMenuFragment : Fragment(R.layout.fragment_main_menu) {

    private var _binding: FragmentMainMenuBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    private val viewModel: MainMenuViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMainMenuBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.order.setOnClickListener {
            viewModel.order()
        }
        binding.registration.setOnClickListener {
            viewModel.registration()
        }
        binding.calendar.setOnClickListener {
            viewModel.calendar()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}