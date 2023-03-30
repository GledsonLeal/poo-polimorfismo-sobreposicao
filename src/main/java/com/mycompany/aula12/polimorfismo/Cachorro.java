/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula12.polimorfismo;

/**
 *
 * @author gleds
 */
public class Cachorro extends Mamifero{
    @Override
    public void emitirSom(){//sobrepondo o método da classe Mamífero
        System.out.println("Cachorro latindo...");
    }
    
}
