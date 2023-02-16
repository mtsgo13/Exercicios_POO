package exercicio_1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class main {
	
		public static void main(String[] args) throws ParseException {
			
			ArrayList<Aluno> aluno = new ArrayList<>();

			SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
			Aluno a1 = new Aluno("Marcos","marcos@Gmail", 2222,formato.parse("10/02/2001"));
			Aluno a2 = new Aluno("Maria","maria@Gmail", 1111,formato.parse("20/02/2001"));
			Aluno a3 = new Aluno("Marcoli","marcoli@Gmail", 2121,formato.parse("05/02/2001"));
			
	        aluno.add(a1);
	        aluno.add(a2);
	        aluno.add(a3);

	       if((a1.getDataNascimento().compareTo(a2.getDataNascimento()) > 0) && (a1.getDataNascimento().compareTo(a3.getDataNascimento()) > 0)){
	    	   System.out.println("Aluno mais velho : " + a1);
	    	   System.out.println("Idade : " + a1.idadeAluno(a1));
	       }
	       else if(a2.getDataNascimento().compareTo(a3.getDataNascimento()) > 0) {
	    	   System.out.println("Aluno mais velho : " + a2);
	    	   System.out.println("Idade : " + a2.idadeAluno(a2));
	       }
	       else {
	    	   System.out.println("Aluno mais velho : " + a3);
	    	   System.out.println("Idade : " + a3.idadeAluno(a3));
	       }
	       
	       System.out.println("Alunos cadastrados:");
	       
	        for (int i = 0; i < aluno.size(); i++) {
	            System.out.println("Alunos : " + aluno.get(i));
	        }
		}
}