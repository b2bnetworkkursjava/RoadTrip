package pl.b2bnetwork.domain;

import java.util.Objects;

public class SectionOfRoad {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SectionOfRoad section = (SectionOfRoad) o;
        return underConstruction == section.underConstruction &&
                Double.compare(section.speedLimit, speedLimit) == 0 &&
                Double.compare(section.distance, distance) == 0 &&
                Objects.equals(name, section.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(underConstruction, name, speedLimit, distance);
    }

    private boolean underConstruction;
    private String name;
    private double speedLimit;
    private double distance;

    public boolean isUnderConstruction() {
        return underConstruction;
    }

    public void setUnderConstruction(boolean underConstruction) {
        this.underConstruction = underConstruction;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSpeedLimit() {
        return speedLimit;
    }

    public void setSpeedLimit(double speedLimit) {
        this.speedLimit = speedLimit;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }
}
