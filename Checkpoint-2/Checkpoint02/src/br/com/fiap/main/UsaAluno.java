package br.com.fiap.main;

import java.time.LocalDate;

import javax.swing.JOptionPane;

import br.com.fiap.bean.Aluno;

public class UsaAluno {

	public static void main(String[] args) {
		
		//Usando o construtor com Parâmetros
		Aluno aluno1 = new Aluno("Lucca Vilaça Okubo", 551538, LocalDate.parse("2005-08-12"));
		Aluno aluno2 = new Aluno("Pedro Henrique", 98608, LocalDate.parse("2005-02-03"));
		
		//Usando o construtor vazio
		Aluno aluno3 = new Aluno();
		Aluno aluno4 = new Aluno();
		String aux1, aux2, dataDeNascimento1, dataDeNascimento2;
		
		try {
			
			//salvando as informações do usuário
			aluno3.setNome(JOptionPane.showInputDialog("Digite seu nome: "));
			aluno3.setRm(Integer.parseInt(JOptionPane.showInputDialog("Digite seu Rm")));
			aux1 = (JOptionPane.showInputDialog("Digite sua Data de nascimeto: "));
			
			aluno4.setNome(JOptionPane.showInputDialog("Digite seu nome: "));
			aluno4.setRm(Integer.parseInt(JOptionPane.showInputDialog("Digite seu Rm")));
			aux2 = (JOptionPane.showInputDialog("Digite sua Data de nascimeto: "));
			
			//Salvando a data atual
			LocalDate dataAtual = LocalDate.now();

			//Convertendo a data de nascimento do aluno 3 e 4 pro formato BR
			dataDeNascimento1 = aux1.substring(6, 10); // yyyy
			dataDeNascimento1 += "-" + aux1.substring(3, 5); // yyyy-MM
			dataDeNascimento1 += "-" + aux1.substring(0, 2); // yyyy-MM-dd
			LocalDate data1 = LocalDate.parse(dataDeNascimento1);
			aluno3.setDataDeNascimento(data1);
			
			
			dataDeNascimento2 = aux2.substring(6, 10); // yyyy
			dataDeNascimento2 += "-" + aux2.substring(3, 5); // yyyy-MM
			dataDeNascimento2 += "-" + aux2.substring(0, 2); // yyyy-MM-dd
			LocalDate data2 = LocalDate.parse(dataDeNascimento2);
			aluno4.setDataDeNascimento(data2);
			
			//Exibindo todas as informações dos 4 alunos
			JOptionPane.showMessageDialog(null, "Aluno 1\n" + "\nNome: " + aluno1.getNome()
			+ "\nRm: " + aluno1.getRm() 
			+ "\nData de nascimento: " + aluno1.calculaIdadeCompleta(dataAtual));
			
			JOptionPane.showMessageDialog(null, "Aluno 2\n" + "\nNome: " + aluno2.getNome()
			+ "\nRm: " + aluno2.getRm() 
			+ "\nData de nascimento: " + aluno2.calculaIdadeCompleta(dataAtual));
			
			JOptionPane.showMessageDialog(null, "Aluno 3\n" + "\nNome: " + aluno3.getNome()
			+ "\nRm: " + aluno3.getRm() 
			+ "\nData de nascimento: " + aluno3.calculaIdadeCompleta(dataAtual));
			
			JOptionPane.showMessageDialog(null, "Aluno 4\n" + "\nNome: " + aluno4.getNome()
			+ "\nRm: " + aluno4.getRm() 
			+ "\nData de nascimento: " + aluno4.calculaIdadeCompleta(dataAtual));
			
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		

	}

}
