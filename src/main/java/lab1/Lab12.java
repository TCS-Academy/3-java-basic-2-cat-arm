package lab1;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Scanner;
import java.io.File;

public class Lab12 {
    
    // โจทย์ทำตาม: ใช้ FileWriter เพื่อสร้างไฟล์ชื่อ data.txt และเขียนข้อความลงไป
    // ให้สร้าง method ที่เขียนข้อความ "Hello, File I/O!" ลงในไฟล์ data.txt
    public static void writeToDataFile() throws IOException {
        // TODO: ใช้ FileWriter เพื่อเขียนข้อความ "Hello, File I/O!" ลงในไฟล์ data.txt
    }
    
    // โจทย์ทำตาม: ใช้ Scanner เพื่ออ่านข้อความจากไฟล์ data.txt และแสดงผลออกทางหน้าจอ
    // ให้สร้าง method ที่อ่านเนื้อหาจากไฟล์ data.txt และคืนค่าเป็น String
    public static String readFromDataFile() throws IOException {
        String filename2 = "data.txt";
        // TODO: ใช้ Scanner เพื่ออ่านข้อความจากไฟล์ data.txt
        // TODO: return เนื้อหาที่อ่านได้
        try (FileWriter writer2 = new FileWriter(filename2)) {
            writer2.write("Hello, Life");
            writer2.close();
            System.out.println("Successfully wrote to file: " + filename2);
        } catch (IOException e) {
            System.err.println("An error occurred while writing.");
            e.printStackTrace();
        }
        try (Scanner scanner2 = new Scanner(new File(filename2))) {
            System.out.println("Reading from file:");
            while (scanner2.hasNextLine()) {
                System.out.println(scanner2.nextLine());
            }
        } catch (IOException e) {
            System.err.println("An error occurred while reading.");
            e.printStackTrace();
        }
        return "";
    }
    
    // โจทย์ทำเอง: เขียนโปรแกรมที่เขียนข้อมูลลงในไฟล์ชื่อ log.txt
    // ให้สร้าง method ที่เขียน "Application started at [เวลาปัจจุบัน]" ลงในไฟล์ log.txt
    public static void writeLogFile() throws IOException {
        // TODO: ใช้ FileWriter เพื่อเขียนข้อความ "Application started at " + เวลาปัจจุบัน ลงในไฟล์ log.txt
        // คำแนะนำ: ใช้ LocalDateTime.now() เพื่อได้เวลาปัจจุบัน
        String filename3 = "log.txt";
        try (FileWriter writer3 = new FileWriter(filename3)) {
            LocalDateTime now = LocalDateTime.now() ;
            writer3.write("Application started at " + now + "\n");
            writer3.write("This is the second line.\n");
            System.out.println("Successfully wrote to file: " + filename3);
        } catch (IOException e) {
            System.err.println("An error occurred while writing");
            e.printStackTrace();
        }
    }
    
    // โจทย์ทำเอง: อ่านเนื้อหาจากไฟล์ log.txt แล้วแสดงผล
    // ให้สร้าง method ที่อ่านเนื้อหาจากไฟล์ log.txt และคืนค่าเป็น String
    public static String readLogFile() throws IOException {
        // TODO: ใช้ Scanner เพื่ออ่านข้อความจากไฟล์ log.txt
        // TODO: return เนื้อหาที่อ่านได้
        String filename3 = "log.txt";
        try (Scanner scanner3 = new Scanner(new File (filename3))) {
            System.out.println("Reading from file:");
            while (scanner3.hasNextLine()) {
                System.out.println(scanner3.nextLine());
            }
        } catch (IOException e) {
            System.err.println("An error occurred while reading");
            e.printStackTrace();
        }
        return "";
    }
    
    // Optional: เขียนโปรแกรมที่อ่านไฟล์ที่มีตัวเลขในแต่ละบรรทัด แล้วคำนวณหาผลรวมของตัวเลขเหล่านั้น
    // ให้สร้าง method ที่สร้างไฟล์ numbers.txt ที่มีตัวเลข 1, 2, 3, 4, 5 แต่ละบรรทัด
    public static void writeNumbersFile() throws IOException {
        // TODO: ใช้ FileWriter เพื่อเขียนตัวเลข 1, 2, 3, 4, 5 แต่ละบรรทัดลงในไฟล์ numbers.txt
        String filename4 = "numbers.txt";
        try (FileWriter writer3 = new FileWriter(filename4)) {
            writer3.write("1\n");
            writer3.write("2\n");
            writer3.write("3\n");
            writer3.write("4\n");
            writer3.write("5\n");
            System.out.println("Successfully wrote to file: " + filename4);
        } catch (IOException e) {
            System.err.println("An error occurred while writing");
            e.printStackTrace();
        }
    }
    
    // Optional: อ่านไฟล์ numbers.txt และคำนวณผลรวม
    // ให้สร้าง method ที่อ่านตัวเลขจากไฟล์ numbers.txt และคืนค่าผลรวม (ควรเป็น 15)
    public static int calculateSumFromFile() throws IOException {
        // TODO: ใช้ Scanner เพื่ออ่านตัวเลขจากไฟล์ numbers.txt
        // TODO: คำนวณผลรวมของตัวเลขทั้งหมด
        // TODO: return ผลรวม (ควรเป็น 15)
        String filename4 = "numbers.txt";
        int result = 0;
        try (Scanner scanner4 = new Scanner(new File (filename4))) {
            System.out.println("Reading from file:");
            while (scanner4.hasNextLine()) {
                String line = scanner4.nextLine();
                result += Integer.parseInt(line.trim());
        } catch (IOException e) {
            System.err.println("An error occurred while reading");
            e.printStackTrace();
        }
        return result;
    }
    
    // Helper method สำหรับตรวจสอบว่าไฟล์มีอยู่หรือไม่
    public static boolean fileExists(String filename) {
        File file = new File(filename);
        return file.exists();
    }
    
    // Helper method สำหรับลบไฟล์ (สำหรับทำความสะอาดหลังจากทดสอบ)
    public static boolean deleteFile(String filename) {
        File file = new File(filename);
        return file.delete();
    }
    
    public static void main(String[] args) {
        System.out.println("Lab12: File I/O Operations");
        
        try {
            // ทดสอบการเขียนและอ่านไฟล์ data.txt
            System.out.println("\n=== Testing data.txt ===");
            writeToDataFile();
            System.out.println("Data written to data.txt");
            
            String dataContent = readFromDataFile();
            System.out.println("Content from data.txt: " + dataContent);
            
            // ทดสอบการเขียนและอ่านไฟล์ log.txt
            System.out.println("\n=== Testing log.txt ===");
            writeLogFile();
            System.out.println("Log written to log.txt");
            
            String logContent = readLogFile();
            System.out.println("Content from log.txt: " + logContent);
            
            // ทดสอบการคำนวณผลรวมจากไฟล์
            System.out.println("\n=== Testing numbers.txt ===");
            writeNumbersFile();
            System.out.println("Numbers written to numbers.txt");
            
            int sum = calculateSumFromFile();
            System.out.println("Sum of numbers from file: " + sum);
            
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
