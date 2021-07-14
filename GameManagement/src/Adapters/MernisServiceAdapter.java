package Adapters;

import java.rmi.RemoteException;

import Abstract.PlayerCheckService;
import Entities.Player;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements PlayerCheckService{
	
	@Override
	public boolean checkIfRealPerson(Player player) {
		
		boolean result=true;
		
		KPSPublicSoapProxy client=new KPSPublicSoapProxy();
		
		try {
			result=client.TCKimlikNoDogrula(
					Long.parseLong(player.getNationalityId()),
					player.getFirstName().toUpperCase(),
					player.getLastName().toUpperCase(),
					player.getDateOfbirth().getYear());
			
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			System.out.println("Error : " + e.getMessage());
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			System.out.println("Error : " + e.getMessage());
		}
		return result;
		
	}

}
