package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Typeface;
import com.yandex.mobile.ads.C4632R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.lv */
/* loaded from: classes3.dex */
public final class C5414lv {

    /* renamed from: com.yandex.mobile.ads.impl.lv$a */
    public enum a {
        /* JADX INFO: Fake field, exist only in values array */
        EF10(C4632R.font.ya_medium, C4632R.font.ya_bold);


        /* renamed from: f */
        public static final /* synthetic */ int f52535f = 0;

        /* renamed from: a */
        private final int f52536a;

        /* renamed from: b */
        private final int f52537b;

        /* renamed from: c */
        private final int f52538c;

        /* renamed from: d */
        private final int f52539d;

        a(int i2, int i3) {
            this.f52536a = r3;
            this.f52537b = r4;
            this.f52538c = i2;
            this.f52539d = i3;
        }

        /* renamed from: a */
        public final int m26534a() {
            return this.f52539d;
        }

        /* renamed from: b */
        public final int m26535b() {
            return this.f52536a;
        }

        /* renamed from: c */
        public final int m26536c() {
            return this.f52538c;
        }

        /* renamed from: d */
        public final int m26537d() {
            return this.f52537b;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.lv$b */
    public /* synthetic */ class b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f52540a;

        static {
            int[] iArr = new int[a.values().length];
            int i2 = a.f52535f;
            iArr[0] = 1;
            f52540a = iArr;
        }
    }

    @Nullable
    /* renamed from: a */
    public static C5361kv m26533a(@NotNull Context context) {
        Typeface typeface;
        Typeface typeface2;
        Typeface typeface3;
        Typeface typeface4;
        Intrinsics.m32179h(context, "context");
        cz0 m29824a = xz0.m29823b().m29824a(context);
        String m23599h = m29824a != null ? m29824a.m23599h() : null;
        if (m23599h == null) {
            return null;
        }
        try {
            a valueOf = a.valueOf(m23599h);
            if (b.f52540a[valueOf.ordinal()] != 1) {
                throw new NoWhenBranchMatchedException();
            }
            try {
                typeface = context.getResources().getFont(valueOf.m26535b());
            } catch (Exception unused) {
                typeface = null;
            }
            try {
                typeface2 = context.getResources().getFont(valueOf.m26537d());
            } catch (Exception unused2) {
                typeface2 = null;
            }
            try {
                typeface3 = context.getResources().getFont(valueOf.m26536c());
            } catch (Exception unused3) {
                typeface3 = null;
            }
            try {
                typeface4 = context.getResources().getFont(valueOf.m26534a());
            } catch (Exception unused4) {
                typeface4 = null;
            }
            return new C5361kv(typeface, typeface2, typeface3, typeface4);
        } catch (Exception unused5) {
            return null;
        }
    }
}
