package aula04.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {

    private Integer roomNumber;
    private Date checkIn;
    private Date checkOut;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Reservation(Integer roomNumber, Date checkIn, Date checkOut) {

        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public static SimpleDateFormat getSdf() {
        return sdf;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setCheckIn(Date checkIn) {
        this.checkIn = checkIn;
    }

    public void setCheckOut(Date checkOut) {
        this.checkOut = checkOut;
    }

    //Métodos

    public long duration() {
        long diff = checkOut.getTime() - checkIn.getTime(); //getTime é um método nativo que pega a Data e transforma em milisegundos
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS); //terá um retorno em dias
    }

    public void updateDates(Date checkIn, Date checkOut) throws IllegalAccessException {
        Date now = new Date(); //Data presente

        //controle de excecao
        if (checkIn.before(now) || checkOut.before(now)) {
//            return "Reservation dates for update must be future dates";
            throw new IllegalAccessException ("Reservation dates for update must be future dates");

        }

        if (!checkOut.after(checkIn)) {
//            return "Check-out date must be after check-in date";
            throw new IllegalAccessException("Check-out date must be after check-in date");
        }

        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

//    public String DisplayReservation(){
//        return "Room: "
//                + roomNumber
//                + ", check-in: "
//                + sdf.format(checkIn)
//                + ", check-out: "
//                + sdf.format(checkOut)
//                + ","
//                + duration()
//                + "nights: ";
//    }

    @Override
    public String toString(){
        return "Room: "
                + roomNumber
                + ", check-in: "
                + sdf.format(checkIn)
                + ", check-out: "
                + sdf.format(checkOut)
                + ","
                + duration()
                + "nights: ";
    }

}
