package lesson3.additionalTask;

import java.time.LocalDate;
import java.time.Period;

public class Cars {
    private String nameCar;
    private float tankVolume;
    private float fuelConsumption;
    private LocalDate releaseTime;

    public Cars() {
    }

    public Cars(String nameCar, float tankVolume, float fuelConsumption, int day, int month, int year) {
        this.nameCar = nameCar;
        this.tankVolume = tankVolume;
        this.fuelConsumption = fuelConsumption;
        this.releaseTime = LocalDate.of(year, month, day);
    }

    public String getNameCar() {
        return nameCar;
    }

    public void setNameCar(String nameCar) {
        this.nameCar = nameCar;
    }

    public float getTankVolume() {
        return tankVolume;
    }

    public void setTankVolume(float tankVolume) {
        this.tankVolume = tankVolume;
    }

    public float getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(float fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public LocalDate getReleaseTime() {
        return releaseTime;
    }

    public void setReleaseTime(LocalDate releaseTime) {
        this.releaseTime = releaseTime;
    }

    public static void comparisonCarByYear(Cars carFirst, Cars carSecond) {
        if (carFirst.getReleaseTime().isBefore(carSecond.getReleaseTime())) {
            Period ageDiff = Period.between(carFirst.getReleaseTime(), carSecond.getReleaseTime());
            System.out.printf("%s старше на %d года(лет), %d месяца(месяцев) и %d дня(дней)\n",
                    carFirst.getNameCar(), ageDiff.getYears(), ageDiff.getMonths(), ageDiff.getDays());
        } else if (carSecond.getReleaseTime().isBefore(carFirst.getReleaseTime())) {
            Period diff = Period.between(carSecond.getReleaseTime(), carFirst.getReleaseTime());
            System.out.printf("%s старше на %d года(лет), %d месяца(месяцев) and %d дня(дней)\n",
                    carSecond.getNameCar(), diff.getYears(), diff.getMonths(), diff.getDays());
        } else {
            System.out.println("они выпущены в один день\n");
        }
    }

    public static void tripDistanceDetermination(Cars carFirst, Cars carSecond) {
        float mileageCarFirst = 100 * (carFirst.getTankVolume() / carFirst.getFuelConsumption());
        float mileageCarSecond = 100 * (carSecond.getTankVolume() / carSecond.getFuelConsumption());
        if (mileageCarFirst > mileageCarSecond) {
            System.out.printf("%s проедет больше на %.02f км.\n", carFirst.getNameCar(), (mileageCarFirst - mileageCarSecond));
        } else if (mileageCarFirst < mileageCarSecond) {
            System.out.printf("%s проедет больше на %.02f км.\n", carSecond.getNameCar(), (mileageCarSecond - mileageCarFirst));
        } else {
            System.out.println("Проедут одинаково\n");
        }
    }
}

