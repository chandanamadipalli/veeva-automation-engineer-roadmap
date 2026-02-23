import java.util.*;

class Student {
    String name;
    double cgpa;
    int id;

    Student(String name, double cgpa, int id) {
        this.name = name;
        this.cgpa = cgpa;
        this.id = id;
    }
}

public class StudentPriorityQueue {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PriorityQueue<Student> pq = new PriorityQueue<>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                if (Double.compare(s2.cgpa, s1.cgpa) != 0) {
                    return Double.compare(s2.cgpa, s1.cgpa);
                } else if (!s1.name.equals(s2.name)) {
                    return s1.name.compareTo(s2.name);
                } else {
                    return Integer.compare(s1.id, s2.id);
                }
            }
        });

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String event = sc.next();

            if (event.equals("ENTER")) {
                String name = sc.next();
                double cgpa = sc.nextDouble();
                int id = sc.nextInt();
                pq.add(new Student(name, cgpa, id));
            } else if (event.equals("SERVED")) {
                if (!pq.isEmpty()) {
                    pq.poll();
                }
            }
        }

        if (pq.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            while (!pq.isEmpty()) {
                System.out.println(pq.poll().name);
            }
        }

        sc.close();
    }
}