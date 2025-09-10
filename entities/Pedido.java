package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities_enums.StatusPedido;

public class Pedido {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date momento;
	private StatusPedido status;
	
	private Cliente cliente;
	
	private List<ItemPedido> itens = new ArrayList<ItemPedido>();
	
	public Pedido() {
	}

	public Pedido(Date momento, StatusPedido status, Cliente cliente) {
		this.momento = momento;
		this.status = status;
		this.cliente = cliente;
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public StatusPedido getStatus() {
		return status;
	}

	public void setStatus(StatusPedido status) {
		this.status = status;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public void adicionaItem(ItemPedido item) {
		
		itens.add(item);
	}
	
	public void removeItem(ItemPedido item) {
		
		itens.remove(item);
	}
	
	public double Total() {
		double soma = 0.0;
		
		for (ItemPedido item : itens) {
			soma += item.subTotal();
		}
		
		return soma;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("MOMENTO DO PEDIDO: ");
		sb.append(sdf.format(momento)+ "\n");
		sb.append("STATUS DO PEDIDO: ");
		sb.append(status + "\n");
		sb.append("CLIENTE: ");
		sb.append(cliente + "\n");
		sb.append("ITEM DO PEDIDO: \n");
		
		for (ItemPedido item : itens) {
			sb.append(item + "\n");
		}
		
		sb.append("PREÇO TOTAL: $");
		sb.append(String.format("%.2f", Total()));
		
		return sb.toString();
		
	}
	
	
	
}