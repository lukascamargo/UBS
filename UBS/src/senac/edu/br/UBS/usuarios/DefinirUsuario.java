package senac.edu.br.UBS.usuarios;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;


public class DefinirUsuario {

	public static void main(String[] args) {
		
		ArrayList<Pessoa> usuarios = new ArrayList<Pessoa>();

		
		Paciente paciente1 = new Paciente("Lukas", "Fialho");
		paciente1.setLogin("lukasfialho");
		paciente1.setSenha("1234567");
		
		Paciente paciente2 = new Paciente("Kathleen", "Rocha");
		paciente2.setLogin("kaathrocha");
		paciente2.setSenha("1234567");
		
		Paciente paciente3 = new Paciente("Alex", "Fialho");
		paciente3.setLogin("alexfialho");
		paciente3.setSenha("1234567");
		
		Funcionario enfermeiro1 = new Funcionario("João", "da Silva", "Enfermeiro", "9999999999");
		paciente3.setLogin("joaosilva");
		paciente3.setSenha("123456789");
		
		Funcionario enfermeiro2 = new Funcionario("Adalto", "Santos", "Enfermeiro", "9999999999");
		paciente3.setLogin("adaltosantos");
		paciente3.setSenha("123456789");
		
		Funcionario enfermeiro3 = new Funcionario("Ana", "Souza", "Enfermeiro", "9999999");
		paciente3.setLogin("anasouza");
		paciente3.setSenha("123456789");
		
		Funcionario medico1 = new Funcionario("Roberto", "Maddi", "Medico", "9999999");
		paciente3.setLogin("robertomaddi");
		paciente3.setSenha("12345");
		
		Funcionario medico2 = new Funcionario("Maria", "Maddi", "Medico", "9999999");
		paciente3.setLogin("mariamaddi");
		paciente3.setSenha("12345");
		
		Funcionario dentista1 = new Funcionario("Beatriz", "Ribeiro", "Dentista", "999999");
		paciente3.setLogin("beatrizribeiro");
		paciente3.setSenha("12345senha");
		
		Funcionario dentista2 = new Funcionario("Alessandra", "Trindade", "Dentista", "999999");
		paciente3.setLogin("alexandretrindade");
		paciente3.setSenha("12345senha");
		
		usuarios.add(paciente1);
		usuarios.add(paciente2);
		usuarios.add(paciente3);
		usuarios.add(enfermeiro1);
		usuarios.add(enfermeiro2);
		usuarios.add(enfermeiro3);
		usuarios.add(medico1);
		usuarios.add(medico2);
		usuarios.add(dentista1);
		usuarios.add(dentista2);
		
		
		XStream xstream = new XStream(new DomDriver());
		xstream.alias("pessoa", Pessoa.class);
		String xml = xstream.toXML(usuarios);
		String xml2 = xstream.toXML(paciente2);
		geraArquivo(xml);
		
		System.out.println(xml);
		
		
	}
	public static void geraArquivo(String xml){
		PrintWriter print = null;
		//try {
			File file = new File("C:\\Users\\Lukas\\Documents\\GitHub\\UBS\\UBS\\src\\senac\\edu\\br\\UBS\\usuarios\\usuarios.xml");
			try {
				print = new PrintWriter(file);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			
			print.write(xml);
			print.flush();
			print.close();
		//} catch (FileNotFoundException ex) {
		//	Logger.getLogger(XStreamMain.class.getName()).log(Level.SEVERE, null, ex);
		//} finally {
		//	print.close();
		//}
	}

}
