import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // Instanciando o Scanner para receber dados do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitando os dados ao usuário
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt();

        // Consumir a quebra de linha (caso contrário, o próximo nextLine será ignorado)
        scanner.nextLine();

        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo inicial:");
        double saldo = scanner.nextDouble();
     
        // Exibindo a mensagem usando método concat
        String mensagem = "Olá ".concat(nomeCliente)
                .concat(", obrigado por criar uma conta em nosso banco, sua agência é ")
                .concat(agencia)
                .concat(", conta ")
                .concat(String.valueOf(numero))
                .concat(" e seu saldo R$ ")
                .concat(String.format("%.2f", saldo))
                .concat(" já está disponível para saque.");

        System.out.println(mensagem);

        // Encerrando o Scanner
        scanner.close();
    }
}
