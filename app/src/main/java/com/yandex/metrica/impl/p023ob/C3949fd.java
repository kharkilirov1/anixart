package com.yandex.metrica.impl.p023ob;

import android.location.Location;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.fd */
/* loaded from: classes2.dex */
class C3949fd extends AbstractC3534P2<Location> {

    /* renamed from: d */
    public static final long f45126d = TimeUnit.MINUTES.toMillis(2);

    /* renamed from: e */
    public static final List<String> f45127e = Arrays.asList("gps", "network");

    /* renamed from: c */
    @NonNull
    private a f45128c;

    /* renamed from: com.yandex.metrica.impl.ob.fd$a */
    public static class a {

        /* renamed from: a */
        public final long f45129a;

        public a(long j2, long j3, long j4) {
            this.f45129a = j2;
        }
    }

    public C3949fd(@Nullable C4214pi c4214pi) {
        this(new a(f45126d, 200L, 50L), c4214pi != null ? c4214pi.f46205c : C3506O.f43524e.f45675d, (c4214pi != null ? c4214pi.f46205c : C3506O.f43524e.f45675d) * 2);
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3557Q0
    /* renamed from: a */
    public boolean mo18772a(@NonNull Object obj) {
        Location location = (Location) obj;
        return f45127e.contains(location.getProvider()) && (this.f43657a.m18650b() || this.f43657a.m18652d() || m19898a(location, (Location) this.f43657a.m18647a()));
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3557Q0
    /* renamed from: b */
    public long mo18773b(@NonNull C4214pi c4214pi) {
        return c4214pi.f46205c;
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3557Q0
    /* renamed from: a */
    public long mo18770a(@NonNull C4214pi c4214pi) {
        return c4214pi.f46205c * 2;
    }

    @VisibleForTesting
    public C3949fd(@NonNull a aVar, long j2, long j3) {
        super(j2, j3);
        this.f45128c = aVar;
    }

    /* renamed from: a */
    private boolean m19898a(@Nullable Location location, @Nullable Location location2) {
        boolean equals;
        long j2 = this.f45128c.f45129a;
        if (location2 == null) {
            return true;
        }
        long time = location.getTime() - location2.getTime();
        boolean z = time > j2;
        boolean z2 = time < (-j2);
        boolean z3 = time > 0;
        if (z) {
            return true;
        }
        if (!z2) {
            int accuracy = (int) (location.getAccuracy() - location2.getAccuracy());
            boolean z4 = accuracy > 0;
            boolean z5 = accuracy < 0;
            boolean z6 = ((long) accuracy) > 200;
            String provider = location.getProvider();
            String provider2 = location2.getProvider();
            if (provider == null) {
                equals = provider2 == null;
            } else {
                equals = provider.equals(provider2);
            }
            if (z5) {
                return true;
            }
            if (z3 && !z4) {
                return true;
            }
            if (z3 && !z6 && equals) {
                return true;
            }
        }
        return false;
    }
}
