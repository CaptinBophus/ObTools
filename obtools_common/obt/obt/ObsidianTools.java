package obt.obt;



import net.minecraft.block.Block;
import obt.block.BlockTest;
import obt.block.ModBlocks;
import obt.lib.BlockIds;
import obt.lib.Reference;
import obt.lib.Strings;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;


@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class ObsidianTools 
{
    
    @PreInit
    public void preInit(FMLPreInitializationEvent event)
    {
        ModBlocks.init();
    }
    
    @Init
    public void load(FMLInitializationEvent event)
    {
        
    }
    
    @PostInit
    public void modsLoaded(FMLPostInitializationEvent event)
    {
        
    }
}
