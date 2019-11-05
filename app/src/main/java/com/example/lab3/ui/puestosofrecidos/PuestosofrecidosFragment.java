package com.example.lab3.ui.puestosofrecidos;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.lab3.R;

public class PuestosofrecidosFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        getActivity().setTitle("Puestos");
        View root = inflater.inflate(R.layout.fragment_puestosofrecidos, container, false);

        return root;
    }
}