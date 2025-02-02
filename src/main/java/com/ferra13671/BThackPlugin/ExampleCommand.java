package com.ferra13671.BThackPlugin;

import com.ferra13671.BThack.api.Managers.managers.Command.AbstractCommand;
import com.ferra13671.BThack.api.Managers.managers.Command.Arguments;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import net.minecraft.command.CommandSource;

public class ExampleCommand extends AbstractCommand {

    public ExampleCommand() {
        super("This is a example command!", "exampleCommand");
    }

    @Override
    public void compile(LiteralArgumentBuilder<CommandSource> builder) {
        builder.executes(context -> {
            sendMessage("Hello world!");

            return SUCCESFUL;
        });
        builder.then(literal("more").executes(context -> {
            sendMessage("Hello world!");
            sendMessage("Hello world!");
            sendMessage("Hello world!");

            return SUCCESFUL;
        }));
        builder.then(arg("text", Arguments.GREEDY_STRING).executes(context -> {
            sendMessage(context.getArgument("text", String.class));

            return SUCCESFUL;
        }));
    }
}
