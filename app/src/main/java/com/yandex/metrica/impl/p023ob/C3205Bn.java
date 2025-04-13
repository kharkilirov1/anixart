package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.Closeable;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.HashMap;
import java.util.concurrent.Semaphore;
import p000a.C0000a;

/* renamed from: com.yandex.metrica.impl.ob.Bn */
/* loaded from: classes2.dex */
public final class C3205Bn {

    /* renamed from: g */
    private static final HashMap<String, C3205Bn> f42639g = new HashMap<>();

    /* renamed from: a */
    @NonNull
    private final String f42640a;

    /* renamed from: b */
    private FileLock f42641b;

    /* renamed from: c */
    private FileChannel f42642c;

    /* renamed from: d */
    @Nullable
    private final File f42643d;

    /* renamed from: e */
    private RandomAccessFile f42644e;

    /* renamed from: f */
    private Semaphore f42645f = new Semaphore(1, true);

    private C3205Bn(@NonNull Context context, @NonNull String str) {
        String m14k = C0000a.m14k(str, ".lock");
        this.f42640a = m14k;
        File cacheDir = context.getCacheDir();
        File file = cacheDir == null ? null : new File(cacheDir, "appmetrica_locks");
        if (file != null) {
            file.mkdirs();
        }
        this.f42643d = file != null ? new File(file, m14k) : null;
    }

    /* renamed from: a */
    public static synchronized C3205Bn m17908a(@NonNull Context context, @NonNull String str) {
        C3205Bn c3205Bn;
        synchronized (C3205Bn.class) {
            HashMap<String, C3205Bn> hashMap = f42639g;
            c3205Bn = hashMap.get(str);
            if (c3205Bn == null) {
                c3205Bn = new C3205Bn(context, str);
                hashMap.put(str, c3205Bn);
            }
        }
        return c3205Bn;
    }

    /* renamed from: b */
    public synchronized void m17910b() {
        this.f42645f.release();
        if (this.f42645f.availablePermits() > 0) {
            C3681V0.m19264a(this.f42641b);
            C3658U2.m19209a((Closeable) this.f42642c);
            C3658U2.m19209a((Closeable) this.f42644e);
            this.f42642c = null;
            this.f42644e = null;
        }
    }

    /* renamed from: a */
    public synchronized void m17909a() throws Throwable {
        this.f42645f.acquire();
        if (this.f42643d != null) {
            if (this.f42642c == null) {
                RandomAccessFile randomAccessFile = new RandomAccessFile(this.f42643d, "rw");
                this.f42644e = randomAccessFile;
                this.f42642c = randomAccessFile.getChannel();
            }
            this.f42641b = this.f42642c.lock();
        } else {
            throw new IllegalStateException("Lock file is null");
        }
    }
}
