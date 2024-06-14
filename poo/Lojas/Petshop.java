package poo.Lojas;

import poo.Animais.Animal;
import poo.Animais.Cachorro;

public class Petshop {

    public void darBanho(Animal animal) {
        animal.setEstadoDeEspirito("Limpo");
    }

    public void tosar(Cachorro cachorro) {
        cachorro.setEstadoDeEspirito("tosado");
    }

    public void deixarNoHotel(Animal animal) {
        animal.setEstadoDeEspirito("Com saudades");
    }
}
