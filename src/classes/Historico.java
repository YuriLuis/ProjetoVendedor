package classes;

import java.util.ArrayList;


public class Historico {
	
	private ArrayList<Vendedor> vendedores ;
	
	
	public Historico() {
		
		this.vendedores = new ArrayList<Vendedor>();
	}
	

	public void addVendedor(Vendedor vendedor) {
		
		this.vendedores.add(vendedor);
		
	}
	
	
	public Vendedor vendedorMaisVendeu() {
		
		Vendedor v = vendedores.get(0);
		
		for (int i = 1; i < vendedores.size(); i++) {
			
			 if (v.totalVenda() <= vendedores.get(i).totalVenda()) {
				 
				 v = vendedores.get(i);
			 }
		}
			return v;
	}
	
	
	public Vendedor vendedorMenosVendeu() {	
		
		Vendedor v = vendedores.get(0);
		
		for (int i = 1; i < vendedores.size() ; i++) {
			
			 if (v.totalVenda() >= vendedores.get(i).totalVenda()) {
				 
				 v = vendedores.get(i);
				 
			 }
		}
			return v;
	}
	
	
	public ArrayList<Vendedor> vendedoresQueAlcancaramMeta(){
		
		ArrayList<Vendedor> v = new ArrayList<>();
		
		for (int i = 0; i < vendedores.size(); i++) {
			
			if (vendedores.get(i).totalVenda() >= vendedores.get(i).getMeta()) {
				
				v.add(vendedores.get(i));
				
			}
		}
		return v;
	}
	
	
	public ArrayList<Vendedor> vendedoresQueNaoAlcancaramMeta(){
		
		ArrayList<Vendedor> v = new ArrayList<Vendedor>();
		
		for (int i = 0; i < vendedores.size(); i++) {
			
			if (vendedores.get(i).totalVenda() <= vendedores.get(i).getMeta()) {
				
				v.add(vendedores.get(i));
				
			}
		}
		return v;
	}

	public String toString() {
		String s = "";
		
		for (Vendedor v : vendedores) {
			s += v + "\n \n";
		}
		return s;
	}
}
