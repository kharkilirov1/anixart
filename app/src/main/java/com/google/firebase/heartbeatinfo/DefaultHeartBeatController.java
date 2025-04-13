package com.google.firebase.heartbeatinfo;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.core.os.UserManagerCompat;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.inject.Provider;
import com.google.firebase.platforminfo.UserAgentPublisher;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class DefaultHeartBeatController implements HeartBeatController, HeartBeatInfo {

    /* renamed from: f */
    public static final /* synthetic */ int f23036f = 0;

    /* renamed from: a */
    public final Provider<HeartBeatInfoStorage> f23037a;

    /* renamed from: b */
    public final Context f23038b;

    /* renamed from: c */
    public final Provider<UserAgentPublisher> f23039c;

    /* renamed from: d */
    public final Set<HeartBeatConsumer> f23040d;

    /* renamed from: e */
    public final Executor f23041e;

    public DefaultHeartBeatController(final Context context, final String str, Set<HeartBeatConsumer> set, Provider<UserAgentPublisher> provider) {
        Provider<HeartBeatInfoStorage> provider2 = new Provider() { // from class: com.google.firebase.heartbeatinfo.a
            @Override // com.google.firebase.inject.Provider
            public final Object get() {
                Context context2 = context;
                String str2 = str;
                int i2 = DefaultHeartBeatController.f23036f;
                return new HeartBeatInfoStorage(context2, str2);
            }
        };
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: com.google.firebase.heartbeatinfo.c
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                int i2 = DefaultHeartBeatController.f23036f;
                return new Thread(runnable, "heartbeat-information-executor");
            }
        });
        this.f23037a = provider2;
        this.f23040d = set;
        this.f23041e = threadPoolExecutor;
        this.f23039c = provider;
        this.f23038b = context;
    }

    @Override // com.google.firebase.heartbeatinfo.HeartBeatController
    /* renamed from: a */
    public Task<String> mo12507a() {
        return UserManagerCompat.m1977a(this.f23038b) ^ true ? Tasks.m9723e("") : Tasks.m9721c(this.f23041e, new CallableC2138b(this, 1));
    }

    @Override // com.google.firebase.heartbeatinfo.HeartBeatInfo
    @NonNull
    /* renamed from: b */
    public synchronized HeartBeatInfo.HeartBeat mo12508b(@NonNull String str) {
        boolean m12517g;
        long currentTimeMillis = System.currentTimeMillis();
        HeartBeatInfoStorage heartBeatInfoStorage = this.f23037a.get();
        synchronized (heartBeatInfoStorage) {
            m12517g = heartBeatInfoStorage.m12517g("fire-global", currentTimeMillis);
        }
        if (!m12517g) {
            return HeartBeatInfo.HeartBeat.NONE;
        }
        synchronized (heartBeatInfoStorage) {
            String m12514d = heartBeatInfoStorage.m12514d(System.currentTimeMillis());
            heartBeatInfoStorage.f23046a.edit().putString("last-used-date", m12514d).commit();
            heartBeatInfoStorage.m12516f(m12514d);
        }
        return HeartBeatInfo.HeartBeat.GLOBAL;
    }

    /* renamed from: c */
    public Task<Void> m12509c() {
        return this.f23040d.size() <= 0 ? Tasks.m9723e(null) : UserManagerCompat.m1977a(this.f23038b) ^ true ? Tasks.m9723e(null) : Tasks.m9721c(this.f23041e, new CallableC2138b(this, 0));
    }
}
