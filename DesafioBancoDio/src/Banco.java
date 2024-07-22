

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class Banco {

	private String nome;
	protected Map<Cliente, List<Conta>> contas;
    
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

    public List<Conta> getContas() {
        return contas.values().stream()
            .flatMap(List::stream) 
            .toList(); 
    }

    public List<Conta> getContasOrdenadasPorSaldo(Cliente cliente) {
        return contas.getOrDefault(cliente, List.of()).stream()
            .sorted(Comparator.comparingDouble(Conta::getSaldo).reversed()) // Ordenar pelo saldo em ordem decrescente
            .collect(Collectors.toList());
    }

}
