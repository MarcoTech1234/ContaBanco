import musicas.ReprodutorMusical;
import musicas.Ipod;
import navegadores.Chrome;
import navegadores.NavegadorInternet;
import telefones.AparelhoTelefonico;
import telefones.Nokia;
import multitarefas.Iphone;


public class Main {

        public static void main(String[] args) {

            System.out.println("Opções Iphone:");
            //cria variaveis que são associadas a cada método do iphone, dependendo da interface
            ReprodutorMusical appMusica = new Iphone();
            AparelhoTelefonico appTelefone = new Iphone();
            NavegadorInternet appNavegador = new Iphone();
            
            System.out.println("\nOpções do IPod:");
            appMusica.tocar();
            appMusica.pausar();
            appMusica.selecionarMusica("Phonk");
            
            System.out.println("\nOpções do Telefone:");
            appTelefone.ligar("99128123");
            appTelefone.atender();
            appTelefone.iniciarCorreioVoz();
            
            System.out.println("\nOpções do Navegador:");
            appNavegador.adicionarNovaAba();
            appNavegador.atualizarPagina();
            appNavegador.exibirPagina("web.dio.me");
            
            System.out.println("\nOpções do IPod:");
            ReprodutorMusical ipod = new Ipod();
            ipod.tocar();
            ipod.pausar();
            ipod.selecionarMusica("Phonk");
            
            System.out.println("\nOpções do Nokia:");
            AparelhoTelefonico nokia = new Nokia();
            nokia.atender();
            nokia.ligar("12131314");
            nokia.iniciarCorreioVoz();
            
            System.out.println("\nOpções do Navegador Safari:");
            NavegadorInternet chrome = new Chrome();
            chrome.adicionarNovaAba();
            chrome.atualizarPagina();
            chrome.exibirPagina("www.youtube");
    }
}
