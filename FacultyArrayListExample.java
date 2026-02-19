import java.util.ArrayList;

// Faculty class
class Faculty {
    String name;
    String department;
    int experienceYears;

    // Constructor
    Faculty(String name, String department, int experienceYears) {
        this.name = name;
        this.department = department;
        this.experienceYears = experienceYears;
    }

    // Method to display faculty details
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Experience: " + experienceYears + " years");
        System.out.println("------------------------");
    }
}

public class FacultyArrayListExample {
    public static void main(String[] args) {

        // Create ArrayList
        ArrayList<Faculty> facultyList = new ArrayList<>();

        // Add 4 faculty members
        facultyList.add(new Faculty("Anita", "Computer Science", 5));
        facultyList.add(new Faculty("Rahul", "Electronics", 8));
        facultyList.add(new Faculty("Meena", "Mechanical", 6));
        facultyList.add(new Faculty("Arjun", "Civil", 4));

        // Update department of one faculty (Rahul -> IT)
        for (Faculty f : facultyList) {
            if (f.name.equals("Rahul")) {
                f.department = "Information Technology";
            }
        }

        // Remove faculty by name (Meena)
        facultyList.removeIf(f -> f.name.equals("Meena"));

        // Display all faculty details
        System.out.println("Faculty Details:");
        for (Faculty f : facultyList) {
            f.display();
        }
    }
}