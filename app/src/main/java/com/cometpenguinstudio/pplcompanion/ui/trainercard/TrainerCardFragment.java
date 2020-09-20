package com.cometpenguinstudio.pplcompanion.ui.trainercard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.cometpenguinstudio.pplcompanion.R;

public class TrainerCardFragment extends Fragment {

    private TrainerCardViewModel trainerCardViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        trainerCardViewModel =
                ViewModelProviders.of(this).get(TrainerCardViewModel.class);
        View root = inflater.inflate(R.layout.fragment_trainer_card, container, false);
        final TextView textView = root.findViewById(R.id.text_trainer_card);
        trainerCardViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}
