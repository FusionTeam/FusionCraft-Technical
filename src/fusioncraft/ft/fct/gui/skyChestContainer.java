package ft.fct.gui;
/**
 * @author Maximilian Bloom
 */
/*
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class skyChestContainer extends Container{

	protected skyChestTileEntity te;

	@Override
	public boolean canInteractWith(EntityPlayer entityplayer) {
		return te.isUseableByPlayer(entityplayer);
	}

	public skyChestContainer(InventoryPlayer inventoryPlayer, skyChestTileEntity tileEntity){
		te = tileEntity;

		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				addSlotToContainer(new Slot(te, j + i * 3, 62 + j * 18, 17 + i * 18));

			}

		}

		bindPlayerInventory(inventoryPlayer);

	}

	private void bindPlayerInventory(InventoryPlayer inventoryPlayer) {

		for(int i = 0; i < 3; i++){

			for(int j = 0; j < 9; j++){

				addSlotToContainer(new Slot(inventoryPlayer, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));

			}



		}

		for(int i = 0; i < 9; i++){
			addSlotToContainer(new Slot(inventoryPlayer, i, 8 + i * 18, 142));
		}

	}

	@Override
	public ItemStack transferStackInSlot(EntityPlayer player, int slot){
		ItemStack stack = null;
		Slot slotObject = (Slot)inventorySlots.get(slot);

		if(slotObject != null && slotObject.getHasStack()){
			ItemStack stackInSlot = slotObject.getStack();
			stack = stackInSlot.copy();

			if(slot < 9){

				if(!mergeItemStack(stackInSlot, 0, 35, true)){
					return null;
				}

			}else if(!mergeItemStack(stackInSlot, 0, 9, false)){
				return null;
			}

			if(stackInSlot.stackSize == 0){
				slotObject.putStack(null);
			}else{
				slotObject.onSlotChanged();
			}


			if(stackInSlot.stackSize == stack.stackSize){

				return null;
			}

			slotObject.onPickupFromSlot(player, stackInSlot);

		}

		return stack;

	}


}
*/