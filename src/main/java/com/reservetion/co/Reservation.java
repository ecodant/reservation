package com.reservetion.co;

import java.time.LocalDate;
import java.util.Collection;

public class Reservation {
    private final LocalDate departureDate;
    private final short totalDays;
    private final String destination;
    private final AccommodationType accomadation;
    private final Collection<Activities> activities;
    private final Diets diet;
    private final TransportationType transportation;
    
    /*  Constructor que deberia ser usando unicamente por el Builder, en este
        casi es indiferente validar si es null o no los parametros dado que
        estos se establecen con los sets en el Builder propiamente.*/
        
    Reservation (LocalDate departureDate, short totalDays, String destination,
     AccommodationType accomadation, Collection<Activities> activities, Diets diet, 
     TransportationType transportation){
        this.departureDate = departureDate;
        this.totalDays = totalDays;
        this.destination = destination;
        this.accomadation = accomadation;
        this.activities = activities;
        this.diet = diet;
        this.transportation = transportation;
    }

    public LocalDate getDepartureDate() {
        return departureDate;
    }

    public short getTotalDays() {
        return totalDays;
    }

    public String getDestination() {
        return destination;
    }

    public AccommodationType getAccomadation() {
        return accomadation;
    }

    public Collection<Activities> getActivities() {
        return activities;
    }

    public Diets getDiet() {
        return diet;
    }

    public TransportationType getTransportation() {
        return transportation;
    }
}
