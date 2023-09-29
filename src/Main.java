import br.newtonpaiva.Atributos;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Deque<Atributos> deque = new LinkedList<Atributos>();

        for (int i = 0; i < 3; i++){
            System.out.println("Entre com os dados: ");
            Atributos a = new Atributos();
            a.setName(sc.next());
            a.setEmail(sc.next());
            a.setTelefone(sc.nextInt());

            deque.add(a);
        }

        for (Iterator itr = deque.iterator(); itr.hasNext();) {
            System.out.print(itr.next() + " ");
        }
        System.out.println(" ");

        for (Iterator itr = deque.descendingIterator(); itr.hasNext();) {
            System.out.print(itr.next() + " ");
        }
    }
}