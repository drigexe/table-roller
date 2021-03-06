package com.vysocki.yuri.table_roller.view.fragments.internal;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.vysocki.yuri.table_roller.R;
import com.vysocki.yuri.table_roller.model.Action;

import androidx.navigation.Navigation;

public class KnowledgeListFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_knowledge_list, container, false);

        Button goButton = view.findViewById(R.id.gobutton);

        goButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigate(R.id.action_knowledgebaseFragment_to_knowledgeInfoFragment);
            }
        });

        return view;
    }

}
