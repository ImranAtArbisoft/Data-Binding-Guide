package com.macrotechnologies.databindingexample.pjos;

import android.support.design.widget.Snackbar;
import android.view.View;

/**
 * Created by Imran on 2/26/2016.
 */
public class Handler {
    public void onClickDefault(View view) {
        Snackbar.make(view, "OnClicked", Snackbar.LENGTH_SHORT).show();
    }
}
