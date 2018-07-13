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
import com.vysocki.yuri.table_roller.interfaces.ExternalFragmentEstablisher;

public class ActionsFragment extends Fragment implements ExternalFragmentEstablisher {

    FragmentTransaction transaction;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_external, container, false);

        DicesFragment dicesFragment = new DicesFragment();
        PanelFragment panelFragment = new PanelFragment();

        setInternalFragment(R.id.container_top, dicesFragment);
        setInternalFragment(R.id.container_bottom, panelFragment);

        return view;
    }

    @Override
    public void setInternalFragment(int frameLayoutId, Fragment internalFragment) {
        transaction = getChildFragmentManager().beginTransaction();
        transaction.add(frameLayoutId, internalFragment).commit();
    }

    @Override
    public boolean getTwoPaneMode(int configResourceTwoPaneMode) {
        return getResources().getBoolean(configResourceTwoPaneMode);
    }

    @Override
    public boolean getScreenSize(int configResourceTabletSize) {
        return getResources().getBoolean(configResourceTabletSize);
    }
}
