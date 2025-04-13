package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.util.Objects;

/* renamed from: com.yandex.metrica.impl.ob.j8 */
/* loaded from: classes2.dex */
public class C4048j8 {

    /* renamed from: c */
    private static final C4048j8 f45400c = new C4048j8(new C3389J7());

    /* renamed from: a */
    @NonNull
    private final C3389J7 f45401a;

    /* renamed from: b */
    private a f45402b = a.BLANK;

    /* renamed from: com.yandex.metrica.impl.ob.j8$a */
    public enum a {
        BLANK,
        LOADING_ERROR,
        LOADED
    }

    @VisibleForTesting
    public C4048j8(@NonNull C3389J7 c3389j7) {
        this.f45401a = c3389j7;
    }

    /* renamed from: a */
    public static C4048j8 m20082a() {
        return f45400c;
    }

    /* renamed from: b */
    public synchronized boolean m20083b() {
        a aVar = this.f45402b;
        a aVar2 = a.LOADED;
        if (aVar == aVar2) {
            return true;
        }
        if (aVar == a.LOADING_ERROR) {
            return false;
        }
        try {
            Objects.requireNonNull(this.f45401a);
            System.loadLibrary("appmetrica-service-native");
            this.f45402b = aVar2;
            return true;
        } catch (Throwable unused) {
            this.f45402b = a.LOADING_ERROR;
            return false;
        }
    }
}
