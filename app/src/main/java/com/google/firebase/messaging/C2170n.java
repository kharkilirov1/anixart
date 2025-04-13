package com.google.firebase.messaging;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.WithinAppServiceConnection;
import java.util.concurrent.ScheduledFuture;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.google.firebase.messaging.n */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2170n implements OnCompleteListener {

    /* renamed from: a */
    public final /* synthetic */ int f23403a;

    /* renamed from: b */
    public final /* synthetic */ Object f23404b;

    public /* synthetic */ C2170n(Object obj, int i2) {
        this.f23403a = i2;
        this.f23404b = obj;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        switch (this.f23403a) {
            case 0:
                WithinAppServiceConnection.BindRequest bindRequest = (WithinAppServiceConnection.BindRequest) this.f23404b;
                int i2 = WithinAppServiceBinder.f23356b;
                bindRequest.m12712a();
                break;
            default:
                ((ScheduledFuture) this.f23404b).cancel(false);
                break;
        }
    }
}
