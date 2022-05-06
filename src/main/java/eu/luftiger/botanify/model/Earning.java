package eu.luftiger.botanify.model;

import org.bukkit.inventory.ItemStack;

import java.util.HashMap;
import java.util.Map;

public class Earning {

    private final String name;
    private final Map<ItemStack, Integer> itemMap = new HashMap<>();

    public Earning(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Map<ItemStack, Integer> getItemMap() {
        return itemMap;
    }

    //TODO: Metohde implementieren, welche eine ItemStack mit einer gewissen Wahrscheinlichkeite zurückgibt
}
