package fr.knightmar.ukyo.items;

import fr.knightmar.ukyo.init.ModItems;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;

public class SwordTool extends ItemSword {
    public SwordTool(String name ,ToolMaterial material) {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
    }
}
