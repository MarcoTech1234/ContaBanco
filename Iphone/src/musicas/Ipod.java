package musicas;

public class Ipod implements ReprodutorMusical{

    @Override
    public void tocar() {
        // TODO Auto-generated method stub
        System.out.println("Tocando Musica");
    }

    @Override
    public void pausar() {
        // TODO Auto-generated method stub
        System.out.println("Pausando a musica");
    }

    @Override
    public void selecionarMusica(String musica) {
        // TODO Auto-generated method stub
        System.out.println(String.format("Selecionando a musica %s", musica));
    }

}
