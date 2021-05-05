package faulkner.solitudinem.handler;

import faulkner.solitudinem.Solitudinem;
import faulkner.solitudinem.init.BlockInit;
import faulkner.solitudinem.utils.RegistryUtil;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = Solitudinem.MODID)
public class RegistryHandler {
    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        final Item[] items = {
        };
        final Item[] itemBlocks = {
        };
        event.getRegistry().registerAll(items);
        event.getRegistry().registerAll(itemBlocks);
    }
    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        final Block[] blocks = {
        };

        event.getRegistry().registerAll(blocks);
    }
}
