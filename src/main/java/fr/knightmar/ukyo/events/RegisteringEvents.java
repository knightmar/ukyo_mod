package fr.knightmar.ukyo.events;

import fr.knightmar.ukyo.init.ModItems;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class RegisteringEvents {

    @SubscribeEvent
    public void registerItems(RegistryEvent.Register<Item> event){
        ModItems.INSTANCE.init();
        event.getRegistry().registerAll(ModItems.INSTANCE.getItems().toArray(new Item[0]));
    }
}
