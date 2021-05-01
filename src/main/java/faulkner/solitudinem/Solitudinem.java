package faulkner.solitudinem;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Solitudinem.MODID, name = Solitudinem.NAME, version = Solitudinem.VERSION)
public class Solitudinem
{
    public static final String MODID = "solitudinem";
    public static final String NAME = "Solitudinem";
    public static final String VERSION = "1.0";

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    }
}
