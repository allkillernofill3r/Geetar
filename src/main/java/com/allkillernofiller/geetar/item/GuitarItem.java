package com.allkillernofiller.geetar.item;

import com.allkillernofiller.geetar.Geetar;
import com.allkillernofiller.geetar.init.SoundInit;
import com.allkillernofiller.geetar.util.GeetarPacketHandler;
import com.allkillernofiller.geetar.util.KeyBindings;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.*;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.network.PacketDistributor;
import org.apache.logging.log4j.Level;
import org.lwjgl.system.windows.MSG;

public class GuitarItem extends Item {
    public GuitarItem(Properties properties) {
        super(properties);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
        ItemStack itemStack = playerIn.getHeldItem(handIn);
        if(KeyBindings.A_CHORD.isPressed()) {
            playChord(worldIn, playerIn, SoundInit.A_CHORD.get(), itemStack);
        } else if (KeyBindings.C_CHORD.isPressed()) {
            playChord(worldIn, playerIn, SoundInit.C_CHORD.get(), itemStack);
        } else if (KeyBindings.D_CHORD.isPressed()) {
            playChord(worldIn, playerIn, SoundInit.D_CHORD.get(), itemStack);
        } else if (KeyBindings.E_CHORD.isPressed()) {
            playChord(worldIn, playerIn, SoundInit.E_CHORD.get(), itemStack);
        } else if (KeyBindings.F_CHORD.isPressed()) {
            playChord(worldIn, playerIn, SoundInit.F_CHORD.get(), itemStack);
        } else if (KeyBindings.G_CHORD.isPressed()) {
            playChord(worldIn, playerIn, SoundInit.G_CHORD.get(), itemStack);
        } else if (KeyBindings.AM_CHORD.isPressed()) {
            playChord(worldIn, playerIn, SoundInit.AM_CHORD.get(), itemStack);
        } else if (KeyBindings.EM_CHORD.isPressed()) {
            playChord(worldIn, playerIn, SoundInit.EM_CHORD.get(), itemStack);
        }
        return ActionResult.resultPass(itemStack);
    }

    protected ActionResult playChord(World worldIn, PlayerEntity playerIn, SoundEvent sound, ItemStack itemStack) {
        GeetarPacketHandler.INSTANCE.send(PacketDistributor.PLAYER.with(() -> (ServerPlayerEntity) null),
                worldIn.playSound((PlayerEntity)null, playerIn.getPosX(), playerIn.getPosY(), playerIn.getPosZ(), sound, SoundCategory.NEUTRAL, 1.0f, 1.0f));
        Geetar.LOGGER.log(Level.INFO, "Guitar Played!");
        return ActionResult.resultSuccess(itemStack);
    }
}
