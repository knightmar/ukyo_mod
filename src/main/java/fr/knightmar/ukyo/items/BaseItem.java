package fr.knightmar.ukyo.items;

import fr.knightmar.ukyo.init.ModItems;
import net.minecraft.item.Item;

public class BaseItem extends Item{
    public BaseItem(String name) {
        setRegistryName(name).setUnlocalizedName(name);
        ModItems.INSTANCE.getItems().add(this);
    }
}
