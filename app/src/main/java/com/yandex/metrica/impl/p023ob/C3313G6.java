package com.yandex.metrica.impl.p023ob;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import androidx.annotation.NonNull;

/* renamed from: com.yandex.metrica.impl.ob.G6 */
/* loaded from: classes2.dex */
public class C3313G6 {

    /* renamed from: a */
    @NonNull
    private final c f42975a;

    @TargetApi
    /* renamed from: com.yandex.metrica.impl.ob.G6$a */
    public static class a implements c {

        /* renamed from: a */
        @NonNull
        private final C3238D6 f42976a;

        public a(@NonNull Context context) {
            this.f42976a = new C3238D6(context);
        }

        @Override // com.yandex.metrica.impl.p023ob.C3313G6.c
        @NonNull
        /* renamed from: a */
        public InterfaceC3263E6 mo18129a() {
            return this.f42976a;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.G6$b */
    public static class b implements c {

        /* renamed from: a */
        @NonNull
        private final C3288F6 f42977a;

        public b(@NonNull Context context) {
            this.f42977a = new C3288F6(context);
        }

        @Override // com.yandex.metrica.impl.p023ob.C3313G6.c
        @NonNull
        /* renamed from: a */
        public InterfaceC3263E6 mo18129a() {
            return this.f42977a;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.G6$c */
    public interface c {
        @NonNull
        /* renamed from: a */
        InterfaceC3263E6 mo18129a();
    }

    public C3313G6(@NonNull Context context) {
        this(Build.VERSION.SDK_INT >= 26 ? new a(context) : new b(context));
    }

    /* renamed from: a */
    public InterfaceC3263E6 m18128a() {
        return this.f42975a.mo18129a();
    }

    public C3313G6(@NonNull c cVar) {
        this.f42975a = cVar;
    }
}
