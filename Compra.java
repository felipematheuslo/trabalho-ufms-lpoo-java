import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Compra{
  
    //Atributos privados
    private Funcionario funcionario;
    private Cliente cliente;
    //Cria uma lista encadeada de produtos
    private List<Produto> produto = new LinkedList<Produto>();

    //Construtor
    public Compra(Funcionario funcionario, Cliente cliente){
      this.funcionario = funcionario;
      this.cliente = cliente;
    }

    //Adiciona um produto à lista encadeada 
    public void adicionaProduto(Produto prod){
      this.produto.add(prod);
    }

    //Imprimir detalhes da compra
    public void listarCompra(){
      System.out.println("\n*** Detalhes da compra ***\n");
      //Informa o funcionário
      System.out.println(funcionario);
      //Informa o cliente
      System.out.println(cliente);
      //Lista todos os produtos comprados
      System.out.println(produto);
      //Mostra o valor total da compra
      float total = 0;
      ListIterator<Produto> it = produto.listIterator(produto.size());
		  while(it.hasPrevious()) {
        total += it.previous().getValor();
		  }
      System.out.println("\nValor da compra: R$"+total);
      System.out.println("******\n");
    }
}