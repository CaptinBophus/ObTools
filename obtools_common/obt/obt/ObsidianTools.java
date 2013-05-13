package obt.obt;

import obt.block.ModBlocks;
import obt.lib.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class ObsidianTools 
{
    
    @PreInit
    public void preInit(FMLPreInitializationEvent event)
    {
        //ModBlocks.init();
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
