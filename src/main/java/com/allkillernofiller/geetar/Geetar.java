package com.allkillernofiller.geetar;

import com.allkillernofiller.geetar.init.ItemInit;
import com.allkillernofiller.geetar.init.SoundInit;
import com.allkillernofiller.geetar.util.KeyBindings;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("geetar")
public class Geetar {
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "geetar";

    public Geetar() {
        SoundInit.SOUNDS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ItemInit.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
        ClientRegistry.registerKeyBinding(KeyBindings.A_CHORD);
        ClientRegistry.registerKeyBinding(KeyBindings.C_CHORD);
        ClientRegistry.registerKeyBinding(KeyBindings.D_CHORD);
        ClientRegistry.registerKeyBinding(KeyBindings.E_CHORD);
        ClientRegistry.registerKeyBinding(KeyBindings.F_CHORD);
        ClientRegistry.registerKeyBinding(KeyBindings.G_CHORD);
        ClientRegistry.registerKeyBinding(KeyBindings.AM_CHORD);
        ClientRegistry.registerKeyBinding(KeyBindings.EM_CHORD);
    }

    public static ItemGroup TAB = new ItemGroup("geetartab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ItemInit.GUITAR.get());
        }
    };
}
