package com.yandex.mobile.ads.impl;

import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.embedded.guava.collect.AbstractC4698p;
import com.yandex.mobile.ads.embedded.guava.collect.AbstractC4700q;
import com.yandex.mobile.ads.exo.offline.StreamKey;
import com.yandex.mobile.ads.impl.InterfaceC5589pf;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/* loaded from: classes3.dex */
public final class pb0 implements InterfaceC5589pf {

    /* renamed from: g */
    public static final InterfaceC5589pf.a<pb0> f53427g;

    /* renamed from: a */
    public final String f53428a;

    /* renamed from: b */
    @Nullable
    public final C5581g f53429b;

    /* renamed from: c */
    public final C5579e f53430c;

    /* renamed from: d */
    public final sb0 f53431d;

    /* renamed from: e */
    public final C5577c f53432e;

    /* renamed from: f */
    public final C5582h f53433f;

    /* renamed from: com.yandex.mobile.ads.impl.pb0$a */
    public static final class C5575a {

        /* renamed from: a */
        @Nullable
        private String f53434a;

        /* renamed from: b */
        @Nullable
        private Uri f53435b;

        /* renamed from: f */
        @Nullable
        private String f53439f;

        /* renamed from: c */
        private C5576b.a f53436c = new C5576b.a();

        /* renamed from: d */
        private C5578d.a f53437d = new C5578d.a(0);

        /* renamed from: e */
        private List<StreamKey> f53438e = Collections.emptyList();

        /* renamed from: g */
        private AbstractC4698p<C5584j> f53440g = AbstractC4698p.m22055i();

        /* renamed from: h */
        private C5579e.a f53441h = new C5579e.a();

        /* renamed from: i */
        private C5582h f53442i = C5582h.f53484c;

        /* renamed from: a */
        public final C5575a m27211a(@Nullable Uri uri) {
            this.f53435b = uri;
            return this;
        }

        /* renamed from: b */
        public final C5575a m27215b(String str) {
            Objects.requireNonNull(str);
            this.f53434a = str;
            return this;
        }

        /* renamed from: c */
        public final C5575a m27216c(@Nullable String str) {
            this.f53435b = str == null ? null : Uri.parse(str);
            return this;
        }

        /* renamed from: a */
        public final C5575a m27213a(@Nullable List<StreamKey> list) {
            this.f53438e = (list == null || list.isEmpty()) ? Collections.emptyList() : Collections.unmodifiableList(new ArrayList(list));
            return this;
        }

        /* renamed from: a */
        public final C5575a m27212a(@Nullable String str) {
            this.f53439f = str;
            return this;
        }

        /* renamed from: a */
        public final pb0 m27214a() {
            C5581g c5581g;
            C5578d c5578d;
            int i2 = 0;
            C5220ia.m25476b(C5578d.a.m27234e(this.f53437d) == null || C5578d.a.m27235f(this.f53437d) != null);
            Uri uri = this.f53435b;
            if (uri != null) {
                String str = null;
                if (C5578d.a.m27235f(this.f53437d) != null) {
                    C5578d.a aVar = this.f53437d;
                    Objects.requireNonNull(aVar);
                    c5578d = new C5578d(aVar, i2);
                } else {
                    c5578d = null;
                }
                c5581g = new C5581g(uri, str, c5578d, this.f53438e, this.f53439f, this.f53440g, null, 0);
            } else {
                c5581g = null;
            }
            String str2 = this.f53434a;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = str2;
            C5576b.a aVar2 = this.f53436c;
            Objects.requireNonNull(aVar2);
            return new pb0(str3, new C5577c(aVar2, i2), c5581g, this.f53441h.m27245a(), sb0.f54557G, this.f53442i, 0);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.pb0$b */
    public static class C5576b implements InterfaceC5589pf {

        /* renamed from: f */
        public static final InterfaceC5589pf.a<C5577c> f53443f;

        /* renamed from: a */
        @IntRange
        public final long f53444a;

        /* renamed from: b */
        public final long f53445b;

        /* renamed from: c */
        public final boolean f53446c;

        /* renamed from: d */
        public final boolean f53447d;

        /* renamed from: e */
        public final boolean f53448e;

        /* renamed from: com.yandex.mobile.ads.impl.pb0$b$a */
        public static final class a {

            /* renamed from: a */
            private long f53449a;

            /* renamed from: b */
            private long f53450b = Long.MIN_VALUE;

            /* renamed from: c */
            private boolean f53451c;

            /* renamed from: d */
            private boolean f53452d;

            /* renamed from: e */
            private boolean f53453e;

            /* renamed from: a */
            public final a m27224a(long j2) {
                C5220ia.m25473a(j2 == Long.MIN_VALUE || j2 >= 0);
                this.f53450b = j2;
                return this;
            }

            /* renamed from: b */
            public final a m27226b(@IntRange long j2) {
                C5220ia.m25473a(j2 >= 0);
                this.f53449a = j2;
                return this;
            }

            /* renamed from: c */
            public final a m27228c(boolean z) {
                this.f53453e = z;
                return this;
            }

            /* renamed from: a */
            public final a m27225a(boolean z) {
                this.f53452d = z;
                return this;
            }

            /* renamed from: b */
            public final a m27227b(boolean z) {
                this.f53451c = z;
                return this;
            }
        }

        static {
            new C5577c(new a(), 0);
            f53443f = jp1.f51703n;
        }

        public /* synthetic */ C5576b(a aVar, int i2) {
            this(aVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public static C5577c m27217a(Bundle bundle) {
            return new C5577c(new a().m27226b(bundle.getLong(Integer.toString(0, 36), 0L)).m27224a(bundle.getLong(Integer.toString(1, 36), Long.MIN_VALUE)).m27227b(bundle.getBoolean(Integer.toString(2, 36), false)).m27225a(bundle.getBoolean(Integer.toString(3, 36), false)).m27228c(bundle.getBoolean(Integer.toString(4, 36), false)), 0);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C5576b)) {
                return false;
            }
            C5576b c5576b = (C5576b) obj;
            return this.f53444a == c5576b.f53444a && this.f53445b == c5576b.f53445b && this.f53446c == c5576b.f53446c && this.f53447d == c5576b.f53447d && this.f53448e == c5576b.f53448e;
        }

        public final int hashCode() {
            long j2 = this.f53444a;
            int i2 = ((int) (j2 ^ (j2 >>> 32))) * 31;
            long j3 = this.f53445b;
            return ((((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.f53446c ? 1 : 0)) * 31) + (this.f53447d ? 1 : 0)) * 31) + (this.f53448e ? 1 : 0);
        }

        private C5576b(a aVar) {
            this.f53444a = aVar.f53449a;
            this.f53445b = aVar.f53450b;
            this.f53446c = aVar.f53451c;
            this.f53447d = aVar.f53452d;
            this.f53448e = aVar.f53453e;
        }
    }

    @Deprecated
    /* renamed from: com.yandex.mobile.ads.impl.pb0$c */
    public static final class C5577c extends C5576b {

        /* renamed from: g */
        public static final C5577c f53454g = new C5577c(new C5576b.a(), 0);

        public /* synthetic */ C5577c(C5576b.a aVar, int i2) {
            this(aVar);
        }

        private C5577c(C5576b.a aVar) {
            super(aVar, 0);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.pb0$d */
    public static final class C5578d {

        /* renamed from: a */
        public final UUID f53455a;

        /* renamed from: b */
        @Nullable
        public final Uri f53456b;

        /* renamed from: c */
        public final AbstractC4700q<String, String> f53457c;

        /* renamed from: d */
        public final boolean f53458d;

        /* renamed from: e */
        public final boolean f53459e;

        /* renamed from: f */
        public final boolean f53460f;

        /* renamed from: g */
        public final AbstractC4698p<Integer> f53461g;

        /* renamed from: h */
        @Nullable
        private final byte[] f53462h;

        /* renamed from: com.yandex.mobile.ads.impl.pb0$d$a */
        public static final class a {

            /* renamed from: a */
            private AbstractC4700q<String, String> f53463a;

            /* renamed from: b */
            private AbstractC4698p<Integer> f53464b;

            public /* synthetic */ a(int i2) {
                this();
            }

            /* renamed from: a */
            public static /* synthetic */ boolean m27230a(a aVar) {
                Objects.requireNonNull(aVar);
                return false;
            }

            /* renamed from: b */
            public static /* synthetic */ boolean m27231b(a aVar) {
                Objects.requireNonNull(aVar);
                return false;
            }

            /* renamed from: d */
            public static /* synthetic */ byte[] m27233d(a aVar) {
                Objects.requireNonNull(aVar);
                return null;
            }

            /* renamed from: e */
            public static /* synthetic */ Uri m27234e(a aVar) {
                Objects.requireNonNull(aVar);
                return null;
            }

            /* renamed from: f */
            public static /* synthetic */ UUID m27235f(a aVar) {
                Objects.requireNonNull(aVar);
                return null;
            }

            /* renamed from: g */
            public static /* synthetic */ boolean m27236g(a aVar) {
                Objects.requireNonNull(aVar);
                return false;
            }

            @Deprecated
            private a() {
                this.f53463a = AbstractC4700q.m22063h();
                this.f53464b = AbstractC4698p.m22055i();
            }
        }

        public /* synthetic */ C5578d(a aVar, int i2) {
            this(aVar);
        }

        @Nullable
        /* renamed from: a */
        public final byte[] m27229a() {
            byte[] bArr = this.f53462h;
            if (bArr != null) {
                return Arrays.copyOf(bArr, bArr.length);
            }
            return null;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C5578d)) {
                return false;
            }
            C5578d c5578d = (C5578d) obj;
            return this.f53455a.equals(c5578d.f53455a) && s91.m28112a(this.f53456b, c5578d.f53456b) && s91.m28112a(this.f53457c, c5578d.f53457c) && this.f53458d == c5578d.f53458d && this.f53460f == c5578d.f53460f && this.f53459e == c5578d.f53459e && this.f53461g.equals(c5578d.f53461g) && Arrays.equals(this.f53462h, c5578d.f53462h);
        }

        public final int hashCode() {
            int hashCode = this.f53455a.hashCode() * 31;
            Uri uri = this.f53456b;
            return Arrays.hashCode(this.f53462h) + ((this.f53461g.hashCode() + ((((((((this.f53457c.hashCode() + ((hashCode + (uri != null ? uri.hashCode() : 0)) * 31)) * 31) + (this.f53458d ? 1 : 0)) * 31) + (this.f53460f ? 1 : 0)) * 31) + (this.f53459e ? 1 : 0)) * 31)) * 31);
        }

        private C5578d(a aVar) {
            C5220ia.m25476b((a.m27236g(aVar) && a.m27234e(aVar) == null) ? false : true);
            this.f53455a = (UUID) C5220ia.m25469a(a.m27235f(aVar));
            this.f53456b = a.m27234e(aVar);
            this.f53457c = aVar.f53463a;
            this.f53458d = a.m27230a(aVar);
            this.f53460f = a.m27236g(aVar);
            this.f53459e = a.m27231b(aVar);
            this.f53461g = aVar.f53464b;
            this.f53462h = a.m27233d(aVar) != null ? Arrays.copyOf(a.m27233d(aVar), a.m27233d(aVar).length) : null;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.pb0$e */
    public static final class C5579e implements InterfaceC5589pf {

        /* renamed from: f */
        public static final C5579e f53465f = new a().m27245a();

        /* renamed from: g */
        public static final InterfaceC5589pf.a<C5579e> f53466g = jp1.f51704o;

        /* renamed from: a */
        public final long f53467a;

        /* renamed from: b */
        public final long f53468b;

        /* renamed from: c */
        public final long f53469c;

        /* renamed from: d */
        public final float f53470d;

        /* renamed from: e */
        public final float f53471e;

        /* renamed from: com.yandex.mobile.ads.impl.pb0$e$a */
        public static final class a {

            /* renamed from: a */
            private long f53472a = -9223372036854775807L;

            /* renamed from: b */
            private long f53473b = -9223372036854775807L;

            /* renamed from: c */
            private long f53474c = -9223372036854775807L;

            /* renamed from: d */
            private float f53475d = -3.4028235E38f;

            /* renamed from: e */
            private float f53476e = -3.4028235E38f;

            /* renamed from: a */
            public final C5579e m27245a() {
                return new C5579e(this, 0);
            }
        }

        public /* synthetic */ C5579e(a aVar, int i2) {
            this(aVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public static C5579e m27238a(Bundle bundle) {
            return new C5579e(bundle.getLong(Integer.toString(0, 36), -9223372036854775807L), bundle.getLong(Integer.toString(1, 36), -9223372036854775807L), bundle.getLong(Integer.toString(2, 36), -9223372036854775807L), bundle.getFloat(Integer.toString(3, 36), -3.4028235E38f), bundle.getFloat(Integer.toString(4, 36), -3.4028235E38f));
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C5579e)) {
                return false;
            }
            C5579e c5579e = (C5579e) obj;
            return this.f53467a == c5579e.f53467a && this.f53468b == c5579e.f53468b && this.f53469c == c5579e.f53469c && this.f53470d == c5579e.f53470d && this.f53471e == c5579e.f53471e;
        }

        public final int hashCode() {
            long j2 = this.f53467a;
            long j3 = this.f53468b;
            int i2 = ((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31;
            long j4 = this.f53469c;
            int i3 = (i2 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
            float f2 = this.f53470d;
            int floatToIntBits = (i3 + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0)) * 31;
            float f3 = this.f53471e;
            return floatToIntBits + (f3 != 0.0f ? Float.floatToIntBits(f3) : 0);
        }

        private C5579e(a aVar) {
            this(aVar.f53472a, aVar.f53473b, aVar.f53474c, aVar.f53475d, aVar.f53476e);
        }

        @Deprecated
        public C5579e(long j2, long j3, long j4, float f2, float f3) {
            this.f53467a = j2;
            this.f53468b = j3;
            this.f53469c = j4;
            this.f53470d = f2;
            this.f53471e = f3;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.pb0$f */
    public static class C5580f {

        /* renamed from: a */
        public final Uri f53477a;

        /* renamed from: b */
        @Nullable
        public final String f53478b;

        /* renamed from: c */
        @Nullable
        public final C5578d f53479c;

        /* renamed from: d */
        public final List<StreamKey> f53480d;

        /* renamed from: e */
        @Nullable
        public final String f53481e;

        /* renamed from: f */
        public final AbstractC4698p<C5584j> f53482f;

        /* renamed from: g */
        @Nullable
        public final Object f53483g;

        public /* synthetic */ C5580f(Uri uri, String str, C5578d c5578d, List list, String str2, AbstractC4698p abstractC4698p, Object obj, int i2) {
            this(uri, str, c5578d, list, str2, abstractC4698p, obj);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C5580f)) {
                return false;
            }
            C5580f c5580f = (C5580f) obj;
            return this.f53477a.equals(c5580f.f53477a) && s91.m28112a(this.f53478b, c5580f.f53478b) && s91.m28112a(this.f53479c, c5580f.f53479c) && s91.m28112a((Object) null, (Object) null) && this.f53480d.equals(c5580f.f53480d) && s91.m28112a(this.f53481e, c5580f.f53481e) && this.f53482f.equals(c5580f.f53482f) && s91.m28112a(this.f53483g, c5580f.f53483g);
        }

        public final int hashCode() {
            int hashCode = this.f53477a.hashCode() * 31;
            String str = this.f53478b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            C5578d c5578d = this.f53479c;
            int hashCode3 = (this.f53480d.hashCode() + ((((hashCode2 + (c5578d == null ? 0 : c5578d.hashCode())) * 31) + 0) * 31)) * 31;
            String str2 = this.f53481e;
            int hashCode4 = (this.f53482f.hashCode() + ((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            Object obj = this.f53483g;
            return hashCode4 + (obj != null ? obj.hashCode() : 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private C5580f(Uri uri, @Nullable String str, @Nullable C5578d c5578d, List list, @Nullable String str2, AbstractC4698p abstractC4698p, @Nullable Object obj) {
            this.f53477a = uri;
            this.f53478b = str;
            this.f53479c = c5578d;
            this.f53480d = list;
            this.f53481e = str2;
            this.f53482f = abstractC4698p;
            AbstractC4698p.a m22054h = AbstractC4698p.m22054h();
            for (int i2 = 0; i2 < abstractC4698p.size(); i2++) {
                m22054h.m22060b(C5584j.a.m27255a(((C5584j) abstractC4698p.get(i2)).m27254a()));
            }
            m22054h.m22058a();
            this.f53483g = obj;
        }
    }

    @Deprecated
    /* renamed from: com.yandex.mobile.ads.impl.pb0$g */
    public static final class C5581g extends C5580f {
        public /* synthetic */ C5581g(Uri uri, String str, C5578d c5578d, List list, String str2, AbstractC4698p abstractC4698p, Object obj, int i2) {
            this(uri, str, c5578d, list, str2, abstractC4698p, obj);
        }

        private C5581g(Uri uri, @Nullable String str, @Nullable C5578d c5578d, List list, @Nullable String str2, AbstractC4698p abstractC4698p, @Nullable Object obj) {
            super(uri, str, c5578d, list, str2, abstractC4698p, obj, 0);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.pb0$h */
    public static final class C5582h implements InterfaceC5589pf {

        /* renamed from: c */
        public static final C5582h f53484c = new C5582h(new a(), 0);

        /* renamed from: d */
        public static final InterfaceC5589pf.a<C5582h> f53485d = jp1.f51705p;

        /* renamed from: a */
        @Nullable
        public final Uri f53486a;

        /* renamed from: b */
        @Nullable
        public final String f53487b;

        /* renamed from: com.yandex.mobile.ads.impl.pb0$h$a */
        public static final class a {

            /* renamed from: a */
            @Nullable
            private Uri f53488a;

            /* renamed from: b */
            @Nullable
            private String f53489b;

            /* renamed from: c */
            @Nullable
            private Bundle f53490c;

            /* renamed from: a */
            public final a m27251a(@Nullable Uri uri) {
                this.f53488a = uri;
                return this;
            }

            /* renamed from: a */
            public final a m27253a(@Nullable String str) {
                this.f53489b = str;
                return this;
            }

            /* renamed from: a */
            public final a m27252a(@Nullable Bundle bundle) {
                this.f53490c = bundle;
                return this;
            }
        }

        public /* synthetic */ C5582h(a aVar, int i2) {
            this(aVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public static C5582h m27246a(Bundle bundle) {
            return new C5582h(new a().m27251a((Uri) bundle.getParcelable(Integer.toString(0, 36))).m27253a(bundle.getString(Integer.toString(1, 36))).m27252a(bundle.getBundle(Integer.toString(2, 36))), 0);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C5582h)) {
                return false;
            }
            C5582h c5582h = (C5582h) obj;
            return s91.m28112a(this.f53486a, c5582h.f53486a) && s91.m28112a(this.f53487b, c5582h.f53487b);
        }

        public final int hashCode() {
            Uri uri = this.f53486a;
            int hashCode = (uri == null ? 0 : uri.hashCode()) * 31;
            String str = this.f53487b;
            return hashCode + (str != null ? str.hashCode() : 0);
        }

        private C5582h(a aVar) {
            this.f53486a = aVar.f53488a;
            this.f53487b = aVar.f53489b;
            Bundle unused = aVar.f53490c;
        }
    }

    @Deprecated
    /* renamed from: com.yandex.mobile.ads.impl.pb0$i */
    public static final class C5583i extends C5584j {
        public /* synthetic */ C5583i(C5584j.a aVar, int i2) {
            this(aVar);
        }

        private C5583i(C5584j.a aVar) {
            super(aVar, 0);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.pb0$j */
    public static class C5584j {

        /* renamed from: a */
        public final Uri f53491a;

        /* renamed from: b */
        @Nullable
        public final String f53492b;

        /* renamed from: c */
        @Nullable
        public final String f53493c;

        /* renamed from: d */
        public final int f53494d;

        /* renamed from: e */
        public final int f53495e;

        /* renamed from: f */
        @Nullable
        public final String f53496f;

        /* renamed from: g */
        @Nullable
        public final String f53497g;

        /* renamed from: com.yandex.mobile.ads.impl.pb0$j$a */
        public static final class a {

            /* renamed from: a */
            private Uri f53498a;

            /* renamed from: b */
            @Nullable
            private String f53499b;

            /* renamed from: c */
            @Nullable
            private String f53500c;

            /* renamed from: d */
            private int f53501d;

            /* renamed from: e */
            private int f53502e;

            /* renamed from: f */
            @Nullable
            private String f53503f;

            /* renamed from: g */
            @Nullable
            private String f53504g;

            public /* synthetic */ a(C5584j c5584j, int i2) {
                this(c5584j);
            }

            /* renamed from: a */
            public static C5583i m27255a(a aVar) {
                return new C5583i(aVar, 0);
            }

            private a(C5584j c5584j) {
                this.f53498a = c5584j.f53491a;
                this.f53499b = c5584j.f53492b;
                this.f53500c = c5584j.f53493c;
                this.f53501d = c5584j.f53494d;
                this.f53502e = c5584j.f53495e;
                this.f53503f = c5584j.f53496f;
                this.f53504g = c5584j.f53497g;
            }
        }

        public /* synthetic */ C5584j(a aVar, int i2) {
            this(aVar);
        }

        /* renamed from: a */
        public final a m27254a() {
            return new a(this, 0);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C5584j)) {
                return false;
            }
            C5584j c5584j = (C5584j) obj;
            return this.f53491a.equals(c5584j.f53491a) && s91.m28112a(this.f53492b, c5584j.f53492b) && s91.m28112a(this.f53493c, c5584j.f53493c) && this.f53494d == c5584j.f53494d && this.f53495e == c5584j.f53495e && s91.m28112a(this.f53496f, c5584j.f53496f) && s91.m28112a(this.f53497g, c5584j.f53497g);
        }

        public final int hashCode() {
            int hashCode = this.f53491a.hashCode() * 31;
            String str = this.f53492b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f53493c;
            int hashCode3 = (((((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f53494d) * 31) + this.f53495e) * 31;
            String str3 = this.f53496f;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f53497g;
            return hashCode4 + (str4 != null ? str4.hashCode() : 0);
        }

        private C5584j(a aVar) {
            this.f53491a = aVar.f53498a;
            this.f53492b = aVar.f53499b;
            this.f53493c = aVar.f53500c;
            this.f53494d = aVar.f53501d;
            this.f53495e = aVar.f53502e;
            this.f53496f = aVar.f53503f;
            this.f53497g = aVar.f53504g;
        }
    }

    static {
        new C5575a().m27214a();
        f53427g = jp1.f51702m;
    }

    public /* synthetic */ pb0(String str, C5577c c5577c, C5581g c5581g, C5579e c5579e, sb0 sb0Var, C5582h c5582h, int i2) {
        this(str, c5577c, c5581g, c5579e, sb0Var, c5582h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static pb0 m27209a(Bundle bundle) {
        String string = bundle.getString(Integer.toString(0, 36), "");
        Objects.requireNonNull(string);
        Bundle bundle2 = bundle.getBundle(Integer.toString(1, 36));
        C5579e fromBundle = bundle2 == null ? C5579e.f53465f : C5579e.f53466g.fromBundle(bundle2);
        Bundle bundle3 = bundle.getBundle(Integer.toString(2, 36));
        sb0 fromBundle2 = bundle3 == null ? sb0.f54557G : sb0.f54558H.fromBundle(bundle3);
        Bundle bundle4 = bundle.getBundle(Integer.toString(3, 36));
        C5577c fromBundle3 = bundle4 == null ? C5577c.f53454g : C5576b.f53443f.fromBundle(bundle4);
        Bundle bundle5 = bundle.getBundle(Integer.toString(4, 36));
        return new pb0(string, fromBundle3, null, fromBundle, fromBundle2, bundle5 == null ? C5582h.f53484c : C5582h.f53485d.fromBundle(bundle5));
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pb0)) {
            return false;
        }
        pb0 pb0Var = (pb0) obj;
        return s91.m28112a(this.f53428a, pb0Var.f53428a) && this.f53432e.equals(pb0Var.f53432e) && s91.m28112a(this.f53429b, pb0Var.f53429b) && s91.m28112a(this.f53430c, pb0Var.f53430c) && s91.m28112a(this.f53431d, pb0Var.f53431d) && s91.m28112a(this.f53433f, pb0Var.f53433f);
    }

    public final int hashCode() {
        int hashCode = this.f53428a.hashCode() * 31;
        C5581g c5581g = this.f53429b;
        return this.f53433f.hashCode() + ((this.f53431d.hashCode() + ((this.f53432e.hashCode() + ((this.f53430c.hashCode() + ((hashCode + (c5581g != null ? c5581g.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }

    private pb0(String str, C5577c c5577c, @Nullable C5581g c5581g, C5579e c5579e, sb0 sb0Var, C5582h c5582h) {
        this.f53428a = str;
        this.f53429b = c5581g;
        this.f53430c = c5579e;
        this.f53431d = sb0Var;
        this.f53432e = c5577c;
        this.f53433f = c5582h;
    }
}
