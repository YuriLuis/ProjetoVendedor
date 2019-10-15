package teste;

import classes.Historico;
import classes.Venda;
import classes.Vendedor;

public class mainTesteClasses {

	public static void main(String[] args) {
		
		
		Vendedor v1 = new Vendedor("Yuri", 8800, 1200);
		Vendedor v2 = new Vendedor("Luis", 25000, 1300);
		Vendedor v3 = new Vendedor("Diego", 22000, 1400);
		Vendedor v4 = new Vendedor("Felipe", 12000, 1500);
		
		Venda ve1 = new Venda("Celular LG K12", 850);
		Venda ve2 = new Venda("Iphone X", 3500);
		Venda ve3 = new Venda("Celular LG K12", 850);
		Venda ve4 = new Venda("Iphone X", 3500);

		v1.addVendaVendedor(ve1);v1.addVendaVendedor(ve2);
		v1.addVendaVendedor(ve3);v1.addVendaVendedor(ve4);
		
		v2.addVendaVendedor(ve1);v2.addVendaVendedor(ve2);
		v2.addVendaVendedor(ve3);v2.addVendaVendedor(ve4);
		v2.addVendaVendedor(ve1);v2.addVendaVendedor(ve2);
		v2.addVendaVendedor(ve3);v2.addVendaVendedor(ve4);
		v2.addVendaVendedor(ve3);v2.addVendaVendedor(ve4);
		v2.addVendaVendedor(ve1);v2.addVendaVendedor(ve2);
		v2.addVendaVendedor(ve3);v2.addVendaVendedor(ve4);
		
		v3.addVendaVendedor(ve1);v3.addVendaVendedor(ve2);
		v3.addVendaVendedor(ve3);v3.addVendaVendedor(ve4);
		v3.addVendaVendedor(ve1);v3.addVendaVendedor(ve2);
		v3.addVendaVendedor(ve3);v3.addVendaVendedor(ve4);
		v3.addVendaVendedor(ve1);v3.addVendaVendedor(ve2);
		v3.addVendaVendedor(ve3);v3.addVendaVendedor(ve4);
		
		v4.addVendaVendedor(ve1);v4.addVendaVendedor(ve2);
		v4.addVendaVendedor(ve3);v4.addVendaVendedor(ve4);
		v4.addVendaVendedor(ve1);v4.addVendaVendedor(ve2);
		v4.addVendaVendedor(ve3);v4.addVendaVendedor(ve4);
		v4.addVendaVendedor(ve3);v4.addVendaVendedor(ve4);
		v4.addVendaVendedor(ve1);v4.addVendaVendedor(ve2);
		v4.addVendaVendedor(ve3);v4.addVendaVendedor(ve4);
		
		Historico h = new Historico();
		h.addVendedor(v1);h.addVendedor(v2);h.addVendedor(v3);h.addVendedor(v4);
		System.out.println(h.vendedoresQueAlcancaramMeta());
		System.out.println("------------------");
		System.out.println("N Ã O    A L C A N Ç A R A M   Á    M E T A ");
		System.out.println(h.vendedoresQueNaoAlcancaramMeta());
	

	}

}
