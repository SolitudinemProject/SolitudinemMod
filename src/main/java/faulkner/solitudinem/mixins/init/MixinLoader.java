package faulkner.solitudinem.mixins.init;

import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.ModContainer;
import net.minecraftforge.fml.common.discovery.ModDiscoverer;
import org.apache.logging.log4j.LogManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mixins;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Iterator;
import java.util.List;

//Thanks for friendly's Code
@Mixin(value = Loader.class, remap = false, priority = 800)
public class MixinLoader {
    @Shadow
    private List<ModContainer> mods;

    @Inject(method = "loadMods", at = @At(value = "INVOKE", target = "Lnet/minecraftforge/fml/common/LoadController;transition(Lnet/minecraftforge/fml/common/LoaderState;Z)V", ordinal = 1), remap = false)
    private void initMixins(List<String> injectedModContainers, CallbackInfo ci){
        LogManager.getLogger("solitudinem mixins").info("registering mod mixins...");
        Mixins.addConfiguration("mixins.solitudinem.json");
    }

    @Inject(method = "identifyMods", at = @At(value = "INVOKE", target = "Lnet/minecraftforge/fml/common/Loader;identifyDuplicates(Ljava/util/List;)V"), remap = false)
    private void InjectIdentifyMods(List<String> additionalContainers, CallbackInfoReturnable<ModDiscoverer> cir) {
        if (mods.stream().filter(modContainer -> modContainer.getModId().equals("solitudinem")).count() <= 1)
            return;
        final Iterator<ModContainer> each = mods.iterator();
        while (each.hasNext()) {
            if (each.next().getModId().equals("solitudinem")) {
                each.remove();
                return;
            }
        }
    }

}

