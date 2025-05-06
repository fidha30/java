import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class EmployeeManagementSystem {
    static final String DB_URL = "jdbc:mysql://localhost:3306/employee_db";
    static final String USER = "root";
    static final String PASS = "";
    static Connection conn;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            while (true) {
                System.out.println("\n--- Employee Management System ---");
                System.out.println("1. Add Employee");
                System.out.println("2. View All Employees");
                System.out.println("3. Update Employee");
                System.out.println("4. Delete Employee");
                System.out.println("5. Exit");
                System.out.print("Choose an option: ");

                int choice = scanner.nextInt();
                scanner.nextLine(); // consume newline

                switch (choice) {
                    case 1:
                        addEmployee();
                        break;
                    case 2:
                        viewEmployees();
                        break;
                    case 3:
                        updateEmployee();
                        break;
                    case 4:
                        deleteEmployee();
                        break;
                    case 5:
                        conn.close();
                        System.out.println("Goodbye!");
                        return;
                    default:
                        System.out.println("Invalid choice. Try again.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    static void addEmployee() throws SQLException {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter department: ");
        String department = scanner.nextLine();

        System.out.print("Enter salary: ");
        double salary = scanner.nextDouble();
        scanner.nextLine();

        String sql = "INSERT INTO employees (name, age, department, salary) VALUES (?, ?, ?, ?)";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, name);
        stmt.setInt(2, age);
        stmt.setString(3, department);
        stmt.setDouble(4, salary);

        int rowsInserted = stmt.executeUpdate();
        if (rowsInserted > 0) {
            System.out.println("Employee added successfully.");
        }
    }

    static void viewEmployees() throws SQLException {
        String sql = "SELECT * FROM employees";
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);

        System.out.println("\n--- Employee List ---");
        while (rs.next()) {
            System.out.printf("ID: %d | Name: %s | Age: %d | Dept: %s | Salary: %.2f%n",
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getInt("age"),
                    rs.getString("department"),
                    rs.getDouble("salary"));
        }
    }

    static void updateEmployee() throws SQLException {
        System.out.print("Enter employee ID to update: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter new name: ");
        String name = scanner.nextLine();

        System.out.print("Enter new age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter new department: ");
        String department = scanner.nextLine();

        System.out.print("Enter new salary: ");
        double salary = scanner.nextDouble();
        scanner.nextLine();

        String sql = "UPDATE employees SET name = ?, age = ?, department = ?, salary = ? WHERE id = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, name);
        stmt.setInt(2, age);
        stmt.setString(3, department);
        stmt.setDouble(4, salary);
        stmt.setInt(5, id);

        int rowsUpdated = stmt.executeUpdate();
        if (rowsUpdated > 0) {
            System.out.println("Employee updated successfully.");
        } else {
            System.out.println("Employee not found.");
        }
    }

    static void deleteEmployee() throws SQLException {
        System.out.print("Enter employee ID to delete: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        String sql = "DELETE FROM employees WHERE id = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, id);

        int rowsDeleted = stmt.executeUpdate();
        if (rowsDeleted > 0) {
            System.out.println("Employee deleted successfully.");
        } else {
            System.out.println("Employee not found.");
        }
    }
}
