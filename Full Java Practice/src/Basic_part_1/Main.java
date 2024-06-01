package Basic_part_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static String id, name;
    public static int pro_marks, data_marks, total;
    public static double average;
    public static String[] student_id = new String[0];
    public static String[] student_names = new String[0];
    public static int[][] student_marks = new int[0][2];
    public static int[] total_marks = new int[0];
    public static double[] avg_marks = new double[0];
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            try {
                System.out.println("--------------------------------------------------");
                System.out.println("WELCOME TO GDSE MARKS MANAGEMENT SYSTEM");
                System.out.println("--------------------------------------------------");

                System.out.print("[1] Add New Student");
                System.out.println("  [2] Add New Student With Marks");
                System.out.print("[3] Add Marks");
                System.out.println("  [4] Update Student Details");
                System.out.print("[5] Update Marks");
                System.out.println("  [6] Delete Student");
                System.out.print("[7] Print Student Details");
                System.out.println("  [8] Print Student Ranks");
                System.out.print("[9] Best in Programming Fundamentals ");
                System.out.println("[10] Best in Database Management System");

                System.out.println("Enter an option to continue >");

                int option = input.nextInt();
                input.nextLine();

                switch (option) {
                    case 1:
                        add_new_student();
                        break;
                    case 2:
                        add_new_student_with_marks();
                        break;
                    case 3:
                        add_marks();
                        break;
                    case 4:
                        update_student_details();
                        break;
                    case 5:
                        update_marks();
                        break;
                    case 6:
                        delete_student();
                        break;
                    case 7:
                        print_student_details();
                        break;
                    case 8:
                        print_student_rank();
                        break;
                    case 9:
                        best_pf_marks();
                        break;
                    case 10:
                        best_dbms_marks();
                        break;
                    case 0:
                        System.out.println("Exiting the program...");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid option. Please try again");
                }
            } catch (InputMismatchException e) {
                System.out.println("ERROR! Option must be a number");
                input.nextLine();
            }
        }
    }

    public static int search_array(String[] array, String value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }

    public static String[] resize_array(String[] array, String value) {
        String[] newArray = new String[array.length + 1];
        System.arraycopy(array, 0, newArray, 0, array.length);
        newArray[array.length] = value;
        return newArray;
    }

    public static int[][] resize_2d_array(int[][] array) {
        int[][] newArray = new int[array.length + 1][2];
        for (int i = 0; i < array.length; i++) {
            System.arraycopy(array[i], 0, newArray[i], 0, array[i].length);
        }
        newArray[array.length][0] = -1;
        newArray[array.length][1] = -1;
        return newArray;
    }

    public static int[] resize_array(int[] array, int value) {
        int[] newArray = new int[array.length + 1];
        System.arraycopy(array, 0, newArray, 0, array.length);
        newArray[array.length] = value;
        return newArray;
    }

    public static double[] resize_array(double[] array, double value) {
        double[] newArray = new double[array.length + 1];
        System.arraycopy(array, 0, newArray, 0, array.length);
        newArray[array.length] = value;
        return newArray;
    }

    public static void add_new_student() {
        while (true) {
            System.out.println("Enter Student ID:");
            id = input.nextLine();
            if (search_array(student_id, id) != -1) {
                System.out.println("Student ID already exists. Please try again.");
                continue;
            }
            student_id = resize_array(student_id, id);
            student_marks = resize_2d_array(student_marks);
            total_marks = resize_array(total_marks, 0);
            avg_marks = resize_array(avg_marks, 0.0);

            System.out.println("Enter Student Name:");
            name = input.nextLine();
            student_names = resize_array(student_names, name);

            System.out.println("Student ID: " + id);
            System.out.println("Student Name: " + name);
            System.out.println("Student has been added successfully");

            while (true) {
                System.out.println("Do you want to add a new student? If yes enter 'Y' or if no enter 'N'");
                char letter = input.nextLine().toUpperCase().charAt(0);
                if (letter == 'Y') {
                    break;
                } else if (letter == 'N') {
                    return;
                } else {
                    System.out.println("Invalid input. Please try again.");
                }
            }
        }
    }

    public static void add_new_student_with_marks() {
        while (true) {
            System.out.println("Enter Student ID:");
            id = input.nextLine();
            if (search_array(student_id, id) != -1) {
                System.out.println("Student ID already exists. Please try again.");
                continue;
            }
            student_id = resize_array(student_id, id);
            student_marks = resize_2d_array(student_marks);
            total_marks = resize_array(total_marks, 0);
            avg_marks = resize_array(avg_marks, 0.0);

            System.out.println("Enter Student Name:");
            name = input.nextLine();
            student_names = resize_array(student_names, name);

            while (true) {
                try {
                    System.out.println("Enter Programming Fundamental Marks:");
                    pro_marks = input.nextInt();
                    if (pro_marks < 0 || pro_marks > 100) {
                        System.out.println("Marks are out of range. Please enter marks between 0 and 100.");
                        continue;
                    }
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Marks must be a number.");
                    input.nextLine();
                }
            }
            while (true) {
                try {
                    System.out.println("Enter Database Management System Marks:");
                    data_marks = input.nextInt();
                    if (data_marks < 0 || data_marks > 100) {
                        System.out.println("Marks are out of range. Please enter marks between 0 and 100.");
                        continue;
                    }
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Marks must be a number.");
                    input.nextLine();
                }
            }
            input.nextLine();

            student_marks[student_id.length - 1][0] = pro_marks;
            student_marks[student_id.length - 1][1] = data_marks;

            total = pro_marks + data_marks;
            average = total / 2.0;
            total_marks[student_id.length - 1] = total;
            avg_marks[student_id.length - 1] = average;

            System.out.println("Student ID: " + id);
            System.out.println("Student Name: " + name);
            System.out.println("Programming Fundamental Marks: " + pro_marks);
            System.out.println("Database Management System Marks: " + data_marks);
            System.out.println("Total Marks: " + total);
            System.out.println("Average Marks: " + average);
            System.out.println("Student has been added successfully");

            while (true) {
                System.out.println("Do you want to add a new student? If yes enter 'Y' or if no enter 'N'");
                char letter = input.nextLine().toUpperCase().charAt(0);
                if (letter == 'Y') {
                    break;
                } else if (letter == 'N') {
                    return;
                } else {
                    System.out.println("Invalid input. Please try again.");
                }
            }
        }
    }

    public static void add_marks() {
        while (true) {
            System.out.println("Enter Student ID:");
            id = input.nextLine();
            int i = search_array(student_id, id);
            if (i == -1) {
                System.out.println("Invalid student ID.");
                continue;
            }
            if (student_marks[i][0] != -1 || student_marks[i][1] != -1) {
                System.out.println("Student ID: " + student_id[i]);
                System.out.println("Student Name: " + student_names[i]);
                System.out.println("This student's marks have already been added. Use [5] to update marks.");

                while (true) {
                    System.out.println("Do you want to add marks for another student? If yes enter 'Y' or if no enter 'N'");
                    char letter = input.nextLine().toUpperCase().charAt(0);
                    if (letter == 'Y') {
                        break;
                    } else if (letter == 'N') {
                        return;
                    } else {
                        System.out.println("Invalid input. Please try again.");
                    }
                }
                continue;
            }

            System.out.println("Student ID: " + student_id[i]);
            System.out.println("Student Name: " + student_names[i]);

            while (true) {
                try {
                    System.out.println("Enter Programming Fundamental Marks:");
                    pro_marks = input.nextInt();
                    if (pro_marks < 0 || pro_marks > 100) {
                        System.out.println("Marks are out of range. Please enter marks between 0 and 100.");
                        continue;
                    }
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Marks must be a number.");
                    input.nextLine();
                }
            }

            while (true) {
                try {
                    System.out.println("Enter Database Management System Marks:");
                    data_marks = input.nextInt();
                    if (data_marks < 0 || data_marks > 100) {
                        System.out.println("Marks are out of range. Please enter marks between 0 and 100.");
                        continue;
                    }
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Marks must be a number.");
                    input.nextLine();
                }
            }
            input.nextLine();

            student_marks[i][0] = pro_marks;
            student_marks[i][1] = data_marks;

            total = pro_marks + data_marks;
            average = total / 2.0;
            total_marks[i] = total;
            avg_marks[i] = average;

            System.out.println("Student ID: " + id);
            System.out.println("Student Name: " + student_names[i]);
            System.out.println("Programming Fundamental Marks: " + pro_marks);
            System.out.println("Database Management System Marks: " + data_marks);
            System.out.println("Total Marks: " + total);
            System.out.println("Average Marks: " + average);
            System.out.println("Marks have been added successfully");

            while (true) {
                System.out.println("Do you want to add marks for another student? If yes enter 'Y' or if no enter 'N'");
                char letter = input.nextLine().toUpperCase().charAt(0);
                if (letter == 'Y') {
                    break;
                } else if (letter == 'N') {
                    return;
                } else {
                    System.out.println("Invalid input. Please try again.");
                }
            }
        }
    }

    public static void update_student_details() {
        while (true) {
            System.out.println("Enter Student ID:");
            id = input.nextLine();
            int i = search_array(student_id, id);
            if (i == -1) {
                System.out.println("Invalid student ID.");
                while (true) {
                    System.out.println("Do you want to search again? If yes enter 'Y' or if no enter 'N'");
                    char letter = input.nextLine().toUpperCase().charAt(0);
                    if (letter == 'Y') {
                        break;
                    } else if (letter == 'N') {
                        return;
                    } else {
                        System.out.println("Invalid input. Please try again.");
                    }
                }
                continue;
            }

            System.out.println("Student ID: " + student_id[i]);
            System.out.println("Student Name: " + student_names[i]);

            System.out.println("Enter the new student name:");
            name = input.nextLine();
            student_names[i] = name;

            System.out.println("Student ID: " + student_id[i]);
            System.out.println("Student Name: " + student_names[i]);
            System.out.println("Student details have been updated successfully");

            while (true) {
                System.out.println("Do you want to update another student's details? If yes enter 'Y' or if no enter 'N'");
                char letter = input.nextLine().toUpperCase().charAt(0);
                if (letter == 'Y') {
                    break;
                } else if (letter == 'N') {
                    return;
                } else {
                    System.out.println("Invalid input. Please try again.");
                }
            }
        }
    }

    public static void update_marks() {
        while (true) {
            System.out.println("Enter Student ID:");
            id = input.nextLine();
            int i = search_array(student_id, id);
            if (i == -1) {
                System.out.println("Invalid student ID.");
                while (true) {
                    System.out.println("Do you want to search again? If yes enter 'Y' or if no enter 'N'");
                    char letter = input.nextLine().toUpperCase().charAt(0);
                    if (letter == 'Y') {
                        break;
                    } else if (letter == 'N') {
                        return;
                    } else {
                        System.out.println("Invalid input. Please try again.");
                    }
                }
                continue;
            }

            System.out.println("Student ID: " + student_id[i]);
            System.out.println("Student Name: " + student_names[i]);
            System.out.println("Programming Fundamental Marks: " + student_marks[i][0]);
            System.out.println("Database Management System Marks: " + student_marks[i][1]);

            while (true) {
                try {
                    System.out.println("Enter new Programming Fundamental Marks:");
                    pro_marks = input.nextInt();
                    if (pro_marks < 0 || pro_marks > 100) {
                        System.out.println("Marks are out of range. Please enter marks between 0 and 100.");
                        continue;
                    }
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Marks must be a number.");
                    input.nextLine();
                }
            }

            while (true) {
                try {
                    System.out.println("Enter new Database Management System Marks:");
                    data_marks = input.nextInt();
                    if (data_marks < 0 || data_marks > 100) {
                        System.out.println("Marks are out of range. Please enter marks between 0 and 100.");
                        continue;
                    }
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Marks must be a number.");
                    input.nextLine();
                }
            }
            input.nextLine();

            student_marks[i][0] = pro_marks;
            student_marks[i][1] = data_marks;

            total = pro_marks + data_marks;
            average = total / 2.0;
            total_marks[i] = total;
            avg_marks[i] = average;

            System.out.println("Student ID: " + id);
            System.out.println("Student Name: " + student_names[i]);
            System.out.println("Programming Fundamental Marks: " + pro_marks);
            System.out.println("Database Management System Marks: " + data_marks);
            System.out.println("Total Marks: " + total);
            System.out.println("Average Marks: " + average);
            System.out.println("Marks have been updated successfully");

            while (true) {
                System.out.println("Do you want to update marks for another student? If yes enter 'Y' or if no enter 'N'");
                char letter = input.nextLine().toUpperCase().charAt(0);
                if (letter == 'Y') {
                    break;
                } else if (letter == 'N') {
                    return;
                } else {
                    System.out.println("Invalid input. Please try again.");
                }
            }
        }
    }

    public static void delete_student() {
        while (true) {
            System.out.println("Enter Student ID:");
            id = input.nextLine();
            int i = search_array(student_id, id);
            if (i == -1) {
                System.out.println("Invalid student ID.");
                while (true) {
                    System.out.println("Do you want to search again? If yes enter 'Y' or if no enter 'N'");
                    char letter = input.nextLine().toUpperCase().charAt(0);
                    if (letter == 'Y') {
                        break;
                    } else if (letter == 'N') {
                        return;
                    } else {
                        System.out.println("Invalid input. Please try again.");
                    }
                }
                continue;
            }

            System.out.println("Student ID: " + student_id[i]);
            System.out.println("Student Name: " + student_names[i]);
            System.out.println("Are you sure you want to delete this student? If yes enter 'Y' or if no enter 'N'");
            char letter = input.nextLine().toUpperCase().charAt(0);
            if (letter == 'N') {
                return;
            } else if (letter == 'Y') {
                student_id = remove_from_array(student_id, i);
                student_names = remove_from_array(student_names, i);
                student_marks = remove_from_2d_array(student_marks, i);
                total_marks = remove_from_array(total_marks, i);
                avg_marks = remove_from_array(avg_marks, i);

                System.out.println("Student has been deleted successfully");

                while (true) {
                    System.out.println("Do you want to delete another student? If yes enter 'Y' or if no enter 'N'");
                    letter = input.nextLine().toUpperCase().charAt(0);
                    if (letter == 'Y') {
                        break;
                    } else if (letter == 'N') {
                        return;
                    } else {
                        System.out.println("Invalid input. Please try again.");
                    }
                }
            } else {
                System.out.println("Invalid input. Please try again.");
            }
        }
    }

    public static String[] remove_from_array(String[] array, int index) {
        if (array == null || index < 0 || index >= array.length) {
            return array;
        }
        String[] newArray = new String[array.length - 1];
        System.arraycopy(array, 0, newArray, 0, index);
        System.arraycopy(array, index + 1, newArray, index, array.length - index - 1);
        return newArray;
    }

    public static int[] remove_from_array(int[] array, int index) {
        if (array == null || index < 0 || index >= array.length) {
            return array;
        }
        int[] newArray = new int[array.length - 1];
        System.arraycopy(array, 0, newArray, 0, index);
        System.arraycopy(array, index + 1, newArray, index, array.length - index - 1);
        return newArray;
    }

    public static double[] remove_from_array(double[] array, int index) {
        if (array == null || index < 0 || index >= array.length) {
            return array;
        }
        double[] newArray = new double[array.length - 1];
        System.arraycopy(array, 0, newArray, 0, index);
        System.arraycopy(array, index + 1, newArray, index, array.length - index - 1);
        return newArray;
    }

    public static int[][] remove_from_2d_array(int[][] array, int index) {
        if (array == null || index < 0 || index >= array.length) {
            return array;
        }
        int[][] newArray = new int[array.length - 1][];
        System.arraycopy(array, 0, newArray, 0, index);
        System.arraycopy(array, index + 1, newArray, index, array.length - index - 1);
        return newArray;
    }

    public static void print_student_details() {
        if (student_id.length == 0) {
            System.out.println("There are no students available.");
        } else {
            boolean continueChecking = true;
            while (continueChecking) {
                System.out.println("Enter Student ID:");
                String input_id = input.nextLine();

                int index = search_array(student_id, input_id);
                if (index != -1) {
                    int rank = getRank(index);
                    System.out.println("Student ID: " + student_id[index]);
                    System.out.println("Student Name: " + student_names[index]);
                    System.out.println("Programming Fundamental Marks: " + student_marks[index][0]);
                    System.out.println("Database Management System Marks: " + student_marks[index][1]);
                    System.out.println("Total Marks: " + total_marks[index]);
                    System.out.println("Average Marks: " + avg_marks[index]);
                    System.out.println("Rank: " + rank + getRankSuffix(rank));
                } else {
                    System.out.println("Student ID not found.");
                }

                System.out.println("Do you want to check another student's details? (y/n)");
                String response = input.nextLine();
                if (!response.equalsIgnoreCase("y")) {
                    continueChecking = false;
                }
            }
        }
    }

    public static void print_student_rank() {
        if (student_id.length == 0) {
            System.out.println("There are no students available.");
        } else {
            int[] sorted_indices = sort_indices_by_total_marks();
            for (int i = 0; i < sorted_indices.length; i++) {
                int index = sorted_indices[i];
                System.out.println("Rank " + (i + 1) + ":");
                System.out.println("Student ID: " + student_id[index]);
                System.out.println("Student Name: " + student_names[index]);
                System.out.println("Total Marks: " + total_marks[index]);
                System.out.println("Average Marks: " + avg_marks[index]);
            }
        }
    }

    public static int[] sort_indices_by_total_marks() {
        int n = total_marks.length;
        int[] indices = new int[n];
        for (int i = 0; i < n; i++) {
            indices[i] = i;
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (total_marks[indices[j]] < total_marks[indices[j + 1]]) {
                    int temp = indices[j];
                    indices[j] = indices[j + 1];
                    indices[j + 1] = temp;
                }
            }
        }
        return indices;
    }

    public static void best_pf_marks() {
        if (student_id.length == 0) {
            System.out.println("There are no students available.");
        } else {
            int max_marks = -1;
            int index = -1;
            for (int i = 0; i < student_marks.length; i++) {
                if (student_marks[i][0] > max_marks) {
                    max_marks = student_marks[i][0];
                    index = i;
                }
            }
            if (index != -1) {
                System.out.println("Student with the highest Programming Fundamental Marks:");
                System.out.println("Student ID: " + student_id[index]);
                System.out.println("Student Name: " + student_names[index]);
                System.out.println("Programming Fundamental Marks: " + student_marks[index][0]);
            }
        }
    }

    public static void best_dbms_marks() {
        if (student_id.length == 0) {
            System.out.println("There are no students available.");
        } else {
            int max_marks = -1;
            int index = -1;
            for (int i = 0; i < student_marks.length; i++) {
                if (student_marks[i][1] > max_marks) {
                    max_marks = student_marks[i][1];
                    index = i;
                }
            }
            if (index != -1) {
                System.out.println("Student with the highest Database Management System Marks:");
                System.out.println("Student ID: " + student_id[index]);
                System.out.println("Student Name: " + student_names[index]);
                System.out.println("Database Management System Marks: " + student_marks[index][1]);
            }
        }
    }

    private static int getRank(int index) {
        int[] sortedTotalMarks = new int[total_marks.length];
        for (int i = 0; i < total_marks.length; i++) {
            sortedTotalMarks[i] = total_marks[i];
        }

        for (int i = 0; i < sortedTotalMarks.length - 1; i++) {
            for (int j = 0; j < sortedTotalMarks.length - i - 1; j++) {
                if (sortedTotalMarks[j] < sortedTotalMarks[j + 1]) {
                    int temp = sortedTotalMarks[j];
                    sortedTotalMarks[j] = sortedTotalMarks[j + 1];
                    sortedTotalMarks[j + 1] = temp;
                }
            }
        }
        int rank = 1;
        for (int i = 0; i < sortedTotalMarks.length; i++) {
            if (sortedTotalMarks[i] == total_marks[index]) {
                break;
            }
            rank++;
        }
        return rank;
    }


    private static String getRankSuffix(int rank) {
        switch (rank) {
            case 1: return "(First)";
            case 2: return "(Second)";
            case 3: return "(Third)";
            default: return "(" + rank + "th)";
        }
    }
}
