package locadora.classificacao;

public abstract class Classificacao {

    protected double valorPorDiaExtra;

    protected int diasAluguelGratis;

    protected double valorFixo;
    
    protected int pontuacaoAlugadorFrequente;

    public abstract int getCodigoPreco();

    public int getPontuacaoAlugadorFrequente(int diasAlugado){
        return pontuacaoAlugadorFrequente;
    }

    public double getValorAluguel(int diasAlugado) {
        if(diasAlugado > diasAluguelGratis) {
            return valorFixo + (valorPorDiaExtra * (diasAlugado - diasAluguelGratis));
        }
        return valorFixo;
    }
}
