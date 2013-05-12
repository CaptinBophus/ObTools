package obt.block;

import obt.lib.BlockIds;
import obt.lib.Reference;
import obt.lib.Strings;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks
{
    public static Block testBlock;
    
    
    public static void init()
    {
        testBlock = new BlockTest(BlockIds.TESTBLOCK);
        GameRegistry.registerBlock(testBlock, Strings.TEST_NAME);
    }
    
}
    
