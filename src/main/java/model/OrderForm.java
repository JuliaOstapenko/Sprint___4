package model;

public class OrderForm {
    private String name;
    private String surname;
    private String address;
    private String metroStation;
    private String telephoneNumber;
    private String orderDate;
    private String rentalPeriod;
    private String scooterColour;
    private String orderComment;

    public OrderForm(String name, String surname, String address,
                     String metroStation, String telephoneNumber, String orderDate,
                     String rentalPeriod, String scooterColour, String orderComment) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.metroStation = metroStation;
        this.telephoneNumber = telephoneNumber;
        this.orderDate = orderDate;
        this.rentalPeriod = rentalPeriod;
        this.scooterColour = scooterColour;
        this.orderComment = orderComment;
    }


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAddress() {
        return address;
    }

    public String getMetroStation() {
        return metroStation;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public String getRentalPeriod() {
        return rentalPeriod;
    }

    public String getScooterColour() {
        return scooterColour;
    }

    public String getOrderComment() {
        return orderComment;
    }
}
