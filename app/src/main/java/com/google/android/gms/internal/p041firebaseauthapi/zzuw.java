package com.google.android.gms.internal.p041firebaseauthapi;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public class zzuw {

    /* renamed from: a */
    public zztt f16881a;

    /* renamed from: b */
    public ExecutorService f16882b;

    /* renamed from: a */
    public final Task m9441a(final zzuv zzuvVar) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f16882b.execute(new Runnable() { // from class: com.google.android.gms.internal.firebase-auth-api.zzuu
            @Override // java.lang.Runnable
            public final void run() {
                zzuvVar.mo9353a(taskCompletionSource, zzuw.this.f16881a);
            }
        });
        return taskCompletionSource.f17240a;
    }
}
