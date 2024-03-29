
package net.mcreator.newridiculousmodforthehahas.block;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.level.storage.loot.LootParams;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.DirectionalBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.ItemStack;
import net.minecraft.network.chat.Component;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import java.util.List;
import java.util.Collections;

public class BigChainBlock extends Block {
	public static final DirectionProperty FACING = DirectionalBlock.FACING;

	public BigChainBlock() {
		super(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.METAL).strength(1f, 10f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, BlockGetter world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return Shapes.empty();
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return switch (state.getValue(FACING)) {
			default -> Shapes.or(box(6.5, 2.5, 9.25, 10.5, 5.5, 16.25), box(6.5, 10.5, 9.25, 10.5, 13.5, 16.25), box(6.5, 5.5, 9.25, 10.5, 10.5, 12.25), box(6.5, 10.5, 0.25, 10.5, 13.5, 7.25), box(6.5, 2.5, 0.25, 10.5, 5.5, 7.25),
					box(6.5, 5.5, 4.25, 10.5, 10.5, 7.25), box(6, 6, 12.25, 11, 10, 15.25), box(6, 6, 1.25, 11, 10, 4.25), box(3, 6, 1.25, 6, 10, 15.25), box(11, 6, 1.25, 14, 10, 15.25));
			case NORTH -> Shapes.or(box(5.5, 2.5, -0.25, 9.5, 5.5, 6.75), box(5.5, 10.5, -0.25, 9.5, 13.5, 6.75), box(5.5, 5.5, 3.75, 9.5, 10.5, 6.75), box(5.5, 10.5, 8.75, 9.5, 13.5, 15.75), box(5.5, 2.5, 8.75, 9.5, 5.5, 15.75),
					box(5.5, 5.5, 8.75, 9.5, 10.5, 11.75), box(5, 6, 0.75, 10, 10, 3.75), box(5, 6, 11.75, 10, 10, 14.75), box(10, 6, 0.75, 13, 10, 14.75), box(2, 6, 0.75, 5, 10, 14.75));
			case EAST -> Shapes.or(box(9.25, 2.5, 5.5, 16.25, 5.5, 9.5), box(9.25, 10.5, 5.5, 16.25, 13.5, 9.5), box(9.25, 5.5, 5.5, 12.25, 10.5, 9.5), box(0.25, 10.5, 5.5, 7.25, 13.5, 9.5), box(0.25, 2.5, 5.5, 7.25, 5.5, 9.5),
					box(4.25, 5.5, 5.5, 7.25, 10.5, 9.5), box(12.25, 6, 5, 15.25, 10, 10), box(1.25, 6, 5, 4.25, 10, 10), box(1.25, 6, 10, 15.25, 10, 13), box(1.25, 6, 2, 15.25, 10, 5));
			case WEST -> Shapes.or(box(-0.25, 2.5, 6.5, 6.75, 5.5, 10.5), box(-0.25, 10.5, 6.5, 6.75, 13.5, 10.5), box(3.75, 5.5, 6.5, 6.75, 10.5, 10.5), box(8.75, 10.5, 6.5, 15.75, 13.5, 10.5), box(8.75, 2.5, 6.5, 15.75, 5.5, 10.5),
					box(8.75, 5.5, 6.5, 11.75, 10.5, 10.5), box(0.75, 6, 6, 3.75, 10, 11), box(11.75, 6, 6, 14.75, 10, 11), box(0.75, 6, 3, 14.75, 10, 6), box(0.75, 6, 11, 14.75, 10, 14));
			case UP -> Shapes.or(box(5.5, 9.25, 2.5, 9.5, 16.25, 5.5), box(5.5, 9.25, 10.5, 9.5, 16.25, 13.5), box(5.5, 9.25, 5.5, 9.5, 12.25, 10.5), box(5.5, 0.25, 10.5, 9.5, 7.25, 13.5), box(5.5, 0.25, 2.5, 9.5, 7.25, 5.5),
					box(5.5, 4.25, 5.5, 9.5, 7.25, 10.5), box(5, 12.25, 6, 10, 15.25, 10), box(5, 1.25, 6, 10, 4.25, 10), box(10, 1.25, 6, 13, 15.25, 10), box(2, 1.25, 6, 5, 15.25, 10));
			case DOWN -> Shapes.or(box(5.5, -0.25, 10.5, 9.5, 6.75, 13.5), box(5.5, -0.25, 2.5, 9.5, 6.75, 5.5), box(5.5, 3.75, 5.5, 9.5, 6.75, 10.5), box(5.5, 8.75, 2.5, 9.5, 15.75, 5.5), box(5.5, 8.75, 10.5, 9.5, 15.75, 13.5),
					box(5.5, 8.75, 5.5, 9.5, 11.75, 10.5), box(5, 0.75, 6, 10, 3.75, 10), box(5, 11.75, 6, 10, 14.75, 10), box(10, 0.75, 6, 13, 14.75, 10), box(2, 0.75, 6, 5, 14.75, 10));
		};
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(FACING);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		return this.defaultBlockState().setValue(FACING, context.getClickedFace());
	}

	public BlockState rotate(BlockState state, Rotation rot) {
		return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
	}

	public BlockState mirror(BlockState state, Mirror mirrorIn) {
		return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootParams.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}
}
