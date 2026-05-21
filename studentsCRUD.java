import java.sql.*;

public class studentsCRUD {

    // Database details
    static final String URL =
        "jdbc:mysql://localhost:3307/student_id";

    static final String USER = "root";
    static final String PASS = "cec123";

    // CREATE - Insert student
    static void insertStudent(String name, int age, double marks) {

        String sql =
            "INSERT INTO students(name, age, marks) VALUES (?, ?, ?)";

        try (
            Connection conn =
                DriverManager.getConnection(URL, USER, PASS);

            PreparedStatement pstmt =
                conn.prepareStatement(sql)
        ) {

            pstmt.setString(1, name);
            pstmt.setInt(2, age);
            pstmt.setDouble(3, marks);

            int rows = pstmt.executeUpdate();

            System.out.println(
                "Inserted " + rows + " student: " + name
            );

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // READ - Get all students
    static void getAllStudents() {

        String sql = "SELECT * FROM students";

        try (
            Connection conn =
                DriverManager.getConnection(URL, USER, PASS);

            Statement stmt = conn.createStatement();

            ResultSet rs = stmt.executeQuery(sql)
        ) {

            System.out.println("\n--- STUDENT LIST ---");

            while (rs.next()) {

                System.out.println(
                    rs.getInt("id") + " | " +
                    rs.getString("name") + " | " +
                    rs.getInt("age") + " | " +
                    rs.getDouble("marks")
                );
            }

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // UPDATE student marks
    static void updateMarks(int id, double newMarks) {

        String sql =
            "UPDATE students SET marks = ? WHERE id = ?";

        try (
            Connection conn =
                DriverManager.getConnection(URL, USER, PASS);

            PreparedStatement pstmt =
                conn.prepareStatement(sql)
        ) {

            pstmt.setDouble(1, newMarks);
            pstmt.setInt(2, id);

            int rows = pstmt.executeUpdate();

            System.out.println("Updated rows: " + rows);

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // DELETE student
    static void deleteStudent(int id) {

        String sql =
            "DELETE FROM students WHERE id = ?";

        try (
            Connection conn =
                DriverManager.getConnection(URL, USER, PASS);

            PreparedStatement pstmt =
                conn.prepareStatement(sql)
        ) {

            pstmt.setInt(1, id);

            int rows = pstmt.executeUpdate();

            System.out.println("Deleted rows: " + rows);

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // MAIN METHOD
    public static void main(String[] args) {

        insertStudent("John", 20, 85.5);
        insertStudent("James", 21, 92.0);
        insertStudent("Carl", 19, 76.5);

        getAllStudents();

        updateMarks(1, 95.0);

        System.out.println("\nAfter Update:");
        getAllStudents();

        deleteStudent(2);

        System.out.println("\nAfter Delete:");
        getAllStudents();
    }
}