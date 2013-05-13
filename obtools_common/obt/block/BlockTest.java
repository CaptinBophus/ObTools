package obt.block;

import java.util.List;

import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


public class BlockTest extends BlockOb{

    public BlockTest(int par1, Material par2Material) {
        super(par1, par2Material);
        this.setHardness(0.5F);
        this.setResistance(89.5F);
        this.setStepSound(soundStoneFootstep);
    }
    
    @SideOnly(Side.CLIENT)
    private Icon[] icons;
    {
        
    }
}
