package com.example.eslamwael74.yourhealth.Model;

/**
 * Created by Eslam Wael on 10/14/2017.
 */

public class HealthHistory {

    String disease;
    String medicine;
    String doctor;
    String date;

    public HealthHistory(String disease, String medicine, String doctor, String date) {
        this.disease = disease;
        this.medicine = medicine;
        this.doctor = doctor;
        this.date = date;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public String getMedicine() {
        return medicine;
    }

    public void setMedicine(String medicine) {
        this.medicine = medicine;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
