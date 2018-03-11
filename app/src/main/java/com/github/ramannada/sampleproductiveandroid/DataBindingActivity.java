package com.github.ramannada.sampleproductiveandroid;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.github.ramannada.sampleproductiveandroid.databinding.ActivityDataBindingBinding;
import com.github.ramannada.sampleproductiveandroid.model.Peserta;

public class DataBindingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityDataBindingBinding binding = DataBindingUtil
                .setContentView(this, R.layout.activity_data_binding);

        Peserta p = new Peserta("labib", "20", "jakarta");
        binding.setPesertas(p);

    }
}
