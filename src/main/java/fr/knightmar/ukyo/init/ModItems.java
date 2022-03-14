package fr.knightmar.ukyo.init;

import com.google.common.collect.Lists;
import fr.knightmar.ukyo.items.BaseItem;
import fr.knightmar.ukyo.items.SwordTool;
import fr.knightmar.ukyo.utils.References;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.List;

@Mod.EventBusSubscriber(modid = References.MODID)
public class ModItems {

    public static final ModItems INSTANCE = new ModItems();

    public static Item diamond_stick;
    public static Item dark_repulser;

    private List<Item> items;

    public void init() {
        items = Lists.newArrayList();
        diamond_stick = new BaseItem("diamond_stick");
        dark_repulser = new SwordTool("dark_repulser", Item.ToolMaterial.DIAMOND);
        items.add(dark_repulser);
        System.out.println("itemsArray : "+items);

    }

    @SubscribeEvent
    public void registerModels(ModelRegistryEvent event) {
        for (Item item : items) {
            registerModel(item);
        }
    }

    private void registerModel(Item item) {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(new ResourceLocation(References.MODID, item.getUnlocalizedName().substring(5)), "inventory"));
    }


    public List<Item> getItems() {
        return items;
    }
}