package com.google.firebase.iid;

import androidx.annotation.Keep;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.iid.internal.FirebaseInstanceIdInternal;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import com.google.firebase.platforminfo.UserAgentPublisher;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.firebase:firebase-iid@@21.1.0 */
@Keep
@KeepForSdk
/* loaded from: classes2.dex */
public final class Registrar implements ComponentRegistrar {

    /* compiled from: com.google.firebase:firebase-iid@@21.1.0 */
    public static class FIIDInternalAdapter implements FirebaseInstanceIdInternal {

        /* renamed from: a */
        public final FirebaseInstanceId f23099a;

        public FIIDInternalAdapter(FirebaseInstanceId firebaseInstanceId) {
            this.f23099a = firebaseInstanceId;
        }

        @Override // com.google.firebase.iid.internal.FirebaseInstanceIdInternal
        /* renamed from: a */
        public Task<String> mo12538a() {
            String m12527g = this.f23099a.m12527g();
            if (m12527g != null) {
                return Tasks.m9723e(m12527g);
            }
            FirebaseInstanceId firebaseInstanceId = this.f23099a;
            FirebaseInstanceId.m12521c(firebaseInstanceId.f23059b);
            return firebaseInstanceId.m12525e(Metadata.m12534b(firebaseInstanceId.f23059b), "*").mo9703h(Registrar$FIIDInternalAdapter$$Lambda$0.f23098b);
        }

        @Override // com.google.firebase.iid.internal.FirebaseInstanceIdInternal
        /* renamed from: b */
        public void mo12539b(FirebaseInstanceIdInternal.NewTokenListener newTokenListener) {
            this.f23099a.f23065h.add(newTokenListener);
        }

        @Override // com.google.firebase.iid.internal.FirebaseInstanceIdInternal
        public String getToken() {
            return this.f23099a.m12527g();
        }
    }

    public static final /* synthetic */ FirebaseInstanceId lambda$getComponents$0$Registrar(ComponentContainer componentContainer) {
        return new FirebaseInstanceId((FirebaseApp) componentContainer.get(FirebaseApp.class), componentContainer.mo12337a(UserAgentPublisher.class), componentContainer.mo12337a(HeartBeatInfo.class), (FirebaseInstallationsApi) componentContainer.get(FirebaseInstallationsApi.class));
    }

    public static final /* synthetic */ FirebaseInstanceIdInternal lambda$getComponents$1$Registrar(ComponentContainer componentContainer) {
        return new FIIDInternalAdapter((FirebaseInstanceId) componentContainer.get(FirebaseInstanceId.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<Component<?>> getComponents() {
        Component.Builder m12328a = Component.m12328a(FirebaseInstanceId.class);
        m12328a.m12333a(new Dependency(FirebaseApp.class, 1, 0));
        m12328a.m12333a(new Dependency(UserAgentPublisher.class, 0, 1));
        m12328a.m12333a(new Dependency(HeartBeatInfo.class, 0, 1));
        m12328a.m12333a(new Dependency(FirebaseInstallationsApi.class, 1, 0));
        m12328a.f22479e = Registrar$$Lambda$0.f23096b;
        m12328a.m12336d(1);
        Component m12334b = m12328a.m12334b();
        Component.Builder m12328a2 = Component.m12328a(FirebaseInstanceIdInternal.class);
        m12328a2.m12333a(new Dependency(FirebaseInstanceId.class, 1, 0));
        m12328a2.f22479e = Registrar$$Lambda$1.f23097b;
        return Arrays.asList(m12334b, m12328a2.m12334b(), LibraryVersionComponent.m12722a("fire-iid", "21.1.0"));
    }
}
