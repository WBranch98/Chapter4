public class Triangle {

        private double side1;
        private double side2;
        private double side3;

        // Constructor to initialize the sides of the triangle
        public Triangle(double side1, double side2, double side3) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }

        // Method to check if the sides form a valid triangle
        public boolean checkSides() throws IllegalTriangleSideException {
            if (side1 + side2 > side3 && side2 + side3 > side1 && side1 + side3 > side2) {
                return true;  // The sides satisfy the triangle inequality
            } else {
                throw new IllegalTriangleSideException("The sides do not form a valid triangle.");
            }
        }

        // Getters for the sides
        public double getSide1() {
            return side1;
        }

        public double getSide2() {
            return side2;
        }

        public double getSide3() {
            return side3;
        }
    }


