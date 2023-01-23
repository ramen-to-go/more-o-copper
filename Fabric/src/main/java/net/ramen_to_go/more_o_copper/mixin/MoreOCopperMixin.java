package net.ramen_to_go.more_o_copper.mixin;

import net.minecraft.client.gui.screen.TitleScreen;
import net.ramen_to_go.more_o_copper.MoreOCopper;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class MoreOCopperMixin {
	@Inject(at = @At("HEAD"), method = "init()V")
	private void init(CallbackInfo info) {
		MoreOCopper.LOGGER.info("This line is printed by an example mod mixin!");
	}
}
