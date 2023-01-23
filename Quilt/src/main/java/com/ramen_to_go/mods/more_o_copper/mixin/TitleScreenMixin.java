package com.ramen_to_go.mods.more_o_copper.mixin;

import com.ramen_to_go.mods.more_o_copper.MoreOCopper;
import net.minecraft.client.gui.screen.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class TitleScreenMixin {
	@Inject(method = "init", at = @At("TAIL"))
	public void exampleMod$onInit(CallbackInfo ci) {
		MoreOCopper.LOGGER.info("This line is printed by an example mod mixin!");
	}
}
