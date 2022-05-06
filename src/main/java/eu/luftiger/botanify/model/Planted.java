package eu.luftiger.botanify.model;

import javax.xml.stream.Location;
import java.util.UUID;

public class Planted {

    private final UUID id;
    private final PlantSample plantSample;
    private final UUID owner;
    private final Location location;

    private GrowthState growthState;
    private int humidity;
    private int nutrient;

    public Planted(UUID id, PlantSample plantSample, UUID owner, Location location){
        this.id = id;
        this.plantSample = plantSample;
        this.owner = owner;
        this.location = location;
    }

    public UUID getId() {
        return id;
    }

    public PlantSample getPlantSample() {
        return plantSample;
    }

    public UUID getOwner() {
        return owner;
    }

    public Location getLocation() {
        return location;
    }

    public void setGrowthState(GrowthState growthState) {
        this.growthState = growthState;
    }

    public GrowthState getGrowthState() {
        return growthState;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setNutrient(int nutrient) {
        this.nutrient = nutrient;
    }

    public int getNutrient() {
        return nutrient;
    }
}
