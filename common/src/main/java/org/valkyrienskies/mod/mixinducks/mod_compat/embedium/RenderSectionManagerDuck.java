package org.valkyrienskies.mod.mixinducks.mod_compat.embedium;

import java.util.WeakHashMap;
import org.embeddedt.embeddium.impl.render.chunk.lists.SortedRenderLists;
import org.valkyrienskies.core.api.ships.ClientShip;

public interface RenderSectionManagerDuck {

    WeakHashMap<ClientShip, SortedRenderLists> vs_getShipRenderLists();

}
