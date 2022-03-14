package fr.knightmar.ukyo.utils;

import fr.knightmar.ukyo.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class ItemsTab extends CreativeTabs {

    public ItemsTab(String label){
        super("itemstab");
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ModItems.INSTANCE.getItems().get(0));
    }
}
