package net.kaloww.thesparkawakens.item;

import net.kaloww.thesparkawakens.TheSparkAwakens;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TheSparkAwakens.MOD_ID);

    public static final RegistryObject<Item> FACETED_SKINT = ITEMS.register("faceted-skint", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SKINT_CRYSTAL = ITEMS.register("skint-crystal", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SKINT_FRAGMENT = ITEMS.register("skint-fragment", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SKINT = ITEMS.register("skint", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SKINT_GRAIN = ITEMS.register("skint-grain", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ANTI_SKINT = ITEMS.register("anti-skint", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DREAMBOUND_SKINT = ITEMS.register("dreambound-skint", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SPACE_COMPRESSION_JAR = ITEMS.register("space-compression-jar", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MODULE_PERSIK = ITEMS.register("module-p.e.r.s.i.k", () -> new Item(new Item.Properties()));







    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
