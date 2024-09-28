import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        double[] numeros = new double[5];
        numeros[0] = 4.5;
        numeros[1] = 5.2;
        numeros[2] = 9.8;
        numeros[3] = 0.4;
        numeros[4] = 1.2;

        int[] valores = {6, 9, 8, 1, 0, 5, 3};

        System.out.println(valores[2]);
        for(int i = 0; i < valores.length; i++){
            System.out.println(valores[i]);
        }

        for(int valor: valores){
            if(valor % 2 == 0) {
                System.out.println(valor);
            }
        }

        Cachorro[] cachorros = new Cachorro[3];

        cachorros[0] = new Cachorro("Bidu");
        cachorros[1] = new Cachorro("Rex");
        cachorros[2] = new Cachorro("Olivério");

        for(Cachorro cao : cachorros){
            System.out.println(cao.getNome());
        }

        ArrayList<String> pessoas = new ArrayList<String>();
        pessoas.add("Armando Uma");
        pessoas.add("Rolando Caio da Rocha");
        pessoas.add("Alceu Dispor");
        pessoas.add(1, "Tiago Kautzmann");

        System.out.println(pessoas.size());

        System.out.println(pessoas.get(1));

        for(int i = 0; i < pessoas.size(); i++){
            System.out.println(pessoas.get(i));
        }

        for(String pessoa : pessoas){
            if(pessoa.length() > 10) {
                System.out.println(pessoa);
            }
        }

        pessoas.forEach(pessoa -> {
            if(pessoa.length() > 10) {
                System.out.println(pessoa);
            }
        });

    }

}