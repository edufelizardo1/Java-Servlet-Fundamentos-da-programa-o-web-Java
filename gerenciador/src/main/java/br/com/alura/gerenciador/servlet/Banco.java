package br.com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private static List<Empresa> empresas = new ArrayList<>();
	
	static {
		Empresa empresa1 = new Empresa();
		empresa1.setNome("Start-Up");
		Empresa empresa2 = new Empresa();
		empresa2.setNome("Neg�cio");
		Empresa empresa3 = new Empresa();
		empresa3.setNome("Desenvolvedor Eduardo");
		
		empresas.add(empresa1);
		empresas.add(empresa2);
		empresas.add(empresa3);
	}
	
	public void adicona(Empresa empresa) {
		empresas.add(empresa);
	}
	
	public List<Empresa> getEmpresas(){
		return Banco.empresas;
	}

}
