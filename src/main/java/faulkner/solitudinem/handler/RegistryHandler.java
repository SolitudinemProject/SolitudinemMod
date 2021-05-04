package faulkner.solitudinem.handler;

import faulkner.solitudinem.Solitudinem;
import faulkner.solitudinem.utils.RegistryUtil;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = Solitudinem.MODID)
public class RegistryHandler {
    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        final Item[] items = {
                RegistryUtil.setItemName(new Item(), "first_item").setCreativeTab(CreativeTabs.MISC)
        };
        event.getRegistry().registerAll(items);
    }
}
