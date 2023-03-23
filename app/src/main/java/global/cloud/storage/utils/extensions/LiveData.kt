package global.cloud.storage.utils.extensions

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData

fun <T> LiveData<T>.observeNonNull(owner: LifecycleOwner, observer: (t: T) -> Unit) {
    this.observe(
        owner
    ) {
        it?.let(observer)
    }
}

fun <T> LiveData<T>.toMutableLiveData(): MutableLiveData<T> = MediatorLiveData<T>().apply {
    addSource(this@toMutableLiveData) { postValue(it) }
}
