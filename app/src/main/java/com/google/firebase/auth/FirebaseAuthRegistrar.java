package com.google.firebase.auth;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.internal.InternalAuthProvider;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.heartbeatinfo.HeartBeatConsumerComponent;
import com.google.firebase.heartbeatinfo.HeartBeatController;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
@Keep
@KeepForSdk
/* loaded from: classes2.dex */
public class FirebaseAuthRegistrar implements ComponentRegistrar {
    public static /* synthetic */ FirebaseAuth lambda$getComponents$0(ComponentContainer componentContainer) {
        return new com.google.firebase.auth.internal.zzv((FirebaseApp) componentContainer.get(FirebaseApp.class), componentContainer.mo12337a(HeartBeatController.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @NonNull
    @Keep
    public List<Component<?>> getComponents() {
        Component.Builder m12329b = Component.m12329b(FirebaseAuth.class, InternalAuthProvider.class);
        m12329b.m12333a(new Dependency(FirebaseApp.class, 1, 0));
        m12329b.m12333a(new Dependency(HeartBeatController.class, 1, 1));
        m12329b.f22479e = new ComponentFactory() { // from class: com.google.firebase.auth.zzv
            @Override // com.google.firebase.components.ComponentFactory
            /* renamed from: a */
            public final Object mo12326a(ComponentContainer componentContainer) {
                return FirebaseAuthRegistrar.lambda$getComponents$0(componentContainer);
            }
        };
        m12329b.m12336d(2);
        return Arrays.asList(m12329b.m12334b(), HeartBeatConsumerComponent.m12510a(), LibraryVersionComponent.m12722a("fire-auth", "21.0.6"));
    }
}
