import java.util.InputMismatchException;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    //Endereços
    Endereco adress1 = new Endereco("rua1",1,"bairro1","cidade1", "79000001");
    Endereco adress2 = new Endereco("rua2",2,"bairro2","cidade2", "79000002");
    Endereco adress3 = new Endereco("rua3",3,"bairro3","cidade3");
    Endereco adress4 = new Endereco("rua4",4,"bairro4","cidade4");
    Endereco adress5 = new Endereco("rua5",5,"bairro5","cidade5", "79000005");
    Endereco adress6 = new Endereco("rua6",6,"bairro6","cidade6");

    //Funcionários

    //Inserindo CPF inválido
    //Funcionario alan = new Funcionario("Alan", "39666660140", adress1, "067992915376", (float)2147.43, "gerente");
    Funcionario alan = new Funcionario("Alan", "39666660148", adress1, "067992915376", (float)2147.43, "gerente");
    Funcionario breno = new Funcionario("Breno", "80958858195", adress2, "067999841152",(float)987.00, "vendedor");

    //Clientes
    Cliente cesar = new Cliente("Cesar", "36069708113", adress3, "067981141829");
    Cliente daniel = new Cliente("Daniel", "86620095143", adress4, "067992926354");

    //Fornecedores

    //Inserindo CNPJ inválido
    //Fornecedor cocacola = new Fornecedor("Coca-Cola Ltda", "Coca-Cola", "57079100000170", adress5, "6733282020");
    Fornecedor cocacola = new Fornecedor("Coca-Cola Ltda", "Coca-Cola", "57079100000172", adress5, "6733282020");
    Fornecedor ambev = new Fornecedor("Ambev Ltda", "Ambev", "89021840000144", adress6, "08005551122");
    Fornecedor sadia = new Fornecedor("Sadia Alimentos Ltda", "Sadia", "97462389000129", adress1, "08007028800");

    //Produtos

    //Valor do produto lido usando tratamento de exceções
    //Produto fantalaranja = new Produto(cocacola, "Fanta Laranja", lerValor());
    Produto fantalaranja = new Produto(cocacola, "Fanta Laranja", (float)6.00);
    Produto guaranaantartica = new Produto(ambev, "Guarana Antartica", (float)6.00);
    Produto h2oh = new Produto(ambev, "H2OH", (float)4.00);
    Produto sprite = new Produto(cocacola, "Sprite", (float)5.50);
    Produto nuggets = new Produto(sadia, "Nuggets", (float)9.59);
    Produto lasagnabolognesa = new Produto(sadia, "Lasagna Bolognesa", (float)13.99);
    Produto gatorade = new Produto(ambev, "Gatorade", (float)4.29);
    Produto matteleao = new Produto(cocacola, "Matte Leao", (float)7.89);
    Produto presunto = new Produto(sadia, "Presunto fatiado", (float)5.37);
    Produto salsicha = new Produto(sadia, "Salsichas", (float)11.21);
    Produto dellvale = new Produto(cocacola, "Suco DellVale", (float)6.00);    

    //Compras
    Compra compraCesar = new Compra(alan, cesar);
    compraCesar.adicionaProduto(fantalaranja);
    compraCesar.adicionaProduto(salsicha);
    compraCesar.adicionaProduto(dellvale);
    compraCesar.adicionaProduto(dellvale);
    compraCesar.listarCompra();

    Compra compraDaniel = new Compra(breno, daniel);
    compraDaniel.adicionaProduto(guaranaantartica);
    compraDaniel.adicionaProduto(guaranaantartica);
    compraDaniel.adicionaProduto(guaranaantartica);
    compraDaniel.adicionaProduto(presunto);
    compraDaniel.adicionaProduto(nuggets);
    compraDaniel.adicionaProduto(lasagnabolognesa);
    compraDaniel.adicionaProduto(matteleao);
    compraDaniel.listarCompra();

  }

  //Função que faz a leitura da entrada, e só retorna caso o valor seja número
  public static float lerValor(){
    boolean laco = false;
    float valor = 0;

    Scanner read = new Scanner(System.in);

    while(!laco){
      try{
        System.out.print("Digite o valor: ");
        valor = read.nextFloat();
        laco = true;
      }
      catch(InputMismatchException e){
          System.out.println("Não é permitido inserir letras, informe apenas números!");
          System.out.println("Digite o valor correto:");
          read.next();
      }//fim tratamento
    }//fim while

    return valor;
  }
}