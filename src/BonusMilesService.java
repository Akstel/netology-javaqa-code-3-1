public class BonusMilesService {
    public int calculate(int ticketPrice) {
        int priceOneMile = 20;
        int bonusMiles;
        bonusMiles = ticketPrice / priceOneMile;
        return bonusMiles;
    }
}