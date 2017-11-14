
class LapTop {
	
	private int laptopvoltage;
	private Target target;

	LapTop(Target t) {
		target = t;
		laptopvoltage = target.getVoltage();
	}
	public void powerOn() { 
		if(laptopvoltage == 110)
			System.out.println("Power On"); 
		else
			System.out.println("Over Voltage");
	}

}