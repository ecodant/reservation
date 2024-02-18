package com.reservetion.co;

import java.time.LocalDate;
import java.util.Collection;
import java.util.LinkedList;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //Datos de prueba
        Collection<Activities> activitiesList = new LinkedList<>();
        activitiesList.add(Activities.FISHING);
        activitiesList.add(Activities.RIVER_RAFTING);
        /*Creación del la reservación sin instancia el Builder, basado
         el código visto en clase y posteriormente compartido.*/
        Reservation reservation= Reservation.builder()
            .departureDate(LocalDate.of(2023,10, 21))
            .totalDays((short) 20)
            .destination("Cartagena")
            .accomadation(AccommodationType.HOTEL)
            .activities(activitiesList)
            .diets(Diets.ZERO_CALORIE)
            .transportation(TransportationType.AIRPLANE)
            .build();
        /*Prints para ver los datos ingresados. */
        System.out.println("Total Days: " + reservation.getTotalDays());
        System.out.println("The destination is: " + reservation.getDestination());
        System.out.println("The Activity are: " + reservation.getActivities());
        System.out.println("The date of out: " + reservation.getDepartureDate());
        System.out.println("The diet is: " + reservation.getDiet());
        System.out.println("FISRT: " + reservation);
        
        /*Creando otra reservación, pero esta vez solo con la fecha de
          salidad y el destino, además ya no se instancia el Builder*/

        Reservation reservation2 = Reservation.builder().departureDate(LocalDate.of(2024, 3, 20))
        .destination("El cabo").build();
        System.out.println("The destination is: " + reservation2.getDestination());
        System.out.println("The date of out: " + reservation2.getDepartureDate());
    }
}
