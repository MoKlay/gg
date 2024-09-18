package com.example.servise;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import com.example.dto.carModelDTO;

public class readFileCar {
    private String path;
    private File file;
    private Scanner scan;

    public readFileCar(String path) throws FileNotFoundException {
        this.path = path;
        file = new File(path);
        scan = new Scanner(file, "UTF-8");
    }

    public ArrayList<carModelDTO> generateListCar() {
        ArrayList<carModelDTO> listCar = new ArrayList();
        String col = scan.nextLine();
        if (!col.equals("BRAND;MODEL;COUNTRY_ORIGIN;COUNTRY_CODE")) return listCar;

        while (scan.hasNextLine()) {
            String car = scan.nextLine();
            listCar.add(new carModelDTO(car.split(";")));
        }
        return listCar;
    }
    public void close() {
        scan.close();
    }


}
