// Problem: https://www.hackerrank.com/challenges/grading/problem
public static List<Integer> gradingStudents(List<Integer> grades) {
    // Write your code here
    List<Integer> result = new LinkedList<Integer>();
    for(int grade : grades) {
        if(grade % 5 >= 3 && grade >= 38) {
            int roundUpGrade = 5 * (grade / 5 + 1);
            result.add(roundUpGrade);
        } else {
            result.add(grade);
        }
    }
    return result;
  }