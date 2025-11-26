package zoomers.com.mixin;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import net.minecraft.client.render.GameRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import zoomers.com.util.Key;

@Mixin(GameRenderer.class)
public class MainMixin {
	private static float sexyFov = -1;

	@ModifyReturnValue(method = "getFov(Lnet/minecraft/client/render/Camera;FZ)F", at = @At("RETURN"))
	private float onGetFov(float original) {
		float targetFov = (Key.zoomKey != null && Key.zoomKey.isPressed()) ? original * 0.2f : original;
		if (sexyFov < 0) sexyFov = original;
		sexyFov += (targetFov - sexyFov) * 0.15f;
		return sexyFov;
	}
}