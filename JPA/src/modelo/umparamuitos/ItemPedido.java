package modelo.umparamuitos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import modelo.base.Produto;

@Entity
public class ItemPedido {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	private Pedido pedido;
	
	@ManyToOne
	private Produto produto;
	
	@Column(nullable = false)
	private int quantidade1;
	
	@Column(nullable = false)
	private Double preco1;
	
	ItemPedido(){
		
	}
	
	
	
	public ItemPedido(Pedido pedido, Produto produto, int quantidade, Double preco) {
		super();
		this.pedido = pedido;
		this.setProduto(produto);
		this.quantidade1 = quantidade;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
		if (produto != null && this.preco == null) {
			this.setPreco1(produto.getPreco());
		}
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPreco1() {
		return preco;
	}

	public void setPreco1(Double preco) {
		this.preco = preco;
	}

	private int quantidade;
	
	private Double preco;
	
	
}
