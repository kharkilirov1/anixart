package com.yandex.appmetrica.push.firebase.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.iid.internal.FirebaseInstanceIdInternal;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.RunnableC2158d;
import com.yandex.metrica.push.common.CoreConstants;
import com.yandex.metrica.push.common.core.PushServiceController;
import com.yandex.metrica.push.common.utils.PublicLogger;
import com.yandex.metrica.push.common.utils.TrackersHub;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.yandex.appmetrica.push.firebase.impl.a */
/* loaded from: classes2.dex */
public class C2798a implements PushServiceController {

    /* renamed from: e */
    private static final Long f30840e = 10L;

    /* renamed from: f */
    private static final TimeUnit f30841f = TimeUnit.SECONDS;

    /* renamed from: a */
    @NonNull
    private final Context f30842a;

    /* renamed from: b */
    @NonNull
    private final C2804g f30843b;

    /* renamed from: c */
    @NonNull
    private final String f30844c;

    /* renamed from: d */
    @Nullable
    private FirebaseMessaging f30845d;

    /* renamed from: com.yandex.appmetrica.push.firebase.impl.a$a */
    public class a implements OnCompleteListener<String> {

        /* renamed from: a */
        public final /* synthetic */ CountDownLatch f30846a;

        public a(C2798a c2798a, CountDownLatch countDownLatch) {
            this.f30846a = countDownLatch;
        }

        @Override // com.google.android.gms.tasks.OnCompleteListener
        public void onComplete(@NonNull Task<String> task) {
            this.f30846a.countDown();
        }
    }

    public C2798a(@NonNull Context context) {
        this(context, new C2802e(context));
    }

    /* renamed from: d */
    private boolean m16548d() {
        try {
            int i2 = GoogleApiAvailability.f15324c;
            return GoogleApiAvailability.f15326e.m7918d(this.f30842a) == 0;
        } catch (Throwable unused) {
            return false;
        }
    }

    @NonNull
    /* renamed from: a */
    public FirebaseApp mo16550a(@NonNull FirebaseOptions firebaseOptions) {
        try {
            FirebaseApp.m12215h(this.f30842a, firebaseOptions);
        } catch (Throwable unused) {
        }
        return FirebaseApp.m12212c();
    }

    @NonNull
    /* renamed from: b */
    public String m16551b() {
        return this.f30844c;
    }

    @NonNull
    /* renamed from: c */
    public C2804g m16552c() {
        return this.f30843b;
    }

    @Override // com.yandex.metrica.push.common.core.PushServiceController
    @NonNull
    public String getTitle() {
        return CoreConstants.Transport.FIREBASE;
    }

    @Override // com.yandex.metrica.push.common.core.PushServiceController
    @Nullable
    @SuppressLint
    public String getToken() {
        FirebaseMessaging firebaseMessaging = this.f30845d;
        if (firebaseMessaging == null) {
            return null;
        }
        b m16547a = m16547a(firebaseMessaging);
        if (m16547a.m16553a()) {
            return m16547a.f30847a;
        }
        PublicLogger.m21384e(m16547a.f30848b, "Failed to get token, will retry once", new Object[0]);
        b m16547a2 = m16547a(firebaseMessaging);
        if (m16547a2.m16553a()) {
            return m16547a2.f30847a;
        }
        PublicLogger.m21384e(m16547a2.f30848b, "Failed to get token after retry", new Object[0]);
        TrackersHub.getInstance().reportError("Attempt to get push token failed", m16547a2.f30848b);
        return null;
    }

    @Override // com.yandex.metrica.push.common.core.PushServiceController
    public boolean register() {
        if (!m16548d()) {
            PublicLogger.m21386w("Google play services not available", new Object[0]);
            TrackersHub.getInstance().reportEvent("Google play services not available");
            return false;
        }
        FirebaseApp mo16550a = mo16550a(m16552c().m16560c());
        mo16550a.m12217a();
        this.f30845d = (FirebaseMessaging) mo16550a.f22262d.get(FirebaseMessaging.class);
        return true;
    }

    @VisibleForTesting
    public C2798a(@NonNull Context context, @NonNull AbstractC2805h abstractC2805h) {
        this.f30842a = context;
        this.f30843b = abstractC2805h.m16561a();
        this.f30844c = abstractC2805h.m16564e();
    }

    /* renamed from: com.yandex.appmetrica.push.firebase.impl.a$b */
    public static class b {

        /* renamed from: a */
        @Nullable
        public final String f30847a;

        /* renamed from: b */
        @Nullable
        public final Throwable f30848b;

        public b(@NonNull String str) {
            this.f30847a = str;
            this.f30848b = null;
        }

        /* renamed from: a */
        public boolean m16553a() {
            return this.f30848b == null && this.f30847a != null;
        }

        public b(@Nullable Throwable th) {
            this.f30847a = null;
            this.f30848b = th;
        }
    }

    @NonNull
    /* renamed from: a */
    private b m16547a(@NonNull FirebaseMessaging firebaseMessaging) {
        Task<String> task;
        try {
            int i2 = 1;
            CountDownLatch countDownLatch = new CountDownLatch(1);
            FirebaseInstanceIdInternal firebaseInstanceIdInternal = firebaseMessaging.f23269b;
            if (firebaseInstanceIdInternal != null) {
                task = firebaseInstanceIdInternal.mo12538a();
            } else {
                TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                firebaseMessaging.f23275h.execute(new RunnableC2158d(firebaseMessaging, taskCompletionSource, i2));
                task = taskCompletionSource.f17240a;
            }
            task.mo9698c(new a(this, countDownLatch));
            if (countDownLatch.await(f30840e.longValue(), f30841f)) {
                if (task.mo9712q()) {
                    return new b(task.mo9708m());
                }
                return new b(task.mo9707l());
            }
            throw new TimeoutException("token retrieval timeout");
        } catch (Throwable th) {
            return new b(th);
        }
    }

    @NonNull
    /* renamed from: a */
    public Context m16549a() {
        return this.f30842a;
    }
}
