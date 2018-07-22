package com.vysocki.yuri.table_roller.fragments.internal;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.vysocki.yuri.table_roller.R;

public class PanelFragment extends Fragment {

    GridLayout grid;
    int actionsCount;
    TextView textView;
    ImageView imageView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_panel, container, false);

        grid = view.findViewById(R.id.panelGrid);
        actionsCount = grid.getChildCount();

        for (int i = 1; i <= actionsCount; i++ ) {
            for (int y = -1; y >= -actionsCount; y--) {
                imageView = view.findViewWithTag(Integer.toString(i));
                textView = view.findViewWithTag(Integer.toString(y));

                setDefaultActionSlot();
            }
        }

        return view;
    }

    public void setDefaultActionSlot() {
        imageView.setImageResource(R.drawable.action_empty);
        textView.setText(R.string.action_empty);
    }

}
