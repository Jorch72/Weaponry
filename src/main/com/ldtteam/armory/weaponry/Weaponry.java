package com.ldtteam.armory.weaponry;

import com.ldtteam.armory.weaponry.common.CommonProxy;
import com.ldtteam.armory.weaponry.common.config.ConfigurationHandler;
import com.ldtteam.armory.weaponry.util.References;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;
import slimeknights.tconstruct.library.TinkerRegistry;
import slimeknights.tconstruct.library.materials.Material;

/**
 * Created by Orion
 * Created on 01.06.2015
 * 10:52
 *
 * Copyrighted according to Project specific license
 */
@Mod(modid = References.General.MOD_ID, name = "Armory-Weaponry", version = References.General.VERSION,
        dependencies = "required-after:forge;required-after:mantle;;required-after:tconstruct;required-after:armory;after:armory-world")
public class Weaponry
{
    // Instance of this mod use for internal and Forge references
    @Mod.Instance(References.General.MOD_ID)
    public static Weaponry instance;

    // Proxies used to register stuff client and server side.
    @SidedProxy(clientSide="com.Orion.Armory.Weaponry.Client.ClientProxy", serverSide="com.Orion.Armory.Weaponry.Common.CommonProxy")
    public static CommonProxy proxy;

    public static Logger logger;

    @Mod.EventHandler
    public void preInit (FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
        proxy.registerEventHandlers();
    }


}
