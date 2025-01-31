package com.curiousminds.ytcreatorszone.retrofit;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
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
public final class NetworkModule_GetRetrofitApiFactory implements Factory<Apis> {
  private final NetworkModule module;

  private final Provider<Interceptor> interceptorProvider;

  private final Provider<Context> contextProvider;

  public NetworkModule_GetRetrofitApiFactory(NetworkModule module,
      Provider<Interceptor> interceptorProvider, Provider<Context> contextProvider) {
    this.module = module;
    this.interceptorProvider = interceptorProvider;
    this.contextProvider = contextProvider;
  }

  @Override
  public Apis get() {
    return getRetrofitApi(module, interceptorProvider.get(), contextProvider.get());
  }

  public static NetworkModule_GetRetrofitApiFactory create(NetworkModule module,
      Provider<Interceptor> interceptorProvider, Provider<Context> contextProvider) {
    return new NetworkModule_GetRetrofitApiFactory(module, interceptorProvider, contextProvider);
  }

  public static Apis getRetrofitApi(NetworkModule instance, Interceptor interceptor,
      Context context) {
    return Preconditions.checkNotNullFromProvides(instance.getRetrofitApi(interceptor, context));
  }
}
