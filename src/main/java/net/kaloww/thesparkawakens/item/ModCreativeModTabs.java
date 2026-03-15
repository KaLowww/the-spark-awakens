package net.kaloww.thesparkawakens.item;

import net.kaloww.thesparkawakens.TheSparkAwakens;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TheSparkAwakens.MOD_ID);

    public static final RegistryObject<CreativeModeTab> SPARK_ORES = CREATIVE_MODE_TABS.register("spark_ores", () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SKINT.get()))
            .title(Component.translatable("creativetab.spark_ores"))
            .displayItems((pParameters, pOutput) -> {
                pOutput.accept(ModItems.SKINT.get());
                pOutput.accept(Items.DIRT);

            })
            .build());


public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
