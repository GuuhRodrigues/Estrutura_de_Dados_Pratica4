//Elabore um programa que utilize o TAD Doquer para
//        adicionar objetos de uma classe contendo os seguintes
//        atributos:
//        Nome, telefone e e-mail.
//        O programa deve solicitar os dados de 10 pessoas.
//        Ao final imprimir a lista na ordem convencional e na ordem
//        inversa


import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Scanner;

public class MainEx2 {
    public static void main(String[] args) {

        Deque<Pessoa> dq = new ArrayDeque<>();
        Scanner ler = new Scanner(System.in);

        String nome, email;
        int telefone;

        for (int i = 0; i < 2; i++) {
            System.out.println("Nome: ");
            nome = ler.next();
            System.out.println("Telefone: ");
            telefone = ler.nextInt();
            System.out.println("E-mail: ");
            email = ler.next();

            Pessoa pessoa = new Pessoa(nome, telefone, email);
            dq.add(pessoa);
        }

        for (Iterator itr = dq.iterator(); itr.hasNext();) {
            System.out.println(itr.next().toString());
        }

        System.out.println();

        for (Iterator itr = dq.descendingIterator(); itr.hasNext();) {
            System.out.println(itr.next().toString());
        }
    }
}
