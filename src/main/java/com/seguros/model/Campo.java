/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.seguros.model;

import java.math.BigInteger;

/**
 *
 * @author Omar
 */
public class Campo {

    public BigInteger id;
    public String nombre;

    public Campo(BigInteger id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    
    

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
