package be.lecson.moremoney.jobs;

import java.io.File;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

import be.lecson.moremoney.Main;

public class CommandJobs implements CommandExecutor {
	
	private File jobs;
	private Main main;

	public CommandJobs(File jobs, Main main) {
		this.jobs = jobs;
		this.main = main;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String msg, String[] args) {
		InvItem mineur = new InvItem("Mineur","tailleur",Material.STONE_PICKAXE,1);
		InvItem pecheur = new InvItem("Pecheur","canne",Material.FISHING_ROD,1);
		InvItem boulanger = new InvItem("Boulanger","baguette",Material.BREAD,1);
		InvItem bucheron = new InvItem("Bucheron","arbre",Material.STONE_AXE,1);
		InvItem charsseur = new InvItem("Chasseur","arc",Material.BOW,1);
		InvItem jardinier = new InvItem("Jardinier","fourche",Material.DIAMOND_HOE,1);
		InvItem macon = new InvItem("Macon","truelle",Material.STONE_SPADE,1);
		
		InvItem close = new InvItem("Fermer","Fermer l'inventaire",Material.BARRIER,1);
		
		if(sender instanceof Player) {
			Player player = (Player) sender;
			Inventory inv = Bukkit.createInventory(null, 54,"�5Choisir un job");
			inv.setItem(19, mineur.getItemMenu());
			inv.setItem(20, pecheur.getItemMenu());
			inv.setItem(21, boulanger.getItemMenu());
			inv.setItem(22, bucheron.getItemMenu());
			inv.setItem(23, charsseur.getItemMenu());
			inv.setItem(24, jardinier.getItemMenu());
			inv.setItem(25, macon.getItemMenu());
			inv.setItem(53, close.getItemMenu());
			
			player.openInventory(inv);
		}
		return false;
	}

}
