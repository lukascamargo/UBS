package senac.edu.br.UBS.usuarios;


public abstract class Pessoa{
	
	protected String nome;
	protected String sobrenome;
	private String login;
	private String senha;
	protected String cargo;
	
	public Pessoa(String name, String lastName, String jobDescription){
		this.nome = name;
		this.sobrenome = lastName;
		this.cargo = jobDescription;
	}
	
	public void setLogin(String loginRecebido){
		this.login = loginRecebido;
	}
	public void setSenha(String senhaRecebida){
		this.senha = senhaRecebida;
	}
	public String getLogin(){
		return this.login;
	}
	public String getSenha(){
		return this.senha;
	}
	public String getNome(){
		return this.nome;
	}
	public String getNomeCompleto(){
		return this.nome + " " + this.sobrenome;
	}
	public String getCargo(){
		return this.cargo;
	}
}
