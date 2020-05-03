public class pedido
{

	private float valorTotal;
  private int numPedidos;
  private final int MAX_PRODUTOS = 10;
  private Produto produtos[];

  public pedido(float valorTotal){
    this.valorTotal = valorTotal;
    this.numPedidos =0;
    this.produtos = new Produto[MAX_PRODUTOS];
  }
  public float getValorTotal(){
    return this.valorTotal;
  }

  public void adicionarItem(itemPedido l){
      this.produtos[numPedidos] = l;
      this.numPedidos++;
  }
      

  public obterTotal(float valor){
    
    valorTotal = (numPedidos * valor);
  }

  public void imprimeMenu(){
    System.out.println("-------------------------------");
    System.out.println("Menu de opções:");
    System.out.println("1- Adicionar item ao pedido.");
    System.out.println("2- Apresentar o total do pedido. ");
    System.out.println("Escolha:");
    System.out.println("-------------------------------");


    
    if(codigo == 1){
        return this.adicionarItem(l);
    }else{
      
       System.out.printf("Total: R$ %.2f\n",obterTotal());

    }
   
  }
	
}
