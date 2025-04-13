package com.google.firebase.messaging;

import androidx.annotation.Keep;
import com.google.android.datatransport.TransportFactory;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.FirebaseApp;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.events.Subscriber;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.iid.internal.FirebaseInstanceIdInternal;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import com.google.firebase.platforminfo.UserAgentPublisher;
import java.util.Arrays;
import java.util.List;
import p027e.C6281a;

@Keep
@KeepForSdk
/* loaded from: classes2.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(ComponentContainer componentContainer) {
        return new FirebaseMessaging((FirebaseApp) componentContainer.get(FirebaseApp.class), (FirebaseInstanceIdInternal) componentContainer.get(FirebaseInstanceIdInternal.class), componentContainer.mo12337a(UserAgentPublisher.class), componentContainer.mo12337a(HeartBeatInfo.class), (FirebaseInstallationsApi) componentContainer.get(FirebaseInstallationsApi.class), (TransportFactory) componentContainer.get(TransportFactory.class), (Subscriber) componentContainer.get(Subscriber.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<Component<?>> getComponents() {
        Component.Builder m12328a = Component.m12328a(FirebaseMessaging.class);
        m12328a.m12333a(new Dependency(FirebaseApp.class, 1, 0));
        m12328a.m12333a(new Dependency(FirebaseInstanceIdInternal.class, 0, 0));
        m12328a.m12333a(new Dependency(UserAgentPublisher.class, 0, 1));
        m12328a.m12333a(new Dependency(HeartBeatInfo.class, 0, 1));
        m12328a.m12333a(new Dependency(TransportFactory.class, 0, 0));
        m12328a.m12333a(new Dependency(FirebaseInstallationsApi.class, 1, 0));
        m12328a.m12333a(new Dependency(Subscriber.class, 1, 0));
        m12328a.f22479e = C6281a.f58014f;
        m12328a.m12336d(1);
        return Arrays.asList(m12328a.m12334b(), LibraryVersionComponent.m12722a("fire-fcm", "23.0.6"));
    }
}
