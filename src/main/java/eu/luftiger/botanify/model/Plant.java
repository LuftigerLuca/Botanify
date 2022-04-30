package eu.luftiger.botanify.model;

import javax.xml.stream.Location;
import java.util.UUID;

public class Plant {

    private final UUID id;
    private final PlantSample plantSample;
    private final UUID ownerUUID;
    private final Location location;

    private GrowthState growthState;
    private int humidity;
    private int nutrientContent;

    public Plant(UUID id, PlantSample plantSample, UUID ownerUUID, Location location, GrowthState growthState, int humidity, int nutrientContent){
        this.id = id;
        this.plantSample = plantSample;
        this.ownerUUID = ownerUUID;
        this.location = location;
        this.growthState = growthState;
        this.humidity = humidity;
        this.nutrientContent = nutrientContent;
    }

    public Plant(PlantSample plantSample, UUID ownerUUID, Location location, GrowthState growthState, int humidity, int nutrientContent){
        this.id = UUID.randomUUID();

        this.plantSample = plantSample;
        this.ownerUUID = ownerUUID;
        this.location = location;
        this.growthState = growthState;
        this.humidity = humidity;
        this.nutrientContent = nutrientContent;
    }

    public UUID getId() {
        return id;
    }

    public PlantSample getPlantSample() {
        return plantSample;
    }

    public UUID getOwnerUUID() {
        return ownerUUID;
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

    public void setNutrientContent(int nutrientContent) {
        this.nutrientContent = nutrientContent;
    }

    public int getNutrientContent() {
        return nutrientContent;
    }
}
