package aga.android.ibeacon.demo.data

import aga.android.ibeacon.RegionDefinition

object RegionsDefinitionSource {

    fun getDefinitions(): List<RegionDefinition> {
        return listOf(RegionDefinition("e56e1f2c-c756-476f-8323-8d1f9cd245ea", 42819, 55646))
    }
}