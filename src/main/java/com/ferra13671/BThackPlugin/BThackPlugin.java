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
        //Here you can add your plugin modules to client.
        PluginUtils.addPluginModules(Arrays.asList(
                new ExampleModule()
        ));
    }

    @Override
    public void onInitHudComponents() {
        //PluginUtils.addPluginHudComponents(Arrays.asList(
        //                                                    Here you can add your hud components to client.
        //));
    }

    @Override
    public void onInitCommands() {
        //Here you can add your commands to client.
        PluginUtils.addPluginCommands(Arrays.asList(
                new ExampleCommand()
        ));
    }

    @Override
    public void onInitDataLists() {
        //Here you can load your data lists to client.
    }

    @Override
    public void onInitCustomCategories() {
        //Here you can load your clickGui categories to client.
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
