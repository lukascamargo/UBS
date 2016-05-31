package senac.edu.br.UBS.usuarios;

public class Paciente extends Pessoa{

	public Paciente(String name, String lastName, String jobDescription) {
		super(name, lastName, jobDescription);
		this.nome = name;
		this.sobrenome = lastName;
		this.cargo = jobDescription;
	}
	
	public String getPaciente(){
		return "paciente";
	}

}
