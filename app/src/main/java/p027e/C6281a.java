package p027e;

import android.content.Context;
import com.google.android.datatransport.TransportFactory;
import com.google.firebase.FirebaseApp;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.datatransport.TransportRegistrar;
import com.google.firebase.heartbeatinfo.DefaultHeartBeatController;
import com.google.firebase.heartbeatinfo.HeartBeatConsumer;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import com.google.firebase.platforminfo.DefaultUserAgentPublisher;
import com.google.firebase.platforminfo.UserAgentPublisher;

/* compiled from: R8$$SyntheticClass */
/* renamed from: e.a */
/* loaded from: classes3.dex */
public final /* synthetic */ class C6281a implements ComponentFactory {

    /* renamed from: c */
    public static final /* synthetic */ C6281a f58011c = new C6281a(0);

    /* renamed from: d */
    public static final /* synthetic */ C6281a f58012d = new C6281a(1);

    /* renamed from: e */
    public static final /* synthetic */ C6281a f58013e = new C6281a(2);

    /* renamed from: f */
    public static final /* synthetic */ C6281a f58014f = new C6281a(3);

    /* renamed from: g */
    public static final /* synthetic */ C6281a f58015g = new C6281a(4);

    /* renamed from: b */
    public final /* synthetic */ int f58016b;

    public /* synthetic */ C6281a(int i2) {
        this.f58016b = i2;
    }

    @Override // com.google.firebase.components.ComponentFactory
    /* renamed from: a */
    public final Object mo12326a(ComponentContainer componentContainer) {
        TransportFactory lambda$getComponents$0;
        FirebaseInstallationsApi lambda$getComponents$02;
        FirebaseMessaging lambda$getComponents$03;
        switch (this.f58016b) {
            case 0:
                lambda$getComponents$0 = TransportRegistrar.lambda$getComponents$0(componentContainer);
                return lambda$getComponents$0;
            case 1:
                return new DefaultHeartBeatController((Context) componentContainer.get(Context.class), ((FirebaseApp) componentContainer.get(FirebaseApp.class)).m12218e(), componentContainer.mo12327c(HeartBeatConsumer.class), componentContainer.mo12337a(UserAgentPublisher.class));
            case 2:
                lambda$getComponents$02 = FirebaseInstallationsRegistrar.lambda$getComponents$0(componentContainer);
                return lambda$getComponents$02;
            case 3:
                lambda$getComponents$03 = FirebaseMessagingRegistrar.lambda$getComponents$0(componentContainer);
                return lambda$getComponents$03;
            default:
                return DefaultUserAgentPublisher.m12718b(componentContainer);
        }
    }
}
