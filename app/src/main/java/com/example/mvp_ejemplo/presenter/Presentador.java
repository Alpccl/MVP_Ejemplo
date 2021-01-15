package com.example.mvp_ejemplo.presenter;

import com.example.mvp_ejemplo.model.VerficadorPassword;
import com.example.mvp_ejemplo.presenter.IViewPresenter;

public class Presentador{

    private IViewPresenter viewPresenter;
    private VerficadorPassword model;

    public Presentador(IViewPresenter viewPresenter) {
        this.viewPresenter = viewPresenter;
        this.model = new VerficadorPassword();
    }

    public void verificadorContrasena(String password){
        if (model.señaletica(password).equals("Weak")){
            viewPresenter.showPasswordString("#F10A0A");
        }else if (model.señaletica(password).equals("Medium")){
            viewPresenter.showPasswordString("#ECD021");
        }else{
            viewPresenter.showPasswordString("#53BF0F");
        }
    }
}
