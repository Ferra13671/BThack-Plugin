package com.ferra13671.BThackPlugin;

import com.ferra13671.BThack.api.Gui.MainMenu.SelectWallpaper.SelectWallpaperScreen;
import com.ferra13671.BThack.api.Managers.Setting.Settings.*;
import com.ferra13671.BThack.api.Module.PluginModule;
import com.ferra13671.BThack.api.Utils.Keyboard.KeyboardUtils;

import java.util.ArrayList;
import java.util.Arrays;

public class ExampleModule extends PluginModule {

    public static BooleanSetting testBoolean;
    public static ModeSetting testMode;
    public static NumberSetting testSlider;
    public static KeyCodeSetting testKeyCode;
    public static GuiButtonSetting testGuiButton;

    public ExampleModule() {
        super("ExampleModule",
                "Test",
                KeyboardUtils.RELEASE,
                Category.MISC,
                false,
                BThackPlugin.instance
        );

        testBoolean = new BooleanSetting("Boolean", this, true);
        testMode = new ModeSetting("Mode", this, new ArrayList<>(Arrays.asList("Test1", "Test2", "Test3")));
        testSlider = new NumberSetting("Slider", this, 10, 1, 100, false);
        testKeyCode = new KeyCodeSetting("KeyCode", this);     //The screen that will be opened when the button is pressed
        testGuiButton = new GuiButtonSetting("GuiButton", this, new SelectWallpaperScreen());

        initSettings(
                testBoolean,
                testMode,
                testSlider,
                testKeyCode,
                testGuiButton
        );
    }

    @Override
    public void onEnable() {
        super.onEnable();

        //Doing something...
    }

    @Override
    public void onDisable() {
        super.onDisable();

        //Doing something...
    }
}
