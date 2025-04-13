package com.bumptech.glide;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.manager.RequestManagerRetriever;
import com.swiftsoft.anixartd.utils.GlideAppModule;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
final class GeneratedAppGlideModuleImpl extends GeneratedAppGlideModule {

    /* renamed from: a */
    public final GlideAppModule f7878a = new GlideAppModule();

    public GeneratedAppGlideModuleImpl() {
        if (Log.isLoggable("Glide", 3)) {
            Log.d("Glide", "Discovered AppGlideModule from annotation: com.swiftsoft.anixartd.utils.GlideAppModule");
        }
    }

    @Override // com.bumptech.glide.module.AppGlideModule
    /* renamed from: a */
    public void mo4866a(@NonNull Context context, @NonNull GlideBuilder glideBuilder) {
        Objects.requireNonNull(this.f7878a);
    }

    @Override // com.bumptech.glide.module.LibraryGlideModule
    /* renamed from: b */
    public void mo4867b(@NonNull Context context, @NonNull Glide glide, @NonNull Registry registry) {
        Objects.requireNonNull(this.f7878a);
    }

    @Override // com.bumptech.glide.module.AppGlideModule
    /* renamed from: c */
    public boolean mo4868c() {
        Objects.requireNonNull(this.f7878a);
        return true;
    }

    @Override // com.bumptech.glide.GeneratedAppGlideModule
    @NonNull
    /* renamed from: d */
    public Set<Class<?>> mo4864d() {
        return Collections.emptySet();
    }

    @Override // com.bumptech.glide.GeneratedAppGlideModule
    @NonNull
    /* renamed from: e */
    public RequestManagerRetriever.RequestManagerFactory mo4865e() {
        return new GeneratedRequestManagerFactory();
    }
}
