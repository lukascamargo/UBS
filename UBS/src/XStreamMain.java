/*import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class XStreamMain {
	public static void main(String[] args){
		Book lukas = new Book("Livro", "Lukas", 15);
		lukas.title = "A Vida do Lukas Fialho";
		lukas.author = "Lukas Fialho";
		lukas.pagesCount = 15;
		XStream xstream = new XStream(new DomDriver());
		xstream.alias("book", Book.class);
		String xml = xstream.toXML(lukas);
		//System.out.println(xml);
		//System.out.println(lukas.title);
		geraArquivo(xml);
		buscaArquivo();
	}
	public static void geraArquivo(String xml){
		PrintWriter print = null;
		//try {
			File file = new File("C:\\Users\\Lukas\\Documents\\GitHub\\UBS\\arquivoGerado.xml");
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
	public static void buscaArquivo(){
		try {
			FileReader ler = new FileReader("C:\\Users\\Lukas\\Documents\\GitHub\\UBS\\arquivoGerado.xml");
		
			XStream xstream = new XStream(new DomDriver());
			xstream.alias("book", Book.class);
			Book lukas = (Book) xstream.fromXML(ler);
			System.out.println("Autor: " + lukas.author);
			System.out.println("Livro: " + lukas.title);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
*/
