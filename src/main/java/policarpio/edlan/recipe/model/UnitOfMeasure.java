package policarpio.edlan.recipe.model;

import javax.persistence.Entity;

@Entity
public class UnitOfMeasure {
    public String unit;

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}
