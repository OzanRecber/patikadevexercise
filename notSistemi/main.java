package notSistemi;

public class main {

	public static void main(String[] args) {
		Teacher t1 = new Teacher("Mahmut Hoca", "TRH", "000");
		Teacher t2 = new Teacher("Paşa Nuri", "FZK", "111");
		Teacher t3 = new Teacher("Külyutmaz", "BIO", "222");
		
		Course tarih = new Course("Tarih", "101", "TRH");
		tarih.addTeacher(t1);
		Course fizik = new Course("Fizik", "102", "FZK");
		fizik.addTeacher(t2);
		Course biyoloji = new Course("Biyoloji", "101", "BIO");
		biyoloji.addTeacher(t3);
		
		
		Student s1 = new Student("İnek Şaban", "123", "6", tarih, fizik, biyoloji, tarih, fizik, biyoloji);
		s1.addBulkExamNote(60, 50, 50);
		s1.addBulkVerbalNote(60, 80, 40);
		s1.isPass();
		Student s2 = new Student("Güdük Necmi", "321", "6", tarih, fizik, biyoloji, tarih, fizik, biyoloji);
		s2.addBulkExamNote(60, 55, 65);
		s2.addBulkVerbalNote(70, 40, 50);
		s2.isPass();
	}

}
