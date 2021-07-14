package Abstract;

import java.time.LocalDate;

import Entities.Player;

public interface PlayerService {
	public void register(Player player,PlayerCheckService playerCheckService) throws Exception;
		
	public void logIn(Player player);
	
	public void updateProfile(Player player,String firstName,String lastName,
			LocalDate dateOfBirth);
	
	public void deleteProfile(Player player);

}
