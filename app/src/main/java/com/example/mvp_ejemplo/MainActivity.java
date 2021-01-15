package com.example.mvp_ejemplo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.mvp_ejemplo.presenter.IViewPresenter;
import com.example.mvp_ejemplo.presenter.Presentador;

public class MainActivity extends AppCompatActivity implements IViewPresenter {

    private Presentador presentador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presentador = new Presentador(this);
    }

    @Override
    public void showPasswordString(String colour) {
    }
}