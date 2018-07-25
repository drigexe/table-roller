package com.vysocki.yuri.table_roller.repository;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;

import com.vysocki.yuri.table_roller.model.Action;

public class ActionRepository {

    public LiveData<Action> getAction() {
        final MutableLiveData<Action> data = new MutableLiveData<>();
        Action action = new Action();
        data.setValue(action);
        return data;
    }

}
