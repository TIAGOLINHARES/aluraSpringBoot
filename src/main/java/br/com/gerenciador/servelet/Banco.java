package br.com.gerenciador.servelet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {

	private static List<Empresa> lista = new ArrayList<>();
	private static Integer chaveSequencial = 1;

	static {
		Empresa empresa = new Empresa();
		empresa.setId(chaveSequencial++);
		empresa.setNome("Alura");
		Empresa empresa2 = new Empresa();
		empresa2.setId(chaveSequencial++);
		empresa2.setNome("Caelum");
		lista.add(empresa);
		lista.add(empresa2);
	}

	public void adiciona(Empresa empresa) {
		empresa.setId(chaveSequencial++);
		lista.add(empresa);
		System.out.println(empresa.getNome());
	}

	public List<Empresa> getEmpresas() {

		return Banco.lista;
	}

	public void removeEmpresa(Integer id) { 
	    for (Empresa empresa: lista) { 
	        if(empresa.getId() == id ) {
	            lista.remove(empresa);
	        }
	    }
	}

	public Empresa buscaEmpresaPelaId(Integer id) {
		for(Empresa empresa:lista) {
			if(empresa.getId() == id) {
				return empresa;
			}
		}
		return null;
	}
}
