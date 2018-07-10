package com.vysocki.yuri.table_roller.fragments.external;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.vysocki.yuri.table_roller.R;
import com.vysocki.yuri.table_roller.fragments.internal.DicesFragment;
import com.vysocki.yuri.table_roller.fragments.internal.PanelFragment;

public class ActionsFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_external, container, false);

        FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
        DicesFragment dicesFragment = new DicesFragment();
        PanelFragment panelFragment = new PanelFragment();
        transaction.add(R.id.container_top, dicesFragment).commit();
        transaction = getChildFragmentManager().beginTransaction();
        transaction.add(R.id.container_bottom, panelFragment).commit();

        return view;
    }
}
