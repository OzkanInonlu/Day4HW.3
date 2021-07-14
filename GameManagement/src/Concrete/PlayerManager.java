package Concrete;

import java.time.LocalDate;

import Abstract.PlayerCheckService;
import Abstract.PlayerService;
import Entities.Player;

public class PlayerManager implements PlayerService{
	
	public void register(Player player,PlayerCheckService playerCheckService) throws Exception {
		
		if(playerCheckService.checkIfRealPerson(player)) {
			System.out.println("Sisteme kaydedildi : " + player.getFirstName()
			+ " " + player.getLastName());
			
			logIn(player);
		}
		else {
			throw new Exception("Lütfen doðru bilgiler giriniz ");
		}
		
	}
	public void logIn(Player player) {
		System.out.println("Sisteme giriþ yapýldý : " + player.getFirstName()
		+ " " + player.getLastName());
	}
	public void updateProfile(Player player,String firstName,String lastName,LocalDate dateOfBirth) {
		
		player.setFirstName(firstName);
		player.setLastName(lastName);
		player.setDateOfbirth(dateOfBirth);
		
		System.out.println("Profil bilgileri güncellendi : " + player.getFirstName()
		+ " " + player.getLastName());
		
	}
	public void deleteProfile(Player player) {
		System.out.println("Profil silindi : " + player.getFirstName()
		+ "\n" + player.getLastName());
	}

}











