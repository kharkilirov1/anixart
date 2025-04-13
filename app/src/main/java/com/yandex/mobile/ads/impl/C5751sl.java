package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.InterfaceC5589pf;
import java.util.Arrays;
import org.checkerframework.dataflow.qual.Pure;

/* renamed from: com.yandex.mobile.ads.impl.sl */
/* loaded from: classes3.dex */
public final class C5751sl implements InterfaceC5589pf {

    /* renamed from: r */
    public static final C5751sl f54715r = new a().m28304a("").m28305a();

    /* renamed from: s */
    public static final InterfaceC5589pf.a<C5751sl> f54716s = jp1.f51714y;

    /* renamed from: a */
    @Nullable
    public final CharSequence f54717a;

    /* renamed from: b */
    @Nullable
    public final Layout.Alignment f54718b;

    /* renamed from: c */
    @Nullable
    public final Layout.Alignment f54719c;

    /* renamed from: d */
    @Nullable
    public final Bitmap f54720d;

    /* renamed from: e */
    public final float f54721e;

    /* renamed from: f */
    public final int f54722f;

    /* renamed from: g */
    public final int f54723g;

    /* renamed from: h */
    public final float f54724h;

    /* renamed from: i */
    public final int f54725i;

    /* renamed from: j */
    public final float f54726j;

    /* renamed from: k */
    public final float f54727k;

    /* renamed from: l */
    public final boolean f54728l;

    /* renamed from: m */
    public final int f54729m;

    /* renamed from: n */
    public final int f54730n;

    /* renamed from: o */
    public final float f54731o;

    /* renamed from: p */
    public final int f54732p;

    /* renamed from: q */
    public final float f54733q;

    /* renamed from: com.yandex.mobile.ads.impl.sl$a */
    public static final class a {

        /* renamed from: a */
        @Nullable
        private CharSequence f54734a;

        /* renamed from: b */
        @Nullable
        private Bitmap f54735b;

        /* renamed from: c */
        @Nullable
        private Layout.Alignment f54736c;

        /* renamed from: d */
        @Nullable
        private Layout.Alignment f54737d;

        /* renamed from: e */
        private float f54738e;

        /* renamed from: f */
        private int f54739f;

        /* renamed from: g */
        private int f54740g;

        /* renamed from: h */
        private float f54741h;

        /* renamed from: i */
        private int f54742i;

        /* renamed from: j */
        private int f54743j;

        /* renamed from: k */
        private float f54744k;

        /* renamed from: l */
        private float f54745l;

        /* renamed from: m */
        private float f54746m;

        /* renamed from: n */
        private boolean f54747n;

        /* renamed from: o */
        @ColorInt
        private int f54748o;

        /* renamed from: p */
        private int f54749p;

        /* renamed from: q */
        private float f54750q;

        public /* synthetic */ a(C5751sl c5751sl, int i2) {
            this(c5751sl);
        }

        /* renamed from: a */
        public final a m28304a(CharSequence charSequence) {
            this.f54734a = charSequence;
            return this;
        }

        /* renamed from: b */
        public final a m28309b(@Nullable Layout.Alignment alignment) {
            this.f54736c = alignment;
            return this;
        }

        @Pure
        /* renamed from: c */
        public final int m28312c() {
            return this.f54740g;
        }

        @Pure
        /* renamed from: d */
        public final int m28315d() {
            return this.f54742i;
        }

        @Nullable
        @Pure
        /* renamed from: e */
        public final CharSequence m28318e() {
            return this.f54734a;
        }

        public a() {
            this.f54734a = null;
            this.f54735b = null;
            this.f54736c = null;
            this.f54737d = null;
            this.f54738e = -3.4028235E38f;
            this.f54739f = Integer.MIN_VALUE;
            this.f54740g = Integer.MIN_VALUE;
            this.f54741h = -3.4028235E38f;
            this.f54742i = Integer.MIN_VALUE;
            this.f54743j = Integer.MIN_VALUE;
            this.f54744k = -3.4028235E38f;
            this.f54745l = -3.4028235E38f;
            this.f54746m = -3.4028235E38f;
            this.f54747n = false;
            this.f54748o = -16777216;
            this.f54749p = Integer.MIN_VALUE;
        }

        /* renamed from: a */
        public final a m28303a(Bitmap bitmap) {
            this.f54735b = bitmap;
            return this;
        }

        /* renamed from: b */
        public final a m28307b(float f2) {
            this.f54741h = f2;
            return this;
        }

        /* renamed from: c */
        public final a m28313c(int i2) {
            this.f54749p = i2;
            return this;
        }

        /* renamed from: d */
        public final a m28316d(float f2) {
            this.f54745l = f2;
            return this;
        }

        /* renamed from: a */
        public final void m28306a(@Nullable Layout.Alignment alignment) {
            this.f54737d = alignment;
        }

        /* renamed from: b */
        public final a m28308b(int i2) {
            this.f54742i = i2;
            return this;
        }

        /* renamed from: c */
        public final void m28314c(float f2) {
            this.f54750q = f2;
        }

        /* renamed from: d */
        public final void m28317d(@ColorInt int i2) {
            this.f54748o = i2;
            this.f54747n = true;
        }

        /* renamed from: a */
        public final a m28302a(int i2, float f2) {
            this.f54738e = f2;
            this.f54739f = i2;
            return this;
        }

        /* renamed from: b */
        public final void m28311b(int i2, float f2) {
            this.f54744k = f2;
            this.f54743j = i2;
        }

        /* renamed from: a */
        public final a m28301a(int i2) {
            this.f54740g = i2;
            return this;
        }

        /* renamed from: b */
        public final void m28310b() {
            this.f54747n = false;
        }

        /* renamed from: a */
        public final a m28300a(float f2) {
            this.f54746m = f2;
            return this;
        }

        /* renamed from: a */
        public final C5751sl m28305a() {
            return new C5751sl(this.f54734a, this.f54736c, this.f54737d, this.f54735b, this.f54738e, this.f54739f, this.f54740g, this.f54741h, this.f54742i, this.f54743j, this.f54744k, this.f54745l, this.f54746m, this.f54747n, this.f54748o, this.f54749p, this.f54750q, 0);
        }

        private a(C5751sl c5751sl) {
            this.f54734a = c5751sl.f54717a;
            this.f54735b = c5751sl.f54720d;
            this.f54736c = c5751sl.f54718b;
            this.f54737d = c5751sl.f54719c;
            this.f54738e = c5751sl.f54721e;
            this.f54739f = c5751sl.f54722f;
            this.f54740g = c5751sl.f54723g;
            this.f54741h = c5751sl.f54724h;
            this.f54742i = c5751sl.f54725i;
            this.f54743j = c5751sl.f54730n;
            this.f54744k = c5751sl.f54731o;
            this.f54745l = c5751sl.f54726j;
            this.f54746m = c5751sl.f54727k;
            this.f54747n = c5751sl.f54728l;
            this.f54748o = c5751sl.f54729m;
            this.f54749p = c5751sl.f54732p;
            this.f54750q = c5751sl.f54733q;
        }
    }

    public /* synthetic */ C5751sl(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f2, int i2, int i3, float f3, int i4, int i5, float f4, float f5, float f6, boolean z, int i6, int i7, float f7, int i8) {
        this(charSequence, alignment, alignment2, bitmap, f2, i2, i3, f3, i4, i5, f4, f5, f6, z, i6, i7, f7);
    }

    /* renamed from: a */
    public final a m28299a() {
        return new a(this, 0);
    }

    public final boolean equals(@Nullable Object obj) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (this == obj) {
            return true;
        }
        if (obj == null || C5751sl.class != obj.getClass()) {
            return false;
        }
        C5751sl c5751sl = (C5751sl) obj;
        return TextUtils.equals(this.f54717a, c5751sl.f54717a) && this.f54718b == c5751sl.f54718b && this.f54719c == c5751sl.f54719c && ((bitmap = this.f54720d) != null ? !((bitmap2 = c5751sl.f54720d) == null || !bitmap.sameAs(bitmap2)) : c5751sl.f54720d == null) && this.f54721e == c5751sl.f54721e && this.f54722f == c5751sl.f54722f && this.f54723g == c5751sl.f54723g && this.f54724h == c5751sl.f54724h && this.f54725i == c5751sl.f54725i && this.f54726j == c5751sl.f54726j && this.f54727k == c5751sl.f54727k && this.f54728l == c5751sl.f54728l && this.f54729m == c5751sl.f54729m && this.f54730n == c5751sl.f54730n && this.f54731o == c5751sl.f54731o && this.f54732p == c5751sl.f54732p && this.f54733q == c5751sl.f54733q;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f54717a, this.f54718b, this.f54719c, this.f54720d, Float.valueOf(this.f54721e), Integer.valueOf(this.f54722f), Integer.valueOf(this.f54723g), Float.valueOf(this.f54724h), Integer.valueOf(this.f54725i), Float.valueOf(this.f54726j), Float.valueOf(this.f54727k), Boolean.valueOf(this.f54728l), Integer.valueOf(this.f54729m), Integer.valueOf(this.f54730n), Float.valueOf(this.f54731o), Integer.valueOf(this.f54732p), Float.valueOf(this.f54733q)});
    }

    private C5751sl(@Nullable CharSequence charSequence, @Nullable Layout.Alignment alignment, @Nullable Layout.Alignment alignment2, @Nullable Bitmap bitmap, float f2, int i2, int i3, float f3, int i4, int i5, float f4, float f5, float f6, boolean z, int i6, int i7, float f7) {
        if (charSequence == null) {
            C5220ia.m25469a(bitmap);
        } else {
            C5220ia.m25473a(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f54717a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f54717a = charSequence.toString();
        } else {
            this.f54717a = null;
        }
        this.f54718b = alignment;
        this.f54719c = alignment2;
        this.f54720d = bitmap;
        this.f54721e = f2;
        this.f54722f = i2;
        this.f54723g = i3;
        this.f54724h = f3;
        this.f54725i = i4;
        this.f54726j = f5;
        this.f54727k = f6;
        this.f54728l = z;
        this.f54729m = i6;
        this.f54730n = i5;
        this.f54731o = f4;
        this.f54732p = i7;
        this.f54733q = f7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static final C5751sl m28297a(Bundle bundle) {
        a aVar = new a();
        CharSequence charSequence = bundle.getCharSequence(Integer.toString(0, 36));
        if (charSequence != null) {
            aVar.m28304a(charSequence);
        }
        Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(Integer.toString(1, 36));
        if (alignment != null) {
            aVar.m28309b(alignment);
        }
        Layout.Alignment alignment2 = (Layout.Alignment) bundle.getSerializable(Integer.toString(2, 36));
        if (alignment2 != null) {
            aVar.m28306a(alignment2);
        }
        Bitmap bitmap = (Bitmap) bundle.getParcelable(Integer.toString(3, 36));
        if (bitmap != null) {
            aVar.m28303a(bitmap);
        }
        if (bundle.containsKey(Integer.toString(4, 36)) && bundle.containsKey(Integer.toString(5, 36))) {
            aVar.m28302a(bundle.getInt(Integer.toString(5, 36)), bundle.getFloat(Integer.toString(4, 36)));
        }
        if (bundle.containsKey(Integer.toString(6, 36))) {
            aVar.m28301a(bundle.getInt(Integer.toString(6, 36)));
        }
        if (bundle.containsKey(Integer.toString(7, 36))) {
            aVar.m28307b(bundle.getFloat(Integer.toString(7, 36)));
        }
        if (bundle.containsKey(Integer.toString(8, 36))) {
            aVar.m28308b(bundle.getInt(Integer.toString(8, 36)));
        }
        if (bundle.containsKey(Integer.toString(10, 36)) && bundle.containsKey(Integer.toString(9, 36))) {
            aVar.m28311b(bundle.getInt(Integer.toString(9, 36)), bundle.getFloat(Integer.toString(10, 36)));
        }
        if (bundle.containsKey(Integer.toString(11, 36))) {
            aVar.m28316d(bundle.getFloat(Integer.toString(11, 36)));
        }
        if (bundle.containsKey(Integer.toString(12, 36))) {
            aVar.m28300a(bundle.getFloat(Integer.toString(12, 36)));
        }
        if (bundle.containsKey(Integer.toString(13, 36))) {
            aVar.m28317d(bundle.getInt(Integer.toString(13, 36)));
        }
        if (!bundle.getBoolean(Integer.toString(14, 36), false)) {
            aVar.m28310b();
        }
        if (bundle.containsKey(Integer.toString(15, 36))) {
            aVar.m28313c(bundle.getInt(Integer.toString(15, 36)));
        }
        if (bundle.containsKey(Integer.toString(16, 36))) {
            aVar.m28314c(bundle.getFloat(Integer.toString(16, 36)));
        }
        return aVar.m28305a();
    }
}
