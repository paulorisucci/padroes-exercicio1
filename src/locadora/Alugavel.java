package locadora;

public interface Alugavel {

    double getValorAluguel(int diasAlugado);
    int getPontuacaoAlugadorFrequente(int diasAlugado);
    String getTitulo();
}
