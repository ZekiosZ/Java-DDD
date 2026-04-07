package com.delivery;

// Importando as classes que criamos
import com.delivery.cliente.Cliente;
import com.delivery.cliente.Endereco;
import com.delivery.pedido.ItemPedido;
import com.delivery.pedido.Pedido;
import java.util.Scanner;
public class Main {
    static Scanner scanner = new Scanner(System.in);
    static Cliente cadastarCliente() {
        System.out.println("Iniciando cadstro de cliente");
        System.out.println("Digite o nome do cliente");
        String nome = scanner.nextLine();//int,double,next=> le soamente a primeira
        return new Cliente(nome,email,telefone,);
    }
    public static void main(String[] args) {
        System.out.println("Seja bem-vindo");
        ///Criando objeto fixo
        Cliente joao = new Cliente(
                "joao",
                "joao@gmail.com",
                "11996360523"


        );

        Endereco endereco = new Endereco(
                "rua odilon",
                "245",
                "jd maggi",
                "São paulo",
                "05145000"

        );
        System.out.println("Entrega em:" + endereco.mostrarCompleto());
        cadastarCliente();
    }
}