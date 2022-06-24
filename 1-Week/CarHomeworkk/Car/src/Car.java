import java.awt.Color;
import java.time.LocalDate;


public final class Car {
    private Model  model;
    private Integer year;
    private Integer capacity;
    private LocalDate productionDate;
    private Integer km;
    private Color color;
    public Car(Model model, Integer year, Integer capacity, LocalDate productionDate, Integer km, Color color) {
        super();
        this.model = model;
        this.year = year;
        this.capacity = capacity;
        this.productionDate = productionDate;
        this.km = km;
        this.color = color;
    }
    public Model getModel() {
        return model;
    }

    public Integer getYear() {
        return year;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public LocalDate getProductionDate() {
        return productionDate;
    }

    public Integer getKm() {
        return km;
    }

    public Color getColor() {
        return color;
    }




}
