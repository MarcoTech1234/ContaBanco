public class Main {

	public static void main(String[] args) {
		Cliente paulo = new Cliente();
		paulo.setNome("Paulo");

		Cliente marco = new Cliente();
		marco.setNome("Marco");
		
		Conta cc = new ContaCorrente(paulo);
		Conta poupanca = new ContaPoupanca(marco);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
