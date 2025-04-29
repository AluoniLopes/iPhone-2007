import java.util.Locale;
import java.util.Scanner;

import iPhone.Iphone;

public class App {
    public static Iphone cel = new Iphone();
    public static Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    public static void main(String[] args) throws Exception {
        int option = -1;
        do {
            System.out.println("\n\n");
            System.out.println("Bem vindo ao iPhone 2007");
            System.out.println("Selecione qual serviço gostaria de utilizar:");
            System.out.println("1. Reprodutor Musical");
            System.out.println("2. Aparelho Telefônico");
            System.out.println("3. Navegador da Internet");
            System.out.println("4. Sair");
            System.out.print(">> ");

            option = scanner.nextInt();
            int option2 = -1;

            switch (option) {
                case 1:
                    System.out.println("1. Tocar");
                    System.out.println("2. Pausar");
                    System.out.println("3. Selecionar Musica");
                    option2 = scanner.nextInt();
                    if (option2 == 1) {
                        cel.musica.tocar();
                    } else if (option2 == 2) {
                        cel.musica.pausar();
                    } else if (option2 == 3) {
                        System.out.println("selecione a musica:");
                        scanner.nextLine();
                        cel.musica.selecionarMusica(scanner.nextLine());
                    } else
                        System.out.println("Opcao invalida");
                    option2 = -1;
                    break;

                case 2:
                    System.out.println("1. Ligar");
                    System.out.println("2. Atender");
                    System.out.println("3. Inicar Correio de Voz");
                    option2 = scanner.nextInt();
                    if (option2 == 1) {
                        System.out.print("Digite o número para ligar: ");
                        scanner.nextLine();
                        cel.telefone.ligar(scanner.nextLine());
                    } else if (option2 == 2) {
                        cel.telefone.atender();
                    } else if (option2 == 3) {
                        cel.telefone.iniciarCorreioDeVoz();
                    } else
                        System.out.println("Opcao invalida");
                    option = -1;
                    break;
                case 3:
                    System.out.println("1. Abrir Pagina");
                    System.out.println("2. Adicionar Nova Pagina");
                    System.out.println("3. Atualizar Pagina");
                    option2 = scanner.nextInt();
                    if (option2 == 1) {
                        System.out.print("Digite o URL para abrir: ");
                        scanner.nextLine();
                        cel.internet.exibirPagina(scanner.nextLine());
                    } else if (option2 == 2) {
                        cel.internet.adicionarNovaAba();
                    } else if (option2 == 3) {
                        cel.internet.atualizarPagina();
                    } else
                        System.out.println("Opcao invalida");
                    option2 = -1;
                    break;
            }
        } while (option != 4);

    }
}
