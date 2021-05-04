package faulkner.solitudinem.utils;

import faulkner.solitudinem.Solitudinem;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class RegistryUtil {

    public static Item setItemName(final Item item, final String name) {
        item.setRegistryName(Solitudinem.MODID, name).setTranslationKey(Solitudinem.MODID + "." + name);
        return item;
    }

    public static Block setBlockName(final Block block, final String name) {
        block.setRegistryName(Solitudinem.MODID, name).setTranslationKey(Solitudinem.MODID + "." + name);
        return block;
    }

}
