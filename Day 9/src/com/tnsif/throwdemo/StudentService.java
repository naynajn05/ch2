package com.tnsif.throwdemo;


public class StudentService {
	
	public void setMarks(Student student,int[] marks) throws InvalidMarksException 
	{
		for(int mark:marks)
		{
			if(mark <0 || mark >100)
			{
				throw new InvalidMarksException ("Invalid Marks");
			}
		}
		student.setMarks(marks);
		calculatePercentage(student);
	}

	
	private void calculatePercentage(Student student) {
        int[] marks = student.getMarks();
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        float percentage = (float) sum / marks.length;
        student.setPer(percentage);
    }
}
