package zoomers.com.util;

import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;
import org.lwjgl.glfw.GLFW;

public class Key {
    public static KeyBinding zoomKey;

    public static void register() {
        zoomKey = KeyBindingHelper.registerKeyBinding(
                new KeyBinding("key.zoom.zoom", GLFW.GLFW_KEY_C, KeyBinding.Category.MISC));
    }
}

