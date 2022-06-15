package orientacaoAObjeto;

import orientacaoAObjeto.composicao.Aluno;
import orientacaoAObjeto.composicao.Curs;

public class CursoTeste {
	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("Joao");
		Aluno aluno2 = new Aluno("Maria");
		Aluno aluno3 = new Aluno("Ricardo");
		
		Curs curso1 = new Curs("Java completo 2022");
		Curs curso2 = new Curs("Web 2022");
		Curs curso3 = new Curs("Git e github para desenvolvedores");
		
		curso1.adicionarAluno(aluno1);
		curso1.adicionarAluno(aluno2);
		
		curso2.adicionarAluno(aluno1);
		curso2.adicionarAluno(aluno2);
		curso2.adicionarAluno(aluno3);
		
		curso3.adicionarAluno(aluno3);
		
		for (Aluno aluno: curso1.alunos) {
			System.out.println(aluno);
			System.out.println(curso1.nome);
		}
		
		System.out.println();
	}
}
