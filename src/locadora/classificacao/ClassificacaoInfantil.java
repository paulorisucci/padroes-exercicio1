package locadora.classificacao;

public class ClassificacaoInfantil extends Classificacao {

    public ClassificacaoInfantil() {
        this.valorPorDiaExtra = 1.5;
        this.valorFixo = 1.5;
        this.diasAluguelGratis = 3;
    }

    @Override
    public int getCodigoPreco() {
        return CodigoPreco.INFANTIL.getCodigo();
    }
}
