package exercicio_1;

import java.util.ArrayList;
import java.util.Date;	

public class Aluno {
		
		//DefiniÃ§Ã£o de variÃ¡veis em Java
		
		private String nome;
		private String email;
		private Integer cpf;
		private Date dataNascimento;
		
		//Construtor com parÃ¢metros
		public Aluno(String nome, String email, Integer cpf, Date dataNascimento) {
			super();
			this.nome = nome;
			this.email = email;
			this.cpf = cpf;
			this.dataNascimento = dataNascimento;
		}

		//MÃ©todos get servem para recuperar um determinado atributo de um objeto;
		public String getNome() {
			return nome;
		}
		
		//MÃ©todos set servem para atribuir valor a um determinado atributo de um objeto;
		public void setNome(String nome) {
			this.nome = nome;
		}
		
		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public Integer getCpf() {
			return cpf;
		}
		public void setCpf(Integer cpf) {
			this.cpf = cpf;
		}
		public Date getDataNascimento() {
			return dataNascimento;
		}
		public void setDataNascimento(Date dataNascimento) {
			this.dataNascimento = dataNascimento;
		}
		
		@Override
	    public String toString() {
	        return "[Aluno: " + this.nome + ", " + this.email + "," + this.cpf + "," + this.dataNascimento + "]";
	    }
		public Integer idadeAluno(Aluno aluno) {
			Integer idade = 0;
			idade = new Date().getYear() - aluno.getDataNascimento().getYear();
			return idade;
		}
}