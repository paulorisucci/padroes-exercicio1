package locadora;

public class Aluguel {
	   private final Alugavel alugavel;
	   private final int diasAlugado;
	 
	   public Aluguel(Alugavel alugavel, int diasAlugado) {
	      this.alugavel = alugavel;
	      this.diasAlugado = diasAlugado;
	   }

	   public String getTituloItem() {
		   return alugavel.getTitulo();
	   }
	 
	   public Alugavel getAlugavel() {
	      return alugavel;
	   }
	 
	   public int getDiasAlugado() {
	      return diasAlugado;
	   }

	   public double getValorAluguel() {
		   return alugavel.getValorAluguel(diasAlugado);
	   }

	   public int getPontuacaoAlugadorFrequente() {
		   return alugavel.getPontuacaoAlugadorFrequente(diasAlugado);
	   }
}
