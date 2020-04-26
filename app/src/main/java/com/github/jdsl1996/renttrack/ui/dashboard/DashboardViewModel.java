package com.github.jdsl1996.renttrack.ui.dashboard;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DashboardViewModel extends ViewModel {

    private MutableLiveData<String> mText;
    private MutableLiveData<String> mButtonText;
    private int count = 0;

    public DashboardViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is dashboard fragment");


        mButtonText = new MutableLiveData<>();
        mButtonText.setValue("This is a button");
    }

    private void UpdateText(){
        count += 1;
        mText.setValue("The page has been reloaded " + count + " times");
    }

    public LiveData<String> getText() {
        MutableLiveData<String> Text = mText;
        UpdateText();
        return Text;
    }

    public LiveData<String> getButtonText() {
        return mButtonText;
    }
}