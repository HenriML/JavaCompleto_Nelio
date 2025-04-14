package edu.henrique.cursoNelioParte2.cursoNelioModulo25.model.entities;

import edu.henrique.cursoNelioParte2.cursoNelioModulo25.model.exceptions.DomainException;

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
    public Reservation(Integer roomNumber, Date checkIn, Date checkOut) throws DomainException {
        if (!checkOut.after(checkIn)) {
            throw new DomainException(" Check-out date must be after check-in date");
        }
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

    public void updateDates(Date checkIn, Date checkOut) throws DomainException{
        Date now = new Date();
        if (checkIn.before(now) || checkOut.before(now)) {
            throw new DomainException(" Reservation dates must be future dates"); //Instanciando uma exception para o catch
        }
        if (!checkOut.after(checkIn)) {
            throw new DomainException(" Check-out date must be after check-in date");
        }
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        //return null + "Verificado"; -- Se retornar alguma String, deu erro, se retornar null, é pq passou plo check
    }

    @Override
    public String toString(){
        return "Room" + roomNumber + ", check-in: " + sdf.format(checkIn) + ", check-Out: " + sdf.format(checkOut) + ", " + duration() + " nights";
    }

}
