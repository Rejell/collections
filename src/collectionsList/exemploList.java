package collectionsList;

import java.util.*;

public class exemploList {

    public static void main(String[] args) {
// Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:

//        List notas = new ArrayList(); // usado antes do Java 5
//        List<Double> notas = new ArrayList<>(); // Generics (jdk 5) - Diamont Operator (jdk 7)
//        ArrayList<Double> notas = new ArrayList<>(); // Não recomendado, com poucas exceções
//        List<Double> notas = new ArrayList<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
/*
        List<Double> notas = Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6); // Limitada, pois não é permitido adicionar ou remover elementos
        notas.add(10d);
        System.out.println(notas);
*/
/*
        List<Double> notas = List.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6); // Imutável, não pode adicionar nem remover parametros
        notas.add(1d);
        notas.remove(o: 5d)
        System.out.println(notas);
*/

        System.out.println("Crie uma lista e adicione as sete notas: ");

        List<Double> notas = new ArrayList<>();
        notas.add(7d);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5d);
        notas.add(7d);
        notas.add(0d);
        notas.add(3.6);
//        System.out.println(notas);
        System.out.println(notas.toString());

        System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5d));

        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        notas.add(4, 8d);
        System.out.println(notas);

        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5d), 6d);
        System.out.println(notas);

        System.out.println("Confira se a nota 5d está na lista: " + notas.contains(5d));

        System.out.println("Exiba todas as notas na ordem em que foram informados: ");
        for (Double nota : notas) System.out.println(nota);

        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));
        System.out.println(notas.toString());

        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exiba a soma dos valores: " + soma);

        System.out.println("Exiba a média das notas: " + (soma/notas.size()));

        System.out.println("Remova a nota 0: ");
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("Remova a nota na posição 0: ");
        notas.remove(0);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 0 e exiba na lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()) {
            Double next = iterator1.next();
            if (next < 7) iterator1.remove();
        }
        System.out.println(notas);

        System.out.println("Apague toda a lista");
        notas.clear();
        System.out.println(notas);

        System.out.println("Confira se a lista está vazia: " + notas.isEmpty());
    }
}
