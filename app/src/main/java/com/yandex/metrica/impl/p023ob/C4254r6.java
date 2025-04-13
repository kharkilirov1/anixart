package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.yandex.metrica.impl.ob.r6 */
/* loaded from: classes2.dex */
public class C4254r6 {

    /* renamed from: a */
    @NonNull
    private final EnumC4462z6 f46278a;

    /* renamed from: b */
    @Nullable
    private final Long f46279b;

    /* renamed from: c */
    @Nullable
    private final Long f46280c;

    /* renamed from: d */
    @Nullable
    private final Integer f46281d;

    /* renamed from: e */
    @Nullable
    private final Long f46282e;

    /* renamed from: f */
    @Nullable
    private final Boolean f46283f;

    /* renamed from: g */
    @Nullable
    private final Long f46284g;

    /* renamed from: h */
    @Nullable
    private final Long f46285h;

    /* renamed from: com.yandex.metrica.impl.ob.r6$b */
    public static final class b {

        /* renamed from: a */
        @Nullable
        public Long f46286a;

        /* renamed from: b */
        @NonNull
        private EnumC4462z6 f46287b;

        /* renamed from: c */
        @Nullable
        private Long f46288c;

        /* renamed from: d */
        @Nullable
        private Long f46289d;

        /* renamed from: e */
        @Nullable
        private Integer f46290e;

        /* renamed from: f */
        @Nullable
        private Long f46291f;

        /* renamed from: g */
        @Nullable
        private Boolean f46292g;

        /* renamed from: h */
        @Nullable
        private Long f46293h;

        private b(C4306t6 c4306t6) {
            this.f46287b = c4306t6.m20777b();
            this.f46290e = c4306t6.m20776a();
        }

        /* renamed from: a */
        public b m20638a(Long l2) {
            this.f46289d = l2;
            return this;
        }

        /* renamed from: b */
        public b m20639b(Long l2) {
            this.f46291f = l2;
            return this;
        }

        /* renamed from: c */
        public b m20640c(Long l2) {
            this.f46288c = l2;
            return this;
        }

        /* renamed from: d */
        public b m20641d(Long l2) {
            this.f46293h = l2;
            return this;
        }

        /* renamed from: a */
        public b m20637a(Boolean bool) {
            this.f46292g = bool;
            return this;
        }
    }

    /* renamed from: a */
    public EnumC4462z6 m20624a() {
        return this.f46278a;
    }

    /* renamed from: b */
    public long m20626b(long j2) {
        Long l2 = this.f46282e;
        return l2 == null ? j2 : l2.longValue();
    }

    /* renamed from: c */
    public long m20627c(long j2) {
        Long l2 = this.f46279b;
        return l2 == null ? j2 : l2.longValue();
    }

    /* renamed from: d */
    public long m20628d(long j2) {
        Long l2 = this.f46285h;
        return l2 == null ? j2 : l2.longValue();
    }

    /* renamed from: e */
    public long m20629e(long j2) {
        Long l2 = this.f46284g;
        return l2 == null ? j2 : l2.longValue();
    }

    private C4254r6(b bVar) {
        this.f46278a = bVar.f46287b;
        this.f46281d = bVar.f46290e;
        this.f46279b = bVar.f46288c;
        this.f46280c = bVar.f46289d;
        this.f46282e = bVar.f46291f;
        this.f46283f = bVar.f46292g;
        this.f46284g = bVar.f46293h;
        this.f46285h = bVar.f46286a;
    }

    /* renamed from: a */
    public long m20623a(long j2) {
        Long l2 = this.f46280c;
        return l2 == null ? j2 : l2.longValue();
    }

    /* renamed from: a */
    public int m20622a(int i2) {
        Integer num = this.f46281d;
        return num == null ? i2 : num.intValue();
    }

    /* renamed from: a */
    public boolean m20625a(boolean z) {
        Boolean bool = this.f46283f;
        return bool == null ? z : bool.booleanValue();
    }
}
