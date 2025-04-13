package com.google.firebase.messaging;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class TopicsSubscriber {

    /* renamed from: i */
    public static final long f23333i = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: j */
    public static final /* synthetic */ int f23334j = 0;

    /* renamed from: a */
    public final Context f23335a;

    /* renamed from: b */
    public final Metadata f23336b;

    /* renamed from: c */
    public final GmsRpc f23337c;

    /* renamed from: d */
    public final FirebaseMessaging f23338d;

    /* renamed from: f */
    public final ScheduledExecutorService f23340f;

    /* renamed from: h */
    public final TopicsStore f23342h;

    /* renamed from: e */
    @GuardedBy
    public final Map<String, ArrayDeque<TaskCompletionSource<Void>>> f23339e = new ArrayMap();

    /* renamed from: g */
    @GuardedBy
    public boolean f23341g = false;

    public TopicsSubscriber(FirebaseMessaging firebaseMessaging, Metadata metadata, TopicsStore topicsStore, GmsRpc gmsRpc, Context context, @NonNull ScheduledExecutorService scheduledExecutorService) {
        this.f23338d = firebaseMessaging;
        this.f23336b = metadata;
        this.f23342h = topicsStore;
        this.f23337c = gmsRpc;
        this.f23335a = context;
        this.f23340f = scheduledExecutorService;
    }

    @WorkerThread
    /* renamed from: a */
    public static <T> void m12693a(Task<T> task) throws IOException {
        try {
            Tasks.m9720b(task, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException e2) {
            e = e2;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        } catch (ExecutionException e3) {
            Throwable cause = e3.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (!(cause instanceof RuntimeException)) {
                throw new IOException(e3);
            }
            throw ((RuntimeException) cause);
        } catch (TimeoutException e4) {
            e = e4;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        }
    }

    /* renamed from: d */
    public static boolean m12694d() {
        return Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3));
    }

    @WorkerThread
    /* renamed from: b */
    public final void m12695b(String str) throws IOException {
        GmsRpc gmsRpc = this.f23337c;
        String m12645a = this.f23338d.m12645a();
        Objects.requireNonNull(gmsRpc);
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        m12693a(gmsRpc.m12658a(gmsRpc.m12660c(m12645a, "/topics/" + str, bundle)));
    }

    @WorkerThread
    /* renamed from: c */
    public final void m12696c(String str) throws IOException {
        GmsRpc gmsRpc = this.f23337c;
        String m12645a = this.f23338d.m12645a();
        Objects.requireNonNull(gmsRpc);
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        bundle.putString("delete", "1");
        m12693a(gmsRpc.m12658a(gmsRpc.m12660c(m12645a, "/topics/" + str, bundle)));
    }

    /* renamed from: e */
    public synchronized void m12697e(boolean z) {
        this.f23341g = z;
    }

    /* renamed from: f */
    public void m12698f() {
        boolean z;
        if (this.f23342h.m12692a() != null) {
            synchronized (this) {
                z = this.f23341g;
            }
            if (z) {
                return;
            }
            m12700h(0L);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:92:0x000e, code lost:
    
        if (m12694d() == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0010, code lost:
    
        android.util.Log.d("FirebaseMessaging", "topic sync succeeded");
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0018, code lost:
    
        return true;
     */
    @androidx.annotation.WorkerThread
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m12699g() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 337
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.TopicsSubscriber.m12699g():boolean");
    }

    /* renamed from: h */
    public void m12700h(long j2) {
        this.f23340f.schedule(new TopicsSyncTask(this, this.f23335a, this.f23336b, Math.min(Math.max(30L, 2 * j2), f23333i)), j2, TimeUnit.SECONDS);
        m12697e(true);
    }
}
