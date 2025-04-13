package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.yandex.mobile.ads.embedded.guava.collect.AbstractC4675d0;
import com.yandex.mobile.ads.embedded.guava.collect.AbstractC4698p;
import com.yandex.mobile.ads.impl.C5959w6;
import com.yandex.mobile.ads.impl.InterfaceC5589pf;
import com.yandex.mobile.ads.impl.InterfaceC5939vs;
import com.yandex.mobile.ads.impl.c71;
import com.yandex.mobile.ads.impl.w90;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.RandomAccess;
import okhttp3.internal.p038ws.WebSocketProtocol;

/* renamed from: com.yandex.mobile.ads.impl.ho */
/* loaded from: classes3.dex */
public final class C5194ho extends w90 {

    /* renamed from: i */
    private static final AbstractC4675d0<Integer> f51018i = AbstractC4675d0.m21986a(C4891by.f49022r);

    /* renamed from: j */
    private static final AbstractC4675d0<Integer> f51019j = AbstractC4675d0.m21986a(C4891by.f49023s);

    /* renamed from: c */
    private final Object f51020c;

    /* renamed from: d */
    private final InterfaceC5939vs.b f51021d;

    /* renamed from: e */
    private final boolean f51022e;

    /* renamed from: f */
    @GuardedBy
    private c f51023f;

    /* renamed from: g */
    @Nullable
    @GuardedBy
    private e f51024g;

    /* renamed from: h */
    @GuardedBy
    private C5481nb f51025h;

    /* renamed from: com.yandex.mobile.ads.impl.ho$b */
    public static final class b implements Comparable<b> {

        /* renamed from: a */
        private final boolean f51044a;

        /* renamed from: b */
        private final boolean f51045b;

        public b(C5606pv c5606pv, int i2) {
            this.f51044a = (c5606pv.f53812d & 1) != 0;
            this.f51045b = C5194ho.m25279a(false, i2);
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final int compareTo(b bVar) {
            return AbstractC5446mj.m26681e().mo26685a(this.f51045b, bVar.f51045b).mo26685a(this.f51044a, bVar.f51044a).mo26687d();
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ho$c */
    public static final class c extends c71 {

        /* renamed from: Q */
        public static final c f51046Q = new a().m25321a();

        /* renamed from: B */
        public final boolean f51047B;

        /* renamed from: C */
        public final boolean f51048C;

        /* renamed from: D */
        public final boolean f51049D;

        /* renamed from: E */
        public final boolean f51050E;

        /* renamed from: F */
        public final boolean f51051F;

        /* renamed from: G */
        public final boolean f51052G;

        /* renamed from: H */
        public final boolean f51053H;

        /* renamed from: I */
        public final boolean f51054I;

        /* renamed from: J */
        public final boolean f51055J;

        /* renamed from: K */
        public final boolean f51056K;

        /* renamed from: L */
        public final boolean f51057L;

        /* renamed from: M */
        public final boolean f51058M;

        /* renamed from: N */
        public final boolean f51059N;

        /* renamed from: O */
        private final SparseArray<Map<x61, d>> f51060O;

        /* renamed from: P */
        private final SparseBooleanArray f51061P;

        /* renamed from: com.yandex.mobile.ads.impl.ho$c$a */
        public static final class a extends c71.C4907a {

            /* renamed from: A */
            private boolean f51062A;

            /* renamed from: B */
            private boolean f51063B;

            /* renamed from: C */
            private boolean f51064C;

            /* renamed from: D */
            private boolean f51065D;

            /* renamed from: E */
            private boolean f51066E;

            /* renamed from: F */
            private boolean f51067F;

            /* renamed from: G */
            private boolean f51068G;

            /* renamed from: H */
            private boolean f51069H;

            /* renamed from: I */
            private boolean f51070I;

            /* renamed from: J */
            private boolean f51071J;

            /* renamed from: K */
            private boolean f51072K;

            /* renamed from: L */
            private boolean f51073L;

            /* renamed from: M */
            private boolean f51074M;

            /* renamed from: N */
            private final SparseArray<Map<x61, d>> f51075N;

            /* renamed from: O */
            private final SparseBooleanArray f51076O;

            public /* synthetic */ a(Bundle bundle, int i2) {
                this(bundle);
            }

            @Deprecated
            public a() {
                this.f51075N = new SparseArray<>();
                this.f51076O = new SparseBooleanArray();
                m25306b();
            }

            @Override // com.yandex.mobile.ads.impl.c71.C4907a
            /* renamed from: a */
            public final c71.C4907a mo23065a(int i2, int i3) {
                super.mo23065a(i2, i3);
                return this;
            }

            @Override // com.yandex.mobile.ads.impl.c71.C4907a
            /* renamed from: b */
            public final void mo23067b(Context context) {
                super.mo23067b(context);
            }

            /* renamed from: c */
            public final void m25324c(boolean z) {
                this.f51067F = z;
            }

            /* renamed from: d */
            public final void m25325d(boolean z) {
                this.f51068G = z;
            }

            /* renamed from: e */
            public final void m25326e(boolean z) {
                this.f51074M = z;
            }

            /* renamed from: f */
            public final void m25327f(boolean z) {
                this.f51065D = z;
            }

            /* renamed from: g */
            public final void m25328g(boolean z) {
                this.f51063B = z;
            }

            /* renamed from: h */
            public final void m25329h(boolean z) {
                this.f51064C = z;
            }

            /* renamed from: i */
            public final void m25330i(boolean z) {
                this.f51071J = z;
            }

            /* renamed from: j */
            public final void m25331j(boolean z) {
                this.f51066E = z;
            }

            /* renamed from: k */
            public final void m25332k(boolean z) {
                this.f51072K = z;
            }

            /* renamed from: l */
            public final void m25333l(boolean z) {
                this.f51062A = z;
            }

            /* renamed from: m */
            public final void m25334m(boolean z) {
                this.f51073L = z;
            }

            /* renamed from: a */
            public final void m25322a(boolean z) {
                this.f51069H = z;
            }

            /* renamed from: b */
            public final void m25323b(boolean z) {
                this.f51070I = z;
            }

            /* renamed from: b */
            private void m25306b() {
                this.f51062A = true;
                this.f51063B = false;
                this.f51064C = true;
                this.f51065D = false;
                this.f51066E = true;
                this.f51067F = false;
                this.f51068G = false;
                this.f51069H = false;
                this.f51070I = false;
                this.f51071J = true;
                this.f51072K = true;
                this.f51073L = false;
                this.f51074M = true;
            }

            @Override // com.yandex.mobile.ads.impl.c71.C4907a
            /* renamed from: a */
            public final void mo23066a(Context context) {
                super.mo23066a(context);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* renamed from: a */
            private void m25304a(Bundle bundle) {
                AbstractC4698p m27717a;
                SparseArray sparseArray;
                int[] intArray = bundle.getIntArray(Integer.toString(1010, 36));
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(Integer.toString(1011, 36));
                if (parcelableArrayList == null) {
                    m27717a = AbstractC4698p.m22055i();
                } else {
                    m27717a = C5637qf.m27717a(x61.f56384e, parcelableArrayList);
                }
                SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(Integer.toString(1012, 36));
                if (sparseParcelableArray == null) {
                    sparseArray = new SparseArray();
                } else {
                    InterfaceC5589pf.a<d> aVar = d.f51077d;
                    SparseArray sparseArray2 = new SparseArray(sparseParcelableArray.size());
                    for (int i2 = 0; i2 < sparseParcelableArray.size(); i2++) {
                        sparseArray2.put(sparseParcelableArray.keyAt(i2), aVar.fromBundle((Bundle) sparseParcelableArray.valueAt(i2)));
                    }
                    sparseArray = sparseArray2;
                }
                if (intArray == null || intArray.length != m27717a.size()) {
                    return;
                }
                for (int i3 = 0; i3 < intArray.length; i3++) {
                    int i4 = intArray[i3];
                    x61 x61Var = (x61) m27717a.get(i3);
                    d dVar = (d) sparseArray.get(i3);
                    Map<x61, d> map = this.f51075N.get(i4);
                    if (map == null) {
                        map = new HashMap<>();
                        this.f51075N.put(i4, map);
                    }
                    if (!map.containsKey(x61Var) || !s91.m28112a(map.get(x61Var), dVar)) {
                        map.put(x61Var, dVar);
                    }
                }
            }

            public a(Context context) {
                super(context);
                this.f51075N = new SparseArray<>();
                this.f51076O = new SparseBooleanArray();
                m25306b();
            }

            private a(Bundle bundle) {
                super(bundle);
                m25306b();
                c cVar = c.f51046Q;
                m25333l(bundle.getBoolean(c71.m23037a(1000), cVar.f51047B));
                m25328g(bundle.getBoolean(c71.m23037a(WebSocketProtocol.CLOSE_CLIENT_GOING_AWAY), cVar.f51048C));
                m25329h(bundle.getBoolean(c71.m23037a(1002), cVar.f51049D));
                m25327f(bundle.getBoolean(c71.m23037a(1014), cVar.f51050E));
                m25331j(bundle.getBoolean(c71.m23037a(1003), cVar.f51051F));
                m25324c(bundle.getBoolean(c71.m23037a(1004), cVar.f51052G));
                m25325d(bundle.getBoolean(c71.m23037a(WebSocketProtocol.CLOSE_NO_STATUS_CODE), cVar.f51053H));
                m25322a(bundle.getBoolean(c71.m23037a(1006), cVar.f51054I));
                m25323b(bundle.getBoolean(c71.m23037a(1015), cVar.f51055J));
                m25330i(bundle.getBoolean(c71.m23037a(1016), cVar.f51056K));
                m25332k(bundle.getBoolean(c71.m23037a(1007), cVar.f51057L));
                m25334m(bundle.getBoolean(c71.m23037a(1008), cVar.f51058M));
                m25326e(bundle.getBoolean(c71.m23037a(1009), cVar.f51059N));
                this.f51075N = new SparseArray<>();
                m25304a(bundle);
                this.f51076O = m25303a(bundle.getIntArray(c71.m23037a(1013)));
            }

            /* renamed from: a */
            public final c m25321a() {
                return new c(this, 0);
            }

            /* renamed from: a */
            private static SparseBooleanArray m25303a(@Nullable int[] iArr) {
                if (iArr == null) {
                    return new SparseBooleanArray();
                }
                SparseBooleanArray sparseBooleanArray = new SparseBooleanArray(iArr.length);
                for (int i2 : iArr) {
                    sparseBooleanArray.append(i2, true);
                }
                return sparseBooleanArray;
            }
        }

        static {
            dn1 dn1Var = dn1.f49687B;
        }

        public /* synthetic */ c(a aVar, int i2) {
            this(aVar);
        }

        /* renamed from: a */
        public static c m25297a(Context context) {
            return new a(context).m25321a();
        }

        /* renamed from: b */
        public final boolean m25301b(int i2) {
            return this.f51061P.get(i2);
        }

        /* JADX WARN: Removed duplicated region for block: B:48:0x008b  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x00f2 A[LOOP:1: B:51:0x009b->B:69:0x00f2, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:70:0x00f5 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
        @Override // com.yandex.mobile.ads.impl.c71
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean equals(@androidx.annotation.Nullable java.lang.Object r11) {
            /*
                Method dump skipped, instructions count: 254
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C5194ho.c.equals(java.lang.Object):boolean");
        }

        @Override // com.yandex.mobile.ads.impl.c71
        public final int hashCode() {
            return ((((((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.f51047B ? 1 : 0)) * 31) + (this.f51048C ? 1 : 0)) * 31) + (this.f51049D ? 1 : 0)) * 31) + (this.f51050E ? 1 : 0)) * 31) + (this.f51051F ? 1 : 0)) * 31) + (this.f51052G ? 1 : 0)) * 31) + (this.f51053H ? 1 : 0)) * 31) + (this.f51054I ? 1 : 0)) * 31) + (this.f51055J ? 1 : 0)) * 31) + (this.f51056K ? 1 : 0)) * 31) + (this.f51057L ? 1 : 0)) * 31) + (this.f51058M ? 1 : 0)) * 31) + (this.f51059N ? 1 : 0);
        }

        private c(a aVar) {
            super(aVar);
            this.f51047B = aVar.f51062A;
            this.f51048C = aVar.f51063B;
            this.f51049D = aVar.f51064C;
            this.f51050E = aVar.f51065D;
            this.f51051F = aVar.f51066E;
            this.f51052G = aVar.f51067F;
            this.f51053H = aVar.f51068G;
            this.f51054I = aVar.f51069H;
            this.f51055J = aVar.f51070I;
            this.f51056K = aVar.f51071J;
            this.f51057L = aVar.f51072K;
            this.f51058M = aVar.f51073L;
            this.f51059N = aVar.f51074M;
            this.f51060O = aVar.f51075N;
            this.f51061P = aVar.f51076O;
        }

        @Nullable
        @Deprecated
        /* renamed from: a */
        public final d m25300a(int i2, x61 x61Var) {
            Map<x61, d> map = this.f51060O.get(i2);
            if (map != null) {
                return map.get(x61Var);
            }
            return null;
        }

        @Deprecated
        /* renamed from: b */
        public final boolean m25302b(int i2, x61 x61Var) {
            Map<x61, d> map = this.f51060O.get(i2);
            return map != null && map.containsKey(x61Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public static /* synthetic */ c m25298b(Bundle bundle) {
            return new a(bundle, 0).m25321a();
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ho$d */
    public static final class d implements InterfaceC5589pf {

        /* renamed from: d */
        public static final InterfaceC5589pf.a<d> f51077d = dn1.f49688C;

        /* renamed from: a */
        public final int f51078a;

        /* renamed from: b */
        public final int[] f51079b;

        /* renamed from: c */
        public final int f51080c;

        public d(int i2, int i3, int[] iArr) {
            this.f51078a = i2;
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.f51079b = copyOf;
            this.f51080c = i3;
            Arrays.sort(copyOf);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public static d m25335a(Bundle bundle) {
            boolean z = false;
            int i2 = bundle.getInt(Integer.toString(0, 36), -1);
            int[] intArray = bundle.getIntArray(Integer.toString(1, 36));
            int i3 = bundle.getInt(Integer.toString(2, 36), -1);
            if (i2 >= 0 && i3 >= 0) {
                z = true;
            }
            C5220ia.m25473a(z);
            Objects.requireNonNull(intArray);
            return new d(i2, i3, intArray);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            return this.f51078a == dVar.f51078a && Arrays.equals(this.f51079b, dVar.f51079b) && this.f51080c == dVar.f51080c;
        }

        public final int hashCode() {
            return ((Arrays.hashCode(this.f51079b) + (this.f51078a * 31)) * 31) + this.f51080c;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ho$f */
    public static final class f extends g<f> implements Comparable<f> {

        /* renamed from: e */
        private final int f51086e;

        /* renamed from: f */
        private final boolean f51087f;

        /* renamed from: g */
        private final boolean f51088g;

        /* renamed from: h */
        private final boolean f51089h;

        /* renamed from: i */
        private final int f51090i;

        /* renamed from: j */
        private final int f51091j;

        /* renamed from: k */
        private final int f51092k;

        /* renamed from: l */
        private final int f51093l;

        /* renamed from: m */
        private final boolean f51094m;

        public f(int i2, w61 w61Var, int i3, c cVar, int i4, @Nullable String str) {
            super(i2, i3, w61Var);
            int i5;
            int i6 = 0;
            this.f51087f = C5194ho.m25279a(false, i4);
            int i7 = this.f51098d.f53812d & (~cVar.f49141u);
            this.f51088g = (i7 & 1) != 0;
            this.f51089h = (i7 & 2) != 0;
            int i8 = Integer.MAX_VALUE;
            AbstractC4698p<String> m22048a = cVar.f49139s.isEmpty() ? AbstractC4698p.m22048a("") : cVar.f49139s;
            int i9 = 0;
            while (true) {
                if (i9 >= m22048a.size()) {
                    i5 = 0;
                    break;
                }
                i5 = C5194ho.m25268a(this.f51098d, m22048a.get(i9), cVar.f49142v);
                if (i5 > 0) {
                    i8 = i9;
                    break;
                }
                i9++;
            }
            this.f51090i = i8;
            this.f51091j = i5;
            int m25267a = C5194ho.m25267a(this.f51098d.f53813e, cVar.f49140t);
            this.f51092k = m25267a;
            this.f51094m = (this.f51098d.f53813e & 1088) != 0;
            int m25268a = C5194ho.m25268a(this.f51098d, str, C5194ho.m25281b(str) == null);
            this.f51093l = m25268a;
            boolean z = i5 > 0 || (cVar.f49139s.isEmpty() && m25267a > 0) || this.f51088g || (this.f51089h && m25268a > 0);
            if (C5194ho.m25279a(cVar.f51057L, i4) && z) {
                i6 = 1;
            }
            this.f51086e = i6;
        }

        @Override // com.yandex.mobile.ads.impl.C5194ho.g
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ boolean mo25295a(f fVar) {
            return false;
        }

        @Override // com.yandex.mobile.ads.impl.C5194ho.g
        /* renamed from: a */
        public final int mo25294a() {
            return this.f51086e;
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final int compareTo(f fVar) {
            AbstractC5446mj mo26682a = AbstractC5446mj.m26681e().mo26685a(this.f51087f, fVar.f51087f).mo26684a(Integer.valueOf(this.f51090i), Integer.valueOf(fVar.f51090i), AbstractC4675d0.m21985a().mo21983b()).mo26682a(this.f51091j, fVar.f51091j).mo26682a(this.f51092k, fVar.f51092k).mo26685a(this.f51088g, fVar.f51088g).mo26684a(Boolean.valueOf(this.f51089h), Boolean.valueOf(fVar.f51089h), this.f51091j == 0 ? AbstractC4675d0.m21985a() : AbstractC4675d0.m21985a().mo21983b()).mo26682a(this.f51093l, fVar.f51093l);
            if (this.f51092k == 0) {
                mo26682a = mo26682a.mo26686b(this.f51094m, fVar.f51094m);
            }
            return mo26682a.mo26687d();
        }

        /* renamed from: a */
        public static int m25344a(List<f> list, List<f> list2) {
            return list.get(0).compareTo(list2.get(0));
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ho$g */
    public static abstract class g<T extends g<T>> {

        /* renamed from: a */
        public final int f51095a;

        /* renamed from: b */
        public final w61 f51096b;

        /* renamed from: c */
        public final int f51097c;

        /* renamed from: d */
        public final C5606pv f51098d;

        /* renamed from: com.yandex.mobile.ads.impl.ho$g$a */
        public interface a<T extends g<T>> {
            /* renamed from: a */
            List<T> mo25345a(int i2, w61 w61Var, int[] iArr);
        }

        public g(int i2, int i3, w61 w61Var) {
            this.f51095a = i2;
            this.f51096b = w61Var;
            this.f51097c = i3;
            this.f51098d = w61Var.m29393a(i3);
        }

        /* renamed from: a */
        public abstract int mo25294a();

        /* renamed from: a */
        public abstract boolean mo25295a(T t);
    }

    public C5194ho(Context context, c cVar, C5959w6.b bVar) {
        this(cVar, bVar, context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ int m25269a(Integer num, Integer num2) {
        if (num.intValue() == -1) {
            return num2.intValue() == -1 ? 0 : -1;
        }
        if (num2.intValue() == -1) {
            return 1;
        }
        return num.intValue() - num2.intValue();
    }

    /* renamed from: a */
    public static boolean m25279a(boolean z, int i2) {
        int i3 = i2 & 7;
        return i3 == 4 || (z && i3 == 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ int m25280b(Integer num, Integer num2) {
        return 0;
    }

    @Nullable
    /* renamed from: b */
    public static String m25281b(@Nullable String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    @Override // com.yandex.mobile.ads.impl.d71
    /* renamed from: d */
    public final void mo23829d() {
        e eVar;
        synchronized (this.f51020c) {
            if (s91.f54530a >= 32 && (eVar = this.f51024g) != null) {
                eVar.m25343d();
            }
        }
        super.mo23829d();
    }

    @RequiresApi
    /* renamed from: com.yandex.mobile.ads.impl.ho$e */
    public static class e {

        /* renamed from: a */
        private final Spatializer f51081a;

        /* renamed from: b */
        private final boolean f51082b;

        /* renamed from: c */
        @Nullable
        private Handler f51083c;

        /* renamed from: d */
        @Nullable
        private Spatializer.OnSpatializerStateChangedListener f51084d;

        /* renamed from: com.yandex.mobile.ads.impl.ho$e$a */
        public class a implements Spatializer.OnSpatializerStateChangedListener {

            /* renamed from: a */
            public final /* synthetic */ C5194ho f51085a;

            public a(C5194ho c5194ho) {
                this.f51085a = c5194ho;
            }

            @Override // android.media.Spatializer.OnSpatializerStateChangedListener
            public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z) {
                C5194ho.m25277a(this.f51085a);
            }

            @Override // android.media.Spatializer.OnSpatializerStateChangedListener
            public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z) {
                C5194ho.m25277a(this.f51085a);
            }
        }

        private e(Spatializer spatializer) {
            this.f51081a = spatializer;
            this.f51082b = spatializer.getImmersiveAudioLevel() != 0;
        }

        @Nullable
        /* renamed from: a */
        public static e m25337a(Context context) {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            if (audioManager == null) {
                return null;
            }
            return new e(audioManager.getSpatializer());
        }

        /* renamed from: b */
        public final boolean m25341b() {
            return this.f51081a.isEnabled();
        }

        /* renamed from: c */
        public final boolean m25342c() {
            return this.f51082b;
        }

        /* renamed from: d */
        public final void m25343d() {
            Spatializer.OnSpatializerStateChangedListener onSpatializerStateChangedListener = this.f51084d;
            if (onSpatializerStateChangedListener == null || this.f51083c == null) {
                return;
            }
            this.f51081a.removeOnSpatializerStateChangedListener(onSpatializerStateChangedListener);
            ((Handler) s91.m28101a(this.f51083c)).removeCallbacksAndMessages(null);
            this.f51083c = null;
            this.f51084d = null;
        }

        /* renamed from: a */
        public final void m25338a(C5194ho c5194ho, Looper looper) {
            if (this.f51084d == null && this.f51083c == null) {
                this.f51084d = new a(c5194ho);
                Handler handler = new Handler(looper);
                this.f51083c = handler;
                this.f51081a.addOnSpatializerStateChangedListener(new ko1(handler, 1), this.f51084d);
            }
        }

        /* renamed from: a */
        public final boolean m25339a() {
            return this.f51081a.isAvailable();
        }

        /* renamed from: a */
        public final boolean m25340a(C5606pv c5606pv, C5481nb c5481nb) {
            AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(s91.m28086a(("audio/eac3-joc".equals(c5606pv.f53820l) && c5606pv.f53833y == 16) ? 12 : c5606pv.f53833y));
            int i2 = c5606pv.f53834z;
            if (i2 != -1) {
                channelMask.setSampleRate(i2);
            }
            return this.f51081a.canBeSpatialized(c5481nb.m26831a().f52900a, channelMask.build());
        }
    }

    private C5194ho(c cVar, C5959w6.b bVar, @Nullable Context context) {
        this.f51020c = new Object();
        if (context != null) {
            context.getApplicationContext();
        }
        this.f51021d = bVar;
        this.f51023f = cVar;
        this.f51025h = C5481nb.f52893g;
        boolean z = context != null && s91.m28131d(context);
        this.f51022e = z;
        if (!z && context != null && s91.f54530a >= 32) {
            this.f51024g = e.m25337a(context);
        }
        if (this.f51023f.f51056K && context == null) {
            d90.m23842d("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ho$a */
    public static final class a extends g<a> implements Comparable<a> {

        /* renamed from: e */
        private final int f51026e;

        /* renamed from: f */
        private final boolean f51027f;

        /* renamed from: g */
        @Nullable
        private final String f51028g;

        /* renamed from: h */
        private final c f51029h;

        /* renamed from: i */
        private final boolean f51030i;

        /* renamed from: j */
        private final int f51031j;

        /* renamed from: k */
        private final int f51032k;

        /* renamed from: l */
        private final int f51033l;

        /* renamed from: m */
        private final boolean f51034m;

        /* renamed from: n */
        private final int f51035n;

        /* renamed from: o */
        private final int f51036o;

        /* renamed from: p */
        private final boolean f51037p;

        /* renamed from: q */
        private final int f51038q;

        /* renamed from: r */
        private final int f51039r;

        /* renamed from: s */
        private final int f51040s;

        /* renamed from: t */
        private final int f51041t;

        /* renamed from: u */
        private final boolean f51042u;

        /* renamed from: v */
        private final boolean f51043v;

        public a(int i2, w61 w61Var, int i3, c cVar, int i4, boolean z, ur0<C5606pv> ur0Var) {
            super(i2, i3, w61Var);
            int i5;
            int i6;
            int i7;
            this.f51029h = cVar;
            this.f51028g = C5194ho.m25281b(this.f51098d.f53811c);
            this.f51030i = C5194ho.m25279a(false, i4);
            int i8 = 0;
            while (true) {
                i5 = Integer.MAX_VALUE;
                if (i8 >= cVar.f49134n.size()) {
                    i8 = Integer.MAX_VALUE;
                    i6 = 0;
                    break;
                } else {
                    i6 = C5194ho.m25268a(this.f51098d, cVar.f49134n.get(i8), false);
                    if (i6 > 0) {
                        break;
                    } else {
                        i8++;
                    }
                }
            }
            this.f51032k = i8;
            this.f51031j = i6;
            this.f51033l = C5194ho.m25267a(this.f51098d.f53813e, cVar.f49135o);
            C5606pv c5606pv = this.f51098d;
            int i9 = c5606pv.f53813e;
            this.f51034m = i9 == 0 || (i9 & 1) != 0;
            this.f51037p = (c5606pv.f53812d & 1) != 0;
            int i10 = c5606pv.f53833y;
            this.f51038q = i10;
            this.f51039r = c5606pv.f53834z;
            int i11 = c5606pv.f53816h;
            this.f51040s = i11;
            this.f51027f = (i11 == -1 || i11 <= cVar.f49137q) && (i10 == -1 || i10 <= cVar.f49136p) && ur0Var.apply(c5606pv);
            String[] m28132d = s91.m28132d();
            int i12 = 0;
            while (true) {
                if (i12 >= m28132d.length) {
                    i12 = Integer.MAX_VALUE;
                    i7 = 0;
                    break;
                } else {
                    i7 = C5194ho.m25268a(this.f51098d, m28132d[i12], false);
                    if (i7 > 0) {
                        break;
                    } else {
                        i12++;
                    }
                }
            }
            this.f51035n = i12;
            this.f51036o = i7;
            int i13 = 0;
            while (true) {
                if (i13 < cVar.f49138r.size()) {
                    String str = this.f51098d.f53820l;
                    if (str != null && str.equals(cVar.f49138r.get(i13))) {
                        i5 = i13;
                        break;
                    }
                    i13++;
                } else {
                    break;
                }
            }
            this.f51041t = i5;
            this.f51042u = co1.m23503b(i4) == 128;
            this.f51043v = co1.m23504c(i4) == 64;
            this.f51026e = m25293a(z, i4);
        }

        @Override // com.yandex.mobile.ads.impl.C5194ho.g
        /* renamed from: a */
        public final boolean mo25295a(a aVar) {
            int i2;
            String str;
            int i3;
            a aVar2 = aVar;
            c cVar = this.f51029h;
            if ((cVar.f51054I || ((i3 = this.f51098d.f53833y) != -1 && i3 == aVar2.f51098d.f53833y)) && (cVar.f51052G || ((str = this.f51098d.f53820l) != null && TextUtils.equals(str, aVar2.f51098d.f53820l)))) {
                c cVar2 = this.f51029h;
                if ((cVar2.f51053H || ((i2 = this.f51098d.f53834z) != -1 && i2 == aVar2.f51098d.f53834z)) && (cVar2.f51055J || (this.f51042u == aVar2.f51042u && this.f51043v == aVar2.f51043v))) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.yandex.mobile.ads.impl.C5194ho.g
        /* renamed from: a */
        public final int mo25294a() {
            return this.f51026e;
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final int compareTo(a aVar) {
            AbstractC4675d0 mo21983b = (this.f51027f && this.f51030i) ? C5194ho.f51018i : C5194ho.f51018i.mo21983b();
            AbstractC5446mj mo26684a = AbstractC5446mj.m26681e().mo26685a(this.f51030i, aVar.f51030i).mo26684a(Integer.valueOf(this.f51032k), Integer.valueOf(aVar.f51032k), AbstractC4675d0.m21985a().mo21983b()).mo26682a(this.f51031j, aVar.f51031j).mo26682a(this.f51033l, aVar.f51033l).mo26685a(this.f51037p, aVar.f51037p).mo26685a(this.f51034m, aVar.f51034m).mo26684a(Integer.valueOf(this.f51035n), Integer.valueOf(aVar.f51035n), AbstractC4675d0.m21985a().mo21983b()).mo26682a(this.f51036o, aVar.f51036o).mo26685a(this.f51027f, aVar.f51027f).mo26684a(Integer.valueOf(this.f51041t), Integer.valueOf(aVar.f51041t), AbstractC4675d0.m21985a().mo21983b()).mo26684a(Integer.valueOf(this.f51040s), Integer.valueOf(aVar.f51040s), this.f51029h.f49143w ? C5194ho.f51018i.mo21983b() : C5194ho.f51019j).mo26685a(this.f51042u, aVar.f51042u).mo26685a(this.f51043v, aVar.f51043v).mo26684a(Integer.valueOf(this.f51038q), Integer.valueOf(aVar.f51038q), mo21983b).mo26684a(Integer.valueOf(this.f51039r), Integer.valueOf(aVar.f51039r), mo21983b);
            Integer valueOf = Integer.valueOf(this.f51040s);
            Integer valueOf2 = Integer.valueOf(aVar.f51040s);
            if (!s91.m28112a(this.f51028g, aVar.f51028g)) {
                mo21983b = C5194ho.f51019j;
            }
            return mo26684a.mo26684a(valueOf, valueOf2, mo21983b).mo26687d();
        }

        /* renamed from: a */
        private int m25293a(boolean z, int i2) {
            if (!C5194ho.m25279a(this.f51029h.f51057L, i2)) {
                return 0;
            }
            if (!this.f51027f && !this.f51029h.f51051F) {
                return 0;
            }
            if (C5194ho.m25279a(false, i2) && this.f51027f && this.f51098d.f53816h != -1) {
                c cVar = this.f51029h;
                if (!cVar.f49144x && !cVar.f49143w && (cVar.f51059N || !z)) {
                    return 2;
                }
            }
            return 1;
        }

        /* renamed from: a */
        public static int m25292a(List<a> list, List<a> list2) {
            return ((a) Collections.max(list)).compareTo((a) Collections.max(list2));
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ho$h */
    public static final class h extends g<h> {

        /* renamed from: e */
        private final boolean f51099e;

        /* renamed from: f */
        private final c f51100f;

        /* renamed from: g */
        private final boolean f51101g;

        /* renamed from: h */
        private final boolean f51102h;

        /* renamed from: i */
        private final int f51103i;

        /* renamed from: j */
        private final int f51104j;

        /* renamed from: k */
        private final int f51105k;

        /* renamed from: l */
        private final int f51106l;

        /* renamed from: m */
        private final boolean f51107m;

        /* renamed from: n */
        private final boolean f51108n;

        /* renamed from: o */
        private final int f51109o;

        /* renamed from: p */
        private final boolean f51110p;

        /* renamed from: q */
        private final boolean f51111q;

        /* renamed from: r */
        private final int f51112r;

        /* JADX WARN: Removed duplicated region for block: B:49:0x00a0  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x00b5  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x00d6  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x00e4  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x00d8  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x00cc A[EDGE_INSN: B:74:0x00cc->B:61:0x00cc BREAK  A[LOOP:0: B:53:0x00ad->B:72:0x00c9], SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public h(int r5, com.yandex.mobile.ads.impl.w61 r6, int r7, com.yandex.mobile.ads.impl.C5194ho.c r8, int r9, int r10, boolean r11) {
            /*
                Method dump skipped, instructions count: 248
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C5194ho.h.<init>(int, com.yandex.mobile.ads.impl.w61, int, com.yandex.mobile.ads.impl.ho$c, int, int, boolean):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public static int m25349b(h hVar, h hVar2) {
            AbstractC4675d0 mo21983b = (hVar.f51099e && hVar.f51102h) ? C5194ho.f51018i : C5194ho.f51018i.mo21983b();
            return AbstractC5446mj.m26681e().mo26684a(Integer.valueOf(hVar.f51103i), Integer.valueOf(hVar2.f51103i), hVar.f51100f.f49143w ? C5194ho.f51018i.mo21983b() : C5194ho.f51019j).mo26684a(Integer.valueOf(hVar.f51104j), Integer.valueOf(hVar2.f51104j), mo21983b).mo26684a(Integer.valueOf(hVar.f51103i), Integer.valueOf(hVar2.f51103i), mo21983b).mo26687d();
        }

        @Override // com.yandex.mobile.ads.impl.C5194ho.g
        /* renamed from: a */
        public final boolean mo25295a(h hVar) {
            h hVar2 = hVar;
            return (this.f51108n || s91.m28112a(this.f51098d.f53820l, hVar2.f51098d.f53820l)) && (this.f51100f.f51050E || (this.f51110p == hVar2.f51110p && this.f51111q == hVar2.f51111q));
        }

        @Override // com.yandex.mobile.ads.impl.C5194ho.g
        /* renamed from: a */
        public final int mo25294a() {
            return this.f51109o;
        }

        /* renamed from: a */
        private int m25346a(int i2, int i3) {
            if ((this.f51098d.f53813e & 16384) != 0 || !C5194ho.m25279a(this.f51100f.f51057L, i2)) {
                return 0;
            }
            if (!this.f51099e && !this.f51100f.f51047B) {
                return 0;
            }
            if (C5194ho.m25279a(false, i2) && this.f51101g && this.f51099e && this.f51098d.f53816h != -1) {
                c cVar = this.f51100f;
                if (!cVar.f49144x && !cVar.f49143w && (i2 & i3) != 0) {
                    return 2;
                }
            }
            return 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public static int m25347a(h hVar, h hVar2) {
            AbstractC5446mj mo26685a = AbstractC5446mj.m26681e().mo26685a(hVar.f51102h, hVar2.f51102h).mo26682a(hVar.f51106l, hVar2.f51106l).mo26685a(hVar.f51107m, hVar2.f51107m).mo26685a(hVar.f51099e, hVar2.f51099e).mo26685a(hVar.f51101g, hVar2.f51101g).mo26684a(Integer.valueOf(hVar.f51105k), Integer.valueOf(hVar2.f51105k), AbstractC4675d0.m21985a().mo21983b()).mo26685a(hVar.f51110p, hVar2.f51110p).mo26685a(hVar.f51111q, hVar2.f51111q);
            if (hVar.f51110p && hVar.f51111q) {
                mo26685a = mo26685a.mo26682a(hVar.f51112r, hVar2.f51112r);
            }
            return mo26685a.mo26687d();
        }

        /* renamed from: a */
        public static int m25348a(List<h> list, List<h> list2) {
            return AbstractC5446mj.m26681e().mo26684a((h) Collections.max(list, C4891by.f49013i), (h) Collections.max(list2, C4891by.f49014j), C4891by.f49015k).mo26682a(list.size(), list2.size()).mo26684a((h) Collections.max(list, C4891by.f49016l), (h) Collections.max(list2, C4891by.f49017m), C4891by.f49018n).mo26687d();
        }
    }

    @Override // com.yandex.mobile.ads.impl.d71
    /* renamed from: a */
    public final void mo23825a(C5481nb c5481nb) {
        boolean z;
        boolean z2;
        e eVar;
        synchronized (this.f51020c) {
            z = true;
            z2 = !this.f51025h.equals(c5481nb);
            this.f51025h = c5481nb;
        }
        if (z2) {
            synchronized (this.f51020c) {
                if (!this.f51023f.f51056K || this.f51022e || s91.f54530a < 32 || (eVar = this.f51024g) == null || !eVar.m25342c()) {
                    z = false;
                }
            }
            if (z) {
                m23827b();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:192:0x02fb, code lost:
    
        if (r4 != 2) goto L188;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.mobile.ads.impl.w90
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.util.Pair mo25291a(com.yandex.mobile.ads.impl.w90.C5964a r33, int[][][] r34, int[] r35) throws com.yandex.mobile.ads.impl.C5043es {
        /*
            Method dump skipped, instructions count: 868
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C5194ho.mo25291a(com.yandex.mobile.ads.impl.w90$a, int[][][], int[]):android.util.Pair");
    }

    @Nullable
    /* renamed from: a */
    public static Pair m25273a(w90.C5964a c5964a, int[][][] iArr, int[] iArr2, c cVar) throws C5043es {
        return m25271a(2, c5964a, iArr, new pn1(cVar, iArr2, 12), C4891by.f49012h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004c  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List m25276a(com.yandex.mobile.ads.impl.C5194ho.c r16, int[] r17, int r18, com.yandex.mobile.ads.impl.w61 r19, int[] r20) {
        /*
            r8 = r16
            r9 = r19
            r10 = r17[r18]
            int r0 = r8.f49129i
            int r1 = r8.f49130j
            boolean r2 = r8.f49131k
            r13 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == r13) goto L77
            if (r1 != r13) goto L15
            goto L77
        L15:
            r3 = 0
            r4 = 2147483647(0x7fffffff, float:NaN)
        L19:
            int r5 = r9.f56028a
            if (r3 >= r5) goto L75
            com.yandex.mobile.ads.impl.pv r5 = r9.m29393a(r3)
            int r6 = r5.f53825q
            if (r6 <= 0) goto L72
            int r7 = r5.f53826r
            if (r7 <= 0) goto L72
            if (r2 == 0) goto L3a
            if (r6 <= r7) goto L2f
            r14 = 1
            goto L30
        L2f:
            r14 = 0
        L30:
            if (r0 <= r1) goto L34
            r15 = 1
            goto L35
        L34:
            r15 = 0
        L35:
            if (r14 == r15) goto L3a
            r14 = r0
            r15 = r1
            goto L3c
        L3a:
            r15 = r0
            r14 = r1
        L3c:
            int r11 = r6 * r14
            int r12 = r7 * r15
            if (r11 < r12) goto L4c
            android.graphics.Point r7 = new android.graphics.Point
            int r6 = com.yandex.mobile.ads.impl.s91.m28087a(r12, r6)
            r7.<init>(r15, r6)
            goto L56
        L4c:
            android.graphics.Point r6 = new android.graphics.Point
            int r7 = com.yandex.mobile.ads.impl.s91.m28087a(r11, r7)
            r6.<init>(r7, r14)
            r7 = r6
        L56:
            int r6 = r5.f53825q
            int r5 = r5.f53826r
            int r11 = r6 * r5
            int r12 = r7.x
            float r12 = (float) r12
            r14 = 1065017672(0x3f7ae148, float:0.98)
            float r12 = r12 * r14
            int r12 = (int) r12
            if (r6 < r12) goto L72
            int r6 = r7.y
            float r6 = (float) r6
            float r6 = r6 * r14
            int r6 = (int) r6
            if (r5 < r6) goto L72
            if (r11 >= r4) goto L72
            r4 = r11
        L72:
            int r3 = r3 + 1
            goto L19
        L75:
            r11 = r4
            goto L7a
        L77:
            r11 = 2147483647(0x7fffffff, float:NaN)
        L7a:
            int r0 = com.yandex.mobile.ads.embedded.guava.collect.AbstractC4698p.f47900c
            com.yandex.mobile.ads.embedded.guava.collect.p$a r12 = new com.yandex.mobile.ads.embedded.guava.collect.p$a
            r12.<init>()
            r14 = 0
        L82:
            int r0 = r9.f56028a
            if (r14 >= r0) goto Laf
            com.yandex.mobile.ads.impl.pv r0 = r9.m29393a(r14)
            int r0 = r0.m27510b()
            if (r11 == r13) goto L98
            r1 = -1
            if (r0 == r1) goto L96
            if (r0 > r11) goto L96
            goto L98
        L96:
            r7 = 0
            goto L99
        L98:
            r7 = 1
        L99:
            com.yandex.mobile.ads.impl.ho$h r15 = new com.yandex.mobile.ads.impl.ho$h
            r5 = r20[r14]
            r0 = r15
            r1 = r18
            r2 = r19
            r3 = r14
            r4 = r16
            r6 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r12.m22060b(r15)
            int r14 = r14 + 1
            goto L82
        Laf:
            com.yandex.mobile.ads.embedded.guava.collect.p r0 = r12.m22058a()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C5194ho.m25276a(com.yandex.mobile.ads.impl.ho$c, int[], int, com.yandex.mobile.ads.impl.w61, int[]):java.util.List");
    }

    @Nullable
    /* renamed from: a */
    public final Pair m25290a(w90.C5964a c5964a, int[][][] iArr, final c cVar) throws C5043es {
        final boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 < c5964a.m29409a()) {
                if (2 == c5964a.m29410a(i2) && c5964a.m29414b(i2).f56385a > 0) {
                    z = true;
                    break;
                }
                i2++;
            } else {
                break;
            }
        }
        return m25271a(1, c5964a, iArr, new g.a() { // from class: com.yandex.mobile.ads.impl.uo1
            @Override // com.yandex.mobile.ads.impl.C5194ho.g.a
            /* renamed from: a */
            public final List mo25345a(int i3, w61 w61Var, int[] iArr2) {
                List m25275a;
                m25275a = C5194ho.this.m25275a(cVar, z, i3, w61Var, iArr2);
                return m25275a;
            }
        }, C4891by.f49011g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public List m25275a(c cVar, boolean z, int i2, w61 w61Var, int[] iArr) {
        ur0 ur0Var = new ur0() { // from class: com.yandex.mobile.ads.impl.vo1
            @Override // com.yandex.mobile.ads.impl.ur0
            public final boolean apply(Object obj) {
                boolean m25278a;
                m25278a = C5194ho.this.m25278a((C5606pv) obj);
                return m25278a;
            }
        };
        int i3 = AbstractC4698p.f47900c;
        AbstractC4698p.a aVar = new AbstractC4698p.a();
        for (int i4 = 0; i4 < w61Var.f56028a; i4++) {
            aVar.m22060b(new a(i2, w61Var, i4, cVar, iArr[i4], z, ur0Var));
        }
        return aVar.m22058a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0062, code lost:
    
        if (r1.m25342c() == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008a, code lost:
    
        if (r7.f51024g.m25340a(r8, r7.f51025h) != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0034, code lost:
    
        if (r1.equals("audio/ac4") == false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0056 A[Catch: all -> 0x008f, TRY_ENTER, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000b, B:8:0x000f, B:10:0x0014, B:19:0x0056, B:21:0x005a, B:23:0x005e, B:25:0x0064, B:27:0x0068, B:29:0x006c, B:31:0x0072, B:33:0x007a, B:35:0x0082, B:37:0x008d), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0068 A[Catch: all -> 0x008f, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000b, B:8:0x000f, B:10:0x0014, B:19:0x0056, B:21:0x005a, B:23:0x005e, B:25:0x0064, B:27:0x0068, B:29:0x006c, B:31:0x0072, B:33:0x007a, B:35:0x0082, B:37:0x008d), top: B:3:0x0003 }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m25278a(com.yandex.mobile.ads.impl.C5606pv r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f51020c
            monitor-enter(r0)
            com.yandex.mobile.ads.impl.ho$c r1 = r7.f51023f     // Catch: java.lang.Throwable -> L8f
            boolean r1 = r1.f51056K     // Catch: java.lang.Throwable -> L8f
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L8c
            boolean r1 = r7.f51022e     // Catch: java.lang.Throwable -> L8f
            if (r1 != 0) goto L8c
            int r1 = r8.f53833y     // Catch: java.lang.Throwable -> L8f
            r4 = 2
            if (r1 <= r4) goto L8c
            java.lang.String r1 = r8.f53820l     // Catch: java.lang.Throwable -> L8f
            if (r1 != 0) goto L19
            goto L4f
        L19:
            r5 = -1
            int r6 = r1.hashCode()
            switch(r6) {
                case -2123537834: goto L42;
                case 187078296: goto L37;
                case 187078297: goto L2e;
                case 1504578661: goto L23;
                default: goto L21;
            }
        L21:
            r4 = -1
            goto L4c
        L23:
            java.lang.String r4 = "audio/eac3"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L2c
            goto L21
        L2c:
            r4 = 3
            goto L4c
        L2e:
            java.lang.String r6 = "audio/ac4"
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L4c
            goto L21
        L37:
            java.lang.String r4 = "audio/ac3"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L40
            goto L21
        L40:
            r4 = 1
            goto L4c
        L42:
            java.lang.String r4 = "audio/eac3-joc"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L4b
            goto L21
        L4b:
            r4 = 0
        L4c:
            switch(r4) {
                case 0: goto L51;
                case 1: goto L51;
                case 2: goto L51;
                case 3: goto L51;
                default: goto L4f;
            }
        L4f:
            r1 = 0
            goto L52
        L51:
            r1 = 1
        L52:
            r4 = 32
            if (r1 == 0) goto L64
            int r1 = com.yandex.mobile.ads.impl.s91.f54530a     // Catch: java.lang.Throwable -> L8f
            if (r1 < r4) goto L8c
            com.yandex.mobile.ads.impl.ho$e r1 = r7.f51024g     // Catch: java.lang.Throwable -> L8f
            if (r1 == 0) goto L8c
            boolean r1 = r1.m25342c()     // Catch: java.lang.Throwable -> L8f
            if (r1 == 0) goto L8c
        L64:
            int r1 = com.yandex.mobile.ads.impl.s91.f54530a     // Catch: java.lang.Throwable -> L8f
            if (r1 < r4) goto L8d
            com.yandex.mobile.ads.impl.ho$e r1 = r7.f51024g     // Catch: java.lang.Throwable -> L8f
            if (r1 == 0) goto L8d
            boolean r1 = r1.m25342c()     // Catch: java.lang.Throwable -> L8f
            if (r1 == 0) goto L8d
            com.yandex.mobile.ads.impl.ho$e r1 = r7.f51024g     // Catch: java.lang.Throwable -> L8f
            boolean r1 = r1.m25339a()     // Catch: java.lang.Throwable -> L8f
            if (r1 == 0) goto L8d
            com.yandex.mobile.ads.impl.ho$e r1 = r7.f51024g     // Catch: java.lang.Throwable -> L8f
            boolean r1 = r1.m25341b()     // Catch: java.lang.Throwable -> L8f
            if (r1 == 0) goto L8d
            com.yandex.mobile.ads.impl.ho$e r1 = r7.f51024g     // Catch: java.lang.Throwable -> L8f
            com.yandex.mobile.ads.impl.nb r4 = r7.f51025h     // Catch: java.lang.Throwable -> L8f
            boolean r8 = r1.m25340a(r8, r4)     // Catch: java.lang.Throwable -> L8f
            if (r8 == 0) goto L8d
        L8c:
            r2 = 1
        L8d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8f
            return r2
        L8f:
            r8 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8f
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C5194ho.m25278a(com.yandex.mobile.ads.impl.pv):boolean");
    }

    @Nullable
    /* renamed from: a */
    public static Pair m25272a(w90.C5964a c5964a, int[][][] iArr, c cVar, @Nullable String str) throws C5043es {
        return m25271a(3, c5964a, iArr, new pn1(cVar, str, 11), C4891by.f49010f);
    }

    @Nullable
    /* renamed from: a */
    private static Pair m25271a(int i2, w90.C5964a c5964a, int[][][] iArr, g.a aVar, Comparator comparator) {
        int i3;
        RandomAccess randomAccess;
        w90.C5964a c5964a2 = c5964a;
        ArrayList arrayList = new ArrayList();
        int m29409a = c5964a.m29409a();
        int i4 = 0;
        while (i4 < m29409a) {
            if (i2 == c5964a2.m29410a(i4)) {
                x61 m29414b = c5964a2.m29414b(i4);
                for (int i5 = 0; i5 < m29414b.f56385a; i5++) {
                    w61 m29682a = m29414b.m29682a(i5);
                    List mo25345a = aVar.mo25345a(i4, m29682a, iArr[i4][i5]);
                    boolean[] zArr = new boolean[m29682a.f56028a];
                    int i6 = 0;
                    while (i6 < m29682a.f56028a) {
                        g gVar = (g) mo25345a.get(i6);
                        int mo25294a = gVar.mo25294a();
                        if (zArr[i6] || mo25294a == 0) {
                            i3 = m29409a;
                        } else {
                            if (mo25294a == 1) {
                                randomAccess = AbstractC4698p.m22048a(gVar);
                                i3 = m29409a;
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(gVar);
                                int i7 = i6 + 1;
                                while (i7 < m29682a.f56028a) {
                                    g gVar2 = (g) mo25345a.get(i7);
                                    int i8 = m29409a;
                                    if (gVar2.mo25294a() == 2 && gVar.mo25295a(gVar2)) {
                                        arrayList2.add(gVar2);
                                        zArr[i7] = true;
                                    }
                                    i7++;
                                    m29409a = i8;
                                }
                                i3 = m29409a;
                                randomAccess = arrayList2;
                            }
                            arrayList.add(randomAccess);
                        }
                        i6++;
                        m29409a = i3;
                    }
                }
            }
            i4++;
            c5964a2 = c5964a;
            m29409a = m29409a;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i9 = 0; i9 < list.size(); i9++) {
            iArr2[i9] = ((g) list.get(i9)).f51097c;
        }
        g gVar3 = (g) list.get(0);
        return Pair.create(new InterfaceC5939vs.a(0, gVar3.f51096b, iArr2), Integer.valueOf(gVar3.f51095a));
    }

    /* renamed from: a */
    public static void m25277a(C5194ho c5194ho) {
        boolean z;
        e eVar;
        synchronized (c5194ho.f51020c) {
            z = c5194ho.f51023f.f51056K && !c5194ho.f51022e && s91.f54530a >= 32 && (eVar = c5194ho.f51024g) != null && eVar.m25342c();
        }
        if (z) {
            c5194ho.m23827b();
        }
    }

    /* renamed from: a */
    public static int m25268a(C5606pv c5606pv, @Nullable String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(c5606pv.f53811c)) {
            return 4;
        }
        String m25281b = m25281b(str);
        String m25281b2 = m25281b(c5606pv.f53811c);
        if (m25281b2 == null || m25281b == null) {
            return (z && m25281b2 == null) ? 1 : 0;
        }
        if (m25281b2.startsWith(m25281b) || m25281b.startsWith(m25281b2)) {
            return 3;
        }
        int i2 = s91.f54530a;
        return m25281b2.split("-", 2)[0].equals(m25281b.split("-", 2)[0]) ? 2 : 0;
    }

    /* renamed from: a */
    public static int m25267a(int i2, int i3) {
        if (i2 == 0 || i2 != i3) {
            return Integer.bitCount(i2 & i3);
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: a */
    public static int m25270a(String str) {
        if (str != null) {
            switch (str) {
                case "video/av01":
                    return 4;
                case "video/hevc":
                    return 3;
                case "video/avc":
                    return 1;
                case "video/x-vnd.on2.vp9":
                    return 2;
            }
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static List m25274a(c cVar, String str, int i2, w61 w61Var, int[] iArr) {
        int i3 = AbstractC4698p.f47900c;
        AbstractC4698p.a aVar = new AbstractC4698p.a();
        for (int i4 = 0; i4 < w61Var.f56028a; i4++) {
            aVar.m22060b(new f(i2, w61Var, i4, cVar, iArr[i4], str));
        }
        return aVar.m22058a();
    }
}
