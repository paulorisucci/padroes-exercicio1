package locadora;

public class DVD {
	  private String título;

	  private Tipo tipoDVD;

	  public DVD(String título, Tipo tipoDVD) {
	    this.título = título;
	    this.tipoDVD = tipoDVD;
	  }
	 
	  public String getTítulo() {
	    return título;
	  }
	 
	  public Tipo getTipoDvd() {
	    return this.tipoDVD;
	  }

	  public double getPrecoFixo() {
		  return this.tipoDVD.precoFixo;
	  }

	  public double getAdicionalPorDia() {
		  return this.tipoDVD.valorAdicionalPorDia;
	  }

	  public enum Tipo {
		  NORMAL(2, 1.5),
		  LANCAMENTO(3, 0),
		  INFANTIL(1.5, 1.5);

		  private final double precoFixo;

		  private final double valorAdicionalPorDia;

		  Tipo(double precoFixo, double valorAdicionalPorDia) {
			  this.precoFixo = precoFixo;
			  this.valorAdicionalPorDia = valorAdicionalPorDia;
		  }
	}
}
