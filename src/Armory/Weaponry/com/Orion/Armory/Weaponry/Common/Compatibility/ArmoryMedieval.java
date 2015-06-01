package com.Orion.Armory.Weaponry.Common.Compatibility;

import com.Orion.Armory.API.Armor.IArmorMaterial;
import com.Orion.Armory.API.Events.Common.ActivateArmorAddonEvent;
import com.Orion.Armory.API.Events.Common.ModifyMaterialEvent;
import com.Orion.Armory.Weaponry.Util.References;
import cpw.mods.fml.common.eventhandler.Event;

/**
 * Created by Orion
 * Created on 01.06.2015
 * 11:37
 * <p/>
 * Copyrighted according to Project specific license
 */
public class ArmoryMedieval
{
    public static void HandleTopHeadMaterials(ActivateArmorAddonEvent pEvent)
    {
        //NOOP
    }

    public static void HandleRightSideHeadMaterials(ActivateArmorAddonEvent pEvent)
    {
        IArmorMaterial tMaterial = pEvent.iArmorMaterial;

        if (tMaterial.getInternalMaterialName().equals(com.Orion.Armory.Weaponry.Util.References.InternalNames.Materials.TinkersConstruct.MANYULLUN)) {
            pEvent.setResult(Event.Result.DENY);
        }
    }

    public static void HandleLeftSideHeadMaterials(ActivateArmorAddonEvent pEvent)
    {
        IArmorMaterial tMaterial = pEvent.iArmorMaterial;

        if (tMaterial.getInternalMaterialName().equals(com.Orion.Armory.Weaponry.Util.References.InternalNames.Materials.TinkersConstruct.MANYULLUN)) {
            pEvent.setResult(Event.Result.DENY);
        }
    }

    public static void HandleLeftShoulderPadMaterials(ActivateArmorAddonEvent pEvent)
    {
        IArmorMaterial tMaterial = pEvent.iArmorMaterial;

        if (tMaterial.getInternalMaterialName().equals(com.Orion.Armory.Weaponry.Util.References.InternalNames.Materials.TinkersConstruct.COBALT) || tMaterial.getInternalMaterialName().equals(com.Orion.Armory.Weaponry.Util.References.InternalNames.Materials.TinkersConstruct.MANYULLUN)) {
            pEvent.setResult(Event.Result.DENY);
        }
    }

    public static void HandleRightShouldPadMaterialsMaterials(ActivateArmorAddonEvent pEvent)
    {
        IArmorMaterial tMaterial = pEvent.iArmorMaterial;

        if (tMaterial.getInternalMaterialName().equals(com.Orion.Armory.Weaponry.Util.References.InternalNames.Materials.TinkersConstruct.COBALT) || tMaterial.getInternalMaterialName().equals(com.Orion.Armory.Weaponry.Util.References.InternalNames.Materials.TinkersConstruct.MANYULLUN)) {
            pEvent.setResult(Event.Result.DENY);
        }
    }

    public static void HandleLeftFrontChestplateMaterials(ActivateArmorAddonEvent pEvent)
    {
        //NOOP
    }

    public static void HandleRightFrontChestplateMaterials(ActivateArmorAddonEvent pEvent)
    {
        //NOOP
    }

    public static void HandleLeftBackChestplateMaterials(ActivateArmorAddonEvent pEvent)
    {
        //NOOP
    }

    public static void HandleRightBackChestplateMaterials(ActivateArmorAddonEvent pEvent)
    {
        //NOOP
    }

    public static void HandleLeftFrontLeggingsMaterials(ActivateArmorAddonEvent pEvent)
    {
        //NOOP
    }

    public static void HandleRightFrontLeggingsMaterials(ActivateArmorAddonEvent pEvent)
    {
        //NOOP
    }

    public static void HandleLeftBackLeggingsMaterials(ActivateArmorAddonEvent pEvent)
    {
        //NOOP
    }

    public static void HandleRightBackLegginsMaterials(ActivateArmorAddonEvent pEvent)
    {
        //NOOP
    }

    public static void HandleLeftShoesMaterials(ActivateArmorAddonEvent pEvent)
    {
        IArmorMaterial tMaterial = pEvent.iArmorMaterial;

        if ((tMaterial.getInternalMaterialName().equals(com.Orion.Armory.Weaponry.Util.References.InternalNames.Materials.TinkersConstruct.ARDITE)) || (tMaterial.getInternalMaterialName().equals(com.Orion.Armory.Weaponry.Util.References.InternalNames.Materials.TinkersConstruct.COBALT)) || tMaterial.getInternalMaterialName().equals(com.Orion.Armory.Weaponry.Util.References.InternalNames.Materials.TinkersConstruct.MANYULLUN)) {
            pEvent.setResult(Event.Result.DENY);
        } 
    }

    public static void HandleRightShoesMaterials(ActivateArmorAddonEvent pEvent)
    {
        IArmorMaterial tMaterial = pEvent.iArmorMaterial;
        
        if ((tMaterial.getInternalMaterialName().equals(com.Orion.Armory.Weaponry.Util.References.InternalNames.Materials.TinkersConstruct.ARDITE)) || (tMaterial.getInternalMaterialName().equals(com.Orion.Armory.Weaponry.Util.References.InternalNames.Materials.TinkersConstruct.COBALT)) || tMaterial.getInternalMaterialName().equals(com.Orion.Armory.Weaponry.Util.References.InternalNames.Materials.TinkersConstruct.MANYULLUN)) {
            pEvent.setResult(Event.Result.DENY);
        }
    }
    
    public static void ModifyMaterialForHelmet(ModifyMaterialEvent pEvent)
    {
        IArmorMaterial tMaterial = pEvent.iArmorMaterial;

        if (tMaterial.getInternalMaterialName().equals(References.InternalNames.Materials.Vanilla.CHAIN)) {
            tMaterial.setBaseDamageAbsorption(pEvent.iArmor.getInternalName(), 2.0F);
            tMaterial.setBaseDurability(pEvent.iArmor.getInternalName(), 60);
            tMaterial.setMaxModifiersOnPart(pEvent.iArmor.getInternalName(), 1);
        } else if (tMaterial.getInternalMaterialName().equals(References.InternalNames.Materials.TinkersConstruct.ALUMITE)) {
            tMaterial.setBaseDamageAbsorption(pEvent.iArmor.getInternalName(), 2.0F);
            tMaterial.setBaseDurability(pEvent.iArmor.getInternalName(), 100);
            tMaterial.setMaxModifiersOnPart(pEvent.iArmor.getInternalName(), 2);
        } else if (tMaterial.getInternalMaterialName().equals(References.InternalNames.Materials.Common.BRONZE)) {
            tMaterial.setBaseDamageAbsorption(pEvent.iArmor.getInternalName(), 1.0F);
            tMaterial.setBaseDurability(pEvent.iArmor.getInternalName(), 100);
            tMaterial.setMaxModifiersOnPart(pEvent.iArmor.getInternalName(), 0);
        } else if (tMaterial.getInternalMaterialName().equals(References.InternalNames.Materials.TinkersConstruct.ARDITE)) {
            tMaterial.setBaseDamageAbsorption(pEvent.iArmor.getInternalName(), 2.5F);
            tMaterial.setBaseDurability(pEvent.iArmor.getInternalName(), 100);
            tMaterial.setMaxModifiersOnPart(pEvent.iArmor.getInternalName(), 2);
        } else if (tMaterial.getInternalMaterialName().equals(References.InternalNames.Materials.TinkersConstruct.COBALT)) {
            tMaterial.setBaseDamageAbsorption(pEvent.iArmor.getInternalName(), 3F);
            tMaterial.setBaseDurability(pEvent.iArmor.getInternalName(), 140);
            tMaterial.setMaxModifiersOnPart(pEvent.iArmor.getInternalName(), 2);
        } else if (tMaterial.getInternalMaterialName().equals(References.InternalNames.Materials.TinkersConstruct.MANYULLUN)) {
            tMaterial.setBaseDamageAbsorption(pEvent.iArmor.getInternalName(), 3.5F);
            tMaterial.setBaseDurability(pEvent.iArmor.getInternalName(), 250);
            tMaterial.setMaxModifiersOnPart(pEvent.iArmor.getInternalName(), 3);
        }
    }

    public static void ModifyMaterialForChestplate(ModifyMaterialEvent pEvent)
    {
        IArmorMaterial tMaterial = pEvent.iArmorMaterial;

        if (tMaterial.getInternalMaterialName().equals(References.InternalNames.Materials.Vanilla.CHAIN)) {
            tMaterial.setBaseDamageAbsorption(pEvent.iArmor.getInternalName(), 2.5F);
            tMaterial.setBaseDurability(pEvent.iArmor.getInternalName(), 60);
            tMaterial.setMaxModifiersOnPart(pEvent.iArmor.getInternalName(), 1);
        } else if (tMaterial.getInternalMaterialName().equals(References.InternalNames.Materials.TinkersConstruct.ALUMITE)) {
            tMaterial.setBaseDamageAbsorption(pEvent.iArmor.getInternalName(), 2.5F);
            tMaterial.setBaseDurability(pEvent.iArmor.getInternalName(), 100);
            tMaterial.setMaxModifiersOnPart(pEvent.iArmor.getInternalName(), 2);
        } else if (tMaterial.getInternalMaterialName().equals(References.InternalNames.Materials.Common.BRONZE)) {
            tMaterial.setBaseDamageAbsorption(pEvent.iArmor.getInternalName(), 1.5F);
            tMaterial.setBaseDurability(pEvent.iArmor.getInternalName(), 100);
            tMaterial.setMaxModifiersOnPart(pEvent.iArmor.getInternalName(), 0);
        } else if (tMaterial.getInternalMaterialName().equals(References.InternalNames.Materials.TinkersConstruct.ARDITE)) {
            tMaterial.setBaseDamageAbsorption(pEvent.iArmor.getInternalName(), 3.0F);
            tMaterial.setBaseDurability(pEvent.iArmor.getInternalName(), 100);
            tMaterial.setMaxModifiersOnPart(pEvent.iArmor.getInternalName(), 2);
        } else if (tMaterial.getInternalMaterialName().equals(References.InternalNames.Materials.TinkersConstruct.COBALT)) {
            tMaterial.setBaseDamageAbsorption(pEvent.iArmor.getInternalName(), 3.5F);
            tMaterial.setBaseDurability(pEvent.iArmor.getInternalName(), 140);
            tMaterial.setMaxModifiersOnPart(pEvent.iArmor.getInternalName(), 2);
        } else if (tMaterial.getInternalMaterialName().equals(References.InternalNames.Materials.TinkersConstruct.MANYULLUN)) {
            tMaterial.setBaseDamageAbsorption(pEvent.iArmor.getInternalName(), 4.0F);
            tMaterial.setBaseDurability(pEvent.iArmor.getInternalName(), 250);
            tMaterial.setMaxModifiersOnPart(pEvent.iArmor.getInternalName(), 3);
        }
    }

    public static void ModifyMaterialForLeggings(ModifyMaterialEvent pEvent)
    {
        IArmorMaterial tMaterial = pEvent.iArmorMaterial;

        if (tMaterial.getInternalMaterialName().equals(References.InternalNames.Materials.Vanilla.CHAIN)) {
            tMaterial.setBaseDamageAbsorption(pEvent.iArmor.getInternalName(), 2.0F);
            tMaterial.setBaseDurability(pEvent.iArmor.getInternalName(), 60);
            tMaterial.setMaxModifiersOnPart(pEvent.iArmor.getInternalName(), 1);
        } else if (tMaterial.getInternalMaterialName().equals(References.InternalNames.Materials.TinkersConstruct.ALUMITE)) {
            tMaterial.setBaseDamageAbsorption(pEvent.iArmor.getInternalName(), 2.0F);
            tMaterial.setBaseDurability(pEvent.iArmor.getInternalName(), 100);
            tMaterial.setMaxModifiersOnPart(pEvent.iArmor.getInternalName(), 2);
        } else if (tMaterial.getInternalMaterialName().equals(References.InternalNames.Materials.Common.BRONZE)) {
            tMaterial.setBaseDamageAbsorption(pEvent.iArmor.getInternalName(), 1.0F);
            tMaterial.setBaseDurability(pEvent.iArmor.getInternalName(), 100);
            tMaterial.setMaxModifiersOnPart(pEvent.iArmor.getInternalName(), 0);
        } else if (tMaterial.getInternalMaterialName().equals(References.InternalNames.Materials.TinkersConstruct.ARDITE)) {
            tMaterial.setBaseDamageAbsorption(pEvent.iArmor.getInternalName(), 2.5F);
            tMaterial.setBaseDurability(pEvent.iArmor.getInternalName(), 100);
            tMaterial.setMaxModifiersOnPart(pEvent.iArmor.getInternalName(), 2);
        } else if (tMaterial.getInternalMaterialName().equals(References.InternalNames.Materials.TinkersConstruct.COBALT)) {
            tMaterial.setBaseDamageAbsorption(pEvent.iArmor.getInternalName(), 3F);
            tMaterial.setBaseDurability(pEvent.iArmor.getInternalName(), 140);
            tMaterial.setMaxModifiersOnPart(pEvent.iArmor.getInternalName(), 2);
        } else if (tMaterial.getInternalMaterialName().equals(References.InternalNames.Materials.TinkersConstruct.MANYULLUN)) {
            tMaterial.setBaseDamageAbsorption(pEvent.iArmor.getInternalName(), 3.5F);
            tMaterial.setBaseDurability(pEvent.iArmor.getInternalName(), 250);
            tMaterial.setMaxModifiersOnPart(pEvent.iArmor.getInternalName(), 3);
        }
    }

    public static void ModifyMaterialForShoes(ModifyMaterialEvent pEvent)
    {
        IArmorMaterial tMaterial = pEvent.iArmorMaterial;

        if (tMaterial.getInternalMaterialName().equals(References.InternalNames.Materials.Vanilla.CHAIN)) {
            tMaterial.setBaseDamageAbsorption(pEvent.iArmor.getInternalName(), 1.5F);
            tMaterial.setBaseDurability(pEvent.iArmor.getInternalName(), 60);
            tMaterial.setMaxModifiersOnPart(pEvent.iArmor.getInternalName(), 1);
        } else if (tMaterial.getInternalMaterialName().equals(References.InternalNames.Materials.TinkersConstruct.ALUMITE)) {
            tMaterial.setBaseDamageAbsorption(pEvent.iArmor.getInternalName(), 1.5F);
            tMaterial.setBaseDurability(pEvent.iArmor.getInternalName(), 100);
            tMaterial.setMaxModifiersOnPart(pEvent.iArmor.getInternalName(), 2);
        } else if (tMaterial.getInternalMaterialName().equals(References.InternalNames.Materials.Common.BRONZE)) {
            tMaterial.setBaseDamageAbsorption(pEvent.iArmor.getInternalName(), 0.5F);
            tMaterial.setBaseDurability(pEvent.iArmor.getInternalName(), 100);
            tMaterial.setMaxModifiersOnPart(pEvent.iArmor.getInternalName(), 0);
        } else if (tMaterial.getInternalMaterialName().equals(References.InternalNames.Materials.TinkersConstruct.ARDITE)) {
            tMaterial.setBaseDamageAbsorption(pEvent.iArmor.getInternalName(), 2.0F);
            tMaterial.setBaseDurability(pEvent.iArmor.getInternalName(), 100);
            tMaterial.setMaxModifiersOnPart(pEvent.iArmor.getInternalName(), 2);
        } else if (tMaterial.getInternalMaterialName().equals(References.InternalNames.Materials.TinkersConstruct.COBALT)) {
            tMaterial.setBaseDamageAbsorption(pEvent.iArmor.getInternalName(), 2.5F);
            tMaterial.setBaseDurability(pEvent.iArmor.getInternalName(), 140);
            tMaterial.setMaxModifiersOnPart(pEvent.iArmor.getInternalName(), 2);
        } else if (tMaterial.getInternalMaterialName().equals(References.InternalNames.Materials.TinkersConstruct.MANYULLUN)) {
            tMaterial.setBaseDamageAbsorption(pEvent.iArmor.getInternalName(), 3.0F);
            tMaterial.setBaseDurability(pEvent.iArmor.getInternalName(), 250);
            tMaterial.setMaxModifiersOnPart(pEvent.iArmor.getInternalName(), 3);
        }
    }
    
    public static void ModifyMaterialForOther(ModifyMaterialEvent pEvent)
    {
        IArmorMaterial tMaterial = pEvent.iArmorMaterial;

        if (tMaterial.getInternalMaterialName().equals(References.InternalNames.Materials.Vanilla.CHAIN)) {
            tMaterial.setBaseDamageAbsorption(pEvent.iArmor.getInternalName(), 1.5F);
            tMaterial.setBaseDurability(pEvent.iArmor.getInternalName(), 60);
            tMaterial.setMaxModifiersOnPart(pEvent.iArmor.getInternalName(), 1);
        } else if (tMaterial.getInternalMaterialName().equals(References.InternalNames.Materials.TinkersConstruct.ALUMITE)) {
            tMaterial.setBaseDamageAbsorption(pEvent.iArmor.getInternalName(), 1.5F);
            tMaterial.setBaseDurability(pEvent.iArmor.getInternalName(), 100);
            tMaterial.setMaxModifiersOnPart(pEvent.iArmor.getInternalName(), 2);
        } else if (tMaterial.getInternalMaterialName().equals(References.InternalNames.Materials.Common.BRONZE)) {
            tMaterial.setBaseDamageAbsorption(pEvent.iArmor.getInternalName(), 0.5F);
            tMaterial.setBaseDurability(pEvent.iArmor.getInternalName(), 100);
            tMaterial.setMaxModifiersOnPart(pEvent.iArmor.getInternalName(), 0);
        } else if (tMaterial.getInternalMaterialName().equals(References.InternalNames.Materials.TinkersConstruct.ARDITE)) {
            tMaterial.setBaseDamageAbsorption(pEvent.iArmor.getInternalName(), 2.0F);
            tMaterial.setBaseDurability(pEvent.iArmor.getInternalName(), 100);
            tMaterial.setMaxModifiersOnPart(pEvent.iArmor.getInternalName(), 2);
        } else if (tMaterial.getInternalMaterialName().equals(References.InternalNames.Materials.TinkersConstruct.COBALT)) {
            tMaterial.setBaseDamageAbsorption(pEvent.iArmor.getInternalName(), 2.5F);
            tMaterial.setBaseDurability(pEvent.iArmor.getInternalName(), 140);
            tMaterial.setMaxModifiersOnPart(pEvent.iArmor.getInternalName(), 2);
        } else if (tMaterial.getInternalMaterialName().equals(References.InternalNames.Materials.TinkersConstruct.MANYULLUN)) {
            tMaterial.setBaseDamageAbsorption(pEvent.iArmor.getInternalName(), 3.0F);
            tMaterial.setBaseDurability(pEvent.iArmor.getInternalName(), 250);
            tMaterial.setMaxModifiersOnPart(pEvent.iArmor.getInternalName(), 3);
        }
    }


}