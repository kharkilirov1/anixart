package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import android.view.TextureView;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.exo.metadata.Metadata;
import com.yandex.mobile.ads.impl.C5201hv;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* loaded from: classes3.dex */
public interface rq0 {

    /* renamed from: com.yandex.mobile.ads.impl.rq0$a */
    public static final class C5705a implements InterfaceC5589pf {

        /* renamed from: b */
        public static final C5705a f54389b = new a().m27973a();

        /* renamed from: a */
        private final C5201hv f54390a;

        /* renamed from: com.yandex.mobile.ads.impl.rq0$a$a */
        public static final class a {

            /* renamed from: a */
            private final C5201hv.a f54391a = new C5201hv.a();

            /* renamed from: a */
            public final a m27969a(int i2) {
                this.f54391a.m25377a(i2);
                return this;
            }

            /* renamed from: a */
            public final a m27971a(boolean z, int i2) {
                C5201hv.a aVar = this.f54391a;
                if (z) {
                    aVar.m25377a(i2);
                } else {
                    Objects.requireNonNull(aVar);
                }
                return this;
            }

            /* renamed from: a */
            public final a m27972a(int... iArr) {
                C5201hv.a aVar = this.f54391a;
                Objects.requireNonNull(aVar);
                for (int i2 : iArr) {
                    aVar.m25377a(i2);
                }
                return this;
            }

            /* renamed from: a */
            public final a m27970a(C5705a c5705a) {
                C5201hv.a aVar = this.f54391a;
                C5201hv c5201hv = c5705a.f54390a;
                Objects.requireNonNull(aVar);
                for (int i2 = 0; i2 < c5201hv.m25374a(); i2++) {
                    aVar.m25377a(c5201hv.m25376b(i2));
                }
                return this;
            }

            /* renamed from: a */
            public final C5705a m27973a() {
                return new C5705a(this.f54391a.m25378a(), 0);
            }
        }

        static {
            jp1 jp1Var = jp1.f51711v;
        }

        public /* synthetic */ C5705a(C5201hv c5201hv, int i2) {
            this(c5201hv);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C5705a) {
                return this.f54390a.equals(((C5705a) obj).f54390a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f54390a.hashCode();
        }

        private C5705a(C5201hv c5201hv) {
            this.f54390a = c5201hv;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public static C5705a m27967a(Bundle bundle) {
            ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(Integer.toString(0, 36));
            if (integerArrayList == null) {
                return f54389b;
            }
            a aVar = new a();
            for (int i2 = 0; i2 < integerArrayList.size(); i2++) {
                aVar.m27969a(integerArrayList.get(i2).intValue());
            }
            return aVar.m27973a();
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.rq0$b */
    public interface InterfaceC5706b {
        /* renamed from: a */
        void mo23438a();

        /* renamed from: a */
        void mo23439a(int i2);

        /* renamed from: a */
        void mo23443a(Metadata metadata);

        /* renamed from: a */
        void mo23444a(@Nullable C5043es c5043es);

        /* renamed from: a */
        void mo23445a(lf1 lf1Var);

        /* renamed from: a */
        void mo23446a(nq0 nq0Var);

        /* renamed from: a */
        void mo23447a(@Nullable pb0 pb0Var, int i2);

        /* renamed from: a */
        void mo23451a(C5705a c5705a);

        /* renamed from: a */
        void mo23452a(C5707c c5707c, C5707c c5707c2, int i2);

        /* renamed from: a */
        void mo23454a(sb0 sb0Var);

        /* renamed from: a */
        void mo23455a(t71 t71Var);

        /* renamed from: a */
        void mo23457a(C5871ul c5871ul);

        /* renamed from: a */
        void mo23458a(C5875uo c5875uo);

        /* renamed from: a */
        void mo23464a(boolean z, int i2);

        @Deprecated
        /* renamed from: b */
        void mo23465b();

        /* renamed from: b */
        void mo23468b(C5043es c5043es);

        @Deprecated
        /* renamed from: c */
        void mo23474c();

        @Deprecated
        void onCues(List<C5751sl> list);

        void onIsLoadingChanged(boolean z);

        void onIsPlayingChanged(boolean z);

        void onPlayWhenReadyChanged(boolean z, int i2);

        void onPlaybackStateChanged(int i2);

        void onPlaybackSuppressionReasonChanged(int i2);

        @Deprecated
        void onPlayerStateChanged(boolean z, int i2);

        void onRenderedFirstFrame();

        void onSkipSilenceEnabledChanged(boolean z);

        void onSurfaceSizeChanged(int i2, int i3);

        void onVolumeChanged(float f2);
    }

    /* renamed from: com.yandex.mobile.ads.impl.rq0$c */
    public static final class C5707c implements InterfaceC5589pf {

        /* renamed from: a */
        @Nullable
        public final Object f54392a;

        /* renamed from: b */
        public final int f54393b;

        /* renamed from: c */
        @Nullable
        public final pb0 f54394c;

        /* renamed from: d */
        @Nullable
        public final Object f54395d;

        /* renamed from: e */
        public final int f54396e;

        /* renamed from: f */
        public final long f54397f;

        /* renamed from: g */
        public final long f54398g;

        /* renamed from: h */
        public final int f54399h;

        /* renamed from: i */
        public final int f54400i;

        static {
            jp1 jp1Var = jp1.f51712w;
        }

        public C5707c(@Nullable Object obj, int i2, @Nullable pb0 pb0Var, @Nullable Object obj2, int i3, long j2, long j3, int i4, int i5) {
            this.f54392a = obj;
            this.f54393b = i2;
            this.f54394c = pb0Var;
            this.f54395d = obj2;
            this.f54396e = i3;
            this.f54397f = j2;
            this.f54398g = j3;
            this.f54399h = i4;
            this.f54400i = i5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public static C5707c m27974a(Bundle bundle) {
            int i2 = bundle.getInt(Integer.toString(0, 36), -1);
            Bundle bundle2 = bundle.getBundle(Integer.toString(1, 36));
            return new C5707c(null, i2, bundle2 == null ? null : pb0.f53427g.fromBundle(bundle2), null, bundle.getInt(Integer.toString(2, 36), -1), bundle.getLong(Integer.toString(3, 36), -9223372036854775807L), bundle.getLong(Integer.toString(4, 36), -9223372036854775807L), bundle.getInt(Integer.toString(5, 36), -1), bundle.getInt(Integer.toString(6, 36), -1));
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C5707c.class != obj.getClass()) {
                return false;
            }
            C5707c c5707c = (C5707c) obj;
            return this.f54393b == c5707c.f54393b && this.f54396e == c5707c.f54396e && this.f54397f == c5707c.f54397f && this.f54398g == c5707c.f54398g && this.f54399h == c5707c.f54399h && this.f54400i == c5707c.f54400i && gn0.m24948a(this.f54392a, c5707c.f54392a) && gn0.m24948a(this.f54395d, c5707c.f54395d) && gn0.m24948a(this.f54394c, c5707c.f54394c);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.f54392a, Integer.valueOf(this.f54393b), this.f54394c, this.f54395d, Integer.valueOf(this.f54396e), Long.valueOf(this.f54397f), Long.valueOf(this.f54398g), Integer.valueOf(this.f54399h), Integer.valueOf(this.f54400i)});
        }
    }

    @Nullable
    /* renamed from: a */
    C5043es mo25683a();

    /* renamed from: a */
    void mo25685a(InterfaceC5706b interfaceC5706b);

    /* renamed from: b */
    void mo25687b(InterfaceC5706b interfaceC5706b);

    long getContentPosition();

    int getCurrentAdGroupIndex();

    int getCurrentAdIndexInAdGroup();

    int getCurrentMediaItemIndex();

    int getCurrentPeriodIndex();

    long getCurrentPosition();

    k61 getCurrentTimeline();

    t71 getCurrentTracks();

    long getDuration();

    boolean getPlayWhenReady();

    int getPlaybackState();

    int getPlaybackSuppressionReason();

    long getTotalBufferedDuration();

    @FloatRange
    float getVolume();

    boolean hasNextMediaItem();

    boolean hasPreviousMediaItem();

    boolean isCurrentMediaItemDynamic();

    boolean isCurrentMediaItemLive();

    boolean isCurrentMediaItemSeekable();

    boolean isPlayingAd();

    void prepare();

    void release();

    void setPlayWhenReady(boolean z);

    void setVideoTextureView(@Nullable TextureView textureView);

    void setVolume(@FloatRange float f2);

    void stop();
}
