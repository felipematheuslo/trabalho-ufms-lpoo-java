public class Cliente extends Pessoa{
  
  //Construtor
  public Cliente(String nome, String cpf, Endereco endereco, String celular){
    super(nome, cpf, endereco, celular);
  }

  public String toString() {
		return "Nome do cliente: " + this.getNome() + ", Celular: " + this.getCelular();
	}
}