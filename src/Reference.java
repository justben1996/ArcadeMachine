/*Use this class to store variables which have a high chance of being changed
 * in the future, or a variable you are/will use a lot, this will make sure
 * that we don't have to go through and individually change each variable.*/
public class Reference {
	static String gameTitle = "Arcade Machine";
	static int windowWidth = 1360; //Ben's Default Screen Size
	static int windowHeight = 768; //Ben's Default Screen Size
	static int targetFrameRate = 60;
	static boolean fullscreenBoolean = true;
	static boolean showFPS = true;
	static boolean useVSync = true;
	
	//Maximum amount of updates per second.
	static int maxLogicUpdateInterval = 120;
	
	
}