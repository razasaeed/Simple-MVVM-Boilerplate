package global.cloud.storage.utils

import android.os.Environment
import android.os.StatFs
import java.math.RoundingMode
import java.text.DecimalFormat
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class StorageUtils @Inject constructor() {

    fun getAvailableInternalMemorySize(): String? {
        val path = Environment.getDataDirectory()
        val stat = StatFs(path.path)
        val blockSize = stat.blockSizeLong
        val availableBlocks = stat.availableBlocksLong
        return formatSize(availableBlocks * blockSize)
    }

    fun getMaxValue(): Int {
        val stat = StatFs(Environment.getExternalStorageDirectory().path)
        return (stat.blockCountLong ).toInt()
    }

    fun getConsumedValue(): Int {
        val stat = StatFs(Environment.getExternalStorageDirectory().path)
        return (stat.blockCountLong - stat.availableBlocksLong).toInt()
    }

    fun getTotalInternalMemorySize(): String? {
        val path = Environment.getDataDirectory()
        val stat = StatFs(path.path)
        val blockSize = stat.blockSizeLong
        val totalBlocks = stat.blockCountLong
        return formatSize(totalBlocks * blockSize)
    }

    fun usedMemorySize(): String? {
        // total
        val path = Environment.getDataDirectory()
        val stat = StatFs(path.path)
        val blockSize = stat.blockSizeLong
        val totalBlocks = stat.blockCountLong

        // available
        val aavailableBlocks = stat.availableBlocksLong

        val usedSize = totalBlocks-aavailableBlocks

        return formatSize(usedSize * blockSize)
    }

    private fun formatSize(size: Long): String? {
        var convertedSize = size.toDouble()
        var suffix: String? = null
        if (convertedSize >= 1024) {
            suffix = " KB"
            convertedSize /= 1024
            if (convertedSize >= 1024) {
                suffix = " MB"
                convertedSize /= 1024

                val df = DecimalFormat("#.#")
                df.roundingMode = RoundingMode.CEILING
                convertedSize = df.format(convertedSize).toDouble()

                if (convertedSize >= 1024) {
                    suffix = " GB"
                    convertedSize /= 1024

                    val df = DecimalFormat("#.#")
                    df.roundingMode = RoundingMode.CEILING
                    convertedSize = df.format(convertedSize).toDouble()
                }
            }
        }
        val resultBuffer = StringBuilder(convertedSize.toString())
        if (suffix != null) resultBuffer.append(suffix)
        return resultBuffer.toString()
    }

}