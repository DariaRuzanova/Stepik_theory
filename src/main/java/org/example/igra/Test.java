package org.example.igra;

public class Test {
    public static void main(String[] args) {
        Schoolar schoolar1 = new Schoolar("Ivan", 13);
        Schoolar schoolar2 = new Schoolar("Masha", 15);
        Schoolar schoolar3 = new Schoolar("Sasha", 10);
        Schoolar schoolar4 = new Schoolar("Dima", 12);

        Student student1 = new Student("Olya",20);
        Student student2 = new Student("Kseniya",18);

        Employer employer1 = new Employer("Petr", 32);
        Employer employer2 = new Employer("Misha", 47);

        Team<Schoolar> schoolarTeam = new Team<>("Drakon");
        schoolarTeam.addNewParticipant(schoolar1);
        schoolarTeam.addNewParticipant(schoolar2);

        Team<Schoolar> schoolarTeam2 = new Team<>("Мудрецы");
        schoolarTeam2.addNewParticipant(schoolar3);
        schoolarTeam2.addNewParticipant(schoolar4);

        Team<Student> studentTeam = new Team<>("Vpered");
        studentTeam.addNewParticipant(student1);
        studentTeam.addNewParticipant(student2);

        Team<Student> studentTeam2 = new Team<>("Vpered");

        Team<Employer> employerTeam = new Team<>("Работяги");
        employerTeam.addNewParticipant(employer1);
        employerTeam.addNewParticipant(employer2);

        schoolarTeam.playWhith(schoolarTeam2);


    }
}
