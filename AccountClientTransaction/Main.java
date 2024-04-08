package AccountClientTransaction;

public class Main {
    public static void main(String[] args) {
           // Criando um cliente
           Client client = new Client();
           client.name = "João";
           client.address = "Rua Principal, 123";
   
           // Criando uma conta para o cliente
           Account account = new Account();
           account.setClient(client);
   
           // Exibindo as informações do cliente e suas transações
           System.out.println("Nome do cliente: " + client.name);
           System.out.println("Endereço do cliente: " + client.address);
           System.out.println("ID da conta: " + account.getId_account());
       }
}
