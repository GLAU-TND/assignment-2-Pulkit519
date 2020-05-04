package problem3.main;

import problem3.myqueue.MyPriorityQueue;
// executable class
// use problem5.student.Student class to create object of student
public class MyMain {
    public static void main(String[] args) {
        Student janeJones = new Student("Jane", "Jones", 1);
        Student johnDoe = new Student("John", "Doe", 3);
        Student marySmith = new Student("Mary", "Smith", 2);
        Student mikeWilson = new Student("Mike", "Wilson", 4);

        Student billEnd = new Student("Bill","End",5);

        MyPriorityQueue<Student> queue = new MyPriorityQueue();

        queue.enQueue(janeJones, janeJones.getRoll());
        queue.enQueue(johnDoe, johnDoe.getRoll());
        queue.enQueue(marySmith, marySmith.getRoll());
        queue.enQueue(mikeWilson, mikeWilson.getRoll());
        queue.enQueue(billEnd, billEnd.getRoll());

        System.out.println("List of Student");
        queue.printQueue();

        Student remove = queue.deQueue();
        System.out.println("remove student "+remove);
        System.out.println("List after removal");
        queue.printQueue();
    }
}