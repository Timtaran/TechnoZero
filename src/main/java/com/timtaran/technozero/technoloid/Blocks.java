package com.timtaran.technozero.technoloid;
import com.timtaran.technozero.InitMod;
import com.timtaran.technozero.blocks.Laptop;
import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Blocks {
        public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, InitMod.MOD_ID);

        public static void init(){
                BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        }
        public static final RegistryObject<Block> LAPTOP = BLOCKS.register("laptop", () -> new Laptop());

}
