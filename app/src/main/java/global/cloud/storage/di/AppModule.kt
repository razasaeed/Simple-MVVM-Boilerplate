package global.cloud.storage.di

import android.content.Context
import android.content.SharedPreferences
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import global.cloud.storage.ui.data.Constants

@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Provides
    fun providePreferences(@ApplicationContext context: Context): SharedPreferences {
        return context.getSharedPreferences(Constants.PREF_NAME, Context.MODE_PRIVATE)
    }

}