package Cliente;

public class Cliente {
    private String id;
    private String nome;
    private String email;
    private String telefone;

    //criando um construtor
    public Cliente(String nome, String id, String email, String telefone){
        //criando um id unico aleatorio
        this.id= java.util.UUID.randomUUID().toString();

        this.nome= nome;
        this.email= email;
        this.telefone= telefone;
        System.out.println("Cadastro do cliente "+nome +" realizado com sucesso");
    }
    //GETTERS - Consultando/ver dados
    public String getId(){
        return this.id;
    }
    public String getNome() {
        return this.nome;
    }
    public String getEmail(){
        return this.email;
    }
    public String getTelefone(){
        return this.telefone;
    }

}
