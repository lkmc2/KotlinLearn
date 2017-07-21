package com.kotlin.领域特定语言

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

/**
 * Created by Lin Change on 2017-07-17.
 */
class MapDelegate(val map: MutableMap<String, String>) : ReadWriteProperty<Any, String> { //map代理
    override fun getValue(thisRef: Any, property: KProperty<*>): String {
        return map[property.name] ?: ""
    }

    override fun setValue(thisRef: Any, property: KProperty<*>, value: String) {
        map[property.name] = value
    }
}