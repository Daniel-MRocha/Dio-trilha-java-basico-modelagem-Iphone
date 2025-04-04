import funcionalidades.AparelhoTelefonico;
import funcionalidades.I_Funcionalidade;
import funcionalidades.NavegadorDeInternet;
import funcionalidades.ReprodutorMusical;

import java.util.Scanner;

public class Iphone {

    public static void main(String[] args) {
        menu();
    }

    private static void menu(){
        Scanner leitura = new Scanner(System.in);
        int resultado;
        System.out.printf("-----%s-----\n","MENU");
        System.out.println("""
                1 - Telefone
                2 - Música
                3 - Navegar na internet
                4 - Sair """);

        try{
            System.out.print("Escolha : ");
            resultado = leitura.nextInt();


            if(resultado<1 && resultado>4){
                throw new Exception("Opção Inválida!!!");
            }
            else if(resultado == 1){
                I_Funcionalidade funcionalidade = new AparelhoTelefonico();
                funcionalidade.ativar();
            }
            else if(resultado == 2){
                I_Funcionalidade funcionalidade = new ReprodutorMusical();
                funcionalidade.ativar();
            }
            else if(resultado == 3){
                I_Funcionalidade funcionalidade = new NavegadorDeInternet();
                funcionalidade.ativar();
            }
            else {
                System.out.println("\n\n<<< Desligar Iphone >>>");
            }
        }catch (Exception e){
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
