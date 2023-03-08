package locadora;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Cliente {
	private String nome;
	private List<Aluguel> dvdsAlugados = new ArrayList<Aluguel>();
	public Cliente(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public void adicionaAluguel(Aluguel aluguel) {
		dvdsAlugados.add(aluguel);
	}
	public String extrato() {
		final String fimDeLinha = System.getProperty("line.separator");
		double valorTotal = 0.0;
		int pontosDeAlugadorFrequente = 0;
		Iterator<Aluguel> alugueis = dvdsAlugados.iterator();
		String resultado = "Registro de Alugueis de " + getNome() +
				fimDeLinha;
		while(alugueis.hasNext()) {
			double valorCorrente = 0.0;
			Aluguel cada = alugueis.next();
			alugueis.forEachRemaining(aluguel -> {valorCorrente += aluguel.getValorAluguel()});
// trata de pontos de alugador frequente
			pontosDeAlugadorFrequente++;
// adiciona bonus para aluguel de um lançamento por pelo
//			menos 2 dias
			if(cada.getDVD().getTipoDvd() == DVD.Tipo.LANCAMENTO &&
					cada.getDiasAlugado() > 1) {
				pontosDeAlugadorFrequente++;

			}
// mostra valores para este aluguel
			resultado += "\t" + cada.getDVD().getTítulo() + "\t" +
					valorCorrente + fimDeLinha;
			valorTotal += valorCorrente;
		} // while
// adiciona rodapé
		resultado += "Valor total devido: " + valorTotal + fimDeLinha;
		resultado += "Voce acumulou " + pontosDeAlugadorFrequente +
				" pontos de alugador frequente";
		return resultado;
	}
}