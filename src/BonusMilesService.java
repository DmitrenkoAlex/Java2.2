public class BonusMilesService {
    public long calculate(int cost) {
        int bonus = 20; // количество рублей за одну бонусную милю
        int bonusMiles = cost / bonus; // расчет бонусных миль.Дробные не начисляются

        return bonusMiles;
    }
}