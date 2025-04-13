package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.io.Closeable;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import p000a.C0000a;

/* renamed from: com.yandex.metrica.impl.ob.bn */
/* loaded from: classes2.dex */
public class C3855bn {

    /* renamed from: a */
    @NonNull
    private final Context f44849a;

    /* renamed from: b */
    @NonNull
    private final String f44850b;

    /* renamed from: c */
    @NonNull
    private final C3432L0 f44851c;

    /* renamed from: d */
    private File f44852d;

    /* renamed from: e */
    private FileLock f44853e;

    /* renamed from: f */
    private RandomAccessFile f44854f;

    /* renamed from: g */
    private FileChannel f44855g;

    /* renamed from: h */
    private int f44856h;

    public C3855bn(@NonNull Context context, @NonNull String str) {
        this(context, str, new C3432L0());
    }

    /* renamed from: a */
    public synchronized void m19663a() throws Throwable {
        File m18472b = this.f44851c.m18472b(this.f44849a.getFilesDir(), this.f44850b);
        this.f44852d = m18472b;
        if (m18472b == null) {
            throw new IllegalStateException("Cannot create lock file");
        }
        RandomAccessFile randomAccessFile = new RandomAccessFile(this.f44852d, "rw");
        this.f44854f = randomAccessFile;
        FileChannel channel = randomAccessFile.getChannel();
        this.f44855g = channel;
        if (this.f44856h == 0) {
            this.f44853e = channel.lock();
        }
        this.f44856h++;
    }

    /* renamed from: b */
    public synchronized void m19664b() {
        File file = this.f44852d;
        if (file != null) {
            file.getAbsolutePath();
        }
        int i2 = this.f44856h - 1;
        this.f44856h = i2;
        if (i2 == 0) {
            C3681V0.m19264a(this.f44853e);
        }
        C3658U2.m19209a((Closeable) this.f44854f);
        C3658U2.m19209a((Closeable) this.f44855g);
        this.f44854f = null;
        this.f44853e = null;
        this.f44855g = null;
    }

    /* renamed from: c */
    public synchronized void m19665c() {
        m19664b();
        File file = this.f44852d;
        if (file != null) {
            file.delete();
        }
    }

    @VisibleForTesting
    public C3855bn(@NonNull Context context, @NonNull String str, @NonNull C3432L0 c3432l0) {
        this.f44856h = 0;
        this.f44849a = context;
        this.f44850b = C0000a.m14k(str, ".lock");
        this.f44851c = c3432l0;
    }
}
