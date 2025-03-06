import java.util.Comparator;

class Student
{
	Integer studentId;
	String studentName;
	
	public Student(Integer studentId,String studentName)
	{
		this.studentId=studentId;
		this.studentName=studentName;
	}
	
	public String toString()
	{
		return this.studentId+" : "+this.studentName;
	}
}

class SortBasedOnStudentName implements Comparator
{

	@Override
	public int compare(Object obj1, Object obj2) {
		Student s1 = (Student)obj1;
		Student s2 = (Student)obj2;
		return s1.studentName.compareTo(s2.studentName);
	}
	
}