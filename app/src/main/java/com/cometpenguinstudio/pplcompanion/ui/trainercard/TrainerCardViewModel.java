package com.cometpenguinstudio.pplcompanion.ui.trainercard;

import com.cometpenguinstudio.pplcompanion.controller.LeaderController;
import com.cometpenguinstudio.pplcompanion.model.Leader;

import java.util.List;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class TrainerCardViewModel extends ViewModel {

    private MutableLiveData<String> mText;
    private LeaderController mLeaderController;

    public TrainerCardViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is dashboard fragment");

        mLeaderController = new LeaderController();
    }

    public LiveData<String> getText() {
        return mText;
    }

    public List<Leader> getCasualLeaders() {
        return mLeaderController.getCasualLeaders();
    }

    public List<Leader> getVeteranLeaders() {
        return mLeaderController.getVeteranLeaders();
    }

    public List<Leader> getEliteLeaders() {
        return mLeaderController.getEliteLeaders();
    }

    public List<Leader> getChampionLeaders() {
        return mLeaderController.getChampionLeaders();
    }
}
