# Customers MCA Reborn Appearance

Customers MCA Reborn Appearance is an optional Fabric and NeoForge add-on for
[Customers](https://www.curseforge.com/minecraft/mc-mods/customers). It adds
the existing `Minecraft Comes Alive` appearance to Customer and Supplier
Spawners using MCA Reborn's villager models, genetics, clothing, hairstyles,
and configured voices.

## Requirements

- Minecraft 1.21.1
- Fabric Loader 0.18.6 with Fabric API 0.105.0+, or NeoForge 21.1.230+
- Customers 2.1.0 or newer
- Architectury API 13.0.8 or newer in the 13.0 line
- MCA Reborn 7.7.9 or newer

Install all requirements on both the server and client.

## Existing worlds

This add-on deliberately preserves the original `customers:mca` appearance
identifier. Customer and Supplier Spawners and villagers saved with the former
built-in MCA integration therefore continue to use the MCA appearance after
the add-on is installed. No data migration is needed.

## Behavior

Enable Minecraft Comes Alive in a Customer or Supplier Spawner's appearance
list. Spawned villagers use MCA Reborn's renderer and preserve their selected
genetics, skin layers, clothing, hairstyle, gendered voices, and sitting
behavior through their Customers appearance variation.

Customers and Suppliers remain Customers entities: MCA Reborn is used only for
appearance and sound rendering.

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
