package com.yandex.metrica.impl.p023ob;

import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.M */
/* loaded from: classes2.dex */
public class C3456M {

    /* renamed from: a */
    @NonNull
    private final InterfaceExecutorC4297sn f43363a;

    /* renamed from: b */
    @Nullable
    private volatile b f43364b;

    /* renamed from: c */
    private final List<c> f43365c = new ArrayList();

    /* renamed from: d */
    private final InterfaceC3678Um<Intent> f43366d;

    /* renamed from: com.yandex.metrica.impl.ob.M$a */
    public class a implements InterfaceC3678Um<Intent> {
        public a() {
        }

        @Override // com.yandex.metrica.impl.p023ob.InterfaceC3678Um
        /* renamed from: b */
        public void mo17875b(@Nullable Intent intent) {
            Intent intent2 = intent;
            b bVar = C3456M.this.f43364b;
            b.a aVar = bVar == null ? null : bVar.f43369b;
            b m18527a = C3456M.this.m18527a(intent2);
            C3456M.this.f43364b = m18527a;
            if (aVar != m18527a.f43369b) {
                ((C4271rn) C3456M.this.f43363a).execute(new C3431L(this, m18527a));
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.M$b */
    public static class b {

        /* renamed from: a */
        @Nullable
        public final Integer f43368a;

        /* renamed from: b */
        @NonNull
        public final a f43369b;

        /* renamed from: com.yandex.metrica.impl.ob.M$b$a */
        public enum a {
            UNKNOWN(-1),
            NONE(0),
            USB(1),
            WIRELESS(2),
            AC(3);


            /* renamed from: a */
            private final int f43376a;

            a(int i2) {
                this.f43376a = i2;
            }

            /* renamed from: a */
            public int m18537a() {
                return this.f43376a;
            }

            /* renamed from: a */
            public static a m18536a(Integer num) {
                if (num != null) {
                    a[] values = values();
                    for (int i2 = 0; i2 < 5; i2++) {
                        a aVar = values[i2];
                        if (aVar.f43376a == num.intValue()) {
                            return aVar;
                        }
                    }
                }
                return UNKNOWN;
            }
        }

        public b(@Nullable Integer num, @NonNull a aVar) {
            this.f43368a = num;
            this.f43369b = aVar;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.M$c */
    public interface c {
        /* renamed from: a */
        void mo18538a(@NonNull b.a aVar);
    }

    public C3456M(@NonNull InterfaceExecutorC4297sn interfaceExecutorC4297sn, @NonNull C3406K c3406k) {
        a aVar = new a();
        this.f43366d = aVar;
        this.f43363a = interfaceExecutorC4297sn;
        this.f43364b = m18527a(c3406k.m18422c(aVar));
    }

    @NonNull
    /* renamed from: b */
    public b.a m18535b() {
        b bVar = this.f43364b;
        return bVar == null ? b.a.UNKNOWN : bVar.f43369b;
    }

    @Nullable
    /* renamed from: a */
    public Integer m18533a() {
        b bVar = this.f43364b;
        if (bVar == null) {
            return null;
        }
        return bVar.f43368a;
    }

    /* renamed from: a */
    public synchronized void m18534a(@NonNull c cVar) {
        this.f43365c.add(cVar);
        ((C3768Yc) cVar).mo18538a(m18535b());
    }

    /* renamed from: a */
    public static void m18531a(C3456M c3456m, b.a aVar) {
        synchronized (c3456m) {
            Iterator<c> it = c3456m.f43365c.iterator();
            while (it.hasNext()) {
                it.next().mo18538a(aVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    /* renamed from: a */
    public b m18527a(@Nullable Intent intent) {
        b.a aVar = b.a.UNKNOWN;
        Integer num = null;
        if (intent != null) {
            int intExtra = intent.getIntExtra("level", -1);
            int intExtra2 = intent.getIntExtra("scale", -1);
            if (intExtra > 0 && intExtra2 > 0) {
                num = Integer.valueOf((intExtra * 100) / intExtra2);
            }
            int intExtra3 = intent.getIntExtra("plugged", -1);
            aVar = b.a.NONE;
            if (intExtra3 == 1) {
                aVar = b.a.AC;
            } else if (intExtra3 == 2) {
                aVar = b.a.USB;
            } else if (intExtra3 == 4) {
                aVar = b.a.WIRELESS;
            }
        }
        return new b(num, aVar);
    }
}
