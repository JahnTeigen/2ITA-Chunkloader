# MC 2ITA Chunkloader

NeoForge mod for **Minecraft 1.21.1** (NeoForge version **21.1.211**). Server-side, admin controlled chunkloading, designed for Create's steam engine and conveyor belts. 

## Prerequisites

- **JDK 21** (required by Minecraft 1.21.1 / NeoForge). This project pins it in `gradle.properties` via `org.gradle.java.home`.
- **Git** (optional, for version control)
- **IDE**: IntelliJ IDEA or VS Code with Java extensions

JDK 21 was installed as: `Microsoft.OpenJDK.21` (21.0.11).

## Project layout

```
src/main/java/no/mc2ita/chunkloader/   # Mod source (commands, chunk logic go here)
src/main/templates/META-INF/         # neoforge.mods.toml template (processed at build)
gradle.properties                    # Minecraft, NeoForge, and mod versions
```

## Gradle tasks

From the project root (Windows):

```bat
.\gradlew.bat build          # Compile mod JAR → build/libs/
.\gradlew.bat runServer      # Local test dedicated server (no GUI)
.\gradlew.bat runClient      # Optional client run (mod is server-focused)
```

First run downloads Minecraft, NeoForge, and mappings — expect several minutes.

## Deploying to your server

1. Build: `.\gradlew.bat build`
2. Copy `build/libs/chunkloader-0.1.0-SNAPSHOT.jar` to the server's `mods/` folder
3. Use the same **NeoForge 21.1.211** (or compatible) loader on the server
4. Install **Create** on the server as usual; players do **not** need this chunkloader mod on their clients

## Development notes (next steps)

Planned implementation areas (not built yet):

- `no.mc2ita.chunkloader.command` — `/chunkload`, `/chunkunload`, `/chunkload list`
- `no.mc2ita.chunkloader.chunk` — ticket storage, persistence (`SavedData` or JSON)
- Permission: require OP level 4 (or NeoForge permission node) on all commands

## Versions

| Component | Version |
|-----------|---------|
| Minecraft | 1.21.1 |
| NeoForge | 21.1.211 |
| Java | 21 |
| Parchment | 2024.11.17 |
