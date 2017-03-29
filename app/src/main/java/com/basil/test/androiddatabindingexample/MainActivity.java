package com.basil.test.androiddatabindingexample;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.basil.test.androiddatabindingexample.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding activityMainBinding;
    private SampleModel model;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        model = new SampleModel("Aman", "shandilya.aman@gmail.com", true);
        activityMainBinding.setModel(model);
        activityMainBinding.txtView.setText("test");
        activityMainBinding.setActivity(this);
    }

    public void onButtonClick(boolean status) {
        model.setOnline(status);
    }
}
