package locadora;

import locadora.classificacao.Classificacao;
import locadora.classificacao.CodigoPreco;

public class DVD implements Alugavel {
	public static final int NORMAL = 0;
	public static final int LANCAMENTO = 1;
	public static final int INFANTIL = 2;

	private final String titulo;

	private Classificacao classificacao;

	public DVD(String titulo, int codigoDePreco) {
		this.titulo = titulo;
	    setClassificacao(codigoDePreco);
	}
	 
	public String getTitulo() {
	    return titulo;
	  }

	public void setClassificacao(int codigoDePreco) {
		this.classificacao = CodigoPreco.getClassificacaoByCodigoPreco(codigoDePreco);
	}

	public double getValorAluguel(int diasAlugado) {
		return classificacao.getValorAluguel(diasAlugado);
	}

	public int getPontuacaoAlugadorFrequente(int diasAlugado) {
		return classificacao.getPontuacaoAlugadorFrequente(diasAlugado);
	}
}
