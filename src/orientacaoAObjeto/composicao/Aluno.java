package orientacaoAObjeto.composicao;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	public final String nome;
	public final List<Curs> cursos = new ArrayList<>();
	
	public Aluno(String nome){
		this.nome = nome;
	}
	
	Curs obterCursoPorNome() {
		Curs procurado = null;
		
		for (Curs curso: this.cursos) {
			if(curso.nome.equalsIgnoreCase(nome)) {
				return curso;
			}
		}
		
		return procurado;
	}
	
	public String toString() {
		return nome;
	}
	
}
