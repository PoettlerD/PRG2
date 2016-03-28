package exceptios.ue.transporter;

public class Tansporter {

	public void beam(String person, String from, String to, boolean urgent) throws TransporterMalfunctionException
	{
		if (urgent == true && Math.random()< 0.7)
		{
	
		throw new TransporterMalfunctionException();
		}
	System.out.println("beaming " + person +" from "+from+" to " +to);
	}
	public void shutdown()
	{
		System.out.println("shutting down transporter");
	}



}
