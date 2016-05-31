package senac.edu.br.UBS.logonSession;
import senac.edu.br.UBS.usuarios.DefinirUsuario;
import senac.edu.br.UBS.usuarios.Pessoa;

import java.util.ArrayList;
import java.util.Scanner;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;

public class autenticaPessoa {
	public static void main(String[] args){
		
		// Recebe os dados de login e senha para autenticação
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite seu login: ");
		String username = leitor.nextLine();
		System.out.println("Digite sua senha: ");
		String senha = leitor.nextLine();
		
		

	try{
		//Este código faz a leitura do arquivo xml que possui os dados dos usuarios
		FileReader ler = new FileReader("C:\\Users\\Lukas\\Documents\\GitHub\\UBS\\UBS\\src\\senac\\edu\\br\\UBS\\usuarios\\usuarios.xml");
		XStream xstream = new XStream(new DomDriver());
		ArrayList<Pessoa> usuarios = (ArrayList<Pessoa>) xstream.fromXML(ler);
		
		//Este faz a autenticação se existe o usuario que foi digitado
		int pos = 0;
		boolean retorno = true;
		for(int i = 0; i < usuarios.size(); i++){
			if(usuarios.get(i).getLogin().compareTo(username) == 0 && usuarios.get(i).getSenha().compareTo(senha) == 0){
				System.out.println("Seja bem vindo " + usuarios.get(i).getNomeCompleto() + ".");
				System.out.println("Você é um " + usuarios.get(i).getCargo() + ".");
				pos = i;
					switch(usuarios.get(pos).getCargo()){
					case "Paciente":
						showOptionsPatient();
						break;
					case "Enfermeiro":
						showOptionsNurse();
						break;
					case "Medico":
						showOptionsDoctor();
						break;
					case "Dentista":
						showOptionsDoctor();
						break;
					default:
						System.out.println("Cargo não identificado");
						break;
					}
				break;
			}
			else {
				retorno = false;
			}
		}	
		if(!retorno){
			System.out.println(username + " ou sua senha não está no nosso banco de dados. Tente novamente.");
		}	
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void showOptionsPatient(){
		System.out.println("1 - Sair do Sistema");
		System.out.println("2 - Marcar uma consulta");
		System.out.println("3 - Ver seu prontuario");
		System.out.println("Digite sua opção:");
		Scanner leitor = new Scanner(System.in);
		int opcao = 0;
		do {
			opcao = leitor.nextInt();
			switch(opcao){
			case 1:
				System.out.println("Finalizando o sistema");
				break;
			case 2:
				System.out.println("Você escolheu marcar uma consulta");
				break;
			case 3:
				System.out.println("Você escolheu ver seu prontuario");
				break;
			default:
				System.out.println("Opção inválida!");
				break;
			}
		}while(opcao != 1);
	}
	public static void showOptionsNurse(){
		System.out.println("1 - Sair do Sistema");
		System.out.println("2 - Realizar Triagem");
		System.out.println("Digite sua opção:");
		Scanner leitor = new Scanner(System.in);
		int opcao = 0;
		do {
			opcao = leitor.nextInt();
			switch(opcao){
			case 1:
				System.out.println("Finalizando o sistema");
				break;
			case 2:
				System.out.println("Você escolheu Realizar Triagem");
				break;
			default:
				System.out.println("Opção inválida!");
				break;
			}
		}while(opcao != 1);
	}
	public static void showOptionsDoctor(){
		System.out.println("1 - Sair do Sistema");
		System.out.println("2 - Realizar Checklist");
		System.out.println("Digite sua opção:");
		Scanner leitor = new Scanner(System.in);
		int opcao = 0;
		do {
			opcao = leitor.nextInt();
			switch(opcao){
			case 1:
				System.out.println("Finalizando o sistema");
				break;
			case 2:
				System.out.println("Você escolheu Realizar Checklist");
				break;
			default:
				System.out.println("Opção inválida!");
				break;
			}
		}while(opcao != 1);
	}
	public static void showOptionsDentist(){
		System.out.println("1 - Sair do Sistema");
		System.out.println("2 - Realizar procedimentos");
		System.out.println("Digite sua opção:");
		Scanner leitor = new Scanner(System.in);
		int opcao = 0;
		do {
			opcao = leitor.nextInt();
			switch(opcao){
			case 1:
				System.out.println("Finalizando o sistema");
				break;
			case 2:
				System.out.println("Você escolheu Realizar procedimentos");
				break;
			default:
				System.out.println("Opção inválida!");
				break;
			}
		}while(opcao != 1);
	}
}
