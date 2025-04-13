package com.yandex.metrica.impl.p023ob;

import android.net.LocalServerSocket;
import android.net.LocalSocket;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.p022ac.CrashpadServiceHelper;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@RequiresApi
/* renamed from: com.yandex.metrica.impl.ob.e8 */
/* loaded from: classes2.dex */
public class C3918e8 {

    /* renamed from: a */
    @NonNull
    private final String f45023a;

    /* renamed from: b */
    private LocalServerSocket f45024b;

    /* renamed from: c */
    private volatile boolean f45025c;

    /* renamed from: d */
    @NonNull
    private final C4048j8 f45026d;

    /* renamed from: e */
    @NonNull
    private final InterfaceC3678Um<String> f45027e;

    /* renamed from: f */
    @Nullable
    private final String f45028f;

    /* renamed from: g */
    private List<InterfaceC3678Um<String>> f45029g;

    /* renamed from: h */
    private final Thread f45030h;

    /* renamed from: com.yandex.metrica.impl.ob.e8$a */
    public class a extends Thread {
        public a() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (C3918e8.this.f45025c) {
                try {
                    LocalSocket accept = C3918e8.this.f45024b.accept();
                    byte[] bArr = new byte[256];
                    int read = accept.getInputStream().read(bArr);
                    accept.close();
                    byte[] bArr2 = new byte[read];
                    System.arraycopy(bArr, 0, bArr2, 0, read);
                    C3918e8.m19792a(C3918e8.this, new String(bArr2));
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.e8$b */
    public class b implements InterfaceC3678Um<String> {
        @Override // com.yandex.metrica.impl.p023ob.InterfaceC3678Um
        /* renamed from: b */
        public void mo17875b(@NonNull String str) {
            CrashpadServiceHelper.setUpServiceHelper(str);
        }
    }

    public C3918e8(@NonNull String str, @Nullable String str2) {
        this(str, str2, C4048j8.m20082a(), new b());
    }

    @VisibleForTesting
    public C3918e8(@NonNull String str, @Nullable String str2, @NonNull C4048j8 c4048j8, @NonNull InterfaceC3678Um<String> interfaceC3678Um) {
        this.f45025c = false;
        this.f45029g = new LinkedList();
        this.f45030h = new a();
        this.f45023a = str;
        this.f45028f = str2;
        this.f45026d = c4048j8;
        this.f45027e = interfaceC3678Um;
    }

    /* renamed from: a */
    public void m19795a(@NonNull InterfaceC3678Um<String> interfaceC3678Um) {
        synchronized (this) {
            this.f45029g.add(interfaceC3678Um);
        }
        if (this.f45025c || this.f45028f == null) {
            return;
        }
        synchronized (this) {
            if (!this.f45025c) {
                try {
                    if (this.f45026d.m20083b()) {
                        this.f45024b = new LocalServerSocket(this.f45023a);
                        this.f45025c = true;
                        this.f45027e.mo17875b(this.f45028f);
                        this.f45030h.start();
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: b */
    public synchronized void m19796b(@NonNull InterfaceC3678Um<String> interfaceC3678Um) {
        this.f45029g.remove(interfaceC3678Um);
    }

    /* renamed from: a */
    public static void m19792a(C3918e8 c3918e8, String str) {
        synchronized (c3918e8) {
            Iterator<InterfaceC3678Um<String>> it = c3918e8.f45029g.iterator();
            while (it.hasNext()) {
                it.next().mo17875b(str);
            }
        }
    }
}
