package senac.edu.br.UBS.usuarios;


public abstract class Pessoa{
	
	protected String nome;
	protected String sobrenome;
	private String login;
	private String senha;
	
	public Pessoa(String name, String lastName){
		this.nome = name;
		this.sobrenome = lastName;
	}
	
	public void setLogin(String loginRecebido){
		loginRecebido = this.login;
	}
	public void setSenha(String senhaRecebida){
		senhaRecebida = this.senha;
	}
}
