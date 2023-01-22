package cursojava.execultavel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.swing.JOptionPane;
import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;
import cursojava.constantes.StatusAluno;

public class PrimeiraClasseJava {
	
	/* Main é um objeto autoexecultavel em Java */
	public static void main(String[] args) {
		
		@SuppressWarnings("rawtypes")
		
		String login = JOptionPane.showInputDialog("Digite o login: ");
		String senha = JOptionPane.showInputDialog("Digite a senha: ");
		
		if (login.equalsIgnoreCase("admin") && senha.equalsIgnoreCase("admin")) {
		
			List<Aluno> alunos = new ArrayList<Aluno>();
			
			/*Uma lista que recebe uma chave que identifica uma sequencia de valores*/
			HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();
			
			for(int qtd = 1; qtd <= 5; qtd++) {
				
				
				// Pegar dados do aluno e passar para variável
				String nome = JOptionPane.showInputDialog("Digite o nome completo do aluno "+ qtd +": ");
				/*String idade = JOptionPane.showInputDialog("Digite a idade do aluno: ");
				String dataNascimento = JOptionPane.showInputDialog("Digite a data de nascimento do aluno: ");
				String rg = JOptionPane.showInputDialog("Digite o registro geral do aluno: ");
				String cpf = JOptionPane.showInputDialog("Digite o CPF do aluno: ");
				String nomeMae = JOptionPane.showInputDialog("Digite o nome completo da mãe do aluno: ");
				String nomePai = JOptionPane.showInputDialog("Digite o nome completo do pai aluno: ");
				String dataMatricula = JOptionPane.showInputDialog("Digite a data da matricula: ");
				String serieMatricula = JOptionPane.showInputDialog("Digite a serie do aluno: ");
				String nomeEscola = JOptionPane.showInputDialog("Digite o nome da escola: ");*/
				
				/* new Aluno é uma instancia e Cria objeto na memória */
				/* Aluno 1 é uma referência para o objeto aluno*/
				Aluno aluno1 = new Aluno();
				
				
				
				/* Set é para adicionar ou receber os dados para os atributos*/
				/* get é para resgatar ou obter o valor do atributo */
				
				aluno1.setNome(nome);
				/*aluno1.setIdade(Integer.valueOf(idade));
				aluno1.setDataNascimento(dataNascimento);
				aluno1.setRegistroGeral(rg);
				aluno1.setNumeroCpf(cpf);
				aluno1.setNomeMae(nomeMae);
				aluno1.setNomePai(nomePai);
				aluno1.setDataMatricula(dataMatricula);
				aluno1.setSerieMatriculado(serieMatricula);
				aluno1.setNomeEscola(nomeEscola);*/
				
				 for (int pos = 1; pos <= 1; pos++) {
					 String nomeDisciplina = JOptionPane.showInputDialog("Digite o nome da disciplina "+ pos +": ");
					 String notaDisciplina = JOptionPane.showInputDialog("Digite a nota da disciplina"+ pos +": ");
					 Disciplina disciplina  = new  Disciplina();
					 disciplina.setDisciplina(nomeDisciplina);
					 disciplina.setNota(Double.valueOf(notaDisciplina));
					 
					 aluno1.getDisciplinas().add(disciplina);
				 }
				 
				 
				 
				 int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina? ");
				
				 if (escolha == 0) {
					 //Opção sim é zero
					 
					 int continuarRemover = 0;
					 int posicao = 1;
					 while (continuarRemover ==0) {
						 	 
						 String disciplinaRemover = JOptionPane.showInputDialog("Digite o número da disciplina que deseja remover 1, 2, 3, 4: ");
						 aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
						 posicao ++;
						 continuarRemover = JOptionPane.showConfirmDialog(null, "Deseja continuar a remover? ");
						 
					 }
				 }
				 
				 alunos.add(aluno1);
				 
			}
			
			maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
			maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
			maps.put(StatusAluno.RECUPERAÇÃO, new ArrayList<Aluno>());
			
			for (Aluno aluno : alunos) {  /*Separei em listas*/
				if (aluno.getAlunoAprovado().equalsIgnoreCase(StatusAluno.APROVADO)) {
						maps.get(StatusAluno.APROVADO).add(aluno);
				}else if (aluno.getAlunoAprovado().equalsIgnoreCase(StatusAluno.RECUPERAÇÃO)) {
					maps.get(StatusAluno.RECUPERAÇÃO).add(aluno);
				} else {
					maps.get(StatusAluno.REPROVADO).add(aluno);
				}
				
					
				}
			
			System.out.println("Listas dos aprovados: ");
			for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
				System.out.println("Nome: " + aluno.getNome());
				System.out.println("Resultado = " + aluno.getAlunoAprovado());
				System.out.println("Média = " + aluno.getMediaNota() );
				
			}
			
			System.out.println("Listas dos Reprovados: ");
			for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
				System.out.println("Nome: " + aluno.getNome());
				System.out.println("Resultado = " + aluno.getAlunoAprovado());
				System.out.println("Média = " + aluno.getMediaNota() );
				
			}
			
			System.out.println("Listas dos recuperação: ");
			for (Aluno aluno :maps.get(StatusAluno.RECUPERAÇÃO)) {
				System.out.println("Nome: " + aluno.getNome());
				System.out.println("Resultado = " + aluno.getAlunoAprovado());
				System.out.println("Média = " + aluno.getMediaNota() );
				
			}
			
		}
		
	}
		
}		



	
	