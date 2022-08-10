import java.util.Scanner;

public class Fornecedor implements Verificavel {
    
    //Atributos privados
    private String razaoSocial;
    private String nomeFantasia;
    private String cnpj;
    private Endereco endereco;
    private String celular;

    //Construtor
    public Fornecedor(String razaoSocial, String nomeFant, String cnpj, Endereco endereco, String celular){
      this.razaoSocial = razaoSocial;
      this.nomeFantasia = nomeFant;
      if(validar(cnpj)){
        this.cnpj = cnpj;
      }
      else{
        // Foi implementada!
        // TESTAR SE FUNCIONA
        solicitarNovo();
      }
      this.endereco = endereco;
      this.celular = celular;
    }

    //Validador de CNPJ
    //Verifica se o tamanho da string é 14
    //Verifica se todos os caracteres são números
    //Roda o algoritmo para validar o CNPJ
    //Algoritmo especificado pelo Ministério da Fazenda
    @Override
    public boolean validar(String cnpj){          
      if(cnpj.length() == 14){
        int[] numerosCnpj = new int[14];
        int soma, resto;
        boolean flag;

        for(int i=0; i<14; i++){
          flag = Character.isDigit(cnpj.charAt(i));
                
          if(flag) {
            numerosCnpj[i] = Character.getNumericValue(cnpj.charAt(i));
          }
          else {
            return false;
          }
        }
            
        soma = numerosCnpj[0] * 5;
        soma += numerosCnpj[1] * 4;
        soma += numerosCnpj[2] * 3;
        soma += numerosCnpj[3] * 2;
        soma += numerosCnpj[4] * 9;
        soma += numerosCnpj[5] * 8;
        soma += numerosCnpj[6] * 7;
        soma += numerosCnpj[7] * 6;
        soma += numerosCnpj[8] * 5;
        soma += numerosCnpj[9] * 4;
        soma += numerosCnpj[10] * 3;
        soma += numerosCnpj[11] * 2;
        resto = soma%11;
            
        if(resto < 2){
          resto = 0;
        }
        else{
          resto = 11-resto;
        }
            
        if(resto != numerosCnpj[12]){
          return false;
        }
            
        soma = numerosCnpj[0] * 6;
        soma += numerosCnpj[1] * 5;
        soma += numerosCnpj[2] * 4;
        soma += numerosCnpj[3] * 3;
        soma += numerosCnpj[4] * 2;
        soma += numerosCnpj[5] * 9;
        soma += numerosCnpj[6] * 8;
        soma += numerosCnpj[7] * 7;
        soma += numerosCnpj[8] * 6;
        soma += numerosCnpj[9] * 5;
        soma += numerosCnpj[10] * 4;
        soma += numerosCnpj[11] * 3;
        soma += numerosCnpj[12] * 2;
        resto = soma%11;
            
        if(resto < 2){
          resto = 0;
        }
        else{
          resto = 11-resto;
        }
            
        if(resto != numerosCnpj[13]){
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

    //Este método solicita um novo CNPJ, até que o valor do CNPJ informado esteja correto
    @Override
    public void solicitarNovo(){
    	String novoCnpj;
    	Scanner leitura = new Scanner(System.in);
    	boolean laco = true;    	
    	
    	do {
	    	System.out.println("Digite um CNPJ válido:");
	    	novoCnpj = leitura.next();
	    	
	    	if(validar(novoCnpj)) {
	    		this.cnpj = novoCnpj;
	    		laco = false;
	    	}
    	}while(laco);
    }
}