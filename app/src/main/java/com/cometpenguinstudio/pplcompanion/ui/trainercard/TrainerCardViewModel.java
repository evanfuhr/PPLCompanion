package com.cometpenguinstudio.pplcompanion.ui.trainercard;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class TrainerCardViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public TrainerCardViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is dashboard fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
