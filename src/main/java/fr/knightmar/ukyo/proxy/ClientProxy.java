package fr.knightmar.ukyo.proxy;

import fr.knightmar.ukyo.init.ModItems;
import net.minecraftforge.common.MinecraftForge;

public class ClientProxy extends CommonProxy{
    @Override
    public void preInit() {
        super.preInit();

        MinecraftForge.EVENT_BUS.register(ModItems.INSTANCE);
    }

    @Override
    public void init() {
        super.init();
    }

    @Override
    public void postInit() {
        super.postInit();
    }
}
