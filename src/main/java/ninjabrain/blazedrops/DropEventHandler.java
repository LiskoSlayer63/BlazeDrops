package ninjabrain.blazedrops;

import java.util.List;
import java.util.Random;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.item.ItemStack;
import net.minecraft.world.WorldServer;
import net.minecraft.world.storage.loot.LootContext;
import net.minecraft.world.storage.loot.LootTable;
import net.minecraft.world.storage.loot.LootTableList;
import net.minecraftforge.common.util.FakePlayerFactory;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class DropEventHandler {

	@SubscribeEvent
	public void onDropEvent(LivingDropsEvent event) {
		EntityLivingBase entity = event.getEntityLiving();
		if (entity instanceof EntityBlaze && !event.isRecentlyHit()) {
			LootTable loottable = event.getEntity().world.getLootTableManager().getLootTableFromLocation(LootTableList.ENTITIES_BLAZE);
			LootContext.Builder lootcontext$builder = (new LootContext.Builder((WorldServer) entity.world)).withLootedEntity(entity);
			lootcontext$builder = lootcontext$builder.withPlayer(FakePlayerFactory.getMinecraft((WorldServer) entity.world));

			List<ItemStack> drops = loottable.generateLootForPools(new Random(), lootcontext$builder.build());
			for (ItemStack itemstack : drops) {
				entity.entityDropItem(itemstack, 0.0F);
			}
		}
		
	}

}
