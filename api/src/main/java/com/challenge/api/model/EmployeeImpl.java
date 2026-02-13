public class EmployeeImpl implements Employee {
    // Declare private fields that each employee must contain because they are implementing Employee Interface
    private UUID Uuid;
    private String firstName;
    private String lastName;
    private String fullName = firstName + " " + lastName;
    private int salary;
    private int age;
    private String jobTitle;
    private String email;
    private Instant contractHireDate;
    private Instant contractTerminationDate;

    // Implement methods that must be defined so that this class is a concrete implementation of Employee class
    // Getters and Setters


}
