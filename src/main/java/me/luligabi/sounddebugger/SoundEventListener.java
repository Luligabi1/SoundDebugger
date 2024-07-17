package me.luligabi.sounddebugger;

import net.minecraftforge.client.event.sound.PlaySoundEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.apache.logging.log4j.LogManager;

public class SoundEventListener {

    @SubscribeEvent
    public void onSoundPlay(PlaySoundEvent event) {
        LogManager.getLogger("SoundDebugger").info(String.format("%s played with %.2f pitch and %.2f volume", event.name, event.sound.getPitch(), event.sound.getVolume()));
    }
}
