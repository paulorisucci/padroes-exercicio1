package locadora;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Cliente {
	private final String nome;
	private final List<Aluguel> alugueis = new ArrayList<Aluguel>();

	public Cliente(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public List<Aluguel> getAlugueis() {
		return new ArrayList<>(alugueis);
	}

	public void adicionaAluguel(Aluguel aluguel) {
		alugueis.add(aluguel);
	}

	public double calcularValorAlugueis() {
		return alugueis
				.stream()
				.mapToDouble(Aluguel::getValorAluguel)
				.sum();
	}

	public int calcularPontuacaoTotalAlugadorFrequente() {
		return alugueis
				.stream()
				.mapToInt(Aluguel::getPontuacaoAlugadorFrequente)
				.sum();
	}
}