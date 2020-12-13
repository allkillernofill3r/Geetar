package com.allkillernofiller.geetar.item;

import com.allkillernofiller.geetar.Geetar;
import com.allkillernofiller.geetar.init.SoundInit;
import com.allkillernofiller.geetar.util.KeyBindings;
import net.minecraft.client.Minecraft;
import net.minecraft.client.util.InputMappings;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.*;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.sound.PlaySoundEvent;
import org.apache.logging.log4j.Level;

public class GuitarItem extends Item {
    public GuitarItem(Properties properties) {
        super(properties);
    }

    @OnlyIn(Dist.CLIENT)
    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
        ItemStack itemStack = playerIn.getHeldItem(handIn);
        if(keyBind(KeyBindings.A_CHORD.getKey().getKeyCode())) {
            playChord(worldIn, playerIn, SoundInit.A_CHORD.get(), itemStack);
        } else if (keyBind(KeyBindings.C_CHORD.getKey().getKeyCode())) {
            playChord(worldIn, playerIn, SoundInit.C_CHORD.get(), itemStack);
        } else if (keyBind(KeyBindings.D_CHORD.getKey().getKeyCode())) {
            playChord(worldIn, playerIn, SoundInit.D_CHORD.get(), itemStack);
        } else if (keyBind(KeyBindings.E_CHORD.getKey().getKeyCode())) {
            playChord(worldIn, playerIn, SoundInit.E_CHORD.get(), itemStack);
        } else if (keyBind(KeyBindings.F_CHORD.getKey().getKeyCode())) {
            playChord(worldIn, playerIn, SoundInit.F_CHORD.get(), itemStack);
        } else if (keyBind(KeyBindings.G_CHORD.getKey().getKeyCode())) {
            playChord(worldIn, playerIn, SoundInit.G_CHORD.get(), itemStack);
        } else if (keyBind(KeyBindings.AM_CHORD.getKey().getKeyCode())) {
            playChord(worldIn, playerIn, SoundInit.AM_CHORD.get(), itemStack);
        } else if (keyBind(KeyBindings.EM_CHORD.getKey().getKeyCode())) {
            playChord(worldIn, playerIn, SoundInit.EM_CHORD.get(), itemStack);
        }
        return ActionResult.resultPass(itemStack);
    }

    protected ActionResult playChord(World worldIn, PlayerEntity playerIn, SoundEvent sound, ItemStack itemStack) {
        worldIn.playSound((PlayerEntity)null, playerIn.getPosX(), playerIn.getPosY(), playerIn.getPosZ(), sound, SoundCategory.NEUTRAL, 1.0F, 1.0F);
        Geetar.LOGGER.log(Level.INFO, "Guitar Played!");
        return ActionResult.resultSuccess(itemStack);
    }

    protected Boolean keyBind(int key) {
        return InputMappings.isKeyDown(Minecraft.getInstance().getMainWindow().getHandle(), key);
    }
}
