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
		
		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();

		
		Usuario paciente1 = new Usuario("Lukas Fialho", 21, "964383728", "paciente");
		paciente1.setLogin("lukasfialho");
		paciente1.setSenha("1234567");
		
		Usuario paciente2 = new Usuario("Kathleen Rocha", 21, "99999-9999", "paciente");
		paciente2.setLogin("kaathrocha");
		paciente2.setSenha("1234567");
		
		Usuario paciente3 = new Usuario("Alex Fialho", 30, "99999-9999", "paciente");
		paciente3.setLogin("alexfialho");
		paciente3.setSenha("1234567");
		
		Usuario enfermeiro1 = new Usuario("Jo�o da Silva", 30, "99999-9999", "enfermeiro");
		paciente3.setLogin("joaosilva");
		paciente3.setSenha("123456789");
		
		Usuario enfermeiro2 = new Usuario("Adalto Santos", 30, "99999-9999", "enfermeiro");
		paciente3.setLogin("adaltosantos");
		paciente3.setSenha("123456789");
		
		Usuario enfermeiro3 = new Usuario("Ana Souza", 30, "99999-9999", "enfermeiro");
		paciente3.setLogin("anasouza");
		paciente3.setSenha("123456789");
		
		Usuario medico1 = new Usuario("Roberto Maddi", 30, "99999-9999", "medico");
		paciente3.setLogin("robertomaddi");
		paciente3.setSenha("12345");
		
		Usuario medico2 = new Usuario("Maria Maddi", 30, "99999-9999", "medico");
		paciente3.setLogin("mariamaddi");
		paciente3.setSenha("12345");
		
		Usuario dentista1 = new Usuario("Beatriz Ribeiro", 30, "99999-9999", "dentista");
		paciente3.setLogin("beatrizribeiro");
		paciente3.setSenha("12345senha");
		
		Usuario dentista2 = new Usuario("Alessandra Trindade", 30, "99999-9999", "dentista");
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
		xstream.alias("usuario", Usuario.class);
		String xml = xstream.toXML(usuarios);
		//String xml2 = xstream.toXML(paciente2);
		//geraArquivo(xml);
		
		System.out.println(usuarios.contains(dentista2));
		
		
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
