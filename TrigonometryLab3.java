/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trigonometrylab3;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class TrigonometryLab3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        // Problem 1: Trigonometric Function Calculator
       
        System.out.println("\n---  Trigonometric Function Calculator --- ");
        
        // Create a Scanner object to get input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter an angle in degrees
        System.out.print("Enter an angle in degrees: ");
        double degrees = scanner.nextDouble();

        // Display the available trigonometric functions
        System.out.println("\nChoose a function:");
        System.out.println("1. Sine");
        System.out.println("2. Cosine");
        System.out.println("3. Tangent");
        System.out.println("4. All three");
        System.out.println("2. Cosine");
        System.out.println("3. Tangent");
        System.out.println("4. All three");

        // Ask the user to choose a function
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        
         // Convert the angle from degrees to radians
        // Java's sin(), cos(), and tan() methods use radians
        double radians = Math.toRadians(degrees);

        // Use switch to perform the function selected by the user
        switch (choice) {

            // If the user chooses 1, calculate sine
            case 1:
                System.out.println("Sine: " + Math.sin(radians));
                break;
            
            // If the user chooses 2, calculate cosine 
            case 2:
                System.out.println("Cosine: " + Math.cos(radians));
                break;

            // If the user chooses 3, calculate tangent
            case 3:
                System.out.println("Tangent: " + Math.tan(radians));
                break;

            // If the user chooses 4, calculate all three functions
            case 4:
                System.out.println("Sine: " + Math.sin(radians));
                System.out.println("Cosine: " + Math.cos(radians));
                
            // If the user enters a number other than 1-4
            default:
                System.out.println("Invalid choice. Please choose 1, 2, 3, or 4.");
              }
    
            // Convert the angle to a value between 0 and 360 degrees
            // The % operator gets the remainder after division by 360
            double normalizedAngle = ((degrees % 360) + 360) % 360;
        
            // Tangent is undefined at 90° and 270°
            // We also check angles within 1 degree of these values
            if (Math.abs(normalizedAngle - 90) <= 1 ||
            Math.abs(normalizedAngle - 270) <= 1) {

            // Display a warning instead of giving a misleading tangent value
            System.out.println(
                "Warning: Tangent is undefined or close to undefined at this angle."
            );

        } else {

            // Calculate and display the tangent
            System.out.println("Tangent: " + Math.tan(radians));
        }
        
       System.out.println("\n--- Inverse Trigonometric Functions Calculator --- "); 
       
        // Ask the user to enter a value
        // For sine and cosine, the value must be between -1 and 1
        System.out.print("Enter a value: ");
        double value = scanner.nextDouble();

        // Display the available inverse trigonometric functions
        System.out.println("\nChoose an inverse trigonometric function:");
        System.out.println("1. Inverse Sine (asin)");
        System.out.println("2. Inverse Cosine (acos)");
        System.out.println("3. Inverse Tangent (atan)");
        System.out.println("4. All three");

        // Ask the user to choose a function
        System.out.print("Enter your choice: ");
        int choice2 = scanner.nextInt();

        // Use switch to perform the selected inverse trigonometric function
         switch (choice2) {

            // Inverse sine
            case 1:
                if (value >= -1 && value <= 1) {
                    // Math.asin() returns the answer in radians
                    // Convert the result to degrees using Math.toDegrees()
                    double result = Math.toDegrees(Math.asin(value));

            System.out.println("Inverse Sine: " + result + " degrees");
            } else {
            // asin is only defined for values from -1 to 1
            System.out.println("Error: Inverse sine requires a value between -1 and 1.");
            }
            break;
               
            // Inverse cosine
            case 2:
                if (value >= -1 && value <= 1) {
                    // Math.acos() returns the answer in radians
                    // Convert the result to degrees
                    double result = Math.toDegrees(Math.acos(value));

            System.out.println("Inverse Cosine: " + result + " degrees");
            } else {
                    
            // acos is only defined for values from -1 to 1
            System.out.println("Error: Inverse cosine requires a value between -1 and 1.");
            }
            break;
            
             // Inverse tangent
            case 3:
                // Math.atan() can accept any real number
                // Convert the result from radians to degrees
                double result = Math.toDegrees(Math.atan(value));

            System.out.println("Inverse Tangent: " + result + " degrees");
            break;

            // Calculate all three inverse functions
            case 4:

            // Check if the value is valid for inverse sine
            if (value >= -1 && value <= 1) {
            
              // Calculate inverse sine and convert to degrees
                double asinResult = Math.toDegrees(Math.asin(value));

            // Calculate inverse cosine and convert to degrees
                double acosResult = Math.toDegrees(Math.acos(value));

            System.out.println("Inverse Sine: " + asinResult + " degrees");
            System.out.println("Inverse Cosine: " + acosResult + " degrees");

            } else {
                    
            // Display an error if the value is outside -1 to 1
            System.out.println("Inverse Sine and Cosine are undefined for values outside -1 to 1.");}
               // Inverse tangent works for any real number
                double atanResult = Math.toDegrees(Math.atan(value));
            
                System.out.println("Inverse Tangent: " + atanResult + " degrees");
                break;
            
            default: // Default runs when the user enters a choice that is not 1, 2, 3, or 4
            // Runs when the user enters something other than 1, 2, 3, or 4
            System.out.println("Invalid choice. Please choose 1, 2, 3, or 4.");
            
            
            // Critical Thinking Questions:
            
            // 1. Why do we need to convert angles from degrees to radians?
            //  Answer: Most programming language trigonometric functions, 
            //          such as sin(), cos(),and tan(), use radians as their 
            //          angle unit. Converting degrees to radians ensures 
            //          the functions calculate the correct values.
            
            // 2. What makes tangent undefined at certain angles?
            //  Answer: Tangent is defined as sin(θ) / cos(θ). It becomes undefined when
            //          cos(θ) = 0, because division by zero is undefined. This occurs at
            //          90°, 270°, and other odd multiples of 90°.
            
            // 3. How could you modify this program to also calculate 
            //    reciprocal functions (cosecant, secant, cotangent)?
            //  Answer: Add formulas for the reciprocal functions: cosecant = 1/sin(θ),
            //          secant = 1/cos(θ), and cotangent = 1/tan(θ). The program should
            //          also check for zero denominators before performing the division.
            
            
            
            // Problem 2: Angle Quadrant Detector
       
            System.out.println("\n---  Angle Quadrant Detector --- ");
            
             // Ask the user to enter an angle
        System.out.print("Enter an angle in degrees: ");
        double angle = scanner.nextDouble();

        // Normalize the angle to a value between 0° and 360°
        double normalizedAngle2 = ((angle % 360) + 360) % 360;

        // Display the normalized angle
        System.out.println("Normalized angle: " + normalizedAngle2 + "°");

        // Create a variable to store the position
        int position;
        
        // Determine the position of the angle
        if (normalizedAngle == 0) {
            position = 1;       // Positive x-axis

        } else if (normalizedAngle == 90) {
            position = 2;       // Positive y-axis

        } else if (normalizedAngle == 180) {
            position = 3;       // Negative x-axis

        } else if (normalizedAngle == 270) {
            position = 4;       // Negative y-axis

        } else if (normalizedAngle > 0 && normalizedAngle < 90) {
            position = 5;       // Quadrant I
            
         } else if (normalizedAngle > 90 && normalizedAngle < 180) {
            position = 6;       // Quadrant II

        } else if (normalizedAngle > 180 && normalizedAngle < 270) {
            position = 7;       // Quadrant III

        } else {
            position = 8;       // Quadrant IV
        }
        
        // Use switch to display the quadrant and signs
        switch (position) {

            // 0° - Positive x-axis
            case 1:
                System.out.println("Position: Positive x-axis");
                System.out.println("Sine: 0");
                System.out.println("Cosine: Positive");
                System.out.println("Tangent: 0");
                break;

            // 90° - Positive y-axis
            case 2:
                System.out.println("Position: Positive y-axis");
                System.out.println("Sine: Positive");
                System.out.println("Cosine: 0");
                System.out.println("Tangent: Undefined");
                break;
                
                // 180° - Negative x-axis
            case 3:
                System.out.println("Position: Negative x-axis");
                System.out.println("Sine: 0");
                System.out.println("Cosine: Negative");
                System.out.println("Tangent: 0");
                break;

            // 270° - Negative y-axis
            case 4:
                System.out.println("Position: Negative y-axis");
                System.out.println("Sine: Negative");
                System.out.println("Cosine: 0");
                System.out.println("Tangent: Undefined");
                break;
                
                 // Quadrant I
            case 5:
                System.out.println("Quadrant: I");
                System.out.println("Sine: Positive");
                System.out.println("Cosine: Positive");
                System.out.println("Tangent: Positive");
                break;

            // Quadrant II
            case 6:
                System.out.println("Quadrant: II");
                System.out.println("Sine: Positive");
                System.out.println("Cosine: Negative");
                System.out.println("Tangent: Negative");
                break;
                
                // Quadrant III
            case 7:
                System.out.println("Quadrant: III");
                System.out.println("Sine: Negative");
                System.out.println("Cosine: Negative");
                System.out.println("Tangent: Positive");
                break;

            // Quadrant IV
            case 8:
                System.out.println("Quadrant: IV");
                System.out.println("Sine: Negative");
                System.out.println("Cosine: Positive");
                System.out.println("Tangent: Negative");
                break;

            // Handle unexpected position values
            default:
                System.out.println("Invalid position.");
                }
        
            // Critical Thinking Questions:
            
            // 1. Why is it important to normalize angles before 
            //    determining their quadrant?
            //  Answer: To put the angle in a standard range so 
            //          we can easily find its quadrant. 
            
            // 2. How does the sign of trigonometric functions change 
            //    across different quadrants?
            //  Answer: The signs change depending on the quadrant. 
            //          Some functions are positive while others are negative.
            
            // 3. What special considerations are needed for angles 
            //    exactly on the axes?
            //  Answer: Angles on the axes are not in any quadrant 
            //          and may have values of zero or undefined.
        
        
        
            // Problem 3: Right Triangle Solver

            System.out.println("\n---  Right Triangle Solver --- ");
            
        // Display the choices
        System.out.println("RIGHT TRIANGLE SOLVER");
        System.out.println("=====================");
        System.out.println("Choose what you know:");
        System.out.println("1. Two legs (a and b)");
        System.out.println("2. Leg and hypotenuse (a and c)");
        System.out.println("3. One side and one angle");

        // Ask the user to choose
        System.out.print("Enter your choice: ");
        int option = scanner.nextInt();

        // Variables for the three sides
        double a = 0;  // First leg
        double b = 0;  // Second leg
        double c = 0;  // Hypotenuse
        
         // Variables for the three angles
        double A = 0;
        double B = 0;
        double C = 90; // A right triangle always has a 90° angle

        switch (option) {

            // ------------------------------------------------
            // OPTION 1: User knows two legs
            // ------------------------------------------------
            case 1:
                
                // Ask for the first leg
                System.out.print("Enter side a: ");
                a = scanner.nextDouble();

                // Validate that a is positive
                if (a <= 0) {
                    System.out.println("Error: Side must be positive.");
                    scanner.close();
                    return;
                }

                // Ask for the second leg
                System.out.print("Enter side b: ");
                b = scanner.nextDouble();
                 // Validate that b is positive
                if (b <= 0) {
                    System.out.println("Error: Side must be positive.");
                    scanner.close();
                    return;
                }

                // Use the Pythagorean theorem to find the hypotenuse
                c = Math.sqrt((a * a) + (b * b));

                // Find angle A using inverse tangent
                A = Math.toDegrees(Math.atan(a / b));
                  // The two acute angles add up to 90°
                B = 90 - A;

                break;
                
                  // ------------------------------------------------
                  // OPTION 2: User knows a leg and the hypotenuse
                  // ------------------------------------------------
            case 2:

                // Ask for the first leg
                System.out.print("Enter side a: ");
                a = scanner.nextDouble();

                // Validate that a is positive
                if (a <= 0) {
                    System.out.println("Error: Side must be positive.");
                    scanner.close();
                    return;
                }
                
                 // Ask for the hypotenuse
                System.out.print("Enter hypotenuse c: ");
                c = scanner.nextDouble();

                // Validate that c is positive
                if (c <= 0) {
                    System.out.println("Error: Side must be positive.");
                    scanner.close();
                    return;
                }
                
                 // The hypotenuse must be longer than the leg
                if (c <= a) {
                    System.out.println(
                        "Error: The hypotenuse must be longer than the leg."
                    );
                    scanner.close();
                    return;
                }

                // Use Pythagorean theorem to find the missing leg
                b = Math.sqrt((c * c) - (a * a));

                // Find angle A using inverse sine
                A = Math.toDegrees(Math.asin(a / c));
                  // The two acute angles add up to 90°
                B = 90 - A;

                break;

                
                 // ------------------------------------------------
                 // OPTION 3: User knows one side and one angle
                 // ------------------------------------------------
            case 3:

                System.out.println("\nWhich side do you know?");
                System.out.println("1. Opposite side (a)");
                System.out.println("2. Adjacent side (b)");
                System.out.println("3. Hypotenuse (c)");

                System.out.print("Enter your choice: ");
                int sideChoice = scanner.nextInt();
                
                // Ask for the known side
                System.out.print("Enter the known side: ");
                double knownSide = scanner.nextDouble();

                // Validate the side
                if (knownSide <= 0) {
                    System.out.println("Error: Side must be positive.");
                    scanner.close();
                    return;
                }

                // Ask for the known angle
                System.out.print("Enter the known angle (less than 90°): ");
                double angle2 = scanner.nextDouble();
                
                 // Validate the angle
                if (angle2 <= 0 || angle2 >= 90) {
                    System.out.println(
                        "Error: Angle must be greater than 0° and less than 90°."
                    );
                    scanner.close();
                    return;
                }

                // Convert the angle from degrees to radians
                double radians2 = Math.toRadians(angle);

                switch (sideChoice) {
                     // Known side is opposite the angle
                    case 1:

                        a = knownSide;

                        // sin(angle) = opposite / hypotenuse
                        c = a / Math.sin(radians2);

                        // tan(angle) = opposite / adjacent
                        b = a / Math.tan(radians2);

                        break;

                    // Known side is adjacent to the angle
                    case 2:
                        
                          b = knownSide;

                        // tan(angle) = opposite / adjacent
                        a = b * Math.tan(radians2);

                        // cos(angle) = adjacent / hypotenuse
                        c = b / Math.cos(radians2);

                        break;

                    // Known side is the hypotenuse
                    case 3:

                        c = knownSide;
                         // sin(angle) = opposite / hypotenuse
                        a = c * Math.sin(radians2);

                        // cos(angle) = adjacent / hypotenuse
                        b = c * Math.cos(radians2);

                        break;

                    default:
                        
                        
                        // Runs if the user enters an invalid side choice
                        System.out.println("Invalid side choice.");
                        scanner.close();
                        return;
                        }

                        // The entered angle is angle A
                        A = angle;

                        // The other acute angle is 90 - A
                        B = 90 - A;

                        break;
                        
                         default:

                // Runs if the user enters an invalid main choice
                System.out.println(
                    "Invalid choice. Please choose 1, 2, or 3."
                );
                scanner.close();
                return;
                }

                // Calculate the area of the right triangle
                // Area = 1/2 × base × height
                double area = 0.5 * a * b;
                // Display all three sides
            System.out.println("\n===== RESULTS =====");

            System.out.printf("Side a: %.2f%n", a);
            System.out.printf("Side b: %.2f%n", b);
            System.out.printf("Hypotenuse c: %.2f%n", c);

            // Display all three angles
            System.out.printf("Angle A: %.2f°%n", A);
            System.out.printf("Angle B: %.2f°%n", B);
            System.out.printf("Angle C: %.2f°%n", C);

            // Display the area
            System.out.printf("Area: %.2f%n", area);
            
            
            
            System.out.println("\n---  Oblique Triangles using the Law of Sines and Cosines --- ");
            
             System.out.println("===== TRIANGLE SOLVER =====");
        System.out.println("Choose the type of triangle:");
        System.out.println("1. Right Triangle");
        System.out.println("2. Oblique Triangle");

        System.out.print("Enter your choice: ");
        int triangleChoice = scanner.nextInt();

        // Variables for sides
        double a2 = 0;
        double b2 = 0;
        double c2 = 0;

        // Variables for angles
        double A1 = 0;
        double B1 = 0;
        double C1 = 0;
        
         // Variable for area
        double area1 = 0;

        switch (triangleChoice) {

            // ==================================================
            // RIGHT TRIANGLE
            // ==================================================
            case 1:

                System.out.println("\nRIGHT TRIANGLE");
                System.out.println("What do you know?");
                System.out.println("1. Two legs");
                System.out.println("2. A leg and hypotenuse");

                System.out.print("Enter your choice: ");
                int rightChoice = scanner.nextInt();

                switch (rightChoice) {
                    
                     // Know two legs
                    case 1:

                        System.out.print("Enter side a: ");
                        a = scanner.nextDouble();

                        System.out.print("Enter side b: ");
                        b = scanner.nextDouble();

                        // Check that both sides are positive
                        if (a <= 0 || b <= 0) {
                            System.out.println("Error: Sides must be positive.");
                            scanner.close();
                            return;
                        }
                        
                         // Use Pythagorean theorem
                        c = Math.sqrt(a * a + b * b);

                        // Find the angles using inverse tangent
                        A = Math.toDegrees(Math.atan(a / b));
                        B = 90 - A;
                        C = 90;

                        break;

                    // Know a leg and hypotenuse
                    case 2:

                        System.out.print("Enter side a: ");
                        a = scanner.nextDouble();

                        System.out.print("Enter hypotenuse c: ");
                        c = scanner.nextDouble();

                        // Check that sides are positive
                        if (a <= 0 || c <= 0) {
                            System.out.println("Error: Sides must be positive.");
                            scanner.close();
                             return;
                        }

                        // Hypotenuse must be longer than the leg
                        if (c <= a) {
                            System.out.println(
                                "Error: Hypotenuse must be longer than side a."
                            );
                            scanner.close();
                            return;
                        }

                        // Find missing side using Pythagorean theorem
                        b = Math.sqrt(2 * c - a * a);

                        // Find angles
                        A = Math.toDegrees(Math.asin(a2 / c2));
                        B = 90 - A;
                        C = 90;
                        
                          break;

                    default:

                        // Invalid right-triangle choice
                        System.out.println("Invalid choice.");
                        scanner.close();
                        return;
                }

                break;
                
                
                
            // ==================================================
            // OBLIQUE TRIANGLE
            // ==================================================
            case 2:

                System.out.println("\nOBLIQUE TRIANGLE");
                System.out.println("Choose the information you know:");
                System.out.println("1. SSS (three sides)");
                System.out.println("2. SAS (two sides and included angle)");
                System.out.println("3. ASA (two angles and included side)");

                System.out.print("Enter your choice: ");
                int obliqueChoice = scanner.nextInt();

                switch (obliqueChoice) {

                    // ==========================================
                    // SSS - Three sides are known
                    // ==========================================
                    case 1:
                          System.out.print("Enter side a: ");
                        a = scanner.nextDouble();

                        System.out.print("Enter side b: ");
                        b = scanner.nextDouble();

                        System.out.print("Enter side c: ");
                        c = scanner.nextDouble();

                        // Check that all sides are positive
                        if (a <= 0 || b <= 0 || c <= 0) {
                            System.out.println(
                                "Error: All sides must be positive."
                            );
                            scanner.close();
                            return;
                              }

                        // Check the triangle inequality
                        if (a + b <= c ||
                            a + c <= b ||
                            b + c <= a) {

                            System.out.println(
                                "Error: These sides cannot form a triangle."
                            );
                            scanner.close();
                            return;
                        }
                        
                         // Law of Cosines
                         // Find angle A
                        A = Math.toDegrees(
                            Math.acos(
                                (b * b + c * c - a * a) / (2 * b * c)
                            )
                        );

                        // Find angle B
                        B = Math.toDegrees(
                            Math.acos(
                                (a * a + c * c - b * b) / (2 * a * c)
                            )
                        );

                        // The angles of a triangle add up to 180°
                        C = 180 - A - B;

                        break;
                        
                         // ==========================================
                         // SAS - Two sides and included angle
                         // ==========================================
                    case 2:

                        System.out.print("Enter side a: ");
                        a = scanner.nextDouble();

                        System.out.print("Enter side b: ");
                        b = scanner.nextDouble();

                        System.out.print("Enter included angle C: ");
                        C = scanner.nextDouble();

                        // Validate the inputs
                        if (a <= 0 || b <= 0) {
                            System.out.println(
                                "Error: Sides must be positive."
                            );
                            scanner.close();
                            return;
                        }
                        
                          if (C <= 0 || C >= 180) {
                            System.out.println(
                                "Error: Angle must be between 0° and 180°."
                            );
                            scanner.close();
                            return;
                        }

                        // Convert angle to radians
                        double radiansC = Math.toRadians(C);

                        // Law of Cosines
                        // c² = a² + b² - 2ab cos(C)
                        c = Math.sqrt(
                            a * a + b * b -
                            2 * a * b * Math.cos(radiansC)
                        );
                        
                         // Find angle A using Law of Cosines
                        A = Math.toDegrees(
                            Math.acos(
                                (b * b + c * c - a * a) /
                                (2 * b * c)
                            )
                        );

                        // Find remaining angle
                        B = 180 - A - C;

                        break;


                    // ==========================================
                    // ASA - Two angles and included side
                    // ==========================================
                    case 3:
                        
                          System.out.print("Enter angle A: ");
                        A = scanner.nextDouble();

                        System.out.print("Enter angle B: ");
                        B = scanner.nextDouble();

                        System.out.print("Enter side c: ");
                        c = scanner.nextDouble();

                        // Validate angles
                        if (A <= 0 || B <= 0 ||
                            A + B >= 180) {

                            System.out.println(
                                "Error: The angles must be positive "
                                + "and their sum must be less than 180°."
                            );

                            scanner.close();
                            return;
                             }

                        // Validate side
                        if (c <= 0) {
                            System.out.println(
                                "Error: Side must be positive."
                            );
                            scanner.close();
                            return;
                        }

                        // Find the third angle
                        C = 180 - A - B;

                        // Convert angles to radians
                        double radiansA = Math.toRadians(A);
                        double radiansB = Math.toRadians(B);
                        double radiansC2 = Math.toRadians(C);
                        
                         // Law of Sines
                        // a / sin(A) = c / sin(C)
                        a = c * Math.sin(radiansA) /
                            Math.sin(radiansC2);

                        // Law of Sines
                        // b / sin(B) = c / sin(C)
                        b = c * Math.sin(radiansB) /
                            Math.sin(radiansC2);

                        break;


                    default:

                        // Invalid oblique-triangle choice
                        System.out.println("Invalid choice.");
                        scanner.close();
                        return;
                }
                    
                 break;


            default:

                // Invalid triangle type
                System.out.println(
                    "Invalid choice. Please choose 1 or 2."
                );
                scanner.close();
                return;
        }
                   // ==================================================
                   // CALCULATE AREA
                   // ==================================================

        // Area of any triangle using two sides and
        // the included angle:
        // Area = 1/2 × a × b × sin(C)
        double radiansForArea = Math.toRadians(C);

        area = 0.5 * a * b * Math.sin(radiansForArea);


        // ==================================================
        // DISPLAY RESULTS
        // ==================================================

        System.out.println("\n===== RESULTS =====");

         // Display all three sides
        System.out.printf("Side a: %.2f%n", a);
        System.out.printf("Side b: %.2f%n", b);
        System.out.printf("Side c: %.2f%n", c);

        // Display all three angles
        System.out.printf("Angle A: %.2f°%n", A);
        System.out.printf("Angle B: %.2f°%n", B);
        System.out.printf("Angle C: %.2f°%n", C);

        // Display the area
        System.out.printf("Area: %.2f%n", area);
        }
            
            
            
            //  Critical Thinking Questions:
            
            // 1. Why must we validate that angles in a right triangle 
            //    are less than 90°?
            //  Answer: Because the two other angles in a right triangle 
            //          must be less than 90°.  
            
            // 2. How does your program handle the different cases of 
            //    known values?
            //  Answer: It checks the known values and uses the correct 
            //          formula to find the missing value.
            
            // 3. What would happen if a user entered values that don't 
            //    form a valid right triangle?
            //  Answer: The program should show an error message and ask 
            //          the user to enter valid values.
            
            
            // Problem 4: Angle Quadrant Detector
       
            System.out.println("\n---  Angle Quadrant Detector --- ");
            
            
        // Ask the user to enter an angle in degrees
        System.out.print("Enter an angle in degrees: ");
        double angle = scanner.nextDouble();

        // Convert the angle from degrees to radians
        // Java's trigonometric functions use radians
        double radians3 = Math.toRadians(angle);

        // Tolerance is used because computers may have
        // very small rounding errors when doing calculations
        double tolerance = 0.000001;
        
        System.out.println("\n===== TRIGONOMETRIC IDENTITY VERIFICATION =====");
        
        
         // ==================================================
         // IDENTITY 1: sin²θ + cos²θ = 1
         // ==================================================

        // Calculate the left side of the identity
        double leftSide1 =
            Math.pow(Math.sin(radians), 2) +
            Math.pow(Math.cos(radians), 2);
        
            // Calculate the right side
        double rightSide1 = 1;

        // Find the difference between both sides
        double difference1 = Math.abs(leftSide1 - rightSide1);

        System.out.println("\nIdentity 1:");
        System.out.println("sin²θ + cos²θ = 1");

        System.out.println("Left side: " + leftSide1);
        System.out.println("Right side: " + rightSide1);

        // Check if the difference is within the tolerance
        if (difference1 <= tolerance) {

        System.out.println("Result: TRUE");
        
          } else {

            System.out.println("Result: FALSE");
            System.out.println("Difference: " + difference1);
        }


        // ==================================================
        // IDENTITY 2: 1 + tan²θ = sec²θ
        // ==================================================

        // Calculate cosine
        double cosine = Math.cos(radians);

        System.out.println("\nIdentity 2:");
        System.out.println("1 + tan²θ = sec²θ");

         // Check if cosine is close to zero
        // because secant cannot be calculated when cos θ = 0
        if (Math.abs(cosine) < tolerance) {

            System.out.println(
                "Cannot verify this identity because cosine is zero."
            );
            System.out.println(
                "Tangent and secant are undefined at this angle."
            );

        } else {

            // Calculate the left side
            double leftSide2 =
                1 + Math.pow(Math.tan(radians), 2);

            // Calculate secant
            // sec θ = 1 / cos θ
            double secant = 1 / cosine;
            
             // Calculate the right side
            double rightSide2 =
                Math.pow(secant, 2);

            // Find the difference
            double difference2 =
                Math.abs(leftSide2 - rightSide2);

            System.out.println("Left side: " + leftSide2);
            System.out.println("Right side: " + rightSide2);

            // Check if the difference is within the tolerance
            if (difference2 <= tolerance) {

                System.out.println("Result: TRUE");

            } else {

                System.out.println("Result: FALSE");
                System.out.println("Difference: " + difference2);
                 }
        }
        
         // ==================================================
         // IDENTITY 3: sin(2θ) = 2sinθcosθ
         // ==================================================

        // Calculate the left side
        double leftSide3 =
            Math.sin(2 * radians);

        // Calculate the right side
        double rightSide3 =
            2 * Math.sin(radians) * Math.cos(radians);

        // Find the difference
        double difference3 =
            Math.abs(leftSide3 - rightSide3);

        System.out.println("\nIdentity 3:");
        System.out.println("sin(2θ) = 2sinθcosθ");

        System.out.println("Left side: " + leftSide3);
        System.out.println("Right side: " + rightSide3);
        
          // Check if the difference is within the tolerance
        if (difference3 <= tolerance) {

            System.out.println("Result: TRUE");

        } else {

            System.out.println("Result: FALSE");
            System.out.println("Difference: " + difference3);
        }
        
        
       
            //  Critical Thinking Questions:
            
            // 1. Why do we need a tolerance when comparing floating-point values?
            //  Answer: Because small rounding errors can make two values 
            //          slightly different.  
            
            // 2. Which identity might be most susceptible to floating-point 
            //    precision issues and why?
            //  Answer: Identities with division or many calculations 
            //          because they can create more rounding errors
            
            // 3. How could you extend this program to verify more complex 
            //    identities?
            //  Answer: Add more formulas and compare both sides using a 
            //          small tolerance.
                }
         
                }
                



