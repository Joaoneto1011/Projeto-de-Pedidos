package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Cliente;
import entities.ItemPedido;
import entities.Pedido;
import entities.Produto;
import entities_enums.StatusPedido;

public class ProgramaPrincipal{
	
	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("                    INSIRA OS DADOS DO CLIENTE \n");
		
		System.out.print("NOME: ");
		String nome = sc.nextLine();
		
		System.out.print("EMAIL: ");
		String email = sc.next();
		
		System.out.print("DATA DE NASCIMENTO (DD/MM/YYYY): ");
		Date dataNascimento = sdf.parse(sc.next());
		
		Cliente cliente = new Cliente(nome, email, dataNascimento);
		
		System.out.println();
	
		System.out.println("                    INSIRA OS DADOS DO PEDIDO \n");
		
		System.out.print("STATUS: ");
		StatusPedido status = StatusPedido.valueOf(sc.next());
		
		Pedido pedido = new Pedido(new Date(), status, cliente);
		
		
		System.out.print("QUANTO ITENS SERÁ PEDIDO? ");
		int quantidadeItems = sc.nextInt();
		
		System.out.println();
		
		
		for(int i=1; i<=quantidadeItems; i++) {
			
			System.out.println("                    INSIRA OS DADOS DO " + i + " ITEM \n");
			
			System.out.print("NOME PRODUTO: ");
			sc.nextLine();
			String nomeProduto = sc.nextLine();
			
			System.out.print("PREÇO PRODUTO: ");
			double precoProduto = sc.nextDouble();
			
			System.out.print("QUANTIDADE: ");
			int quantidade = sc.nextInt();
			
			Produto produto = new Produto(nomeProduto, precoProduto);
			
			ItemPedido item = new ItemPedido(quantidade, precoProduto, produto);
			
			pedido.adicionaItem(item);
			
			System.out.println();
	
		}
		
		System.out.println();
		System.out.println(pedido);
		
		
		sc.close();
	}

}
