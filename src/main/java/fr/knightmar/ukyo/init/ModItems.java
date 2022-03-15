package fr.knightmar.ukyo.init;

import com.google.common.collect.Lists;
import fr.knightmar.ukyo.Ukyo;
import fr.knightmar.ukyo.items.AxeTool;
import fr.knightmar.ukyo.items.BaseItem;
import fr.knightmar.ukyo.items.SwordTool;
import fr.knightmar.ukyo.items.swords.Excalibur;
import fr.knightmar.ukyo.utils.ItemsTab;
import fr.knightmar.ukyo.utils.References;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
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

    public static Item dark_repulser;
    public static Item excalibur;
    public static Item elucidator;
    public static Item rapiere;
    public static Item night_sky;
    public static Item chakram;
    public static Item hache_en_os;


    private List<Item> items;

    public void init() {
        items = Lists.newArrayList();
        items = registerItems();
    }

    public List<Item> registerItems() {
        items = Lists.newArrayList();
        dark_repulser = new SwordTool("dark_repulser", Item.ToolMaterial.DIAMOND).setCreativeTab(Ukyo.ItemsTab);
        excalibur = new Excalibur("excalibur", Item.ToolMaterial.DIAMOND).setCreativeTab(Ukyo.ItemsTab);
        elucidator = new SwordTool("elucidator", Item.ToolMaterial.DIAMOND).setCreativeTab(Ukyo.ItemsTab);
        rapiere = new SwordTool("rapiere", Item.ToolMaterial.DIAMOND).setCreativeTab(Ukyo.ItemsTab);
        night_sky = new SwordTool("night_sky", Item.ToolMaterial.DIAMOND).setCreativeTab(Ukyo.ItemsTab);
        chakram = new SwordTool("chakram", Item.ToolMaterial.DIAMOND).setCreativeTab(Ukyo.ItemsTab);
        hache_en_os = new AxeTool("hache_en_os", Item.ToolMaterial.DIAMOND,7F,-3.2F).setCreativeTab(Ukyo.ItemsTab);

        items.add(dark_repulser);
        items.add(excalibur);
        items.add(elucidator);
        items.add(rapiere);
        items.add(night_sky);
        items.add(chakram);
        items.add(hache_en_os);
        return items;
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
