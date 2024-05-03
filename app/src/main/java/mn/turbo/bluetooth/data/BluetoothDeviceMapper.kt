package mn.turbo.bluetooth.data

import android.annotation.SuppressLint
import android.bluetooth.BluetoothDevice
import mn.turbo.bluetooth.domain.BluetoothDeviceDomain

@SuppressLint("MissingPermission")
fun BluetoothDevice.toBluetoothDeviceDomain(): BluetoothDeviceDomain {
    return BluetoothDeviceDomain(
        name = name,
        address = address,
    )
}
