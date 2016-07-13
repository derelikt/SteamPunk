package dereliktt.steampunk.proxy.common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.UUID;

import net.minecraftforge.event.AnvilUpdateEvent;
import net.minecraftforge.event.entity.EntityEvent.EntityConstructing;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.living.EnderTeleportEvent;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.event.entity.living.LivingEvent.LivingJumpEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.event.entity.living.LivingSpawnEvent;
import net.minecraftforge.event.entity.player.EntityInteractEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.event.world.WorldEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.ItemCraftedEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.PlayerTickEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.WorldTickEvent;

public class EventHandler {

	@SubscribeEvent
	public void onLoad(WorldEvent.Load event)
	{
		
	}
	
	@SubscribeEvent
	public void onSave(WorldEvent.Save event)
	{
		
	}
	
	@SubscribeEvent
	public void onUnload(WorldEvent.Unload event)
	{
		
	}
	
	@SubscribeEvent
	public void onEntityConstructing(EntityConstructing event)
	{
		
	}
	
	@SubscribeEvent
	public void onEntityJoiningWorld(EntityJoinWorldEvent event)
	{
	
	}
	
	@SubscribeEvent
	public void onEntityInteract(EntityInteractEvent event)
	{
		
	}
	
	@SubscribeEvent
	public void onWorldTick(WorldTickEvent event)
	{
		
	}
	
	@SubscribeEvent
	public void onPlayerTick(PlayerTickEvent event)
	{
		
	}
	
	@SubscribeEvent
	public void onLogin(PlayerLoggedInEvent event)
	{
		
	}
	
	@SubscribeEvent
	public void harvestCheck(PlayerEvent.HarvestCheck event)
	{
		
	}
	
	@SubscribeEvent(priority=EventPriority.LOWEST)
	public void onLivingDropsLowest(LivingDropsEvent event)
	{
		
	}
	
	@SubscribeEvent
	public void onLivingDrops(LivingDropsEvent event)
	{
		
	}
	
	@SubscribeEvent(priority=EventPriority.LOWEST)
	public void onLivingHurt(LivingHurtEvent event)
	{
		
	}
	
	@SubscribeEvent
	public void onLivingJump(LivingJumpEvent event)
	{
		
	}
	
	@SubscribeEvent
	public void onEnderTeleport(EnderTeleportEvent event)
	{
		
	}
	
	@SubscribeEvent
	public void onEntitySpawnCheck(LivingSpawnEvent.CheckSpawn event)
	{
		
	}
	
	@SubscribeEvent
	public void onItemCrafted(ItemCraftedEvent event)
	{
		
	}
	
	@SubscribeEvent(priority=EventPriority.LOWEST)
	public void onBlockPlaced(BlockEvent.PlaceEvent event)
	{
		
	}
	
	@SubscribeEvent()
	public void digSpeedEvent(PlayerEvent.BreakSpeed event)
	{
		
	}
	
	@SubscribeEvent
	public void onAnvilChange(AnvilUpdateEvent event)
	{
		
	}
	
	
}
