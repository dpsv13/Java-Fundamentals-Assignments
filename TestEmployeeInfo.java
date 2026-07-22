import java.util.Optional;

public class TestEmployeeInfo {

    public static void main(String[] args) {

        //EmployeeInfo emp = null;
        EmployeeInfo emp = new EmployeeInfo(101, "Rahul");

        try {
            EmployeeInfo employee = Optional.ofNullable(emp)
                    .orElseThrow(() ->
                            new InvalidEmployeeException("Invalid Employee"));

            employee.display();

        } catch (InvalidEmployeeException e) {
            System.out.println(e.getMessage());
        }
    }
}