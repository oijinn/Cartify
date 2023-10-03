package com.example.cartify.Logic;

import com.example.cartify.Model.Input.Int_Userlogin;
import com.example.cartify.Model.Output.GenericResponse;

import javax.ejb.Local;

@Local
public interface UserLogicI {
    GenericResponse login (Int_Userlogin input);

}
