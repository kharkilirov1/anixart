package androidx.room.util;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.io.File;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import p000a.C0000a;

@RestrictTo
/* loaded from: classes.dex */
public class CopyLock {

    /* renamed from: e */
    public static final Map<String, Lock> f5918e = new HashMap();

    /* renamed from: a */
    public final File f5919a;

    /* renamed from: b */
    public final Lock f5920b;

    /* renamed from: c */
    public final boolean f5921c;

    /* renamed from: d */
    public FileChannel f5922d;

    public CopyLock(@NonNull String str, @NonNull File file, boolean z) {
        Lock lock;
        File file2 = new File(file, C0000a.m14k(str, ".lck"));
        this.f5919a = file2;
        String absolutePath = file2.getAbsolutePath();
        Map<String, Lock> map = f5918e;
        synchronized (map) {
            lock = (Lock) ((HashMap) map).get(absolutePath);
            if (lock == null) {
                lock = new ReentrantLock();
                ((HashMap) map).put(absolutePath, lock);
            }
        }
        this.f5920b = lock;
        this.f5921c = z;
    }

    /* renamed from: a */
    public void m4092a() {
        FileChannel fileChannel = this.f5922d;
        if (fileChannel != null) {
            try {
                fileChannel.close();
            } catch (IOException unused) {
            }
        }
        this.f5920b.unlock();
    }
}
