package introaojava;

public class funcoes {
    public static void main(String[] args) {
        String name = "Nome";
        saudacao(name);
        int resultado = soma(2, 4);
        System.out.println(resultado);
    }

    public static void saudacao(String name) {
        System.out.println("Olá, mundo!");
    }

    public static int soma(int a, int b) {
        return a + b;
    }
}
