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
import com.vysocki.yuri.table_roller.fragments.internal.KnowledgeListFragment;
import com.vysocki.yuri.table_roller.fragments.internal.KnowledgeManagerFragment;
import com.vysocki.yuri.table_roller.fragments.internal.PanelFragment;

public class KnowledgebaseFragment extends Fragment {

    FragmentTransaction transaction;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_external, container, false);

        KnowledgeManagerFragment knowledgeManagerFragment = new KnowledgeManagerFragment();
        KnowledgeListFragment knowledgeListFragment = new KnowledgeListFragment();

        transaction = getChildFragmentManager().beginTransaction();
        transaction.add(R.id.container_top, knowledgeManagerFragment).commit();
        transaction = getChildFragmentManager().beginTransaction();
        transaction.add(R.id.container_bottom, knowledgeListFragment).commit();

        return view;
    }
}
