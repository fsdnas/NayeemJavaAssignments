package ClassAndObject;

public class StudentMain {

	public static void main(String[] args) {
		int[] arr = new int[] { 10, 20, 30 };

		Student s = new Student("nayeem", "168");
		s.getDetails();
		s.getGrades(arr);
		
		int[] arr1 = new int[] { 13, 28,5 };
		
		System.out.println();

		Student s1 = new Student("ahmed", "170");
		s1.getDetails();
		s1.getGrades(arr1);
		
		
	}

}
