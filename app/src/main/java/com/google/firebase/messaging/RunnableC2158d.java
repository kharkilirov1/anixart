package com.google.firebase.messaging;

import android.content.Intent;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Objects;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.google.firebase.messaging.d */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2158d implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f23373b;

    /* renamed from: c */
    public final /* synthetic */ Object f23374c;

    /* renamed from: d */
    public final /* synthetic */ Object f23375d;

    public /* synthetic */ RunnableC2158d(Object obj, Object obj2, int i2) {
        this.f23373b = i2;
        this.f23374c = obj;
        this.f23375d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23373b) {
            case 0:
                ((FcmLifecycleCallbacks) this.f23374c).m12643a((Intent) this.f23375d);
                break;
            case 1:
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f23374c;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f23375d;
                Store store = FirebaseMessaging.f23265o;
                Objects.requireNonNull(firebaseMessaging);
                try {
                    taskCompletionSource.m9716b(firebaseMessaging.m12645a());
                    break;
                } catch (Exception e2) {
                    taskCompletionSource.m9715a(e2);
                }
            default:
                ImageDownload imageDownload = (ImageDownload) this.f23374c;
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) this.f23375d;
                Objects.requireNonNull(imageDownload);
                try {
                    taskCompletionSource2.m9716b(imageDownload.m12661a());
                    break;
                } catch (Exception e3) {
                    taskCompletionSource2.m9715a(e3);
                    return;
                }
        }
    }
}
