package com.kotlin.面向对象

/**
 * Created by Lin Change on 2017-07-12.
 */
interface InputDevice { //输入设备接口
    fun input(event: Any) //输入的方法
}

interface USBInputDevice: InputDevice //user输入设备接口
interface BLEInputDevice: InputDevice //蓝牙输入设备接口
interface OpticalMouse //光电鼠标接口

abstract class USBMouse(val name: String): USBInputDevice, OpticalMouse { //usb鼠标
    override fun input(event: Any) {

    }

    override fun toString(): String {
        return name
    }
}

class LogitechMouse : USBMouse("罗技鼠标") {

}

class Computer { //电脑类
    fun addUSBInputDevice(inputDevice: USBInputDevice) { //插入usb输入设备
        println("add usb input device: $inputDevice")
    }

    fun addBLEInputDevice(inputDevice: BLEInputDevice) { //插入蓝牙输入设备
        println("add ble input device: $inputDevice")
    }

    fun addInputDevice(inputDevice: InputDevice) { //插入输入设备
        when (inputDevice) {
            is BLEInputDevice -> {
                addBLEInputDevice(inputDevice)
            }
            is USBInputDevice -> {
                addUSBInputDevice(inputDevice)
            }
            else -> {
                throw IllegalArgumentException("输入设备类型不支持")
            }
        }
    }
}

fun main(args: Array<String>) {
    val computer = Computer() //新建电脑
    val mouse = LogitechMouse() //新建罗技鼠标
    computer.addInputDevice(mouse) //把鼠标添加到电脑上
}