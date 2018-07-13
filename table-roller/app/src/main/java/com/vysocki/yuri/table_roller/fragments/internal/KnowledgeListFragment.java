package com.vysocki.yuri.table_roller.fragments.internal;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.vysocki.yuri.table_roller.R;
import com.vysocki.yuri.table_roller.activities.MainActivity;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;

public class KnowledgeListFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_knowledge_list, container, false);

        Button goButton = view.findViewById(R.id.gobutton);

        goButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavController navController = Navigation.findNavController(getActivity(), R.id.nav_host_fragment);
                navController.navigate(R.id.knowledgeParticularFragment);
            }
        });

        return view;
    }

}
