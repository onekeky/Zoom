package zoomers.com;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import zoomers.com.util.Key;

public class Zoom implements ClientModInitializer {
	public static final String MOD_ID = "zoom";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitializeClient() {
		Key.register();
		LOGGER.info("Hello user!");
	}
}