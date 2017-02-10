package com.molidt.cookbook;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.molidt.cookbook.utils.StringUtil;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_main, container, false);
        // Example of a call to a native method
        TextView tv = (TextView) root.findViewById(R.id.tv_msg);
        tv.setText(StringUtil.stringFromJNI());
        return root;
    }
}
