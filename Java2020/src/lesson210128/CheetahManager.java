package lesson210128;

public class CheetahManager {
	private static CheetahManager cheetahManager = new CheetahManager();

	private CheetahManager() {
	}

	static CheetahManager getCheetahManager() {
//		if (cheetahManager == null) {
//			cheetahManager = new CheetahManager();
//		}
		return cheetahManager;
	}
}