package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import androidx.window.layout.ExecutorC0688c;
import com.google.android.exoplayer2.trackselection.C1136a;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.google.firebase.messaging.k */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2167k implements Continuation {

    /* renamed from: b */
    public final /* synthetic */ int f23393b;

    /* renamed from: c */
    public final /* synthetic */ Object f23394c;

    /* renamed from: d */
    public final /* synthetic */ Object f23395d;

    public /* synthetic */ C2167k(Object obj, Object obj2, int i2) {
        this.f23393b = i2;
        this.f23394c = obj;
        this.f23395d = obj2;
    }

    @Override // com.google.android.gms.tasks.Continuation
    /* renamed from: e */
    public final Object mo7340e(Task task) {
        switch (this.f23393b) {
            case 0:
                RequestDeduplicator requestDeduplicator = (RequestDeduplicator) this.f23394c;
                String str = (String) this.f23395d;
                synchronized (requestDeduplicator) {
                    requestDeduplicator.f23305b.remove(str);
                }
                return task;
            default:
                Context context = (Context) this.f23394c;
                Intent intent = (Intent) this.f23395d;
                Object obj = FcmBroadcastProcessor.f23259c;
                return (PlatformVersion.m8244a() && ((Integer) task.mo9708m()).intValue() == 402) ? FcmBroadcastProcessor.m12641a(context, intent).mo9704i(ExecutorC0688c.f6816h, C1136a.f14049p) : task;
        }
    }
}
