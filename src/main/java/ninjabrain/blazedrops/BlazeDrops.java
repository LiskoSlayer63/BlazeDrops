package ninjabrain.blazedrops;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = BlazeDrops.MODID, name = BlazeDrops.NAME, version = BlazeDrops.VERSION)
public class BlazeDrops {

	public static final String MODID = "blazedrops";
	public static final String NAME = "Blaze Drops";
	public static final String VERSION = "1.0";

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		MinecraftForge.EVENT_BUS.register(new DropEventHandler());
	}
	
}
