package dereliktt.steampunk.proxy.cllient;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.client.resources.IResourceManager;
import net.minecraft.client.resources.IResourceManagerReloadListener;
import net.minecraftforge.client.event.DrawBlockHighlightEvent;
import net.minecraftforge.client.event.FOVUpdateEvent;
import net.minecraftforge.client.event.MouseEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderLivingEvent;
import net.minecraftforge.client.event.sound.PlaySoundEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.Phase;

public class ClientEventHandler implements IResourceManagerReloadListener
{

	@Override
	public void onResourceManagerReload(IResourceManager resourceManager)
	{
		TextureMap texturemap = Minecraft.getMinecraft().getTextureMapBlocks();
		
	}
	
	@SubscribeEvent
	public void onPlayerTick(TickEvent.PlayerTickEvent event)
	{
		
	}
	
	@SubscribeEvent
	public void onItemTooltip(ItemTooltipEvent event)
	{
		
	}
	
	@SubscribeEvent
	public void onPlaySound(PlaySoundEvent event)
	{
		
	}
	
	@SubscribeEvent()
	public void onRenderOverlayPre(RenderGameOverlayEvent.Pre event)
	{
		
	}
	
	@SubscribeEvent()
	public void onRenderOverlayPost(RenderGameOverlayEvent.Post event)
	{
		
	}
	
	@SubscribeEvent()
	public void onFOVUpdate(FOVUpdateEvent event)
	{
		
	}
	
	@SubscribeEvent
	public void onMouseEvent(MouseEvent event)
	{
		
	}
	
	@SubscribeEvent()
	public void renderAdditionalBlockBounds(DrawBlockHighlightEvent event)
	{
		
	}
	
	@SubscribeEvent()
	public void onClientDeath(LivingDeathEvent event)
	{
	}
	
	@SubscribeEvent()
	public void onRenderLivingPre(RenderLivingEvent.Pre event)
	{
		
	}
	
	@SubscribeEvent()
	public void onRenderLivingPost(RenderLivingEvent.Post event)
	{
		
	}
	
	//====================================================================
	//This stuff is necessary to work around a rendering issue with WAILA.
	//====================================================================
	
	boolean blendOn;
	@SubscribeEvent(priority=EventPriority.LOWEST)
	public void onRenderTickLowest(TickEvent.RenderTickEvent ev)
	{
		if (ev.phase!=Phase.START)
			return;
		if (blendOn)
			GlStateManager.enableBlend();
		else
			GlStateManager.disableBlend();
	}
	@SubscribeEvent(priority=EventPriority.HIGHEST)
	public void onRenderTickHighest(TickEvent.RenderTickEvent ev)
	{
		if (ev.phase!=Phase.START)
			return;
		blendOn = GL11.glGetBoolean(GL11.GL_BLEND);
	}
}
