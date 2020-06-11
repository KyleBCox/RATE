package ticticboooom.rate;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod(RATEMod.MOD_ID)
public class RATEMod {
    public static final String MOD_ID = "rate";

    public RATEMod() {

        MinecraftForge.EVENT_BUS.register(this);
    }
}
