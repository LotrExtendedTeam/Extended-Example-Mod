package com.examplemod;

import net.minecraftforge.fml.common.Mod;

@Mod(ExampleMod.MOD_ID)
public class ExampleMod {

	public static final String MOD_ID = "examplemod";

	public ExampleMod() {
		System.out.println("Mod init");
	}
}
