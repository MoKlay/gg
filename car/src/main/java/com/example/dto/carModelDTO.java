package com.example.dto;

public class carModelDTO {
    private String BRAND;
    private String MODEL;
    private String COUNTRY_ORIGIN;
    private String COUNTRY_CODE;

    public carModelDTO(String[] Car) {
        this.BRAND = Car[0];
        this.MODEL = Car[1];
        this.COUNTRY_ORIGIN = Car[2];
        this.COUNTRY_CODE = Car[3];
    }
    public void Show() {
        System.out.println("\n---------------------");
        System.out.println("Brand:          " + this.BRAND);
        System.out.println("Model:          " + this.MODEL);
        System.out.println("Country Origin: " + this.COUNTRY_ORIGIN);
        System.out.println("Country Code:   " + this.COUNTRY_CODE);
        System.out.println("---------------------\n");
    }
}
