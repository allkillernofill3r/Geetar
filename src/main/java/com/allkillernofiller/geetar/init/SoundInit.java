package com.allkillernofiller.geetar.init;

import com.allkillernofiller.geetar.Geetar;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class SoundInit {
    public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, Geetar.MOD_ID);

    public static final RegistryObject<SoundEvent> A_CHORD = SOUNDS.register("a_chord", () -> new SoundEvent(new ResourceLocation(Geetar.MOD_ID, "a_chord")));
    public static final RegistryObject<SoundEvent> C_CHORD = SOUNDS.register("c_chord", () -> new SoundEvent(new ResourceLocation(Geetar.MOD_ID, "c_chord")));
    public static final RegistryObject<SoundEvent> D_CHORD = SOUNDS.register("d_chord", () -> new SoundEvent(new ResourceLocation(Geetar.MOD_ID, "d_chord")));
    public static final RegistryObject<SoundEvent> E_CHORD = SOUNDS.register("e_chord", () -> new SoundEvent(new ResourceLocation(Geetar.MOD_ID, "e_chord")));
    public static final RegistryObject<SoundEvent> F_CHORD = SOUNDS.register("f_chord", () -> new SoundEvent(new ResourceLocation(Geetar.MOD_ID, "f_chord")));
    public static final RegistryObject<SoundEvent> G_CHORD = SOUNDS.register("g_chord", () -> new SoundEvent(new ResourceLocation(Geetar.MOD_ID, "g_chord")));
    public static final RegistryObject<SoundEvent> AM_CHORD = SOUNDS.register("am_chord", () -> new SoundEvent(new ResourceLocation(Geetar.MOD_ID, "am_chord")));
    public static final RegistryObject<SoundEvent> EM_CHORD = SOUNDS.register("em_chord", () -> new SoundEvent(new ResourceLocation(Geetar.MOD_ID, "em_chord")));
}
