package fr.knightmar.ukyo.items;

import net.minecraft.item.ItemAxe;

public class AxeTool extends ItemAxe {
    public AxeTool(String name, ToolMaterial material, float damage, float speed) {
        super(material, damage, speed);
        setUnlocalizedName(name);
        setRegistryName(name);
    }
}
