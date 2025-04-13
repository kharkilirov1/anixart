package com.google.firebase.iid;

import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.firebase:firebase-iid@@21.1.0 */
/* loaded from: classes2.dex */
class FirebaseIidExecutors {

    /* renamed from: a */
    public static final Executor f23052a = FirebaseIidExecutors$$Lambda$0.f23053b;

    /* renamed from: a */
    public static ExecutorService m12519a() {
        return new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory("firebase-iid-executor"));
    }
}
