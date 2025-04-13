package com.yandex.metrica.impl.p023ob;

import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

/* renamed from: com.yandex.metrica.impl.ob.E3 */
/* loaded from: classes2.dex */
public class C3260E3 {

    /* renamed from: a */
    private final c f42766a;

    /* renamed from: b */
    private final InterfaceC3653Tm<Thread, StackTraceElement[], C4125m7> f42767b;

    /* renamed from: c */
    private final InterfaceC3354Hm f42768c;

    /* renamed from: com.yandex.metrica.impl.ob.E3$a */
    public class a implements c {
    }

    /* renamed from: com.yandex.metrica.impl.ob.E3$b */
    public class b implements Comparator<Thread> {
        public b(C3260E3 c3260e3) {
        }

        @Override // java.util.Comparator
        public int compare(Thread thread, Thread thread2) {
            Thread thread3 = thread;
            Thread thread4 = thread2;
            if (thread3 != thread4) {
                String name = thread3.getName();
                String name2 = thread4.getName();
                int i2 = C3509O2.f43529a;
                if (name != null) {
                    if (name2 == null) {
                        return 1;
                    }
                    return name.compareTo(name2);
                }
                if (name2 != null) {
                    return -1;
                }
            }
            return 0;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.E3$c */
    public interface c {
    }

    public C3260E3() {
        this(new a(), new C3235D3(), C3755Y.m19410g().m19419j());
    }

    /* renamed from: a */
    public C3917e7 m17998a() {
        StackTraceElement[] stackTraceElementArr;
        Objects.requireNonNull((a) this.f42766a);
        Thread thread = Looper.getMainLooper().getThread();
        try {
            stackTraceElementArr = thread.getStackTrace();
        } catch (SecurityException unused) {
            stackTraceElementArr = null;
        }
        return new C3917e7(this.f42767b.mo17948a(thread, stackTraceElementArr), m17997a(thread, null), ((C3254Dm) this.f42768c).m17984b());
    }

    @VisibleForTesting
    public C3260E3(@NonNull c cVar, @NonNull InterfaceC3653Tm<Thread, StackTraceElement[], C4125m7> interfaceC3653Tm, @NonNull InterfaceC3354Hm interfaceC3354Hm) {
        this.f42766a = cVar;
        this.f42767b = interfaceC3653Tm;
        this.f42768c = interfaceC3354Hm;
    }

    /* renamed from: a */
    public List<C4125m7> m17999a(@Nullable Thread thread) {
        Objects.requireNonNull((a) this.f42766a);
        Thread thread2 = Looper.getMainLooper().getThread();
        List<C4125m7> m17997a = m17997a(thread2, thread);
        if (thread != thread2) {
            StackTraceElement[] stackTraceElementArr = null;
            try {
                stackTraceElementArr = thread2.getStackTrace();
            } catch (SecurityException unused) {
            }
            ((ArrayList) m17997a).add(0, this.f42767b.mo17948a(thread2, stackTraceElementArr));
        }
        return m17997a;
    }

    /* renamed from: a */
    private List<C4125m7> m17997a(@NonNull Thread thread, @Nullable Thread thread2) {
        Map<Thread, StackTraceElement[]> map;
        ArrayList arrayList = new ArrayList();
        TreeMap treeMap = new TreeMap(new b(this));
        try {
            Objects.requireNonNull((a) this.f42766a);
            map = Thread.getAllStackTraces();
        } catch (SecurityException unused) {
            map = null;
        }
        if (map != null) {
            treeMap.putAll(map);
        }
        if (thread2 != null) {
            treeMap.remove(thread2);
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            Thread thread3 = (Thread) entry.getKey();
            if (thread3 != thread && thread3 != thread2) {
                arrayList.add(this.f42767b.mo17948a(thread3, (StackTraceElement[]) entry.getValue()));
            }
        }
        return arrayList;
    }
}
