

package com.mycompany.aula12.polimorfismo;

public class Aula12Polimorfismo {

    public static void main(String[] args) {
        //Animal n = new Animal();//Animal é uma classe abstrata, não pode ser instanciada.
        Mamifero mamifero = new Mamifero();
        Reptil reptil = new Reptil();
        Peixe peixe = new Peixe();
        Ave ave = new Ave();
        Canguru canguru = new Canguru();
        Cachorro cachorro = new Cachorro();
        
        //m.setPeso(34.8f);
        //m.setMembros(4);
        //m.setCorPelo("Marrom");
        //m.alimentar();
        //m.locomover();
        //m.emitirSom();
        
        ave.locomover(); //Polimorfismo!!!
        mamifero.locomover();
        reptil.locomover();
        peixe.locomover();
        canguru.locomover();
        canguru.usarBolsa();
        cachorro.locomover();
        canguru.emitirSom();
        cachorro.emitirSom();
    }
        
}
