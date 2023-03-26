package ninjabrain.blazedrops;

import org.slf4j.Logger;

import com.mojang.logging.LogUtils;
import net.minecraftforge.fml.common.Mod;

@Mod(BlazeDrops.MODID)
public class BlazeDrops {

	public static final String MODID = "blazedrops";
    public static final Logger LOGGER = LogUtils.getLogger();

    public BlazeDrops() 
    {
    	LOGGER.info("Blaze Drops enabled!");
    }
}
