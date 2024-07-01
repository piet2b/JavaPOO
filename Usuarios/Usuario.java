package Usuarios;

public class Usuario {
    private static int proximoId = 1;  // Atributo de classe para controlar o próximo ID disponível
    private final int id;  // Identificador único do usuário, não pode ser modificado após a instanciação

    public Usuario() {
        this.id = proximoId;  // Atribui o próximo ID disponível ao novo usuário
        proximoId++;  // Incrementa o próximo ID disponível para a próxima instância
    }

    public int getId() {
        return id;  // Retorna o identificador do usuário
    }
}
