/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proxectomaquinabebidaselena;

/**
 *
 * @author Elena Dopico
 */
public class TarxetaMoedeiro {
    
    private int saldo;

    public TarxetaMoedeiro(int saldo) {
        this.saldo = saldo;
    } 
   
    /**
     * Get the value of saldo
     *
     * @return the value of saldo
     */
    public int getSaldo() {
        return saldo;
    }

    /**
     * Set the value of saldo
     *
     * @param saldo new value of saldo
     */
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "TarxetaMoedeiro{" + "saldo=" + saldo + '}';
    }

           
    
}
