package com.yandex.mobile.ads.impl;

import androidx.room.util.C0576a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.ej */
/* loaded from: classes3.dex */
public abstract class AbstractC5029ej {

    /* renamed from: com.yandex.mobile.ads.impl.ej$a */
    public static final class a extends AbstractC5029ej {

        /* renamed from: a */
        private final boolean f49979a;

        public a(boolean z) {
            super(0);
            this.f49979a = z;
        }

        /* renamed from: a */
        public final boolean m24178a() {
            return this.f49979a;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f49979a == ((a) obj).f49979a;
        }

        public final int hashCode() {
            boolean z = this.f49979a;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        @NotNull
        public final String toString() {
            StringBuilder m26356a = l60.m26356a("CmpPresent(value=");
            m26356a.append(this.f49979a);
            m26356a.append(')');
            return m26356a.toString();
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ej$b */
    public static final class b extends AbstractC5029ej {

        /* renamed from: a */
        @Nullable
        private final String f49980a;

        public b(@Nullable String str) {
            super(0);
            this.f49980a = str;
        }

        @Nullable
        /* renamed from: a */
        public final String m24179a() {
            return this.f49980a;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.m32174c(this.f49980a, ((b) obj).f49980a);
        }

        public final int hashCode() {
            String str = this.f49980a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @NotNull
        public final String toString() {
            return C0576a.m4118q(l60.m26356a("ConsentString(value="), this.f49980a, ')');
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ej$c */
    public static final class c extends AbstractC5029ej {

        /* renamed from: a */
        @Nullable
        private final String f49981a;

        public c(@Nullable String str) {
            super(0);
            this.f49981a = str;
        }

        @Nullable
        /* renamed from: a */
        public final String m24180a() {
            return this.f49981a;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && Intrinsics.m32174c(this.f49981a, ((c) obj).f49981a);
        }

        public final int hashCode() {
            String str = this.f49981a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @NotNull
        public final String toString() {
            return C0576a.m4118q(l60.m26356a("Gdpr(value="), this.f49981a, ')');
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ej$d */
    public static final class d extends AbstractC5029ej {

        /* renamed from: a */
        @Nullable
        private final String f49982a;

        public d(@Nullable String str) {
            super(0);
            this.f49982a = str;
        }

        @Nullable
        /* renamed from: a */
        public final String m24181a() {
            return this.f49982a;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && Intrinsics.m32174c(this.f49982a, ((d) obj).f49982a);
        }

        public final int hashCode() {
            String str = this.f49982a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @NotNull
        public final String toString() {
            return C0576a.m4118q(l60.m26356a("PurposeConsents(value="), this.f49982a, ')');
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ej$e */
    public static final class e extends AbstractC5029ej {

        /* renamed from: a */
        @Nullable
        private final String f49983a;

        public e(@Nullable String str) {
            super(0);
            this.f49983a = str;
        }

        @Nullable
        /* renamed from: a */
        public final String m24182a() {
            return this.f49983a;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && Intrinsics.m32174c(this.f49983a, ((e) obj).f49983a);
        }

        public final int hashCode() {
            String str = this.f49983a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @NotNull
        public final String toString() {
            return C0576a.m4118q(l60.m26356a("VendorConsents(value="), this.f49983a, ')');
        }
    }

    private AbstractC5029ej() {
    }

    public /* synthetic */ AbstractC5029ej(int i2) {
        this();
    }
}
