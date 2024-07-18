package multitarefas;

import musicas.ReprodutorMusical;
import navegadores.NavegadorInternet;
import telefones.AparelhoTelefonico;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    @Override
    public void tocar() {
        // TODO Auto-generated method stub
        System.out.println("Tocando música pelo Iphone");
    }

    @Override
    public void pausar() {
        // TODO Auto-generated method stub
        System.out.println("Pausando música pelo Iphone");
    }

    @Override
    public void selecionarMusica(String musica) {
        // TODO Auto-generated method stub
        System.out.println(String.format("Selecionado a música %s pelo Iphone", musica));
    }

    @Override
    public void exibirPagina(String url) {
        // TODO Auto-generated method stub
        System.out.println(String.format("Exibindo pagina %s pelo Iphone", url));
    }

    @Override
    public void adicionarNovaAba() {
        // TODO Auto-generated method stub
        System.out.println("Abrindo nova aba pelo Iphone");
    }

    @Override
    public void atualizarPagina() {
        // TODO Auto-generated method stub
        System.out.println("Atualizando a página pelo Iphone");
    }

    @Override
    public void ligar(String numero) {
        // TODO Auto-generated method stub
        System.out.println(String.format("Ligado para o numero nº %s pelo Iphone", numero));
    }

    @Override
    public void atender() {
        // TODO Auto-generated method stub
        System.out.println("Atendendo pelo Iphone");
    }

    @Override
    public void iniciarCorreioVoz() {
        // TODO Auto-generated method stub
        System.out.println("Abrindo correio de voz pelo Iphone");
    }

}
