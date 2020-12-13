package com.allkillernofiller.geetar.init;

import com.allkillernofiller.geetar.Geetar;
import com.allkillernofiller.geetar.item.GuitarItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Geetar.MOD_ID);

    public static final RegistryObject<Item> GUITAR_BODY =  ITEMS.register("guitar_body", () -> new Item(new Item.Properties().group(Geetar.TAB)));
    public static final RegistryObject<Item> GUITAR_NECK =  ITEMS.register("guitar_neck", () -> new Item(new Item.Properties().group(Geetar.TAB)));
    public static final RegistryObject<Item> GUITAR_STRINGS =  ITEMS.register("guitar_strings", () -> new Item(new Item.Properties().group(Geetar.TAB)));
    public static final RegistryObject<Item> GUITAR = ITEMS.register("guitar", () -> new GuitarItem(new Item.Properties().group(Geetar.TAB)));
}
