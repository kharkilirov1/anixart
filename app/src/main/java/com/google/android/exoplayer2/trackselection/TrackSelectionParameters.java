package com.google.android.exoplayer2.trackselection;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import android.view.accessibility.CaptioningManager;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.util.Util;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.UnmodifiableListIterator;
import com.google.common.primitives.Ints;
import java.util.Locale;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* loaded from: classes.dex */
public class TrackSelectionParameters implements Bundleable {

    /* renamed from: z */
    public static final TrackSelectionParameters f13980z = new TrackSelectionParameters(new Builder());

    /* renamed from: b */
    public final int f13981b;

    /* renamed from: c */
    public final int f13982c;

    /* renamed from: d */
    public final int f13983d;

    /* renamed from: e */
    public final int f13984e;

    /* renamed from: f */
    public final int f13985f;

    /* renamed from: g */
    public final int f13986g;

    /* renamed from: h */
    public final int f13987h;

    /* renamed from: i */
    public final int f13988i;

    /* renamed from: j */
    public final int f13989j;

    /* renamed from: k */
    public final int f13990k;

    /* renamed from: l */
    public final boolean f13991l;

    /* renamed from: m */
    public final ImmutableList<String> f13992m;

    /* renamed from: n */
    public final ImmutableList<String> f13993n;

    /* renamed from: o */
    public final int f13994o;

    /* renamed from: p */
    public final int f13995p;

    /* renamed from: q */
    public final int f13996q;

    /* renamed from: r */
    public final ImmutableList<String> f13997r;

    /* renamed from: s */
    public final ImmutableList<String> f13998s;

    /* renamed from: t */
    public final int f13999t;

    /* renamed from: u */
    public final boolean f14000u;

    /* renamed from: v */
    public final boolean f14001v;

    /* renamed from: w */
    public final boolean f14002w;

    /* renamed from: x */
    public final TrackSelectionOverrides f14003x;

    /* renamed from: y */
    public final ImmutableSet<Integer> f14004y;

    public TrackSelectionParameters(Builder builder) {
        this.f13981b = builder.f14005a;
        this.f13982c = builder.f14006b;
        this.f13983d = builder.f14007c;
        this.f13984e = builder.f14008d;
        this.f13985f = builder.f14009e;
        this.f13986g = builder.f14010f;
        this.f13987h = builder.f14011g;
        this.f13988i = builder.f14012h;
        this.f13989j = builder.f14013i;
        this.f13990k = builder.f14014j;
        this.f13991l = builder.f14015k;
        this.f13992m = builder.f14016l;
        this.f13993n = builder.f14017m;
        this.f13994o = builder.f14018n;
        this.f13995p = builder.f14019o;
        this.f13996q = builder.f14020p;
        this.f13997r = builder.f14021q;
        this.f13998s = builder.f14022r;
        this.f13999t = builder.f14023s;
        this.f14000u = builder.f14024t;
        this.f14001v = builder.f14025u;
        this.f14002w = builder.f14026v;
        this.f14003x = builder.f14027w;
        this.f14004y = builder.f14028x;
    }

    /* renamed from: b */
    public static String m7331b(int i2) {
        return Integer.toString(i2, 36);
    }

    @Override // com.google.android.exoplayer2.Bundleable
    /* renamed from: a */
    public Bundle mo5679a() {
        Bundle bundle = new Bundle();
        bundle.putInt(m7331b(6), this.f13981b);
        bundle.putInt(m7331b(7), this.f13982c);
        bundle.putInt(m7331b(8), this.f13983d);
        bundle.putInt(m7331b(9), this.f13984e);
        bundle.putInt(m7331b(10), this.f13985f);
        bundle.putInt(m7331b(11), this.f13986g);
        bundle.putInt(m7331b(12), this.f13987h);
        bundle.putInt(m7331b(13), this.f13988i);
        bundle.putInt(m7331b(14), this.f13989j);
        bundle.putInt(m7331b(15), this.f13990k);
        bundle.putBoolean(m7331b(16), this.f13991l);
        bundle.putStringArray(m7331b(17), (String[]) this.f13992m.toArray(new String[0]));
        bundle.putStringArray(m7331b(1), (String[]) this.f13993n.toArray(new String[0]));
        bundle.putInt(m7331b(2), this.f13994o);
        bundle.putInt(m7331b(18), this.f13995p);
        bundle.putInt(m7331b(19), this.f13996q);
        bundle.putStringArray(m7331b(20), (String[]) this.f13997r.toArray(new String[0]));
        bundle.putStringArray(m7331b(3), (String[]) this.f13998s.toArray(new String[0]));
        bundle.putInt(m7331b(4), this.f13999t);
        bundle.putBoolean(m7331b(5), this.f14000u);
        bundle.putBoolean(m7331b(21), this.f14001v);
        bundle.putBoolean(m7331b(22), this.f14002w);
        bundle.putBundle(m7331b(23), this.f14003x.mo5679a());
        bundle.putIntArray(m7331b(25), Ints.m12085g(this.f14004y));
        return bundle;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TrackSelectionParameters trackSelectionParameters = (TrackSelectionParameters) obj;
        return this.f13981b == trackSelectionParameters.f13981b && this.f13982c == trackSelectionParameters.f13982c && this.f13983d == trackSelectionParameters.f13983d && this.f13984e == trackSelectionParameters.f13984e && this.f13985f == trackSelectionParameters.f13985f && this.f13986g == trackSelectionParameters.f13986g && this.f13987h == trackSelectionParameters.f13987h && this.f13988i == trackSelectionParameters.f13988i && this.f13991l == trackSelectionParameters.f13991l && this.f13989j == trackSelectionParameters.f13989j && this.f13990k == trackSelectionParameters.f13990k && this.f13992m.equals(trackSelectionParameters.f13992m) && this.f13993n.equals(trackSelectionParameters.f13993n) && this.f13994o == trackSelectionParameters.f13994o && this.f13995p == trackSelectionParameters.f13995p && this.f13996q == trackSelectionParameters.f13996q && this.f13997r.equals(trackSelectionParameters.f13997r) && this.f13998s.equals(trackSelectionParameters.f13998s) && this.f13999t == trackSelectionParameters.f13999t && this.f14000u == trackSelectionParameters.f14000u && this.f14001v == trackSelectionParameters.f14001v && this.f14002w == trackSelectionParameters.f14002w && this.f14003x.equals(trackSelectionParameters.f14003x) && this.f14004y.equals(trackSelectionParameters.f14004y);
    }

    public int hashCode() {
        return this.f14004y.hashCode() + ((this.f14003x.hashCode() + ((((((((((this.f13998s.hashCode() + ((this.f13997r.hashCode() + ((((((((this.f13993n.hashCode() + ((this.f13992m.hashCode() + ((((((((((((((((((((((this.f13981b + 31) * 31) + this.f13982c) * 31) + this.f13983d) * 31) + this.f13984e) * 31) + this.f13985f) * 31) + this.f13986g) * 31) + this.f13987h) * 31) + this.f13988i) * 31) + (this.f13991l ? 1 : 0)) * 31) + this.f13989j) * 31) + this.f13990k) * 31)) * 31)) * 31) + this.f13994o) * 31) + this.f13995p) * 31) + this.f13996q) * 31)) * 31)) * 31) + this.f13999t) * 31) + (this.f14000u ? 1 : 0)) * 31) + (this.f14001v ? 1 : 0)) * 31) + (this.f14002w ? 1 : 0)) * 31)) * 31);
    }

    public static class Builder {

        /* renamed from: a */
        public int f14005a;

        /* renamed from: b */
        public int f14006b;

        /* renamed from: c */
        public int f14007c;

        /* renamed from: d */
        public int f14008d;

        /* renamed from: e */
        public int f14009e;

        /* renamed from: f */
        public int f14010f;

        /* renamed from: g */
        public int f14011g;

        /* renamed from: h */
        public int f14012h;

        /* renamed from: i */
        public int f14013i;

        /* renamed from: j */
        public int f14014j;

        /* renamed from: k */
        public boolean f14015k;

        /* renamed from: l */
        public ImmutableList<String> f14016l;

        /* renamed from: m */
        public ImmutableList<String> f14017m;

        /* renamed from: n */
        public int f14018n;

        /* renamed from: o */
        public int f14019o;

        /* renamed from: p */
        public int f14020p;

        /* renamed from: q */
        public ImmutableList<String> f14021q;

        /* renamed from: r */
        public ImmutableList<String> f14022r;

        /* renamed from: s */
        public int f14023s;

        /* renamed from: t */
        public boolean f14024t;

        /* renamed from: u */
        public boolean f14025u;

        /* renamed from: v */
        public boolean f14026v;

        /* renamed from: w */
        public TrackSelectionOverrides f14027w;

        /* renamed from: x */
        public ImmutableSet<Integer> f14028x;

        @Deprecated
        public Builder() {
            this.f14005a = Integer.MAX_VALUE;
            this.f14006b = Integer.MAX_VALUE;
            this.f14007c = Integer.MAX_VALUE;
            this.f14008d = Integer.MAX_VALUE;
            this.f14013i = Integer.MAX_VALUE;
            this.f14014j = Integer.MAX_VALUE;
            this.f14015k = true;
            this.f14016l = ImmutableList.m11627D();
            this.f14017m = ImmutableList.m11627D();
            this.f14018n = 0;
            this.f14019o = Integer.MAX_VALUE;
            this.f14020p = Integer.MAX_VALUE;
            this.f14021q = ImmutableList.m11627D();
            this.f14022r = ImmutableList.m11627D();
            this.f14023s = 0;
            this.f14024t = false;
            this.f14025u = false;
            this.f14026v = false;
            this.f14027w = TrackSelectionOverrides.f13973c;
            this.f14028x = ImmutableSet.m11671C();
        }

        /* renamed from: b */
        public static ImmutableList<String> m7332b(String[] strArr) {
            UnmodifiableListIterator<Object> unmodifiableListIterator = ImmutableList.f21033c;
            ImmutableList.Builder builder = new ImmutableList.Builder();
            for (String str : strArr) {
                Objects.requireNonNull(str);
                builder.m11640d(Util.m7718Q(str));
            }
            return builder.m11641e();
        }

        @EnsuresNonNull({"preferredVideoMimeTypes", "preferredAudioLanguages", "preferredAudioMimeTypes", "preferredTextLanguages", "trackSelectionOverrides", "disabledTrackTypes"})
        /* renamed from: a */
        public final void m7333a(TrackSelectionParameters trackSelectionParameters) {
            this.f14005a = trackSelectionParameters.f13981b;
            this.f14006b = trackSelectionParameters.f13982c;
            this.f14007c = trackSelectionParameters.f13983d;
            this.f14008d = trackSelectionParameters.f13984e;
            this.f14009e = trackSelectionParameters.f13985f;
            this.f14010f = trackSelectionParameters.f13986g;
            this.f14011g = trackSelectionParameters.f13987h;
            this.f14012h = trackSelectionParameters.f13988i;
            this.f14013i = trackSelectionParameters.f13989j;
            this.f14014j = trackSelectionParameters.f13990k;
            this.f14015k = trackSelectionParameters.f13991l;
            this.f14016l = trackSelectionParameters.f13992m;
            this.f14017m = trackSelectionParameters.f13993n;
            this.f14018n = trackSelectionParameters.f13994o;
            this.f14019o = trackSelectionParameters.f13995p;
            this.f14020p = trackSelectionParameters.f13996q;
            this.f14021q = trackSelectionParameters.f13997r;
            this.f14022r = trackSelectionParameters.f13998s;
            this.f14023s = trackSelectionParameters.f13999t;
            this.f14024t = trackSelectionParameters.f14000u;
            this.f14025u = trackSelectionParameters.f14001v;
            this.f14026v = trackSelectionParameters.f14002w;
            this.f14027w = trackSelectionParameters.f14003x;
            this.f14028x = trackSelectionParameters.f14004y;
        }

        /* renamed from: c */
        public Builder mo7317c(Context context) {
            CaptioningManager captioningManager;
            int i2 = Util.f14736a;
            if (i2 >= 19 && ((i2 >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled())) {
                this.f14023s = 1088;
                Locale locale = captioningManager.getLocale();
                if (locale != null) {
                    this.f14022r = ImmutableList.m11628E(i2 >= 21 ? locale.toLanguageTag() : locale.toString());
                }
            }
            return this;
        }

        /* renamed from: d */
        public Builder mo7318d(int i2, int i3, boolean z) {
            this.f14013i = i2;
            this.f14014j = i3;
            this.f14015k = z;
            return this;
        }

        /* renamed from: e */
        public Builder mo7319e(Context context, boolean z) {
            Point point;
            String[] m7725X;
            DisplayManager displayManager;
            int i2 = Util.f14736a;
            Display display = (i2 < 17 || (displayManager = (DisplayManager) context.getSystemService("display")) == null) ? null : displayManager.getDisplay(0);
            if (display == null) {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                Objects.requireNonNull(windowManager);
                display = windowManager.getDefaultDisplay();
            }
            if (display.getDisplayId() == 0 && Util.m7715N(context)) {
                String m7707F = i2 < 28 ? Util.m7707F("sys.display-size") : Util.m7707F("vendor.display-size");
                if (!TextUtils.isEmpty(m7707F)) {
                    try {
                        m7725X = Util.m7725X(m7707F.trim(), "x");
                    } catch (NumberFormatException unused) {
                    }
                    if (m7725X.length == 2) {
                        int parseInt = Integer.parseInt(m7725X[0]);
                        int parseInt2 = Integer.parseInt(m7725X[1]);
                        if (parseInt > 0 && parseInt2 > 0) {
                            point = new Point(parseInt, parseInt2);
                            return mo7318d(point.x, point.y, z);
                        }
                    }
                    String valueOf = String.valueOf(m7707F);
                    Log.e("Util", valueOf.length() != 0 ? "Invalid display size: ".concat(valueOf) : new String("Invalid display size: "));
                }
                if ("Sony".equals(Util.f14738c) && Util.f14739d.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                    point = new Point(3840, 2160);
                    return mo7318d(point.x, point.y, z);
                }
            }
            point = new Point();
            int i3 = Util.f14736a;
            if (i3 >= 23) {
                Display.Mode mode = display.getMode();
                point.x = mode.getPhysicalWidth();
                point.y = mode.getPhysicalHeight();
            } else if (i3 >= 17) {
                display.getRealSize(point);
            } else {
                display.getSize(point);
            }
            return mo7318d(point.x, point.y, z);
        }

        public Builder(TrackSelectionParameters trackSelectionParameters) {
            m7333a(trackSelectionParameters);
        }

        public Builder(Bundle bundle) {
            String m7331b = TrackSelectionParameters.m7331b(6);
            TrackSelectionParameters trackSelectionParameters = TrackSelectionParameters.f13980z;
            this.f14005a = bundle.getInt(m7331b, trackSelectionParameters.f13981b);
            this.f14006b = bundle.getInt(TrackSelectionParameters.m7331b(7), trackSelectionParameters.f13982c);
            this.f14007c = bundle.getInt(TrackSelectionParameters.m7331b(8), trackSelectionParameters.f13983d);
            this.f14008d = bundle.getInt(TrackSelectionParameters.m7331b(9), trackSelectionParameters.f13984e);
            this.f14009e = bundle.getInt(TrackSelectionParameters.m7331b(10), trackSelectionParameters.f13985f);
            this.f14010f = bundle.getInt(TrackSelectionParameters.m7331b(11), trackSelectionParameters.f13986g);
            this.f14011g = bundle.getInt(TrackSelectionParameters.m7331b(12), trackSelectionParameters.f13987h);
            this.f14012h = bundle.getInt(TrackSelectionParameters.m7331b(13), trackSelectionParameters.f13988i);
            this.f14013i = bundle.getInt(TrackSelectionParameters.m7331b(14), trackSelectionParameters.f13989j);
            this.f14014j = bundle.getInt(TrackSelectionParameters.m7331b(15), trackSelectionParameters.f13990k);
            this.f14015k = bundle.getBoolean(TrackSelectionParameters.m7331b(16), trackSelectionParameters.f13991l);
            this.f14016l = ImmutableList.m11635z((String[]) MoreObjects.m11165a(bundle.getStringArray(TrackSelectionParameters.m7331b(17)), new String[0]));
            this.f14017m = m7332b((String[]) MoreObjects.m11165a(bundle.getStringArray(TrackSelectionParameters.m7331b(1)), new String[0]));
            this.f14018n = bundle.getInt(TrackSelectionParameters.m7331b(2), trackSelectionParameters.f13994o);
            this.f14019o = bundle.getInt(TrackSelectionParameters.m7331b(18), trackSelectionParameters.f13995p);
            this.f14020p = bundle.getInt(TrackSelectionParameters.m7331b(19), trackSelectionParameters.f13996q);
            this.f14021q = ImmutableList.m11635z((String[]) MoreObjects.m11165a(bundle.getStringArray(TrackSelectionParameters.m7331b(20)), new String[0]));
            this.f14022r = m7332b((String[]) MoreObjects.m11165a(bundle.getStringArray(TrackSelectionParameters.m7331b(3)), new String[0]));
            this.f14023s = bundle.getInt(TrackSelectionParameters.m7331b(4), trackSelectionParameters.f13999t);
            this.f14024t = bundle.getBoolean(TrackSelectionParameters.m7331b(5), trackSelectionParameters.f14000u);
            this.f14025u = bundle.getBoolean(TrackSelectionParameters.m7331b(21), trackSelectionParameters.f14001v);
            this.f14026v = bundle.getBoolean(TrackSelectionParameters.m7331b(22), trackSelectionParameters.f14002w);
            Bundleable.Creator<TrackSelectionOverrides> creator = TrackSelectionOverrides.f13974d;
            Bundle bundle2 = bundle.getBundle(TrackSelectionParameters.m7331b(23));
            this.f14027w = (TrackSelectionOverrides) (bundle2 != null ? ((C1136a) creator).fromBundle(bundle2) : TrackSelectionOverrides.f13973c);
            this.f14028x = ImmutableSet.m11676x(Ints.m12079a((int[]) MoreObjects.m11165a(bundle.getIntArray(TrackSelectionParameters.m7331b(25)), new int[0])));
        }
    }
}
