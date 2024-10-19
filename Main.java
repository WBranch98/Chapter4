public class Main {

    public static void main(String[] args) {

Triangle triangle1 = new Triangle(3, 4, 5);  // Valid triangle (Pythagorean triplet)
        Triangle triangle2 = new Triangle(1, 1, 2);  // Invalid triangle (sum of two sides < third side)
        Triangle triangle3 = new Triangle(5, 5, 5);  // Valid triangle (Equilateral)

        // Check if the triangles are valid using checkSides method
        checkAndPrintTriangle(triangle1);
        checkAndPrintTriangle(triangle2);
        checkAndPrintTriangle(triangle3);
    }

    // Method to check the triangle and handle exceptions
    public static void checkAndPrintTriangle(Triangle triangle) {
        try {
            if (triangle.checkSides()) {
                System.out.println("Triangle with sides " + triangle.getSide1() + ", " + triangle.getSide2() + ", " + triangle.getSide3() + " is a valid triangle.");
            }
        } catch (IllegalTriangleSideException e) {
            System.out.println("Invalid triangle with sides " + triangle.getSide1() + ", " + triangle.getSide2() + ", " + triangle.getSide3() + ": " + e.getMessage());
        }
    }
}


