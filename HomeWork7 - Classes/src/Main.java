public class Main {
    public static void main(String[] args) {
        LeadEngineer first = new LeadEngineer("Vanya", "Lead Engineer", 100, "leadership", "strategic thinking","efficiency");
        Engineer second = new LeadEngineer();
        Traineer third = new Traineer("Petro", "Trainee", 100, "UFT", 4.89, 8.85);
        Engineer fourth = new Traineer();

        System.out.print(first.name + " is " + first.getPosition() + ". ");
        System.out.print("His competencies: " + first.comp1 + ", " + first.comp2 + ", " + first.getComp3() + ". ");
        System.out.println("His salary - " + first.personal_salary() + "$.");

        System.out.println(second.getPosition() + "\"" + first.getPosition() + "\"." + " Salary - " + first.public_salary + "$.");

        System.out.print(third.name + " is " + third.getPosition() + ". ");
        System.out.print("His indicators: " + "University - " + third.university + ", " + "Raiting from University - " + third.getRaitingU() + ", " + "Raiting after test - " + third.raitingT + ". ");
        System.out.println("His salary - " + third.personal_salary() + "$.");

        System.out.println(fourth.getPosition() + "\"" + third.getPosition() + "\".");
    }
}
