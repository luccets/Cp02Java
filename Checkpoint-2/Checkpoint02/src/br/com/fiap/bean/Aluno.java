package br.com.fiap.bean;

import java.time.LocalDate;
import java.time.Period;

import javax.swing.JOptionPane;


public class Aluno {

	// Atributos
	private int rm;
	private String nome;
	private LocalDate dataDeNascimento;

	// Construtores
	public Aluno() {
	}

	public Aluno(String nome, int rm, LocalDate dataDeNascimento) {
		this.nome = nome;
		setRm(rm);
		setDataDeNascimento(dataDeNascimento);
	}

	// Métodos Gtters && Setters
	public int getRm() {
		return rm;
	}

	public void setRm(int rm) {

		try {

			if (rm >= 95001 && rm <= 552999) {
				this.rm = rm;

			} else {
				throw new Exception("O rm está invalido");
				
			}

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			System.exit(0); //Encerra o programa após o erro
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(LocalDate dataDeNascimento) {

		try {

			LocalDate AnoMinimo = LocalDate.parse("1899-12-31");
			LocalDate AnoMaximo = LocalDate.now();

			if (dataDeNascimento.isAfter(AnoMinimo) && dataDeNascimento.isBefore(AnoMaximo)) {

				this.dataDeNascimento = dataDeNascimento;

			} else {

				throw new Exception("O ano de nascimento deve estrar entre 1900 e o ano atual");
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			System.exit(0); //Encerra o programa após o erro
		}
	}

	// Métodos Privados

	public String calculaIdadeCompleta(LocalDate dataAtual) {

		dataAtual = LocalDate.now();
		Period calculo = (Period.between(dataDeNascimento, dataAtual));
		String idade = calculo.getDays() + " dias " 
				+ calculo.getMonths() + " meses "
				+ calculo.getYears() + " anos ";

		return idade;
	}

}
