package br.com.semana4_gerenciador_de_armazem.menuArmazem;

import br.com.semana4_gerenciador_de_armazem.model.Product;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public static void menu() {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Product> products = new ArrayList<Product>();
        int id = 0;
        int option;

        do {
            System.out.println("\t Seja bem vindo Sr. Roberto, ");
            System.out.println("\t Abaixo segue menu para auxilia-lo no gerenciamento do seu armazem");
            System.out.println("0. Fim");
            System.out.println("1. Inclui produto");
            System.out.println("2. Consulta produto");
            System.out.println("Opcao:");
            option = teclado.nextInt();
            switch (option) {
                case 1:
                    System.out.print("Qual a quantidade de produtos que deseja cadastrar? ");
                    int qtt = teclado.nextInt();
                    for (int i = 1; i <= qtt; i++) {
                        System.out.printf("Qual o nome do %dº produto que deseja cadastrar? ", i);
                        teclado.nextLine();
                        String name = teclado.nextLine();
                        System.out.printf("Qual o valor do %dº produto que deseja cadastrar? ", i);
                        double value = teclado.nextDouble();
                        System.out.printf("Qual a quantidade em estoque do %dº produto que deseja cadastrar? ", i);
                        int amount = teclado.nextInt();
                        id++;
                        Product product = new Product(id, name, value, amount);
                        products.add(product);

                    }
                    break;

                case 2:
                    double total = 0;
                    for (Product product : products) {
                        System.out.println(product);
                        total += product.getValue() * product.getTotal();
                    }
                    System.out.println("Total = $" + total);
                    break;
                case 3:
                    System.out.println("Opção inválida. Digite novamente uma das opções do menu ");
                    break;
                case 0:
                    System.out.println("Programa finalizado, para começar novamente, por gentileza reiniciar a aplicação Sr. Roberto");
            }
        } while (option != 0);
    }
}


