public class produto
{
private int codigo;
private float valor;
private String descricao;

public produto(int codigo,float valor,String descricao){
    this.codigo = codigo;
    this.valor = valor;
    this.descricao = descricao;
  }

  public String getDescricao(){
    return this.descricao;
  }
  public String getValor(){
    return this.valor;
  }
  public String getCodigo(){
    return this.codigo;
  }
  
}
