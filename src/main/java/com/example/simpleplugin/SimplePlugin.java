package com.example.simpleplugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.entity.Player;

public class SimplePlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("SimplePlugin iniciado! Use /saudacao para dizer olá.");
    }

    @Override
    public void onDisable() {
        getLogger().info("SimplePlugin finalizado. Até logo!");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!command.getName().equalsIgnoreCase("saudacao")) {
            return false;
        }

        String nome = sender.getName();
        String mensagem = String.format("Olá, %s! Obrigado por testar o SimplePlugin.", nome);

        if (sender instanceof Player) {
            Player player = (Player) sender;
            player.sendMessage(mensagem);
        } else {
            sender.sendMessage(mensagem);
        }

        return true;
    }
}
