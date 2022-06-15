package orientacaoAObjeto.composicao;

import java.util.ArrayList;
import java.util.List;

public class Curs {

	public final String nome;
	public final List<Aluno> alunos = new ArrayList<>();
	
	public Curs(String nome){
		this.nome = nome;
	}
	
	public void adicionarAluno(Aluno aluno) {
		this.alunos.add(aluno);
		aluno.cursos.add(this);
	}
}
