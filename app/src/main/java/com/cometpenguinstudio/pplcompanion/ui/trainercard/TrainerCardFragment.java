package com.cometpenguinstudio.pplcompanion.ui.trainercard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.cometpenguinstudio.pplcompanion.R;
import com.cometpenguinstudio.pplcompanion.controller.LeaderController;
import com.cometpenguinstudio.pplcompanion.model.Leader;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class TrainerCardFragment extends Fragment {

    private TrainerCardViewModel trainerCardViewModel;
    private ConstraintLayout trainerCardContainer;
    List<List<Leader>> casualLeaders;
    List<List<Leader>> veteranLeaders;
    List<List<Leader>> eliteLeaders;
    List<List<Leader>> championLeaders;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        trainerCardViewModel =
                ViewModelProviders.of(this).get(TrainerCardViewModel.class);
        View root = inflater.inflate(R.layout.fragment_trainer_card, container, false);
//        final TextView textView = root.findViewById(R.id.text_trainer_card);
//        trainerCardViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });

        // Sort Leaders
        try {
            casualLeaders = sortLeaders(trainerCardViewModel.getCasualLeaders());
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            veteranLeaders = sortLeaders(trainerCardViewModel.getVeteranLeaders());
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            eliteLeaders = sortLeaders(trainerCardViewModel.getEliteLeaders());
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            championLeaders = sortLeaders(trainerCardViewModel.getChampionLeaders());
        } catch (Exception e) {
            e.printStackTrace();
        }

        return root;
    }

    @org.jetbrains.annotations.NotNull
    private List<List<Leader>> sortLeaders(@NotNull List<Leader> leaders) throws Exception {

        /* The logic:

        length = number of leaders;
        if (length <= 6) => 1 row
        else if (length <= 12) => 2 rows

        Rows will have either the same number of leaders (length is even)
        or the top row will have 1 additional leader

         */

        // Default
        int rows = 1;
        int rowMax = 0;
        int leaderTotal = leaders.size();

        if (leaderTotal < 1) {
            throw new Exception();
        }
        else if (leaderTotal <= 6) {
            rows = 1;
            rowMax = leaders.size();
        }
        else if (leaderTotal <= 12) {
            rows = 2;
            rowMax = (int) Math.ceil(leaders.size() / 2.0);
        }
        else {
            throw new Exception();
        }

        List<List<Leader>> leaderRows = new ArrayList<>();
        for (int i = 0; i < rows; i++) {
            List<Leader> leaderRow = new ArrayList<>();
            for (int j = 0; j < rowMax; j++) {
                try {
                    leaderRow.add(leaders.remove(0));
                }
                catch (Exception e) {
                    break;
                }
            }
            leaderRows.add(leaderRow);
        }

        return leaderRows;
    }
}
