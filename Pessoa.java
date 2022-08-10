import java.util.Scanner;

public abstract class Pessoa implements Verificavel {
    
    //Atributos privados
    private String nome;
    private String cpf;
    private Endereco endereco;
    private String celular;

    //Construtor
    public Pessoa(String nome, String cpf, Endereco endereco, String celular){
      this.nome = nome;
      if(validar(cpf)){
        this.cpf = cpf;
      }
      else{
        // Foi implementada!
        // TESTAR SE FUNCIONA
        solicitarNovo();
      }
      this.endereco = endereco;
      this.celular = celular;
    }

    //Get e Set para nome
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }

    //Get e Set para celular
    public void setCelular(String celular) {
        this.celular = celular;
    }
    public String getCelular() {
        return this.celular;
    }

    //Validador de CPF
    //Verifica se o tamanho da string é 11
    //Verifica se todos os caracteres são números
    //Roda o algoritmo para validar o CPF
    //Algoritmo especificado pelo Ministério da Fazenda    @Override
    public boolean validar(String cpf){
    // considera-se erro CPF's formados por uma sequencia de numeros iguais
      if (cpf.equals("00000000000") || cpf.equals("11111111111") ||
          cpf.equals("22222222222") || cpf.equals("33333333333") ||
          cpf.equals("44444444444") || cpf.equals("55555555555") ||
          cpf.equals("66666666666") || cpf.equals("77777777777") ||
          cpf.equals("88888888888") || cpf.equals("99999999999"))
      {
       	return(false);
      }
    
      if(cpf.length() == 11){
        int[] numerosCpf = new int[11];
        int soma, resto;
        boolean flag;

        for(int i=0; i<11; i++){
          flag = Character.isDigit(cpf.charAt(i));
                
          if(flag) {
            numerosCpf[i] = Character.getNumericValue(cpf.charAt(i));
          }
          else {
            return false;
          }
        }
            
        soma = numerosCpf[0] * 10;
        soma += numerosCpf[1] * 9;
        soma += numerosCpf[2] * 8;
        soma += numerosCpf[3] * 7;
        soma += numerosCpf[4] * 6;
        soma += numerosCpf[5] * 5;
        soma += numerosCpf[6] * 4;
        soma += numerosCpf[7] * 3;
        soma += numerosCpf[8] * 2;
        soma *= 10;
        resto = soma%11;
            
        if(resto == 10){
          resto = 0;
        }
            
        if(resto != numerosCpf[9]){
          return false;
        }
            
        soma = numerosCpf[0] * 11;
        soma += numerosCpf[1] * 10;
        soma += numerosCpf[2] * 9;
        soma += numerosCpf[3] * 8;
        soma += numerosCpf[4] * 7;
        soma += numerosCpf[5] * 6;
        soma += numerosCpf[6] * 5;
        soma += numerosCpf[7] * 4;
        soma += numerosCpf[8] * 3;
        soma += numerosCpf[9] * 2;
        soma *= 10;
        resto = soma%11;
            
        if(resto == 10){
          resto = 0;
        }
            
        if(resto != numerosCpf[10]){
          return false;
        }
        else{
          return true;
        }
      }
      else{
        return false;
      }
    }

    //Este método solicita um novo CPF, até que o valor do CPF informado esteja correto
    @Override
    public void solicitarNovo(){
    	String novoCpf;
    	Scanner leitura = new Scanner(System.in);
    	boolean laco = true;    	
    	
    	do {
	    	System.out.println("Digite um CPF válido:");
	    	novoCpf = leitura.next();
	    	
	    	if(validar(novoCpf)) {
	    		this.cpf = novoCpf;
	    		laco = false;
	    	}
    	}while(laco);
    }

}