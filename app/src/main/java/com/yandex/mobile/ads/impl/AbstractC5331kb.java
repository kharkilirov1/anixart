package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.KotlinVersion;

/* renamed from: com.yandex.mobile.ads.impl.kb */
/* loaded from: classes3.dex */
abstract class AbstractC5331kb {

    /* renamed from: a */
    public final int f51928a;

    /* renamed from: com.yandex.mobile.ads.impl.kb$a */
    public static final class a extends AbstractC5331kb {

        /* renamed from: b */
        public final long f51929b;

        /* renamed from: c */
        public final ArrayList f51930c;

        /* renamed from: d */
        public final ArrayList f51931d;

        public a(int i2, long j2) {
            super(i2);
            this.f51929b = j2;
            this.f51930c = new ArrayList();
            this.f51931d = new ArrayList();
        }

        @Nullable
        /* renamed from: c */
        public final a m26097c(int i2) {
            int size = this.f51931d.size();
            for (int i3 = 0; i3 < size; i3++) {
                a aVar = (a) this.f51931d.get(i3);
                if (aVar.f51928a == i2) {
                    return aVar;
                }
            }
            return null;
        }

        @Nullable
        /* renamed from: d */
        public final b m26098d(int i2) {
            int size = this.f51930c.size();
            for (int i3 = 0; i3 < size; i3++) {
                b bVar = (b) this.f51930c.get(i3);
                if (bVar.f51928a == i2) {
                    return bVar;
                }
            }
            return null;
        }

        @Override // com.yandex.mobile.ads.impl.AbstractC5331kb
        public final String toString() {
            return AbstractC5331kb.m26095a(this.f51928a) + " leaves: " + Arrays.toString(this.f51930c.toArray()) + " containers: " + Arrays.toString(this.f51931d.toArray());
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.kb$b */
    public static final class b extends AbstractC5331kb {

        /* renamed from: b */
        public final ap0 f51932b;

        public b(int i2, ap0 ap0Var) {
            super(i2);
            this.f51932b = ap0Var;
        }
    }

    public AbstractC5331kb(int i2) {
        this.f51928a = i2;
    }

    /* renamed from: a */
    public static String m26095a(int i2) {
        StringBuilder m26356a = l60.m26356a("");
        m26356a.append((char) ((i2 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE));
        m26356a.append((char) ((i2 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE));
        m26356a.append((char) ((i2 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE));
        m26356a.append((char) (i2 & KotlinVersion.MAX_COMPONENT_VALUE));
        return m26356a.toString();
    }

    /* renamed from: b */
    public static int m26096b(int i2) {
        return (i2 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE;
    }

    public String toString() {
        return m26095a(this.f51928a);
    }
}
