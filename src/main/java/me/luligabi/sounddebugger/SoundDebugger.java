package me.luligabi.sounddebugger;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = SoundDebugger.MODID, version = SoundDebugger.VERSION, clientSideOnly = true)
public class SoundDebugger
{
    public static final String MODID = "sounddebugger";
    public static final String VERSION = "1.0";
    
    @EventHandler
    public void init(FMLInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(new SoundEventListener());
    }
}
