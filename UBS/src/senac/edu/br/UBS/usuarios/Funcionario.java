package senac.edu.br.UBS.usuarios;

public class Funcionario extends Pessoa{
	protected String documentoProfissional;
	//No caso de médico o CRM, por exemplo.
	
	public Funcionario(String name, String lastName, String jobDescription, String document) {
		super(name, lastName, jobDescription);
		this.nome = name;
		this.sobrenome = lastName;
		this.cargo = jobDescription;
		this.documentoProfissional = document;
	}
	
	public String getCargo(){
		return this.cargo;
	}

}
