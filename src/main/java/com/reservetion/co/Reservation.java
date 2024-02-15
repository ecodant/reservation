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
    
    private Reservation (LocalDate departureDate, short totalDays, String destination,
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
    
    //Gets
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
    //Inner Class
    public static class ReservationBuilder {
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
        public Reservation build() {
            return new Reservation(departureDate, totalDays, destination, accomadation, activities, diet, transportation);
        }
    }
}
