package com.google.android.exoplayer2.scheduler;

import com.google.android.exoplayer2.scheduler.RequirementsWatcher;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.google.android.exoplayer2.scheduler.a */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1084a implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f12226b;

    /* renamed from: c */
    public final /* synthetic */ RequirementsWatcher.NetworkCallback f12227c;

    public /* synthetic */ RunnableC1084a(RequirementsWatcher.NetworkCallback networkCallback, int i2) {
        this.f12226b = i2;
        this.f12227c = networkCallback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int m6758a;
        int m6758a2;
        switch (this.f12226b) {
            case 0:
                RequirementsWatcher requirementsWatcher = this.f12227c.f12225c;
                if (requirementsWatcher.f12221f != null && (requirementsWatcher.f12220e & 3) != 0 && requirementsWatcher.f12220e != (m6758a2 = requirementsWatcher.f12218c.m6758a(requirementsWatcher.f12216a))) {
                    requirementsWatcher.f12220e = m6758a2;
                    requirementsWatcher.f12217b.m6763a(requirementsWatcher, m6758a2);
                    break;
                }
                break;
            default:
                RequirementsWatcher requirementsWatcher2 = this.f12227c.f12225c;
                if (requirementsWatcher2.f12221f != null && requirementsWatcher2.f12220e != (m6758a = requirementsWatcher2.f12218c.m6758a(requirementsWatcher2.f12216a))) {
                    requirementsWatcher2.f12220e = m6758a;
                    requirementsWatcher2.f12217b.m6763a(requirementsWatcher2, m6758a);
                    break;
                }
                break;
        }
    }
}
