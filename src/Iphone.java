import aplicacoes.Iphone.Navegador;
import aplicacoes.Iphone.ReprodutorMusical;
import aplicacoes.Iphone.Telefone;

import java.util.Scanner;

public class Iphone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("...BEM VINDO...");
        System.out.println("---------------\n");
        System.out.println("Spotify: 1\n" + "Mozilla: 2\n" + "Agenda: 3\n");
        System.out.println("---------------");

        int opcao = sc.nextInt();
        switch (opcao) {
            case 1:
                ReprodutorMusical rep = new ReprodutorMusical("We Found Each Other In The Dark", "City And Colour", "As Mais Tocadas");
                rep.selecaoArtista();
                rep.tocarMusica();
                rep.pausarMusica();
                break;

            case 2:
                Navegador navegador = new Navegador("www.google.com.br");
                navegador.addNovaAba();
                navegador.atualizaPagina();
                navegador.exibirPagina();
                break;

            case 3:
                Telefone telefone = new Telefone("Exibir Contatos", "Adicionar um novo contato", "Pessoa");
                telefone.atenderLigacao();
                telefone.ligar();
                telefone.correioVoz();
                break;

            default:
                System.out.println("Opção inválida");
        }
    }
}




    }
}