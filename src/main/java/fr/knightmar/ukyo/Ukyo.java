package fr.knightmar.ukyo;

import fr.knightmar.ukyo.events.RegisteringEvents;
import fr.knightmar.ukyo.proxy.CommonProxy;
import fr.knightmar.ukyo.utils.References;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = References.MODID, name = References.NAME, version = References.VERSION)
public class Ukyo {

    @Mod.Instance(References.MODID)
    public static Ukyo instance;

    @SidedProxy(clientSide = References.CP, serverSide = References.SP)
    public static CommonProxy proxy;

    public Ukyo() {
        MinecraftForge.EVENT_BUS.register(new RegisteringEvents());
    }

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit();
    }
}
