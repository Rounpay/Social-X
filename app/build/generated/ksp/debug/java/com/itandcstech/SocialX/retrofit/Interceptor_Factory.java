package com.curiousminds.ytcreatorszone.retrofit;

import com.curiousminds.ytcreatorszone.util.PreferenceHelper;
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
public final class Interceptor_Factory implements Factory<Interceptor> {
  private final Provider<PreferenceHelper> preferenceHelperProvider;

  public Interceptor_Factory(Provider<PreferenceHelper> preferenceHelperProvider) {
    this.preferenceHelperProvider = preferenceHelperProvider;
  }

  @Override
  public Interceptor get() {
    return newInstance(preferenceHelperProvider.get());
  }

  public static Interceptor_Factory create(Provider<PreferenceHelper> preferenceHelperProvider) {
    return new Interceptor_Factory(preferenceHelperProvider);
  }

  public static Interceptor newInstance(PreferenceHelper preferenceHelper) {
    return new Interceptor(preferenceHelper);
  }
}
