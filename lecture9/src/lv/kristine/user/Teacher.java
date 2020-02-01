package lv.kristine.user;

import java.util.Arrays;

public class Teacher extends Person {
	private int numCourses;
	private String[] courses;
	private static final int MAX_COURSES = 4;

	public Teacher(String name, String address) {
		super(name, address);
		this.numCourses = 0;
		this.courses = new String[MAX_COURSES];
	}

	public void addCourse(String course) {
		courses[numCourses] = course;
		++numCourses;
		System.out.println(Arrays.toString(this.courses));
	}

	public boolean addCourses(String kursi) { // ja kurs eksiste, tad return
												// false = t.i. neko nedara
		for (int i = 0; i < numCourses; i++) {
			if (courses[i].equals(kursi)) {
				return false;
			}
		}
		courses[numCourses] = course;
		numCourses++;
		return true;

	}

	public boolean removeCourses(String course) {
		boolean found = false;
		int courseInsdex = -1;
		for (int i = 0; i < numCourses; i++) {
			if (courses[i].equals(course)) {
				courseInsdex = i;
				found = true;
				break;
			}
		}
		if (found) {
			for (int i = courseInsdex; i < numCourses - 1; i++) {
				courses[i] = courses[i + 1];

			}
			numCourses--;
			return true;
		} else {
			return false;

		}

	}

	public String toString() {
		return "Teacher " + super.toString();

	}

}
