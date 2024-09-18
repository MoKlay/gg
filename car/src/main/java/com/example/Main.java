package com.example;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import com.example.dto.carModelDTO;
import com.example.servise.readFileCar;

public class Main {
    public static void clearConsole() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            }
            else {
                System.out.print("\033\143");
            }
        } catch (IOException | InterruptedException ex) {}
    }   
    public static void main(String[] args) throws FileNotFoundException{
        if (args.length == 0) {
            System.out.println("No parameters");
            return;
        }
        Scanner scan = new Scanner(System.in);
        readFileCar read = new readFileCar(args[0]);
        ArrayList<carModelDTO> list = read.generateListCar();
        if (!list.isEmpty()) {
            for (carModelDTO el : list) {
                clearConsole();
                el.Show();
                scan.nextLine();
            }
        }
        read.close();
        scan.close();
    }
}