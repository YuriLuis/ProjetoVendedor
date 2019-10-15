package classes;

import java.util.ArrayList;

public class Vendedor {
	
	private String nome;
	
	private double meta;
	
	private double salario;
	
	private double comissao;
	
	private ArrayList<Venda>vendas = new ArrayList<Venda>();
	
	
	public Vendedor() {
		
	}
	

	public Vendedor(String nome, double meta, double salario) {
		this.nome = nome;
		
		this.meta = meta;
		
		this.salario = salario;
		
		this.comissao = 1;
		
	}
	

	public String getNome() {
		
		return nome;
	}
	

	public void setNome(String nome) {
		
		this.nome = nome;
	}
	

	public double getMeta() {
		
		return meta;
	}
	

	public void setMeta(double meta) {
		
		this.meta = meta;
	}
	

	public double getSalario() {
		
		return salario;
	}
	

	public void setSalario(double salario) {
		
		this.salario = salario;
	}
	

	public double getComissao() {
		
		return comissao;
	}
	

	public void setComissao(double comissao) {
		
		this.comissao = comissao;
	}
	

	public ArrayList<Venda> getVendas() {
		
		return vendas;
	}
	
	
	public void addVendaVendedor(Venda venda) {
		
		vendas.add(venda);
	}
	
	
	public void removeVendaVendedor(Venda venda) {
		
		vendas.remove(venda);
	}
	
	
	public double totalVenda() { 
		
		double soma = 0;
		
		for (Venda venda : vendas) {
			
			soma += venda.getPreco();
			
		}
		
		return soma;
	}
	

	public boolean alcacouMeta() {
		
		if (totalVenda() >= getMeta()) {
			
			return true;
			
		}else {
			
			return false;
			
		}
		
	}
	
	public String toString() {
		
		String s = "";
		
		s = "\nVendedor: " + this.getNome() + "\n"+ "Vendas: " + "\n " ;
		
		for (Venda v : vendas) {
			s += v + "\n";
		}
		
		s += "Total Venda: " + totalVenda() + "\n" + "Meta: " + getMeta() + "\n";
		 
		
		if (alcacouMeta() == true) {
			
			s += "Alcançou a meta!  \n";
			
		}else {
			
			s += "Não alcançou a meta!  \n";
		}
		
		return s;
		
	}
	
}
