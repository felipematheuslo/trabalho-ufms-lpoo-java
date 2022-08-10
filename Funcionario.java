public class Funcionario extends Pessoa {
    
    //Atributos privados
    private float salario;
    private String funcao;

    //Construtor
    public Funcionario(String nome, String cpf, Endereco endereco, String celular, float salario, String funcao){
      super(nome, cpf, endereco, celular);
      this.salario = salario;
      this.funcao = funcao;
    }

    public String toString() {
		  return "Nome do funcionario: "+ this.getNome();
	  }
}