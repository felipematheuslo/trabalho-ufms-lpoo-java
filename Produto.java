public class Produto{

  //Atributos privados
  private String nomeProduto;
  private Float valor;
  private Fornecedor empresa;

  public Produto(Fornecedor empresa, String nomeProduto, float valor){
    this.empresa = empresa;    
    this.nomeProduto = nomeProduto;
    this.valor = valor;
  }

  //Get e para valor
  public float getValor() {
    return this.valor;
  }

  public String toString(){
		return "\nProduto: "+this.nomeProduto+", valor: R$"+this.valor;
	}
  
}