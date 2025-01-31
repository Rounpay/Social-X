package com.curiousminds.ytcreatorszone.modules.auth.data;

import com.curiousminds.ytcreatorszone.retrofit.Apis;
import com.curiousminds.ytcreatorszone.util.NetworkManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast"
})
public final class AuthRepo_Factory implements Factory<AuthRepo> {
  private final Provider<NetworkManager> networkManagerProvider;

  private final Provider<Apis> apisProvider;

  public AuthRepo_Factory(Provider<NetworkManager> networkManagerProvider,
      Provider<Apis> apisProvider) {
    this.networkManagerProvider = networkManagerProvider;
    this.apisProvider = apisProvider;
  }

  @Override
  public AuthRepo get() {
    return newInstance(networkManagerProvider.get(), apisProvider.get());
  }

  public static AuthRepo_Factory create(Provider<NetworkManager> networkManagerProvider,
      Provider<Apis> apisProvider) {
    return new AuthRepo_Factory(networkManagerProvider, apisProvider);
  }

  public static AuthRepo newInstance(NetworkManager networkManager, Apis apis) {
    return new AuthRepo(networkManager, apis);
  }
}
