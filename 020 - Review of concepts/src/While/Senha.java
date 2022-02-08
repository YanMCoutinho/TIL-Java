package While;

import java.util.Scanner;

public class Senha {

	public static void main(String[] args) {
        String rogerio[] = {"fusca", "fiat", "vaga vazia", "vaga de cadeirante"};        
        //int cont = 1982;
        
        for (int indice = 0; indice<rogerio.length; indice = indice + 1) {
            System.out.println("a vaga do rogerio é " + rogerio[indice]);
            System.out.println("o indice (nome) dessa vaga é " + indice);
        }
    }



}
