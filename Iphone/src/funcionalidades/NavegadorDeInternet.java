package funcionalidades;

import java.util.Scanner;

public class NavegadorDeInternet implements I_Funcionalidade{

    public void exibirPagina(String url){
        System.out.printf("-----http//%s-----\n",url);
        System.out.print("""
                |      the page     |
                |                   |
                |                   |
                _____________________
                """);
    };
    public void adicionarNovaAba(){
        System.out.println("Nova aba adicionada!");};
    public void atualizarPagina(){
        System.out.println("Atualizando página.....");
    };

    @Override
    public void ativar() {
        Scanner leitura = new Scanner(System.in);
        System.out.println("""
                Escolha:
                1 - Abrir link
                2 - Adicionar nova aba
                3 - Atualizar """);

        System.out.print("----->Opção : ");
        String opcao = leitura.next();

        switch (opcao){
            case ("1"):
                System.out.println("Digite url:");
                String url = leitura.next();
                exibirPagina(url);
                break;
            case ("2"):
                adicionarNovaAba();
                break;
            case ("3"):
                atualizarPagina();
                break;
            default:
                System.out.println("Opção inválida!!");
        }
    }
}
