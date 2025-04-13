package com.google.android.exoplayer2;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.BundleUtil;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableListIterator;
import com.google.errorprone.annotations.InlineMe;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class Timeline implements Bundleable {

    /* renamed from: b */
    public static final Timeline f10047b = new Timeline() { // from class: com.google.android.exoplayer2.Timeline.1
        @Override // com.google.android.exoplayer2.Timeline
        /* renamed from: d */
        public int mo5609d(Object obj) {
            return -1;
        }

        @Override // com.google.android.exoplayer2.Timeline
        /* renamed from: i */
        public Period mo5612i(int i2, Period period, boolean z) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.google.android.exoplayer2.Timeline
        /* renamed from: k */
        public int mo5936k() {
            return 0;
        }

        @Override // com.google.android.exoplayer2.Timeline
        /* renamed from: o */
        public Object mo5615o(int i2) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.google.android.exoplayer2.Timeline
        /* renamed from: q */
        public Window mo5616q(int i2, Window window, long j2) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.google.android.exoplayer2.Timeline
        /* renamed from: r */
        public int mo5937r() {
            return 0;
        }
    };

    public static final class Period implements Bundleable {

        /* renamed from: i */
        public static final Bundleable.Creator<Period> f10048i = C1026l.f11816s;

        /* renamed from: b */
        @Nullable
        public Object f10049b;

        /* renamed from: c */
        @Nullable
        public Object f10050c;

        /* renamed from: d */
        public int f10051d;

        /* renamed from: e */
        public long f10052e;

        /* renamed from: f */
        public long f10053f;

        /* renamed from: g */
        public boolean f10054g;

        /* renamed from: h */
        public AdPlaybackState f10055h = AdPlaybackState.f12599h;

        /* renamed from: h */
        public static String m5992h(int i2) {
            return Integer.toString(i2, 36);
        }

        @Override // com.google.android.exoplayer2.Bundleable
        /* renamed from: a */
        public Bundle mo5679a() {
            Bundle bundle = new Bundle();
            bundle.putInt(m5992h(0), this.f10051d);
            bundle.putLong(m5992h(1), this.f10052e);
            bundle.putLong(m5992h(2), this.f10053f);
            bundle.putBoolean(m5992h(3), this.f10054g);
            bundle.putBundle(m5992h(4), this.f10055h.mo5679a());
            return bundle;
        }

        /* renamed from: b */
        public long m5993b(int i2, int i3) {
            AdPlaybackState.AdGroup m6925b = this.f10055h.m6925b(i2);
            if (m6925b.f12610c != -1) {
                return m6925b.f12613f[i3];
            }
            return -9223372036854775807L;
        }

        /* renamed from: c */
        public int m5994c(long j2) {
            return this.f10055h.m6926c(j2, this.f10052e);
        }

        /* renamed from: d */
        public long m5995d(int i2) {
            return this.f10055h.m6925b(i2).f12609b;
        }

        /* renamed from: e */
        public int m5996e(int i2) {
            return this.f10055h.m6925b(i2).m6936d(-1);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !Period.class.equals(obj.getClass())) {
                return false;
            }
            Period period = (Period) obj;
            return Util.m7728a(this.f10049b, period.f10049b) && Util.m7728a(this.f10050c, period.f10050c) && this.f10051d == period.f10051d && this.f10052e == period.f10052e && this.f10053f == period.f10053f && this.f10054g == period.f10054g && Util.m7728a(this.f10055h, period.f10055h);
        }

        /* renamed from: f */
        public long m5997f() {
            return Util.m7735d0(this.f10053f);
        }

        /* renamed from: g */
        public boolean m5998g(int i2) {
            return this.f10055h.m6925b(i2).f12615h;
        }

        public int hashCode() {
            Object obj = this.f10049b;
            int hashCode = (217 + (obj == null ? 0 : obj.hashCode())) * 31;
            Object obj2 = this.f10050c;
            int hashCode2 = (((hashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.f10051d) * 31;
            long j2 = this.f10052e;
            int i2 = (hashCode2 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            long j3 = this.f10053f;
            return this.f10055h.hashCode() + ((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.f10054g ? 1 : 0)) * 31);
        }

        /* renamed from: i */
        public Period m5999i(@Nullable Object obj, @Nullable Object obj2, int i2, long j2, long j3) {
            m6000j(obj, obj2, i2, j2, j3, AdPlaybackState.f12599h, false);
            return this;
        }

        /* renamed from: j */
        public Period m6000j(@Nullable Object obj, @Nullable Object obj2, int i2, long j2, long j3, AdPlaybackState adPlaybackState, boolean z) {
            this.f10049b = obj;
            this.f10050c = obj2;
            this.f10051d = i2;
            this.f10052e = j2;
            this.f10053f = j3;
            this.f10055h = adPlaybackState;
            this.f10054g = z;
            return this;
        }
    }

    public static final class RemotableTimeline extends Timeline {

        /* renamed from: c */
        public final ImmutableList<Window> f10056c;

        /* renamed from: d */
        public final ImmutableList<Period> f10057d;

        /* renamed from: e */
        public final int[] f10058e;

        /* renamed from: f */
        public final int[] f10059f;

        public RemotableTimeline(ImmutableList<Window> immutableList, ImmutableList<Period> immutableList2, int[] iArr) {
            Assertions.m7513a(immutableList.size() == iArr.length);
            this.f10056c = immutableList;
            this.f10057d = immutableList2;
            this.f10058e = iArr;
            this.f10059f = new int[iArr.length];
            for (int i2 = 0; i2 < iArr.length; i2++) {
                this.f10059f[iArr[i2]] = i2;
            }
        }

        @Override // com.google.android.exoplayer2.Timeline
        /* renamed from: c */
        public int mo5608c(boolean z) {
            if (m5991s()) {
                return -1;
            }
            if (z) {
                return this.f10058e[0];
            }
            return 0;
        }

        @Override // com.google.android.exoplayer2.Timeline
        /* renamed from: d */
        public int mo5609d(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.android.exoplayer2.Timeline
        /* renamed from: e */
        public int mo5610e(boolean z) {
            if (m5991s()) {
                return -1;
            }
            return z ? this.f10058e[mo5937r() - 1] : mo5937r() - 1;
        }

        @Override // com.google.android.exoplayer2.Timeline
        /* renamed from: g */
        public int mo5611g(int i2, int i3, boolean z) {
            if (i3 == 1) {
                return i2;
            }
            if (i2 != mo5610e(z)) {
                return z ? this.f10058e[this.f10059f[i2] + 1] : i2 + 1;
            }
            if (i3 == 2) {
                return mo5608c(z);
            }
            return -1;
        }

        @Override // com.google.android.exoplayer2.Timeline
        /* renamed from: i */
        public Period mo5612i(int i2, Period period, boolean z) {
            Period period2 = this.f10057d.get(i2);
            period.m6000j(period2.f10049b, period2.f10050c, period2.f10051d, period2.f10052e, period2.f10053f, period2.f10055h, period2.f10054g);
            return period;
        }

        @Override // com.google.android.exoplayer2.Timeline
        /* renamed from: k */
        public int mo5936k() {
            return this.f10057d.size();
        }

        @Override // com.google.android.exoplayer2.Timeline
        /* renamed from: n */
        public int mo5614n(int i2, int i3, boolean z) {
            if (i3 == 1) {
                return i2;
            }
            if (i2 != mo5608c(z)) {
                return z ? this.f10058e[this.f10059f[i2] - 1] : i2 - 1;
            }
            if (i3 == 2) {
                return mo5610e(z);
            }
            return -1;
        }

        @Override // com.google.android.exoplayer2.Timeline
        /* renamed from: o */
        public Object mo5615o(int i2) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.android.exoplayer2.Timeline
        /* renamed from: q */
        public Window mo5616q(int i2, Window window, long j2) {
            Window window2 = this.f10056c.get(i2);
            window.m6005f(window2.f10064b, window2.f10066d, window2.f10067e, window2.f10068f, window2.f10069g, window2.f10070h, window2.f10071i, window2.f10072j, window2.f10074l, window2.f10076n, window2.f10077o, window2.f10078p, window2.f10079q, window2.f10080r);
            window.f10075m = window2.f10075m;
            return window;
        }

        @Override // com.google.android.exoplayer2.Timeline
        /* renamed from: r */
        public int mo5937r() {
            return this.f10056c.size();
        }
    }

    public static final class Window implements Bundleable {

        /* renamed from: s */
        public static final Object f10060s = new Object();

        /* renamed from: t */
        public static final Object f10061t = new Object();

        /* renamed from: u */
        public static final MediaItem f10062u;

        /* renamed from: v */
        public static final Bundleable.Creator<Window> f10063v;

        /* renamed from: c */
        @Nullable
        @Deprecated
        public Object f10065c;

        /* renamed from: e */
        @Nullable
        public Object f10067e;

        /* renamed from: f */
        public long f10068f;

        /* renamed from: g */
        public long f10069g;

        /* renamed from: h */
        public long f10070h;

        /* renamed from: i */
        public boolean f10071i;

        /* renamed from: j */
        public boolean f10072j;

        /* renamed from: k */
        @Deprecated
        public boolean f10073k;

        /* renamed from: l */
        @Nullable
        public MediaItem.LiveConfiguration f10074l;

        /* renamed from: m */
        public boolean f10075m;

        /* renamed from: n */
        public long f10076n;

        /* renamed from: o */
        public long f10077o;

        /* renamed from: p */
        public int f10078p;

        /* renamed from: q */
        public int f10079q;

        /* renamed from: r */
        public long f10080r;

        /* renamed from: b */
        public Object f10064b = f10060s;

        /* renamed from: d */
        public MediaItem f10066d = f10062u;

        static {
            MediaItem.Builder builder = new MediaItem.Builder();
            builder.f9718a = "com.google.android.exoplayer2.Timeline";
            builder.f9719b = Uri.EMPTY;
            f10062u = builder.m5839a();
            f10063v = C1026l.f11817t;
        }

        /* renamed from: e */
        public static String m6001e(int i2) {
            return Integer.toString(i2, 36);
        }

        @Override // com.google.android.exoplayer2.Bundleable
        /* renamed from: a */
        public Bundle mo5679a() {
            return m6006g(false);
        }

        /* renamed from: b */
        public long m6002b() {
            return Util.m7735d0(this.f10076n);
        }

        /* renamed from: c */
        public long m6003c() {
            return Util.m7735d0(this.f10077o);
        }

        /* renamed from: d */
        public boolean m6004d() {
            Assertions.m7516d(this.f10073k == (this.f10074l != null));
            return this.f10074l != null;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !Window.class.equals(obj.getClass())) {
                return false;
            }
            Window window = (Window) obj;
            return Util.m7728a(this.f10064b, window.f10064b) && Util.m7728a(this.f10066d, window.f10066d) && Util.m7728a(this.f10067e, window.f10067e) && Util.m7728a(this.f10074l, window.f10074l) && this.f10068f == window.f10068f && this.f10069g == window.f10069g && this.f10070h == window.f10070h && this.f10071i == window.f10071i && this.f10072j == window.f10072j && this.f10075m == window.f10075m && this.f10076n == window.f10076n && this.f10077o == window.f10077o && this.f10078p == window.f10078p && this.f10079q == window.f10079q && this.f10080r == window.f10080r;
        }

        /* renamed from: f */
        public Window m6005f(Object obj, @Nullable MediaItem mediaItem, @Nullable Object obj2, long j2, long j3, long j4, boolean z, boolean z2, @Nullable MediaItem.LiveConfiguration liveConfiguration, long j5, long j6, int i2, int i3, long j7) {
            MediaItem.LocalConfiguration localConfiguration;
            this.f10064b = obj;
            this.f10066d = mediaItem != null ? mediaItem : f10062u;
            this.f10065c = (mediaItem == null || (localConfiguration = mediaItem.f9714c) == null) ? null : localConfiguration.f9777h;
            this.f10067e = obj2;
            this.f10068f = j2;
            this.f10069g = j3;
            this.f10070h = j4;
            this.f10071i = z;
            this.f10072j = z2;
            this.f10073k = liveConfiguration != null;
            this.f10074l = liveConfiguration;
            this.f10076n = j5;
            this.f10077o = j6;
            this.f10078p = i2;
            this.f10079q = i3;
            this.f10080r = j7;
            this.f10075m = false;
            return this;
        }

        /* renamed from: g */
        public final Bundle m6006g(boolean z) {
            Bundle bundle = new Bundle();
            bundle.putBundle(m6001e(1), (z ? MediaItem.f9711g : this.f10066d).mo5679a());
            bundle.putLong(m6001e(2), this.f10068f);
            bundle.putLong(m6001e(3), this.f10069g);
            bundle.putLong(m6001e(4), this.f10070h);
            bundle.putBoolean(m6001e(5), this.f10071i);
            bundle.putBoolean(m6001e(6), this.f10072j);
            MediaItem.LiveConfiguration liveConfiguration = this.f10074l;
            if (liveConfiguration != null) {
                bundle.putBundle(m6001e(7), liveConfiguration.mo5679a());
            }
            bundle.putBoolean(m6001e(8), this.f10075m);
            bundle.putLong(m6001e(9), this.f10076n);
            bundle.putLong(m6001e(10), this.f10077o);
            bundle.putInt(m6001e(11), this.f10078p);
            bundle.putInt(m6001e(12), this.f10079q);
            bundle.putLong(m6001e(13), this.f10080r);
            return bundle;
        }

        public int hashCode() {
            int hashCode = (this.f10066d.hashCode() + ((this.f10064b.hashCode() + 217) * 31)) * 31;
            Object obj = this.f10067e;
            int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
            MediaItem.LiveConfiguration liveConfiguration = this.f10074l;
            int hashCode3 = (hashCode2 + (liveConfiguration != null ? liveConfiguration.hashCode() : 0)) * 31;
            long j2 = this.f10068f;
            int i2 = (hashCode3 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            long j3 = this.f10069g;
            int i3 = (i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
            long j4 = this.f10070h;
            int i4 = (((((((i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31) + (this.f10071i ? 1 : 0)) * 31) + (this.f10072j ? 1 : 0)) * 31) + (this.f10075m ? 1 : 0)) * 31;
            long j5 = this.f10076n;
            int i5 = (i4 + ((int) (j5 ^ (j5 >>> 32)))) * 31;
            long j6 = this.f10077o;
            int i6 = (((((i5 + ((int) (j6 ^ (j6 >>> 32)))) * 31) + this.f10078p) * 31) + this.f10079q) * 31;
            long j7 = this.f10080r;
            return i6 + ((int) (j7 ^ (j7 >>> 32)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public static <T extends Bundleable> ImmutableList<T> m5984b(Bundleable.Creator<T> creator, @Nullable IBinder iBinder) {
        int readInt;
        if (iBinder == null) {
            return ImmutableList.m11627D();
        }
        ImmutableList.Builder builder = new ImmutableList.Builder();
        int i2 = BundleListRetriever.f9454b;
        UnmodifiableListIterator<Object> unmodifiableListIterator = ImmutableList.f21033c;
        ImmutableList.Builder builder2 = new ImmutableList.Builder();
        int i3 = 1;
        int i4 = 0;
        while (i3 != 0) {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInt(i4);
                try {
                    iBinder.transact(1, obtain, obtain2, 0);
                    while (true) {
                        readInt = obtain2.readInt();
                        if (readInt == 1) {
                            Bundle readBundle = obtain2.readBundle();
                            Objects.requireNonNull(readBundle);
                            builder2.m11640d(readBundle);
                            i4++;
                        }
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    i3 = readInt;
                } catch (RemoteException e2) {
                    throw new RuntimeException(e2);
                }
            } catch (Throwable th) {
                obtain2.recycle();
                obtain.recycle();
                throw th;
            }
        }
        ImmutableList m11641e = builder2.m11641e();
        for (int i5 = 0; i5 < m11641e.size(); i5++) {
            builder.m11640d(((C1026l) creator).fromBundle((Bundle) m11641e.get(i5)));
        }
        return builder.m11641e();
    }

    /* renamed from: t */
    public static String m5985t(int i2) {
        return Integer.toString(i2, 36);
    }

    @Override // com.google.android.exoplayer2.Bundleable
    /* renamed from: a */
    public final Bundle mo5679a() {
        ArrayList arrayList = new ArrayList();
        int mo5937r = mo5937r();
        Window window = new Window();
        for (int i2 = 0; i2 < mo5937r; i2++) {
            arrayList.add(mo5616q(i2, window, 0L).m6006g(false));
        }
        ArrayList arrayList2 = new ArrayList();
        int mo5936k = mo5936k();
        Period period = new Period();
        for (int i3 = 0; i3 < mo5936k; i3++) {
            arrayList2.add(mo5612i(i3, period, false).mo5679a());
        }
        int[] iArr = new int[mo5937r];
        if (mo5937r > 0) {
            iArr[0] = mo5608c(true);
        }
        for (int i4 = 1; i4 < mo5937r; i4++) {
            iArr[i4] = mo5611g(iArr[i4 - 1], 0, true);
        }
        Bundle bundle = new Bundle();
        BundleUtil.m7521b(bundle, m5985t(0), new BundleListRetriever(arrayList));
        BundleUtil.m7521b(bundle, m5985t(1), new BundleListRetriever(arrayList2));
        bundle.putIntArray(m5985t(2), iArr);
        return bundle;
    }

    /* renamed from: c */
    public int mo5608c(boolean z) {
        return m5991s() ? -1 : 0;
    }

    /* renamed from: d */
    public abstract int mo5609d(Object obj);

    /* renamed from: e */
    public int mo5610e(boolean z) {
        if (m5991s()) {
            return -1;
        }
        return mo5937r() - 1;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Timeline)) {
            return false;
        }
        Timeline timeline = (Timeline) obj;
        if (timeline.mo5937r() != mo5937r() || timeline.mo5936k() != mo5936k()) {
            return false;
        }
        Window window = new Window();
        Period period = new Period();
        Window window2 = new Window();
        Period period2 = new Period();
        for (int i2 = 0; i2 < mo5937r(); i2++) {
            if (!m5990p(i2, window).equals(timeline.m5990p(i2, window2))) {
                return false;
            }
        }
        for (int i3 = 0; i3 < mo5936k(); i3++) {
            if (!mo5612i(i3, period, true).equals(timeline.mo5612i(i3, period2, true))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final int m5986f(int i2, Period period, Window window, int i3, boolean z) {
        int i4 = mo5612i(i2, period, false).f10051d;
        if (m5990p(i4, window).f10079q != i2) {
            return i2 + 1;
        }
        int mo5611g = mo5611g(i4, i3, z);
        if (mo5611g == -1) {
            return -1;
        }
        return m5990p(mo5611g, window).f10078p;
    }

    /* renamed from: g */
    public int mo5611g(int i2, int i3, boolean z) {
        if (i3 == 0) {
            if (i2 == mo5610e(z)) {
                return -1;
            }
            return i2 + 1;
        }
        if (i3 == 1) {
            return i2;
        }
        if (i3 == 2) {
            return i2 == mo5610e(z) ? mo5608c(z) : i2 + 1;
        }
        throw new IllegalStateException();
    }

    /* renamed from: h */
    public final Period m5987h(int i2, Period period) {
        return mo5612i(i2, period, false);
    }

    public int hashCode() {
        Window window = new Window();
        Period period = new Period();
        int mo5937r = mo5937r() + 217;
        for (int i2 = 0; i2 < mo5937r(); i2++) {
            mo5937r = (mo5937r * 31) + m5990p(i2, window).hashCode();
        }
        int mo5936k = mo5936k() + (mo5937r * 31);
        for (int i3 = 0; i3 < mo5936k(); i3++) {
            mo5936k = (mo5936k * 31) + mo5612i(i3, period, true).hashCode();
        }
        return mo5936k;
    }

    /* renamed from: i */
    public abstract Period mo5612i(int i2, Period period, boolean z);

    /* renamed from: j */
    public Period mo5613j(Object obj, Period period) {
        return mo5612i(mo5609d(obj), period, true);
    }

    /* renamed from: k */
    public abstract int mo5936k();

    @InlineMe
    @Deprecated
    /* renamed from: l */
    public final Pair<Object, Long> m5988l(Window window, Period period, int i2, long j2) {
        Pair<Object, Long> m5989m = m5989m(window, period, i2, j2, 0L);
        Objects.requireNonNull(m5989m);
        return m5989m;
    }

    @Nullable
    @InlineMe
    @Deprecated
    /* renamed from: m */
    public final Pair<Object, Long> m5989m(Window window, Period period, int i2, long j2, long j3) {
        Assertions.m7515c(i2, 0, mo5937r());
        mo5616q(i2, window, j3);
        if (j2 == -9223372036854775807L) {
            j2 = window.f10076n;
            if (j2 == -9223372036854775807L) {
                return null;
            }
        }
        int i3 = window.f10078p;
        m5987h(i3, period);
        while (i3 < window.f10079q && period.f10053f != j2) {
            int i4 = i3 + 1;
            if (m5987h(i4, period).f10053f > j2) {
                break;
            }
            i3 = i4;
        }
        mo5612i(i3, period, true);
        long j4 = j2 - period.f10053f;
        long j5 = period.f10052e;
        if (j5 != -9223372036854775807L) {
            j4 = Math.min(j4, j5 - 1);
        }
        long max = Math.max(0L, j4);
        Object obj = period.f10050c;
        Objects.requireNonNull(obj);
        return Pair.create(obj, Long.valueOf(max));
    }

    /* renamed from: n */
    public int mo5614n(int i2, int i3, boolean z) {
        if (i3 == 0) {
            if (i2 == mo5608c(z)) {
                return -1;
            }
            return i2 - 1;
        }
        if (i3 == 1) {
            return i2;
        }
        if (i3 == 2) {
            return i2 == mo5608c(z) ? mo5610e(z) : i2 - 1;
        }
        throw new IllegalStateException();
    }

    /* renamed from: o */
    public abstract Object mo5615o(int i2);

    /* renamed from: p */
    public final Window m5990p(int i2, Window window) {
        return mo5616q(i2, window, 0L);
    }

    /* renamed from: q */
    public abstract Window mo5616q(int i2, Window window, long j2);

    /* renamed from: r */
    public abstract int mo5937r();

    /* renamed from: s */
    public final boolean m5991s() {
        return mo5937r() == 0;
    }
}
