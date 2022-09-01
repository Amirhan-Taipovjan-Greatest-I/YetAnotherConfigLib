package dev.isxander.yacl.api;

import net.minecraft.text.Text;

/**
 * Used for the default value formatter of {@link dev.isxander.yacl.gui.controllers.EnumController}
 */
public interface NameableEnum {
    Text getDisplayName();
}
