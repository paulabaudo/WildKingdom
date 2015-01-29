package com.globant.paulabaudo.wildkingdom;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class GeckoFragment extends Fragment {

    View mRootView;

    public GeckoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mRootView = inflater.inflate(R.layout.fragment_gecko, container, false);
        init();
        return mRootView;
    }

    private void init(){
        Button nextAnimalButton = (Button) mRootView.findViewById(R.id.button_gecko);

        nextAnimalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().
                        replace(R.id.frame_container, new CoralSnakeFragment()).
                        addToBackStack(null).commit();
            }
        });
    }

}
