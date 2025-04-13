package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import android.content.res.Configuration;
import android.os.LocaleList;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.metrica.impl.ob.p1 */
/* loaded from: classes2.dex */
public final class C4197p1 {

    /* renamed from: c */
    private static volatile C4197p1 f46093c;

    /* renamed from: d */
    private static final Object f46094d = new Object();

    /* renamed from: a */
    @NonNull
    private List<String> f46095a;

    /* renamed from: b */
    @NonNull
    private final List<a> f46096b = new ArrayList();

    /* renamed from: com.yandex.metrica.impl.ob.p1$a */
    public interface a {
        /* renamed from: a */
        void mo19906a();
    }

    @VisibleForTesting
    public C4197p1(Context context) {
        synchronized (this) {
            this.f46095a = m20518a(context.getResources().getConfiguration());
        }
    }

    /* renamed from: a */
    public static C4197p1 m20517a(@NonNull Context context) {
        if (f46093c == null) {
            synchronized (f46094d) {
                if (f46093c == null) {
                    f46093c = new C4197p1(context.getApplicationContext());
                }
            }
        }
        return f46093c;
    }

    /* renamed from: b */
    public void m20521b(@NonNull Configuration configuration) {
        ArrayList arrayList;
        synchronized (this) {
            this.f46095a = m20518a(configuration);
            arrayList = new ArrayList(this.f46096b);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((a) it.next()).mo19906a();
        }
    }

    @NonNull
    /* renamed from: a */
    public List<String> m20519a() {
        return this.f46095a;
    }

    /* renamed from: a */
    public synchronized void m20520a(@NonNull a aVar) {
        this.f46096b.add(aVar);
    }

    /* renamed from: a */
    private List<String> m20518a(@NonNull Configuration configuration) {
        if (C3658U2.m19211a(24)) {
            ArrayList arrayList = new ArrayList();
            LocaleList locales = configuration.getLocales();
            if (locales != null) {
                int size = locales.size();
                for (int i2 = 0; i2 < size; i2++) {
                    Locale locale = locales.get(i2);
                    if (locale != null) {
                        String m19632a = C3834b2.m19632a(locale);
                        Intrinsics.m32178g(m19632a, "PhoneUtils.normalizedLocale(it)");
                        arrayList.add(m19632a);
                    }
                }
            }
            return arrayList;
        }
        return Collections.singletonList(C3834b2.m19632a(configuration.locale));
    }
}
