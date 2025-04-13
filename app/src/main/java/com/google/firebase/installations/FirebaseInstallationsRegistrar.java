package com.google.firebase.installations;

import androidx.annotation.Keep;
import com.google.firebase.FirebaseApp;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.heartbeatinfo.HeartBeatConsumerComponent;
import com.google.firebase.heartbeatinfo.HeartBeatController;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import java.util.Arrays;
import java.util.List;
import p027e.C6281a;

@Keep
/* loaded from: classes2.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirebaseInstallationsApi lambda$getComponents$0(ComponentContainer componentContainer) {
        return new FirebaseInstallations((FirebaseApp) componentContainer.get(FirebaseApp.class), componentContainer.mo12337a(HeartBeatController.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<Component<?>> getComponents() {
        Component.Builder m12328a = Component.m12328a(FirebaseInstallationsApi.class);
        m12328a.m12333a(new Dependency(FirebaseApp.class, 1, 0));
        m12328a.m12333a(new Dependency(HeartBeatController.class, 0, 1));
        m12328a.m12335c(C6281a.f58013e);
        return Arrays.asList(m12328a.m12334b(), HeartBeatConsumerComponent.m12510a(), LibraryVersionComponent.m12722a("fire-installations", "17.0.1"));
    }
}
