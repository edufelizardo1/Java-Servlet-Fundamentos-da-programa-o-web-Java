package br.com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {

	private static List<Empresa> empresas = new ArrayList<>();
	private static Integer chaveSequencial = 1;
	
	static {
		Empresa empresa1 = new Empresa();
		empresa1.setId(chaveSequencial++);
		empresa1.setNome("Start-Up");
		Empresa empresa2 = new Empresa();
		empresa2.setId(chaveSequencial++);
		empresa2.setNome("Negócio");
		Empresa empresa3 = new Empresa();
		empresa3.setId(chaveSequencial++);
		empresa3.setNome("Desenvolvedor Eduardo");
		
		empresas.add(empresa1);
		empresas.add(empresa2);
		empresas.add(empresa3);
	}
	
	public void adicona(Empresa empresa) {
		empresa.setId(Banco.chaveSequencial++);
		empresas.add(empresa);
	}
	
	public List<Empresa> getEmpresas(){
		return Banco.empresas;
	}

	public void removeEmpresa(Integer id) {
		
		Iterator<Empresa> it = empresas.iterator();
		
		while (it.hasNext()) {
			Empresa emp = it.next();
			if(emp.getId() == id) {
				it.remove();
			}
		}		
	}

	public Empresa buscaEmpresaPelaid(Integer id) {
		for (Empresa empresa : empresas) {
			if (empresa.getId() == id) {
				return empresa;
			}
		}
		return null;
	}

}
