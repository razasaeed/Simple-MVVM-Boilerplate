package global.cloud.storage.di

import android.content.Context
import android.content.Intent
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import global.cloud.storage.BuildConfig
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AuthModule {

    @Singleton
    @Provides
    fun provideSignInIntent(@ApplicationContext context: Context): Intent {
        return GoogleSignIn.getClient(context,
            GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestIdToken(BuildConfig.DEFAULT_CLIENT_ID)
                .requestEmail()
                .build()
        ).signInIntent
    }

    @Singleton
    @Provides
    fun provideGoogleSignInClient(@ApplicationContext context: Context): GoogleSignInClient {
        return GoogleSignIn.getClient(context, GoogleSignInOptions.
        Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).
        build())
    }

}