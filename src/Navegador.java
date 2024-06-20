package aplicacoes.Iphone;

public class Navegador {
    private String endereco;

    public Navegador(String endereco) {
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void exibirPagina() {
        System.out.println("Exibindo página: " + endereco);
    }

    public void addNovaAba() {
        System.out.println("Nova Aba Aberta");
    }

    public void atualizaPagina() {
        System.out.println("F5 " + "Página Atualizada");
    }
}
