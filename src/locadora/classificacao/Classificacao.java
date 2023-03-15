package locadora.classificacao;

public abstract class Classificacao {

    protected double valorPorDiaExtra;

    protected int diasAluguelGratis;

    protected double valorFixo;
    
    public abstract int getCodigoPreco();

    public double getValorAluguel(int diasAlugado) {
        if(diasAlugado > diasAluguelGratis) {
            return valorFixo + (valorPorDiaExtra * (diasAlugado - diasAluguelGratis));
        }
        return valorFixo;
    }
}
