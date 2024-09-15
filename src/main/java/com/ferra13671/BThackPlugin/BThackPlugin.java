package com.ferra13671.BThackPlugin;

import com.ferra13671.BThack.api.Interfaces.Mc;
import com.ferra13671.BThack.api.Plugin.Plugin;
import com.ferra13671.BThack.api.Plugin.PluginUtils;

import java.util.Arrays;

public class BThackPlugin extends Plugin implements Mc {

    public static Plugin instance;

    @Override
    public void preInit() {
        instance = this;
    }

    @Override
    public void postInit() {

    }

    @Override
    public void onInitModules() {
        PluginUtils.addPluginModules(Arrays.asList(
                new ExampleModule()
        ));
        //PluginUtils.addPluginModules(Arrays.asList(
        //                                                    Here you can add your plugin modules to client.
        //));
    }

    @Override
    public void onInitHudComponents() {
        //PluginUtils.addPluginHudComponents(Arrays.asList(
        //                                                    Here you can add your hud components to client.
        //));
    }

    @Override
    public void onInitCommands() {
        //PluginUtils.addPluginCommands(Arrays.asList(
        //                                                    Here you can add your commands to client.
        //));
    }

    @Override
    public void onLoadColourThemes() {
        //Here you can load your colour themes to client.
    }

    @Override
    public void onLoadLanguages() {
        //PluginUtils.loadPluginTranslations(...);
        //PluginUtils.loadPluginTranslations(...);           Here you can load your languages to client.
        //PluginUtils.loadPluginTranslations(...);
        //...
    }
}
