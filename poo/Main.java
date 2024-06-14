package poo;

import poo.Animais.Cachorro;
import poo.Animais.Gato;
import poo.Animais.Passaro;
import poo.Lojas.Petshop;

public class Main {
    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro("Puppy", "Marrom", 25, 5.5, 10, "feliz");

        System.out.println(cachorro.getNumeroDeCachorros());

        Cachorro cachorro2 = new Cachorro("Thing", "Marrom", 25, 5.5, 10, "feliz");

        System.out.println(cachorro2.getNumeroDeCachorros());
        System.out.println(cachorro.getNumeroDeCachorros());

        // cachorro.setNome("Puppy");
        // cachorro.setCor("Marrom");
        // cachorro.setAltura(25);
        // cachorro.setPeso(5.5);
        // cachorro.setTamanhoDoRabo(10);

        cachorro.latir();
        cachorro.pegar();
        System.out.println(cachorro.pegar());

        System.out.println("O cachorro está " + cachorro.interagir("vai dormir!"));

        System.out.println(cachorro.toString());
        System.out.println(cachorro2.toString());

        Gato gato = new Gato("Felix", "Preto", 5.5);

        Passaro passaro = new Passaro("Piu", "Azul", 0.5);

        gato.soar();
        passaro.soar();

        Petshop petshop = new Petshop();

        petshop.darBanho(passaro);
        System.out.println(cachorro.getEstadoDeEspirito());

        petshop.darBanho(gato);
        System.out.println(gato.getEstadoDeEspirito());

    }
}