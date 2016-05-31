package senac.edu.br.UBS.usuarios;

public class Funcionario extends Pessoa{
	protected String cargo;
	protected String documentoProfissional;
	//No caso de m�dico o CRM, por exemplo.
	
	public Funcionario(String name, String lastName, String jobDescription, String document) {
		super(name, lastName);
		this.nome = name;
		this.sobrenome = lastName;
		this.cargo = jobDescription;
		this.documentoProfissional = document;
	}

}
