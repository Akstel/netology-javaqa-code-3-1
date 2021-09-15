public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int ticketPrice = 14_750; //руб.
        int bonusMilesAccrued  = service.calculate(ticketPrice);
        System.out.println("Вам добавлено " + bonusMilesAccrued + " бонусных миль");
    }
}