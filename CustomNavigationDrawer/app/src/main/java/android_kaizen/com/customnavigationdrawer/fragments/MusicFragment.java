package android_kaizen.com.customnavigationdrawer.fragments;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android_kaizen.com.customnavigationdrawer.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class MusicFragment extends Fragment {


    public MusicFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_music, container, false);
    }


}
