package edu.henrique.cursoNelioParte2.cursoNelioModulo24.model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
    private Integer roomNumber;
    private Date checkIn;
    private Date checkOut;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    //Simple constructor
    public Reservation(){
    }

    //Constructor
    public Reservation(Integer roomNumber, Date checkIn, Date checkOut) {
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }


    //Getters and Setters
    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckIn() {
        return checkIn;
    }


    public Date getCheckOut() {
        return checkOut;
    }


    public long duration(){
     long diff = checkOut.getTime() - checkIn.getTime();
       return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }

    public String updateDates(Date checkIn, Date checkOut){
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        Date now = new Date();
        if (checkIn.before(now) || checkOut.before(now)) {
            return "Reservation dates must be future dates";
        }
        if (!checkOut.after(checkIn)) {
            return "Check-out date must be after check-in date";
        }
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        return null + "Verificado"; // Se retornar alguma String, deu erro, se retornar null, é pq passou plo check
    }

    @Override
    public String toString(){
        return "Room" + roomNumber + ", check-in: " + sdf.format(checkIn) + ", check-Out: " + sdf.format(checkOut) + ", " + duration() + " nights";
    }

}
