package com.basil.test.androiddatabindingexample;

import android.databinding.BaseObservable;

/**
 * Created by basi on 30/3/17.
 */

public class SampleModel extends BaseObservable {

    private String username, useremail;
    private boolean isOnline;

    public SampleModel(String username, String useremail, boolean online) {
        this.username = username;
        this.useremail = useremail;
        isOnline = online;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
        notifyChange();
    }

    public String getUseremail() {
        return useremail;
    }

    public void setUseremail(String useremail) {
        this.useremail = useremail;
        notifyChange();
    }

    public boolean isOnline() {
        return isOnline;
    }

    public void setOnline(boolean online) {
        isOnline = online;
        notifyChange();
    }
}
