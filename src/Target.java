
abstract class Target {
	abstract public int getVoltage();
	}

	class Adapter extends Target {

		private Power adaptee;

		public Adapter(final Power a) {
			adaptee = a;
		}
		public int getVoltage() {
			return adaptee.getVoltage()/2;
		}

}