package com.vysocki.yuri.table_roller.view.fragments.internal;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.vysocki.yuri.table_roller.R;
import com.vysocki.yuri.table_roller.model.Action;
import com.vysocki.yuri.table_roller.viewmodel.ActionViewModel;

public class PanelFragment extends Fragment {

    GridLayout grid;
    int actionsCount;
    TextView textView;
    ImageView imageView;
    private ActionViewModel viewModel;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_panel, container, false);

        viewModel = ViewModelProviders.of(getActivity()).get(ActionViewModel.class);
        viewModel.init();

        grid = view.findViewById(R.id.panelGrid);
        actionsCount = grid.getChildCount();

        Observer<Action> actionObserver = new Observer<Action>() {
            @Override
            public void onChanged(@Nullable Action action) {

                for (int i = 1; i <= actionsCount; i++ ) {
                    for (int y = -1; y >= -actionsCount; y--) {
                        imageView = view.findViewWithTag(Integer.toString(i));
                        textView = view.findViewWithTag(Integer.toString(y));

                        imageView.setImageResource(action.getIconId());
                        textView.setText(action.getName());
                    }
                }

            }
        };

        viewModel.getAction().observe(getActivity(), actionObserver);

        return view;
    }

}
