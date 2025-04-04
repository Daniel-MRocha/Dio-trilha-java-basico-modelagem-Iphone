package funcionalidades;

import java.util.Scanner;

public class ReprodutorMusical implements I_Funcionalidade{

    Scanner leitura = new Scanner(System.in);

    public void tocar(){
        System.out.println("Reproduzindo faixa de som...!!");
    };
    public void pausar(){
        System.out.println("Faixa pausada");
    };
    public void selecionarMusica(String musica){
        System.out.println("Música selecionada ---> " + musica);
    };

    @Override
    public void ativar() {

        System.out.println("Selecione a música:");
        String musica = leitura.next();
        selecionarMusica(musica);

        System.out.println("Controles");
        System.out.println("1 - Play\n2 - Pause");
        String controle = leitura.next();

        switch (controle){
            case ("1") -> tocar();
            case ("2") -> pausar();
            default -> throw new RuntimeException("Opção inválida");
        }
    }
}
