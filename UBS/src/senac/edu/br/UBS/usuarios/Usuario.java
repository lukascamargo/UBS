package senac.edu.br.UBS.usuarios;
import java.util.ArrayList;
import java.util.List;

public class Usuario{
	
	protected String nome;
	private String login;
	private String senha;
	protected int idade;	
	protected String telefone;
	protected String posicao;
	
	public Usuario(String name, int age, String phone, String position){
		this.nome = name;
		this.idade = age;
		this.telefone = phone;
		this.posicao = position;
	}
	
	public void setLogin(String loginRecebido){
		loginRecebido = this.login;
	}
	public void setSenha(String senhaRecebida){
		senhaRecebida = this.senha;
	}
}
