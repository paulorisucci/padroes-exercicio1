package locadora.classificacao;

class ClassificacaoNormal extends Classificacao {

    public ClassificacaoNormal() {
        this.valorPorDiaExtra = 1.5;
        this.valorFixo = 2;
        this.diasAluguelGratis = 2;
    }

    @Override
    public int getCodigoPreco() {
        return CodigoPreco.NORMAL.getCodigo();
    }
}
