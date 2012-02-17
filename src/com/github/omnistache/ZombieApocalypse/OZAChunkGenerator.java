package com.github.omnistache.ZombieApocalypse;

import java.util.Random;

import org.bukkit.World;
import org.bukkit.generator.ChunkGenerator;

public class OZAChunkGenerator extends ChunkGenerator {
	 /**
     * Shapes the chunk for the given coordinates.<br />
     * <br />
     * This method should return a byte[32768] in the following format:
     *
     * <pre>
     * for (int x = 0; x &lt; 16; x++) {
     *     for (int z = 0; z &lt; 16; z++) {
     *         for (int y = 0; y &lt; 128; y++) {
     *             // result[(x * 16 + z) * 128 + y] = ??;
     *         }
     *     }
     * }
     * </pre>
     *
     * Note that this method should <b>never</b> attempt to get the Chunk at
     * the passed coordinates, as doing so may cause an infinite loop
     *
     * @param world The world this chunk will be used for
     * @param random The random generator to use
     * @param x The X-coordinate of the chunk
     * @param z The Z-coordinate of the chunk
     * @return byte[] containing the types for each block created by this generator
     */
	@Override
	public byte[] generate(World world, Random random, int x, int z) {
		return null;
	}

	
	
}
