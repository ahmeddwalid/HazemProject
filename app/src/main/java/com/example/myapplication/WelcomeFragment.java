package com.example.myapplication;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import com.example.myapplication.databinding.FragmentWelcomeBinding;


public class WelcomeFragment extends Fragment {


private @NonNull FragmentWelcomeBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        binding = FragmentWelcomeBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // Navigate to LoginFragment
        binding.loginbtn.setOnClickListener(v ->
                Navigation.findNavController(v).navigate(R.id.action_welcomeFragment_to_loginFragment)
        );

        // Navigate to SignupFragment
        binding.regbtn.setOnClickListener(v ->
                Navigation.findNavController(v).navigate(R.id.action_welcomeFragment_to_regFragment)
        );
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null; // Prevent memory leaks
    }
}
