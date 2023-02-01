package notSistemi;

public class Student {
	Course c1;
	Course c2;
	Course c3;
	Course v1;
	Course v2;
	Course v3;
	String name;
	String stuNo;
	String classes;
	double avarage;
	boolean isPass;
	
	Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3, Course v1, Course v2, Course v3) {
		this.name = name;
		this.stuNo = stuNo;
		this.classes = classes;
		this.c1 = c1;
		this.c2 = c2;
		this.c3 = c3;
		this.v1 = v1;
		this.v2 = v2;
		this.v3 = v3;
		this.avarage = 0;
		this.isPass = false;
	}
	
	void addBulkExamNote(int note1, int note2, int note3) {
		if(note1 >= 0 && note1 <= 100) {
			this.c1.note = note1;
		}
		if(note2 >= 0 && note2 <= 100) {
			this.c2.note = note2;;
		}
		if(note3 >= 0 && note3 <= 100) {
			this.c3.note = note3;
		}
		
	}
	void addBulkVerbalNote(int v1, int v2, int v3) {
		if(v1 >= 0 && v1 <= 100) {
			this.v1.verbalNote = v1;
		}
		if(v2 >= 0 && v2 <= 100) {
			this.v2.verbalNote = v2;
		}
		if(v3 >= 0 && v3 <= 100) {
			this.v3.verbalNote = v3;
		}
	}
	
	void isPass() {
		System.out.println("--------");
		this.avarage = (((this.c1.note + this.c2.note + this.c3.note)/3)*0.8)+
				(((this.v1.verbalNote + this.v2.verbalNote + this.v3.verbalNote)/3)*0.2);
		if(this.avarage >= 55)
			System.out.println("Sınıfı geçtiniz!");
		else
			System.out.println("Sınıfı geçemediniz!");
		printNote();
	}
	
	void printNote() {
		System.out.println(c1.name + " sınav notu: " + this.c1.note + " sözlü notu: " + this.v1.verbalNote);
		System.out.println(c2.name + " sınav notu: " + this.c2.note + " sözlü notu: " + this.v2.verbalNote);
		System.out.println(c3.name + " sınav notu: " + this.c3.note + " sözlü notu: " + this.v3.verbalNote);
		System.out.println("Ortalamanız: " + this.avarage);
	}

}
