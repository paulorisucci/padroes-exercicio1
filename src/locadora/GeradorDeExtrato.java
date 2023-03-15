package locadora;

public class GeradorDeExtrato {

    private static final String lineSeparator = System.getProperty("line.separator");

    private Cliente cliente;

    private StringBuilder extrato;

    public GeradorDeExtrato(Cliente cliente) {
        this.cliente = cliente;
        this.extrato = new StringBuilder();
    }

    public String gerarExtrato() {

        adicionarCabecalho();
        cliente.getAlugueis().forEach(this::adicionarInformacoesAluguel);
        adicionarRodape();

        return extrato.toString();
    }

    private void adicionarCabecalho() {
        extrato
                .append("Registro de Alugueis de ")
                .append(cliente.getNome())
                .append(lineSeparator);
    }

    private void adicionarInformacoesAluguel(Aluguel aluguel) {
        extrato
                .append("\t")
                .append(aluguel.getTituloItem())
                .append("\t R$ ")
                .append(aluguel.getValorAluguel())
                .append(lineSeparator);
    }

    private void adicionarRodape() {
        extrato
                .append("Valor total pago: R$ ")
                .append(cliente.calcularValorAlugueis())
                .append(lineSeparator)
                .append("Voce acumulou ")
                .append(cliente.calcularPontuacaoTotalAlugadorFrequente())
                .append(" pontos de alugador frequente");
    }
}
