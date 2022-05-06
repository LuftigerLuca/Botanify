package eu.luftiger.botanify.model;

import org.bukkit.Material;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PlantSample {

    private final String name;
    private final List<Earning> earnings;
    private final List<Material> growingMedia;

    private final Map<GrowthState, Integer> growthStateTimeMap = new HashMap<>();

    public PlantSample(String name, List<Earning> earnings, List<Material> growingMedia){
        this.name = name;
        this.earnings = earnings;
        this.growingMedia = growingMedia;
    }

    public String getName() {
        return name;
    }

    public List<Earning> getEarnings() {
        return earnings;
    }

    public List<Material> getGrowingMedia() {
        return growingMedia;
    }

    public Map<GrowthState, Integer> getGrowthStateTimeMap() {
        return growthStateTimeMap;
    }
}
