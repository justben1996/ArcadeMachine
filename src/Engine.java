import java.io.File;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

public class Engine extends BasicGame{
	
	//Set Game Title to value stored at "Reference.gameTitle".
	public Engine() {
		super(Reference.gameTitle);
		
	}
	
	public static void main(String[] args){
		
		//Set natives folder.
		File nativeFile = new File("natives");
		if (nativeFile.exists()) System.setProperty("org.lwjgl.librarypath", nativeFile.getAbsolutePath());
		
		try {
			AppGameContainer game = new AppGameContainer(new Engine());
			
			//Set resolution to that defined in Reference class.
			game.setDisplayMode(Reference.windowWidth, Reference.windowHeight, false);
			
			//Set game into fullscreen mode.
			game.setFullscreen(Reference.fullscreenBoolean);
			game.start();
		} catch (SlickException slickException) {
			slickException.printStackTrace();
		}
	}

	@Override
	public void init(GameContainer gc) throws SlickException {
		gc.setMaximumLogicUpdateInterval(Reference.maxLogicUpdateInterval);
		gc.setTargetFrameRate(Reference.targetFrameRate);
		gc.setAlwaysRender(true);
		gc.setShowFPS(Reference.showFPS);
		gc.setVSync(true);
	}
	
	@Override
	public void update(GameContainer gc, int delta) throws SlickException {
			
	}	
	
	@Override
	public void render(GameContainer gc, Graphics g) throws SlickException {
		
	}


}