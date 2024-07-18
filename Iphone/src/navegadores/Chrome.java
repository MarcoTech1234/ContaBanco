package navegadores;

public class Chrome implements NavegadorInternet{

    @Override
    public void exibirPagina(String url) {
        // TODO Auto-generated method stub
        System.out.println(String.format("Exibindo pagina do site: %s",url));
    }

    @Override
    public void adicionarNovaAba() {
        // TODO Auto-generated method stub
        System.out.println("Abrindo nova aba");
    }

    @Override
    public void atualizarPagina() {
        // TODO Auto-generated method stub
        System.out.println("Atualizar página");
    }

}
