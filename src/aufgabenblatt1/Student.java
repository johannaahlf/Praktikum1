package aufgabenblatt1;

import java.util.ArrayList;
import java.util.List;

public class Student implements Comparable<Student> {
	private String vorname;
	private String nachname;
	private int matrikelnummer;
	private List<Pruefungsleistung> liste = new ArrayList<Pruefungsleistung>();

	/*
	 * Konstruktor
	 */
	public Student(String vorname, String nachname, int matrikelnummer) {
		this.vorname = vorname;
		this.nachname = nachname;
		this.matrikelnummer = matrikelnummer;
	}

	/*
	 * Getter (non-Javadoc)
	 * 
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	public String getVorname() {
		return vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public int getMatrikelnummer() {
		return matrikelnummer;
	}

	@Override
	public int compareTo(Student otherstudent) {
		if (this.matrikelnummer == otherstudent.matrikelnummer) {
			return 0;
		} else if (this.matrikelnummer > otherstudent.matrikelnummer) {
			return 1;
		}
		return -1;

	}

}
