# Fractured Factions

Developed for Play.FracturedKingdoms.net. Fractured Factions is an extension of [MedievalFactions](https://www.spigotmc.org/resources/medieval-factions.79941/) that introduces unique features to enhance and customize the core factions experience. 

## Features

- **Faction Specialization**: Specialization paths grant unique buffs and upgrades to factions and members.
- [More Coming Soon]

### Dependencies
- **Medieval Factions** (Required): Make sure you have the Medieval Factions plugin installed on your server.

## Installation

To install FracturedFactions on your server:

1. Download MedievalFactions `.jar` from [Medieval Factions](https://www.spigotmc.org/resources/medieval-factions.79941/history)
2. Download the latest `.jar` from the [releases page](https://github.com/ImAquarius/fractured-factions/releases) [Coming Soon].
3. Place both `.jar` files in your server’s `plugins` folder.
4. Restart the server.

## Building
FracturedFactions uses Maven for dependencies and building.

**Requirements**:

- Java 21+ JDK
- Create `libs` directory in project root
- Add MedievalFactions `.jar` to `/libs` directory

**Ensure this is in your `Pom.xml`**
```
<dependency>
    <groupId>com.dansplugin</groupId>
    <artifactId>medievalfactions</artifactId>
    <version>5.6.0</version>
    <scope>system</scope>
    <systemPath>${project.basedir}/libs/medieval-factions-5.6.0.jar</systemPath>
</dependency>
```

## License

This plugin is licensed under the GNU General Public License v3.0. See the [LICENSE](https://github.com/ImAquarius/fractured-factions?tab=GPL-3.0-1-ov-file#) file for details.

## Credits

ImAquarius: Developer of FracturedFactions.

Medieval Factions: Core Factions plugin.



## Discord
Fractured Kingdoms --> https://discord.gg/TCe9Ehe5sF