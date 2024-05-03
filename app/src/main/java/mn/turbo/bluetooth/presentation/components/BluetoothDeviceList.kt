package mn.turbo.bluetooth.presentation.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import mn.turbo.bluetooth.domain.BluetoothDeviceDomain

@Composable
fun BluetoothDeviceList(
    pairedDevices: List<BluetoothDeviceDomain>,
    scannedDevices: List<BluetoothDeviceDomain>,
    onClick: (BluetoothDeviceDomain) -> Unit,
    modifier: Modifier = Modifier,
) {
    LazyColumn(
        modifier = modifier,
    ) {
        // title
        item {
            Text(
                text = "Paired Devices",
                fontWeight = FontWeight.W600,
                fontSize = 24.sp,
                modifier = Modifier.padding(16.dp),
            )
        }

        // devices
        items(pairedDevices) { device ->
            if (!device.name.isNullOrEmpty()) {
                Text(
                    text = device.name,
                    modifier = Modifier
                        .fillMaxWidth()
                        .clickable { onClick(device) }
                        .padding(16.dp),
                )
            }
        }

        // title
        item {
            Text(
                text = "Scanned Devices",
                fontWeight = FontWeight.W600,
                fontSize = 24.sp,
                modifier = Modifier.padding(16.dp),
            )
        }

        // devices
        items(scannedDevices) { device ->
            if (!device.name.isNullOrEmpty()) {
                Text(
                    text = device.name,
                    modifier = Modifier
                        .fillMaxWidth()
                        .clickable { onClick(device) }
                        .padding(16.dp),
                )
            }
        }
    }
}
