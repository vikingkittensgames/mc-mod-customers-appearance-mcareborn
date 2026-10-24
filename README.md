# Customers MCA Reborn Appearance

Customers MCA Reborn Appearance is an optional Fabric and NeoForge add-on for
[Customers](https://www.curseforge.com/minecraft/mc-mods/customers). It adds
the existing `Minecraft Comes Alive` appearance to Customer and Supplier
Spawners using MCA Reborn's villager models, genetics, clothing, hairstyles,
and configured voices.

## Documentation

Check out the full Customers documentation here:

https://vikingkittensgames.github.io/mc-mod-customers-appearance-mcareborn

## Building

First build the Customers NeoForge production JAR at
`../neoforge/build/libs/customers-neoforge-1.21.1-2.1.0.jar`, then run from
this directory:

```text
..\gradlew.bat --no-daemon spotlessCheck testAllLoaders buildAllLoaders
```

The remapped release JARs are:

- `fabric/build/libs/customers_mcareborn_appearance-fabric-1.21.1-1.0.0.jar`
- `neoforge/build/libs/customers_mcareborn_appearance-neoforge-1.21.1-1.0.0.jar`

The add-on uses the same Architectury Loom 1.13.469 baseline as Customers.
MCA Reborn's loader-specific production JARs remain external dependencies and
are not bundled into the appearance add-on.

## Compatibility and licensing

This integration is a separate add-on because MCA Reborn integration relies on
its renderer and entity APIs. MCA Reborn remains a required user-installed
dependency; this add-on does not redistribute MCA Reborn assets.
