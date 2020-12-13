package com.allkillernofiller.geetar.util;

import net.minecraft.client.settings.KeyBinding;
import net.minecraft.client.util.InputMappings;
import net.minecraftforge.client.settings.KeyConflictContext;
import org.lwjgl.glfw.GLFW;

public class KeyBindings {
    public static final KeyBinding A_CHORD = new KeyBinding("key.a_chord", KeyConflictContext.UNIVERSAL, InputMappings.Type.KEYSYM, GLFW.GLFW_KEY_V, "key.categories.guitar");
    public static final KeyBinding C_CHORD = new KeyBinding("key.c_chord", KeyConflictContext.UNIVERSAL, InputMappings.Type.KEYSYM, GLFW.GLFW_KEY_B, "key.categories.guitar");
    public static final KeyBinding D_CHORD = new KeyBinding("key.d_chord", KeyConflictContext.UNIVERSAL, InputMappings.Type.KEYSYM, GLFW.GLFW_KEY_N, "key.categories.guitar");
    public static final KeyBinding E_CHORD = new KeyBinding("key.e_chord", KeyConflictContext.UNIVERSAL, InputMappings.Type.KEYSYM, GLFW.GLFW_KEY_M, "key.categories.guitar");
    public static final KeyBinding F_CHORD = new KeyBinding("key.f_chord", KeyConflictContext.UNIVERSAL, InputMappings.Type.KEYSYM, GLFW.GLFW_KEY_COMMA, "key.categories.guitar");
    public static final KeyBinding G_CHORD = new KeyBinding("key.g_chord", KeyConflictContext.UNIVERSAL, InputMappings.Type.KEYSYM, GLFW.GLFW_KEY_PERIOD, "key.categories.guitar");
    public static final KeyBinding AM_CHORD = new KeyBinding("key.am_chord", KeyConflictContext.UNIVERSAL, InputMappings.Type.KEYSYM, GLFW.GLFW_KEY_L, "key.categories.guitar");
    public static final KeyBinding EM_CHORD = new KeyBinding("key.em_chord", KeyConflictContext.UNIVERSAL, InputMappings.Type.KEYSYM, GLFW.GLFW_KEY_SEMICOLON, "key.categories.guitar");

}
