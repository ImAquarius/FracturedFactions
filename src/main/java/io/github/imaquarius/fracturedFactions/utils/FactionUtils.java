package io.github.imaquarius.fracturedFactions.utils;

import com.dansplugins.factionsystem.faction.MfFaction;
import com.dansplugins.factionsystem.faction.MfFactionMember;
import org.bukkit.Bukkit;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.UUID;

public final class FactionUtils {

    private static final String OWNER_ROLE_NAME = "Owner";

    private FactionUtils() {

    }

    @Nullable
    public static UUID getFactionOwnerUUID(MfFaction faction) {
        List<MfFactionMember> members = faction.getMembers();

        for (MfFactionMember member : members) {
            String roleName = member.getRole().getName();

            if (OWNER_ROLE_NAME.equalsIgnoreCase(roleName)) {
                return UUID.fromString(member.getPlayerId());
            }
        }
        return null;
    }
}