package net.kaloww.thesparkawakens.item;

import net.kaloww.thesparkawakens.TheSparkAwakens;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TheSparkAwakens.MOD_ID);

    public static final RegistryObject<CreativeModeTab> ALL_MODDED_ITEMS = CREATIVE_MODE_TABS.register("all-modded-items", () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.MODULE_PERSIK.get()))
            .title(Component.translatable("creativetab.all-modded-items"))
            .displayItems((pParameters, pOutput) -> {
                pOutput.accept(ModItems.FACETED_SKINT.get());
                pOutput.accept(ModItems.SKINT_CRYSTAL.get());
                pOutput.accept(ModItems.SKINT_FRAGMENT.get());
                pOutput.accept(ModItems.SKINT.get());
                pOutput.accept(ModItems.SKINT_GRAIN.get());
                pOutput.accept(ModItems.ANTI_SKINT.get());
                pOutput.accept(ModItems.DREAMBOUND_SKINT.get());
                pOutput.accept(ModItems.SPACE_COMPRESSION_JAR.get());
                pOutput.accept(ModItems.MODULE_PERSIK.get());

            })
            .build());


public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
