package locadora.classificacao;

class ClassificacaoLancamento extends Classificacao {

    public ClassificacaoLancamento() {
        this.valorPorDiaExtra = 3;
        this.valorFixo = 0;
        this.diasAluguelGratis = 0;
    }

    @Override
    public int getPontuacaoAlugadorFrequente(int diasAlugado) {
        if(diasAlugado > 1) {
            return 2;
        }
        return 1;
    }

    @Override
    public int getCodigoPreco() {
        return CodigoPreco.LANCAMENTO.getCodigo();
    }
}
