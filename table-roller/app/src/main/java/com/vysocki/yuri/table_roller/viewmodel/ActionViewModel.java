package com.vysocki.yuri.table_roller.viewmodel;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import com.vysocki.yuri.table_roller.model.Action;
import com.vysocki.yuri.table_roller.repository.ActionRepository;

public class ActionViewModel extends ViewModel {

    private LiveData<Action> action;
    private ActionRepository actionRepo = new ActionRepository();

    public void init() {
        if (this.action != null) {
            return;
        }
        action = actionRepo.getAction();
    }

    public LiveData<Action> getAction() {
        return this.action;
    }

}
