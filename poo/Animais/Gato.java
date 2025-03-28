package poo.Animais;

public class Gato extends Animal {

    static int numeroDeGatos;

    public Gato(String nome, String cor, double peso) {
        super(nome, cor, peso);
        numeroDeGatos++;
    }

    @Override
    public String toString() {
        return "Gato{" + "nome='" + nome + '\'' + '}';
    }

    @Override
    public void soar() {
        System.out.println("MIAU!");
    }
}
