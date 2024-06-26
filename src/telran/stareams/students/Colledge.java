package telran.stareams.students;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Colledge implements Iterable<Student> {
	Student[] students;
	public Colledge(Student[] students) {
		this.students = Arrays.copyOf(students, students.length);
	}
	
	@Override
	public Iterator<Student> iterator() {
		return new ColledgeIterator();
	}
	
	private class ColledgeIterator implements Iterator<Student>{
		int currentIndex = 0;

		@Override
		public boolean hasNext() {
			return currentIndex < students.length;
		}
		@Override
		public Student next() {
			if(!hasNext()) {
				throw new NoSuchElementException("There are no more students in college");
			}
			return students[currentIndex++];
		}	
	}

}
