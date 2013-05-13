package obt.block;

import obt.lib.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class BlockOb extends Block{
    public BlockOb(int id, Material par2Material){
        super(id, par2Material);
        this.setCreativeTab(CreativeTabs.tabBlock);
    }
    
    public void registerIcons(IconRegister par1IconRegister)
    {
        this.blockIcon = par1IconRegister.registerIcon(Reference.MOD_ID + ":" + (this.getUnlocalizedName().substring(5)));
    }

}