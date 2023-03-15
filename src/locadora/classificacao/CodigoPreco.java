package locadora.classificacao;

import java.util.Arrays;
import java.util.function.Supplier;

public enum CodigoPreco {
    NORMAL(0, ClassificacaoNormal::new),
    LANCAMENTO(1, ClassificacaoLancamento::new),
    INFANTIL(2, ClassificacaoInfantil::new);

    private final int codigo;

    private final Supplier<Classificacao> classificacaoSupplier;

    CodigoPreco(int codigo, Supplier<Classificacao> classificacaoSupplier) {
        this.codigo = codigo;
        this.classificacaoSupplier = classificacaoSupplier;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public static Classificacao getClassificacaoByCodigoPreco(int codigoRecebido) {
        return Arrays.stream(values())
                .filter(codigoPreco -> codigoPreco.codigo == codigoRecebido)
                .findFirst().map(codigoPreco -> codigoPreco.classificacaoSupplier.get())
                .orElse(null);
    }
}
