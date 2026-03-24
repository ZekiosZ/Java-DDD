package Cliente;

public class Endereco {
    private  final String rua;
    private  final String numero;
    private  final String bairro;
    private  final String cidade;
    private  final String cep;

    public Endereco(String rua,String numero,String bairro, String cidade,String cep){
        this.rua=rua;
        this.numero=numero;
        this.bairro=bairro;
        this.cidade=cidade;
        this.cep=cep;
    }
    //GETTERS(leitura de dados)
    public String getRua(){
        return this.rua;
    }
    public String getNumero(){
        return this.numero;
    }
    public String getBairro(){
        return this.bairro;
    }
    public String getCidade(){
        return this.cidade;
    }
    public String getCep(){
        return this.cep;
    }
    public String mostrarCompleto(){
        return rua+", "+numero+", "+bairro+",  "+cidade+" -"+cep;
    }
}
