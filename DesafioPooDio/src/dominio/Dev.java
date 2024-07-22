package dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {

	private String nome;
	private Set<Conteudo> conteudoInscrito = new LinkedHashSet<>();
	private Set<Conteudo> conteudoConcluido = new LinkedHashSet<>();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Set<Conteudo> getConteudoInscrito() {
		return conteudoInscrito;
	}

	public void setConteudoInscrito(Set<Conteudo> conteudoInscrito) {
		this.conteudoInscrito = conteudoInscrito;
	}

	public Set<Conteudo> getConteudoConcluido() {
		return conteudoConcluido;
	}

	public void setConteudoConcluido(Set<Conteudo> conteudoConcluido) {
		this.conteudoConcluido = conteudoConcluido;
	}

	public void inscreverBootcamp(Bootcamp boot) {
	    this.conteudoInscrito.addAll(boot.getConteudos()); 	
	    boot.getDevsInscritos().add(this);
	}
	
	public void progredir() {
		Optional<Conteudo> oConteudo = this.conteudoInscrito.stream().findFirst();
		if(oConteudo.isPresent()) {
			this.conteudoConcluido.add(oConteudo.get());
			this.conteudoInscrito.remove(oConteudo.get());
		}else {
			System.err.println("Você não está matriculado em nenhum conteúdo!");
		}
	}
	
	public double calcularTotalXP() {
		return this.conteudoConcluido.stream()
				.mapToDouble(conteudo -> conteudo.calcularXP())
				.sum();
	}
	
    @Override
	public int hashCode() {
		return Objects.hash(nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dev other = (Dev) obj;
		return Objects.equals(nome, other.nome);
	}

    @Override
    public String toString() {
        return "Dev{" +
                "conteudosConcluidos=" + conteudoConcluido +
                ", nome='" + nome + '\'' +
                ", conteudosInscritos=" + conteudoInscrito +
                '}';
    }
}
