
package com.mycompany.aula12.polimorfismo;


public class Canguru extends Mamifero{
    @Override
    public void locomover(){//sobrepondo o método da classe Mamífero
        System.out.println("Canguru saltando...");
    }
    @Override
    public void emitirSom(){//sobrepondo o método da classe Mamífero
        System.out.println("Som de ganguru...");
    }
    public void usarBolsa(){
        System.out.println("Canguru usando bolsa...");
    }
}
