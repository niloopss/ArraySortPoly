import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Arranjo<?> arranjo = null;

        while (true) {
            System.out.println("\n╔═════════════════════════════════════════╗");
            System.out.println("║         Classificador de Arrays         ║");
            System.out.println("╠═════════════════════════════════════════╣");
            System.out.println("║ 1. Criar e ordenar arranjo              ║");
            System.out.println("║ 0. Sair                                 ║");
            System.out.println("╚═════════════════════════════════════════╝");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            switch (opcao) {
                case 1:
                    System.out.println("Tipos de arranjo:");
                    for (TipoArranjo tipo : TipoArranjo.values()) {
                        System.out.println(tipo.getValor() + " - " + tipo);
                    }
                    System.out.print("Escolha o tipo do arranjo: ");
                    int tipoArranjo = scanner.nextInt();
                    scanner.nextLine(); // Limpar o buffer

                    System.out.print("Digite os elementos separados por espaço: ");
                    String elementosStr = scanner.nextLine();

                    System.out.println("Ordens:");
                    for (Ordem ordem : Ordem.values()) {
                        System.out.println(ordem.getValor() + " - " + ordem);
                    }
                    System.out.print("Escolha a ordem: ");
                    int ordemValor = scanner.nextInt();
                    scanner.nextLine(); // Limpar o buffer

                    try {
                        TipoArranjo tipo = TipoArranjo.fromValor(tipoArranjo);
                        Ordem ordem = Ordem.fromValor(ordemValor);
                        arranjo = criarArranjo(tipo, elementosStr);

                        if (arranjo != null) {
                            System.out.println("\nLista original: ");
                            arranjo.listar();
                            System.out.println("Ordem escolhida: " + ordem);
                            arranjo.classificar(ordem == Ordem.DECRESCENTE);
                            System.out.println("Lista ordenada: ");
                            arranjo.listar();
                        }
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    if (arranjo != null) {
                        System.out.print("Digite o índice para inserir: ");
                        int indice = scanner.nextInt();
                        System.out.print("Digite o valor: ");
                        if (arranjo instanceof ArranjoInteiro) {
                            ((ArranjoInteiro) arranjo).inserir(indice, scanner.nextInt());
                        } else if (arranjo instanceof ArranjoDouble) {
                            ((ArranjoDouble) arranjo).inserir(indice, scanner.nextDouble());
                        } else if (arranjo instanceof ArranjoFloat) {
                            ((ArranjoFloat) arranjo).inserir(indice, scanner.nextFloat());
                        } else if (arranjo instanceof ArranjoByte) {
                            ((ArranjoByte) arranjo).inserir(indice, scanner.nextByte());
                        } else if (arranjo instanceof ArranjoShort) {
                            ((ArranjoShort) arranjo).inserir(indice, scanner.nextShort());
                        } else if (arranjo instanceof ArranjoLong) {
                            ((ArranjoLong) arranjo).inserir(indice, scanner.nextLong());
                        } else if (arranjo instanceof ArranjoChar) {
                            ((ArranjoChar) arranjo).inserir(indice, scanner.next().charAt(0));
                        }
                    } else {
                        System.out.println("Crie um arranjo primeiro.");
                    }
                    break;
                case 3:
                    if (arranjo != null) {
                        arranjo.listar();
                    } else {
                        System.out.println("Crie um arranjo primeiro.");
                    }
                    break;
                case 4:
                    if (arranjo != null) {
                        System.out.print("Digite o índice para remover: ");
                        int indiceRemover = scanner.nextInt();
                        arranjo.remover(indiceRemover);
                    } else {
                        System.out.println("Crie um arranjo primeiro.");
                    }
                    break;
                case 5:
                    if (arranjo != null) {
                        System.out.println("Ordens:");
                        for (Ordem ordem : Ordem.values()) {
                            System.out.println(ordem.getValor() + " - " + ordem);
                        }
                        System.out.print("Escolha a ordem: ");
                        //int ordemValor = scanner.nextInt();
                        scanner.nextLine(); // Limpar o buffer

                        try {
                            Ordem ordem = Ordem.fromValor(scanner.nextInt());
                            arranjo.classificar(ordem == Ordem.DECRESCENTE);
                            System.out.println("Lista ordenada: ");
                            arranjo.listar();
                        } catch (IllegalArgumentException e) {
                            System.out.println(e.getMessage());
                        }
                    } else {
                        System.out.println("Crie um arranjo primeiro.");
                    }
                    break;
                case 0:
                    System.out.println("Saindo...");
                    System.exit(0);
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

    private static Arranjo<?> criarArranjo(TipoArranjo tipo, String elementosStr) {
        String[] elementosArray = elementosStr.split(" ");
        int tamanho = elementosArray.length;

        switch (tipo) {
            case INTEIRO:
                ArranjoInteiro arranjoInt = new ArranjoInteiro(tamanho);
                for (int i = 0; i < tamanho; i++) {
                    arranjoInt.inserir(i, Integer.parseInt(elementosArray[i]));
                }
                return arranjoInt;
            case DOUBLE:
                ArranjoDouble arranjoDouble = new ArranjoDouble(tamanho);
                for (int i = 0; i < tamanho; i++) {
                    arranjoDouble.inserir(i, Double.parseDouble(elementosArray[i]));
                }
                return arranjoDouble;
            case FLOAT:
                ArranjoFloat arranjoFloat = new ArranjoFloat(tamanho);
                for (int i = 0; i < tamanho; i++) {
                    arranjoFloat.inserir(i, Float.parseFloat(elementosArray[i]));
                }
                return arranjoFloat;
            case BYTE:
                ArranjoByte arranjoByte = new ArranjoByte(tamanho);
                for (int i = 0; i < tamanho; i++) {
                    arranjoByte.inserir(i, Byte.parseByte(elementosArray[i]));
                }
                return arranjoByte;
            case SHORT:
                ArranjoShort arranjoShort = new ArranjoShort(tamanho);
                for (int i = 0; i < tamanho; i++) {
                    arranjoShort.inserir(i, Short.parseShort(elementosArray[i]));
                }
                return arranjoShort;
            case LONG:
                ArranjoLong arranjoLong = new ArranjoLong(tamanho);
                for (int i = 0; i < tamanho; i++) {
                    arranjoLong.inserir(i, Long.parseLong(elementosArray[i]));
                }
                return arranjoLong;
            case CHAR:
                ArranjoChar arranjoChar = new ArranjoChar(tamanho);
                for (int i = 0; i < tamanho; i++) {
                    arranjoChar.inserir(i, elementosArray[i].charAt(0));
                }
                return arranjoChar;
            default:
                System.out.println("Tipo de arranjo inválido.");
                return null;
        }
    }
}
