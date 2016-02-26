package com.macrotechnologies.databindingexample.pjos;

import android.support.design.widget.Snackbar;
import android.view.View;

/**
 * Created by Imran on 2/26/2016.
 */
public class User {
    public String firstName;
    public String lastName;
    public String clickText;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        clickText="Click Me";
    }
    public void onClickFirstName(View view) {
        Snackbar.make(view,"FirstName is Clicked",Snackbar.LENGTH_SHORT).show();
    }
}
