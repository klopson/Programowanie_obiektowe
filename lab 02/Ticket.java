class Ticket {
    Screening screening;
    int seatNumber;
    double price;

    public Ticket(Screening screening, int seatNumber, double price) {
        this.screening = screening;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    public void printTicket() {
        screening.showScreening();
        System.out.println("Miejsce nr: " + seatNumber + " | Cena: " + price + " PLN");
    }
}