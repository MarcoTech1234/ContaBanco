package telefones;

public class Nokia implements AparelhoTelefonico{

    @Override
    public void ligar(String numero) {
        // TODO Auto-generated method stub
        System.out.println(String.format("Ligando para o numero nº %s", numero));
    }

    @Override
    public void atender() {
        // TODO Auto-generated method stub
        System.out.println("Atendendo...");
    }

    @Override
    public void iniciarCorreioVoz() {
        // TODO Auto-generated method stub
        System.out.println("Abrindo correio de voz");
    }

}
