package adapters;

import java.rmi.RemoteException;

import abstracts.PlayerCheckService;
import entities.Player;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements PlayerCheckService {

	@Override
	public boolean CheckIfRealPerson(Player player) {

		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		boolean result = false;
		try {

			result = client.TCKimlikNoDogrula(Long.parseLong(player.getNationalityId()),
					player.getFirstName().toUpperCase(), player.getLastName().toUpperCase(),
					player.getDateOfBirth().getYear());

		} catch (RemoteException e) {
			e.printStackTrace();
		}

		return result;

	}

}
