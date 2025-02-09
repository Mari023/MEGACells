package gripe._90.megacells.integration.appmek.item;

import java.util.List;

import com.google.common.base.Preconditions;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import appeng.api.config.FuzzyMode;
import appeng.api.storage.cells.ICellWorkbenchItem;
import appeng.items.AEBaseItem;
import appeng.items.contents.CellConfig;
import appeng.util.ConfigInventory;

import me.ramidzkh.mekae2.ae2.MekanismKeyType;

import gripe._90.megacells.integration.appmek.item.cell.radioactive.RadioactiveCellHandler;

public class MEGARadioactiveCell extends AEBaseItem implements ICellWorkbenchItem {
    public MEGARadioactiveCell(Properties properties) {
        super(properties.stacksTo(1));
    }

    @Override
    public boolean isEditable(ItemStack itemStack) {
        return true;
    }

    public ConfigInventory getConfigInventory(ItemStack is) {
        return CellConfig.create(MekanismKeyType.TYPE.filter(), is, 1);
    }

    @Override
    public FuzzyMode getFuzzyMode(ItemStack itemStack) {
        return null;
    }

    @Override
    public void setFuzzyMode(ItemStack itemStack, FuzzyMode fuzzyMode) {
    }

    @Override
    public void appendHoverText(ItemStack is, Level level, List<Component> lines, TooltipFlag advancedTooltips) {
        Preconditions.checkArgument(is.getItem() == this);
        RadioactiveCellHandler.INSTANCE.addCellInformationToTooltip(is, lines);
    }

}
