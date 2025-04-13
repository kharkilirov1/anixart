package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class z00 {

    /* renamed from: a */
    private final String f56995a;

    /* renamed from: com.yandex.mobile.ads.impl.z00$a */
    public static class C6100a {

        /* renamed from: a */
        @Nullable
        private String f56996a;

        /* renamed from: b */
        @Nullable
        private EnumC6101b f56997b;

        /* renamed from: c */
        @Nullable
        private String f56998c;

        /* renamed from: d */
        @Nullable
        private Integer f56999d;

        /* renamed from: e */
        @Nullable
        private Integer f57000e;

        /* renamed from: f */
        @Nullable
        private int f57001f;

        /* renamed from: g */
        @Nullable
        private int f57002g;

        /* renamed from: h */
        @Nullable
        private String f57003h;

        /* renamed from: i */
        @Nullable
        private Long f57004i;

        /* renamed from: j */
        @Nullable
        private Long f57005j;

        /* renamed from: k */
        @Nullable
        private Integer f57006k;

        /* renamed from: l */
        @Nullable
        private Integer f57007l;

        @NonNull
        /* renamed from: c */
        public final C6100a m30025c(@Nullable String str) {
            Integer num;
            try {
                num = Integer.valueOf(str);
            } catch (NumberFormatException e2) {
                n60.m26808a(e2, e2.toString(), new Object[0]);
                num = null;
            }
            this.f57000e = num;
            return this;
        }

        @NonNull
        /* renamed from: d */
        public final C6100a m30026d(@Nullable String str) {
            int i2 = "left".equals(str) ? 1 : "right".equals(str) ? 2 : 3;
            this.f57001f = i2;
            if (i2 == 3) {
                Integer num = null;
                try {
                    num = Integer.valueOf(str);
                } catch (NumberFormatException e2) {
                    n60.m26808a(e2, e2.toString(), new Object[0]);
                }
                this.f57006k = num;
            }
            return this;
        }

        @NonNull
        /* renamed from: g */
        public final C6100a m30029g(@Nullable String str) {
            EnumC6101b enumC6101b;
            Iterator it = Arrays.asList(EnumC6101b.values()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    enumC6101b = null;
                    break;
                }
                enumC6101b = (EnumC6101b) it.next();
                if (enumC6101b.f57009a.equals(str)) {
                    break;
                }
            }
            this.f56997b = enumC6101b;
            return this;
        }

        @NonNull
        /* renamed from: i */
        public final C6100a m30031i(@Nullable String str) {
            int i2 = "top".equals(str) ? 1 : "bottom".equals(str) ? 2 : 3;
            this.f57002g = i2;
            if (i2 == 3) {
                Integer num = null;
                try {
                    num = Integer.valueOf(str);
                } catch (NumberFormatException e2) {
                    n60.m26808a(e2, e2.toString(), new Object[0]);
                }
                this.f57007l = num;
            }
            return this;
        }

        @NonNull
        /* renamed from: j */
        public final C6100a m30032j(@Nullable String str) {
            Integer num;
            try {
                num = Integer.valueOf(str);
            } catch (NumberFormatException e2) {
                n60.m26808a(e2, e2.toString(), new Object[0]);
                num = null;
            }
            this.f56999d = num;
            return this;
        }

        @NonNull
        /* renamed from: a */
        public final C6100a m30022a(@Nullable String str) {
            this.f57003h = str;
            return this;
        }

        @NonNull
        /* renamed from: b */
        public final C6100a m30024b(@Nullable String str) {
            this.f57005j = zd1.m30151a(str);
            return this;
        }

        @NonNull
        /* renamed from: e */
        public final C6100a m30027e(@Nullable String str) {
            this.f57004i = zd1.m30151a(str);
            return this;
        }

        @NonNull
        /* renamed from: f */
        public final C6100a m30028f(@Nullable String str) {
            this.f56998c = str;
            return this;
        }

        @NonNull
        /* renamed from: h */
        public final void m30030h(@Nullable String str) {
            this.f56996a = str;
        }

        @NonNull
        /* renamed from: a */
        public final z00 m30023a() {
            return new z00(this);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.z00$b */
    public enum EnumC6101b {
        /* JADX INFO: Fake field, exist only in values array */
        EF7("StaticResource"),
        /* JADX INFO: Fake field, exist only in values array */
        EF17("IFrameResource"),
        /* JADX INFO: Fake field, exist only in values array */
        EF27("HTMLResource");


        /* renamed from: a */
        @NonNull
        public final String f57009a;

        EnumC6101b(String str) {
            this.f57009a = str;
        }
    }

    public z00(@NonNull C6100a c6100a) {
        c6100a.f56996a;
        c6100a.f56997b;
        this.f56995a = c6100a.f56998c;
        c6100a.f56999d;
        c6100a.f57000e;
        c6100a.f57001f;
        c6100a.f57002g;
        c6100a.f57003h;
        c6100a.f57004i;
        c6100a.f57005j;
        c6100a.f57006k;
        c6100a.f57007l;
    }

    /* renamed from: a */
    public final String m30009a() {
        return this.f56995a;
    }
}
