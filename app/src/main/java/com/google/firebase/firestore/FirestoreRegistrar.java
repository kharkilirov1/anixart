package com.google.firebase.firestore;

import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.RestrictTo;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.appcheck.interop.InternalAppCheckTokenProvider;
import com.google.firebase.auth.internal.InternalAuthProvider;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.firestore.remote.FirebaseClientGrpcMetadataProvider;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import com.google.firebase.platforminfo.UserAgentPublisher;
import java.util.Arrays;
import java.util.List;

@Keep
@RestrictTo
/* loaded from: classes2.dex */
public class FirestoreRegistrar implements ComponentRegistrar {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirestoreMultiDbComponent lambda$getComponents$0(ComponentContainer componentContainer) {
        return new FirestoreMultiDbComponent((Context) componentContainer.get(Context.class), (FirebaseApp) componentContainer.get(FirebaseApp.class), componentContainer.mo12339d(InternalAuthProvider.class), componentContainer.mo12339d(InternalAppCheckTokenProvider.class), new FirebaseClientGrpcMetadataProvider(componentContainer.mo12337a(UserAgentPublisher.class), componentContainer.mo12337a(HeartBeatInfo.class), (FirebaseOptions) componentContainer.get(FirebaseOptions.class)));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<Component<?>> getComponents() {
        Component.Builder m12328a = Component.m12328a(FirestoreMultiDbComponent.class);
        m12328a.m12333a(new Dependency(FirebaseApp.class, 1, 0));
        m12328a.m12333a(new Dependency(Context.class, 1, 0));
        m12328a.m12333a(new Dependency(HeartBeatInfo.class, 0, 1));
        m12328a.m12333a(new Dependency(UserAgentPublisher.class, 0, 1));
        m12328a.m12333a(new Dependency(InternalAuthProvider.class, 0, 2));
        m12328a.m12333a(new Dependency(InternalAppCheckTokenProvider.class, 0, 2));
        m12328a.m12333a(new Dependency(FirebaseOptions.class, 0, 0));
        m12328a.f22479e = new ComponentFactory() { // from class: com.google.firebase.firestore.a
            @Override // com.google.firebase.components.ComponentFactory
            /* renamed from: a */
            public final Object mo12326a(ComponentContainer componentContainer) {
                FirestoreMultiDbComponent lambda$getComponents$0;
                lambda$getComponents$0 = FirestoreRegistrar.lambda$getComponents$0(componentContainer);
                return lambda$getComponents$0;
            }
        };
        return Arrays.asList(m12328a.m12334b(), LibraryVersionComponent.m12722a("fire-fst", "24.2.1"));
    }
}
