package com.kekboy.Core;

import com.kekboy.Core.baseplate.hub;

import com.kekboy.Core.proxy.CommonProxy;

import akka.Main;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
@Mod(modid = hub.MOD_ID, name = hub.NAME, version = hub.VERSION)
public class MainCore {

		@Instance
		public static MainCore instance;
		
		@SidedProxy(clientSide = hub.CLIENT_PROXY_CLASS, serverSide = hub.COMMON_PROXY_CLASS)
		public static CommonProxy proxy;
		
@EventHandler
		public static void PreInit(FMLPreInitializationEvent event) 
		{
		
		}
@EventHandler
		public static void Init(FMLInitializationEvent event) 
		{	

		}
@EventHandler
		public static void PostInit(FMLPostInitializationEvent event) 
		{

		}
}
