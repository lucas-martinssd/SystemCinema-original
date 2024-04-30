/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.systemcinema;

/**
 *
 * @author enzov
 */
public enum Assentos 
{
    A(0),
    B(1),
    C(3),
    D(4),
    E(5),
    F(6),
    G(7),
    H(8);
   
    private final int value;

    // Construtor privado para definir o valor do enum
    Assentos(int value) {
        this.value = value;
    }

    // Método getter para obter o valor do enum
    public int getValue() {
        return this.value;
    }
            
}
