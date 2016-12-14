package KW50;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
	*****alex***** 
	Autor: Alexander Werner
	Projekt: KW50
	Classe: Aufgabe111.java
	Datum: 12.12.2016
 */

public class Aufgabe111 {

	public static void main(String[] args) {
		File home = new File(System.getProperty("user.home") + File.separator + "Dokumente" + File.separator + "Übung");
		System.out.println(dirTree(home, false)); // Keine versteckten Dateien
	}
	
	/**
	 * Zeigt ein Verzeichniss mit beinhaltenden Datein und Unterordner <br>
	 * als Verzeichnissbaum an
	 * @param f Der Datein Pfad <b> Sollte ein Verzeichniss sein </b>
	 * @param showHidden <b> True: </b> Wenn Versteckte Datein/Verzeichnisse angezeigt werden sollen <br>
	 * <b>False: </b> Wenn keine Versteckten Datein/Verzeichnisse angezeigt werden sollen
	 * @return Eine Iterierte Liste der Files.
	 */
	public static String dirTree(File f, boolean showHidden) {
		List<File> li = new LinkedList<File>();
		li.addAll(Arrays.asList(f.listFiles()));
		Iterator<File> it = li.iterator();
		return fileToString(f) + "\n" +dirTree(it, 1, showHidden);
	}
	
	/**
	 * Zeigt ein Verzeichniss mit beinhaltenden Datein und Unterordner <br>
	 * als Verzeichnissbaum an
	 * @param it Iterierte Liste der Files
	 * @param level Die Ebene in der sich Der Unterordner bewegt
	 * @param showHidden  <b> True: </b> Wenn Versteckte Datein/Verzeichnisse angezeigt werden sollen <br>
	 * <b>False: </b> Wenn keine Versteckten Datein/Verzeichnisse angezeigt werden sollen
	 * @return Die Ordnerstruktur als String
	 */
	public static String dirTree(Iterator<File> it, int level, boolean showHidden) {
		if(!it.hasNext()) return "";		
		StringBuilder sb = new StringBuilder();
		File file = it.next();
		if(file.isDirectory() && (showHidden || !file.isHidden())) {
			List<File> subdirectory = new LinkedList<File>();
			subdirectory.addAll(Arrays.asList(file.listFiles()));
			Iterator<File> it2 = subdirectory.iterator();
			
			level++;
			sb.append(dirTree(it2, level, showHidden));
			level--;
		}
		String space = (level > 0 ? String.format("%"+ (level * 4) + "s", "") : "");
		String fileString = (showHidden || !file.isHidden()) ? space + fileToString(file) + "\n" + sb.toString() : "";
		return  !file.isDirectory() ? dirTree(it, level, showHidden) + fileString : fileString + dirTree(it, level, showHidden); 
	}
	
	/**
	 * Wandelt ein File/Ordner in ein String mit/ohne die Größe der Datei
	 * @param file Das Elemnt das Umgewandelt werden soll
	 * @return Ein String der Den Namen des Elemntes 
	 */
	public static String fileToString(File file) {
		return "|_ " + (file.isDirectory() ? file.getName() : file.getName() + " (" + (int)(file.length() / 1024.0) +"kB)");
	}
}