package com.reservetion.co;

import java.time.LocalDate;

import java.util.Collection;

public class ReservationBuilder {
    /*Esta clase contiene los mismo atributos de la clase "Reservation", sin embargo
      esta contiene los setters para cada atributo de "Reservation"
    */
    private LocalDate departureDate;
    private short totalDays;
    private String destination;
    private AccommodationType accomadation;
    private Collection<Activities> activities;
    private Diets diet;
    private TransportationType transportation;
    
    public ReservationBuilder departureDate(LocalDate departureDate) {
        this.departureDate = departureDate;
        return this;
    }
    public ReservationBuilder totalDays(short totalDays) {
        this.totalDays = totalDays;
        return this;
    }
    public ReservationBuilder destination(String destination) {
        this.destination = destination;
        return this;
    }
    public ReservationBuilder accomadation(AccommodationType accomadation) {
        this.accomadation = accomadation;
        return this;
    }
    public ReservationBuilder activities(Collection<Activities> activities) {
        this.activities = activities;
        return this;
    }
    public ReservationBuilder diets(Diets diet) {
        this.diet = diet;
        return this;
    }
    public ReservationBuilder transportation(TransportationType transportation) {
        this.transportation = transportation;
        return this;
    }
    /* Este método debería ser el unico en usar el constructor de "Reservation" para crear el objeto del mismo tipo
     * según los valores que se tengan para cada atributo, por lo que me debería proporcionar el objeto de la clase
     * "Reservation" bajo los parametros que se quieran brindar.
    */
    public Reservation build() {
        return new Reservation(departureDate, totalDays, destination, accomadation, activities, diet, transportation);
    }
    
}