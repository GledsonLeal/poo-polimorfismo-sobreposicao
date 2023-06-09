
package com.mycompany.aula12.polimorfismo;

public class Peixe extends Animal{
    
    private String corEscama;

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
        
    @Override
    public void locomover() {
        System.out.println("Nadando...");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo substâncias...");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de peixe...");
    }
    
    public void soltarBolha(){
        System.out.println("Soltou bolha...");
    }
    
}
