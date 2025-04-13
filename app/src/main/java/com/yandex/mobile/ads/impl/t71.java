package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.embedded.guava.collect.AbstractC4698p;
import com.yandex.mobile.ads.impl.InterfaceC5589pf;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class t71 implements InterfaceC5589pf {

    /* renamed from: b */
    public static final t71 f54968b = new t71(AbstractC4698p.m22055i());

    /* renamed from: a */
    private final AbstractC4698p<C5785a> f54969a;

    /* renamed from: com.yandex.mobile.ads.impl.t71$a */
    public static final class C5785a implements InterfaceC5589pf {

        /* renamed from: f */
        public static final InterfaceC5589pf.a<C5785a> f54970f = jp1.f51687A;

        /* renamed from: a */
        public final int f54971a;

        /* renamed from: b */
        private final w61 f54972b;

        /* renamed from: c */
        private final boolean f54973c;

        /* renamed from: d */
        private final int[] f54974d;

        /* renamed from: e */
        private final boolean[] f54975e;

        public C5785a(w61 w61Var, boolean z, int[] iArr, boolean[] zArr) {
            int i2 = w61Var.f56028a;
            this.f54971a = i2;
            boolean z2 = false;
            C5220ia.m25473a(i2 == iArr.length && i2 == zArr.length);
            this.f54972b = w61Var;
            if (z && i2 > 1) {
                z2 = true;
            }
            this.f54973c = z2;
            this.f54974d = (int[]) iArr.clone();
            this.f54975e = (boolean[]) zArr.clone();
        }

        /* renamed from: a */
        public final C5606pv m28476a(int i2) {
            return this.f54972b.m29393a(i2);
        }

        /* renamed from: b */
        public final boolean m28477b() {
            for (boolean z : this.f54975e) {
                if (z) {
                    return true;
                }
            }
            return false;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C5785a.class != obj.getClass()) {
                return false;
            }
            C5785a c5785a = (C5785a) obj;
            return this.f54973c == c5785a.f54973c && this.f54972b.equals(c5785a.f54972b) && Arrays.equals(this.f54974d, c5785a.f54974d) && Arrays.equals(this.f54975e, c5785a.f54975e);
        }

        public final int hashCode() {
            return Arrays.hashCode(this.f54975e) + ((Arrays.hashCode(this.f54974d) + (((this.f54972b.hashCode() * 31) + (this.f54973c ? 1 : 0)) * 31)) * 31);
        }

        /* renamed from: a */
        public final int m28475a() {
            return this.f54972b.f56030c;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public static C5785a m28473a(Bundle bundle) {
            InterfaceC5589pf.a<w61> aVar = w61.f56027f;
            Bundle bundle2 = bundle.getBundle(Integer.toString(0, 36));
            Objects.requireNonNull(bundle2);
            w61 fromBundle = aVar.fromBundle(bundle2);
            int[] intArray = bundle.getIntArray(Integer.toString(1, 36));
            int[] iArr = new int[fromBundle.f56028a];
            if (intArray == null) {
                intArray = iArr;
            }
            boolean[] booleanArray = bundle.getBooleanArray(Integer.toString(3, 36));
            boolean[] zArr = new boolean[fromBundle.f56028a];
            if (booleanArray == null) {
                booleanArray = zArr;
            }
            return new C5785a(fromBundle, bundle.getBoolean(Integer.toString(4, 36), false), intArray, booleanArray);
        }

        /* renamed from: b */
        public final boolean m28478b(int i2) {
            return this.f54975e[i2];
        }
    }

    static {
        jp1 jp1Var = jp1.f51715z;
    }

    public t71(AbstractC4698p abstractC4698p) {
        this.f54969a = AbstractC4698p.m22050a((Collection) abstractC4698p);
    }

    /* renamed from: a */
    public final AbstractC4698p<C5785a> m28471a() {
        return this.f54969a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t71.class != obj.getClass()) {
            return false;
        }
        return this.f54969a.equals(((t71) obj).f54969a);
    }

    public final int hashCode() {
        return this.f54969a.hashCode();
    }

    /* renamed from: a */
    public final boolean m28472a(int i2) {
        for (int i3 = 0; i3 < this.f54969a.size(); i3++) {
            C5785a c5785a = this.f54969a.get(i3);
            if (c5785a.m28477b() && c5785a.m28475a() == i2) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static t71 m28469a(Bundle bundle) {
        AbstractC4698p m27717a;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(Integer.toString(0, 36));
        if (parcelableArrayList == null) {
            m27717a = AbstractC4698p.m22055i();
        } else {
            m27717a = C5637qf.m27717a(C5785a.f54970f, parcelableArrayList);
        }
        return new t71(m27717a);
    }
}
