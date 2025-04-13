package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* renamed from: com.yandex.metrica.impl.ob.R7 */
/* loaded from: classes2.dex */
public class C3588R7 {

    /* renamed from: a */
    @Nullable
    private String f43800a;

    /* renamed from: b */
    private final Context f43801b;

    /* renamed from: c */
    private final List<InterfaceC3613S7> f43802c;

    /* renamed from: d */
    private final C3389J7 f43803d;

    /* renamed from: e */
    private boolean f43804e;

    /* renamed from: f */
    private boolean f43805f;

    /* renamed from: g */
    @Nullable
    private InterfaceC3613S7 f43806g;

    /* renamed from: h */
    @NonNull
    private final C3432L0 f43807h;

    public C3588R7(@NonNull Context context, @NonNull C3659U3 c3659u3) {
        this(context, C3658U2.m19211a(21) ? Arrays.asList(new C4022i8(context, c3659u3), new C3713W7()) : Collections.singletonList(new C3713W7()), new C3432L0(), new C3389J7());
    }

    /* renamed from: a */
    private synchronized void m18940a() {
        InterfaceC3613S7 interfaceC3613S7;
        if (!this.f43805f) {
            synchronized (this) {
                Iterator<InterfaceC3613S7> it = this.f43802c.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        interfaceC3613S7 = null;
                        break;
                    }
                    interfaceC3613S7 = it.next();
                    try {
                        C3389J7 c3389j7 = this.f43803d;
                        String mo19080c = interfaceC3613S7.mo19080c();
                        Objects.requireNonNull(c3389j7);
                        System.loadLibrary(mo19080c);
                        break;
                    } catch (Throwable unused) {
                    }
                }
                this.f43806g = interfaceC3613S7;
                if (interfaceC3613S7 != null) {
                    try {
                        interfaceC3613S7.mo19078a(false);
                    } catch (Throwable unused2) {
                    }
                    this.f43800a = this.f43807h.m18473b(this.f43801b, this.f43806g.mo19075a());
                }
            }
        }
        this.f43805f = true;
    }

    @VisibleForTesting
    public C3588R7(@NonNull Context context, @NonNull List<InterfaceC3613S7> list, @NonNull C3432L0 c3432l0, @NonNull C3389J7 c3389j7) {
        this.f43801b = context;
        this.f43802c = list;
        this.f43807h = c3432l0;
        this.f43803d = c3389j7;
    }

    @WorkerThread
    /* renamed from: a */
    public synchronized void m18942a(boolean z, @NonNull String str, @Nullable String str2) {
        String str3;
        if (z) {
            synchronized (this) {
                try {
                    m18940a();
                } catch (Throwable unused) {
                    this.f43804e = false;
                }
                synchronized (this) {
                    InterfaceC3613S7 interfaceC3613S7 = this.f43806g;
                    if ((interfaceC3613S7 != null) && (str3 = this.f43800a) != null && !this.f43804e) {
                        interfaceC3613S7.mo19077a(str, str3, str2);
                        this.f43804e = true;
                    }
                }
            }
        }
        synchronized (this) {
            synchronized (this) {
                InterfaceC3613S7 interfaceC3613S72 = this.f43806g;
                if ((interfaceC3613S72 != null) && this.f43804e) {
                    interfaceC3613S72.mo19079b();
                }
                this.f43804e = false;
            }
        }
    }

    /* renamed from: a */
    public void m18941a(@NonNull String str) {
        InterfaceC3613S7 interfaceC3613S7 = this.f43806g;
        if (interfaceC3613S7 != null) {
            interfaceC3613S7.mo19076a(str);
        }
    }
}
