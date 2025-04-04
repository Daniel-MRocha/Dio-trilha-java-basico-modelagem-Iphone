package funcionalidades;

import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AparelhoTelefonico implements I_Funcionalidade{

    public void ligar(String contato){
        System.out.println("Ligando para " + contato);
        System.out.println(".................");
    };
    public void atender(){
        System.out.println("Atender a ligação......");
        System.out.println(".........Atendida!!");
    };
    public void iniciarCorreioVoz(){
        System.out.println("Iniciando correio de voz .....");
        System.out.println("........você tem X mensagens");
    };

    @Override
    public void ativar() {

        Scanner leitura = new Scanner(System.in);

        System.out.println("""
                ----Telefone----
                1 - Chamar contato
                2 - Atender
                3 - Correio de voz """);

        System.out.println("----Opção: ");
        String opcao = leitura.next();

        switch (opcao){
            case ("1"):
                System.out.println("Nome do contato: ");
                String contato = leitura.next();
                ligar(contato);
                break;
            case ("2"):
                atender();
                break;
            case ("3"):
                iniciarCorreioVoz();
                break;
            default:
                throw new RuntimeException("Opção inválida");
        }

    }
}
