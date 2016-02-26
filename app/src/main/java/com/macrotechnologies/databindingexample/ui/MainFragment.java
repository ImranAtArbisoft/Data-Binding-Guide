package com.macrotechnologies.databindingexample.ui;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.macrotechnologies.databindingexample.R;
import com.macrotechnologies.databindingexample.databinding.FragmentMainBinding;
import com.macrotechnologies.databindingexample.pjos.User;

/**
 * Created by Imran on 2/26/2016.
 * Main screen
 */
public class MainFragment extends Fragment {
    private FragmentMainBinding mBinding;
    int count = 0;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_main, container, false);
        mBinding.setHandler(new com.macrotechnologies.databindingexample.pjos.Handler());
        return mBinding.getRoot();
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        final Handler handler = new Handler();

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                count++;
                mBinding.setUser(new User("Muhammad:" + count, "Imran:" + count));
                handler.postDelayed(this, 2000);
            }
        }, 2000);
    }
}