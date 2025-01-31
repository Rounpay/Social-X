package com.curiousminds.ytcreatorszone.modules.auth.login;

import com.curiousminds.ytcreatorszone.modules.auth.data.AuthRepo;
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
public final class LoginViewModel_Factory implements Factory<LoginViewModel> {
  private final Provider<AuthRepo> repoProvider;

  public LoginViewModel_Factory(Provider<AuthRepo> repoProvider) {
    this.repoProvider = repoProvider;
  }

  @Override
  public LoginViewModel get() {
    return newInstance(repoProvider.get());
  }

  public static LoginViewModel_Factory create(Provider<AuthRepo> repoProvider) {
    return new LoginViewModel_Factory(repoProvider);
  }

  public static LoginViewModel newInstance(AuthRepo repo) {
    return new LoginViewModel(repo);
  }
}
