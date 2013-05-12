package obt.block;

import obt.lib.Strings;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockTest extends BlockOb {
    public BlockTest(int id) {

        super(id, Material.ground);
        this.setUnlocalizedName(Strings.TEST_NAME);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setHardness(0.5F);
    }
}
