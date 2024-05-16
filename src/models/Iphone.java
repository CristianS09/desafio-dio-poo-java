package models;

import models.interfaces.AparelhoTelefonico;
import models.interfaces.NavegadorInternet;
import models.interfaces.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{
    
    public void ligar(){
        System.out.println("Ligando...");
    }

    public void atender(){
        System.out.println("Atendendo...");
    }
    
    public void iniciarCorrerioVoz(){
        System.out.println("O correio de voz foi iniciado");
    }

    public void exibirPagina(){
        System.out.println("Página exibida");
    }

    public void adicionarNovaAba(){
        System.out.println("Nova Aba adicionada");
    }

    public void atualizarPagina(){
        System.out.println("Página atualizada");
    }  

    public void tocar(){
        System.out.println("Tocando música");
    }

    public void pausar(){
        System.out.println("Música pausada");
    }

    public void selecionarMusica(){
        System.out.println("Selecione sua música");
    }

}
