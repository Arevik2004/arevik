package com.example.tictactoe.screens;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ToggleButton;

import com.example.tictactoe.MainActivity;
import com.example.tictactoe.R;


public class SettingsFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_settings, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        ToggleButton toggleButton = view.findViewById(R.id.toggleButton);

        toggleButton.setChecked(MainActivity.isMusicPlaying());
        toggleButton.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                MainActivity.playMusic(requireContext());
            } else {
                MainActivity.stopMusic();
            }
        });
    }

    public static SettingsFragment newInstance() {
        return new SettingsFragment();
    }
}