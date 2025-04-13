package com.yandex.mobile.ads.impl;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.annotation.Nullable;
import com.google.apphosting.datastore.testing.DatastoreTestTrace;
import com.yandex.mobile.ads.C4632R;
import com.yandex.mobile.ads.impl.C5751sl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* renamed from: com.yandex.mobile.ads.impl.zg */
/* loaded from: classes3.dex */
public final class C6122zg extends AbstractC4865bh {

    /* renamed from: h */
    private final int f57152h;

    /* renamed from: i */
    private final int f57153i;

    /* renamed from: j */
    private final int f57154j;

    /* renamed from: n */
    @Nullable
    private List<C5751sl> f57158n;

    /* renamed from: o */
    @Nullable
    private List<C5751sl> f57159o;

    /* renamed from: p */
    private int f57160p;

    /* renamed from: q */
    private int f57161q;

    /* renamed from: r */
    private boolean f57162r;

    /* renamed from: s */
    private boolean f57163s;

    /* renamed from: t */
    private byte f57164t;

    /* renamed from: u */
    private byte f57165u;

    /* renamed from: w */
    private boolean f57167w;

    /* renamed from: x */
    private long f57168x;

    /* renamed from: y */
    private static final int[] f57149y = {11, 1, 3, 12, 14, 5, 7, 9};

    /* renamed from: z */
    private static final int[] f57150z = {0, 4, 8, 12, 16, 20, 24, 28};

    /* renamed from: A */
    private static final int[] f57143A = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};

    /* renamed from: B */
    private static final int[] f57144B = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, C4632R.styleable.AppCompatTheme_textAppearanceLargePopupMenu, C4632R.styleable.AppCompatTheme_textAppearanceListItem, C4632R.styleable.AppCompatTheme_textAppearanceListItemSecondary, C4632R.styleable.AppCompatTheme_textAppearanceListItemSmall, C4632R.styleable.AppCompatTheme_textAppearancePopupMenuHeader, C4632R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle, C4632R.styleable.AppCompatTheme_textAppearanceSearchResultTitle, C4632R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu, C4632R.styleable.AppCompatTheme_textColorAlertDialogListItem, C4632R.styleable.AppCompatTheme_textColorSearchUrl, C4632R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, C4632R.styleable.AppCompatTheme_toolbarStyle, C4632R.styleable.AppCompatTheme_tooltipForegroundColor, C4632R.styleable.AppCompatTheme_tooltipFrameBackground, C4632R.styleable.AppCompatTheme_viewInflaterClass, C4632R.styleable.AppCompatTheme_windowActionBar, C4632R.styleable.AppCompatTheme_windowActionBarOverlay, C4632R.styleable.AppCompatTheme_windowActionModeOverlay, C4632R.styleable.AppCompatTheme_windowFixedHeightMajor, C4632R.styleable.AppCompatTheme_windowFixedHeightMinor, C4632R.styleable.AppCompatTheme_windowFixedWidthMajor, 231, 247, 209, 241, 9632};

    /* renamed from: C */
    private static final int[] f57145C = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};

    /* renamed from: D */
    private static final int[] f57146D = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, DatastoreTestTrace.DatastoreAction.ACTION_ID_FIELD_NUMBER, DatastoreTestTrace.FirestoreV1Action.DATABASE_CONTENTS_BEFORE_ACTION_FIELD_NUMBER, DatastoreTestTrace.FirestoreV1Action.MATCHING_DOCUMENTS_FIELD_NUMBER, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};

    /* renamed from: E */
    private static final int[] f57147E = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, C4632R.styleable.AppCompatTheme_windowMinWidthMajor, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};

    /* renamed from: F */
    private static final boolean[] f57148F = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* renamed from: g */
    private final ap0 f57151g = new ap0();

    /* renamed from: l */
    private final ArrayList<a> f57156l = new ArrayList<>();

    /* renamed from: m */
    private a f57157m = new a(0, 4);

    /* renamed from: v */
    private int f57166v = 0;

    /* renamed from: k */
    private final long f57155k = 16000000;

    /* renamed from: com.yandex.mobile.ads.impl.zg$a */
    public static final class a {

        /* renamed from: a */
        private final ArrayList f57169a = new ArrayList();

        /* renamed from: b */
        private final ArrayList f57170b = new ArrayList();

        /* renamed from: c */
        private final StringBuilder f57171c = new StringBuilder();

        /* renamed from: d */
        private int f57172d;

        /* renamed from: e */
        private int f57173e;

        /* renamed from: f */
        private int f57174f;

        /* renamed from: g */
        private int f57175g;

        /* renamed from: h */
        private int f57176h;

        /* renamed from: com.yandex.mobile.ads.impl.zg$a$a, reason: collision with other inner class name */
        public static class C7021a {

            /* renamed from: a */
            public final int f57177a;

            /* renamed from: b */
            public final boolean f57178b;

            /* renamed from: c */
            public int f57179c;

            public C7021a(int i2, int i3, boolean z) {
                this.f57177a = i2;
                this.f57178b = z;
                this.f57179c = i3;
            }
        }

        public a(int i2, int i3) {
            m30181b(i2);
            this.f57176h = i3;
        }

        /* renamed from: d */
        public final void m30185d(int i2) {
            this.f57176h = i2;
        }

        /* renamed from: b */
        public final void m30181b(int i2) {
            this.f57175g = i2;
            this.f57169a.clear();
            this.f57170b.clear();
            this.f57171c.setLength(0);
            this.f57172d = 15;
            this.f57173e = 0;
            this.f57174f = 0;
        }

        /* renamed from: c */
        public final boolean m30183c() {
            return this.f57169a.isEmpty() && this.f57170b.isEmpty() && this.f57171c.length() == 0;
        }

        /* renamed from: d */
        public final void m30184d() {
            this.f57170b.add(m30174b());
            this.f57171c.setLength(0);
            this.f57169a.clear();
            int min = Math.min(this.f57176h, this.f57172d);
            while (this.f57170b.size() >= min) {
                this.f57170b.remove(0);
            }
        }

        /* renamed from: a */
        public final void m30180a(boolean z, int i2) {
            this.f57169a.add(new C7021a(i2, this.f57171c.length(), z));
        }

        /* renamed from: a */
        public final void m30178a() {
            int length = this.f57171c.length();
            if (length > 0) {
                this.f57171c.delete(length - 1, length);
                for (int size = this.f57169a.size() - 1; size >= 0; size--) {
                    C7021a c7021a = (C7021a) this.f57169a.get(size);
                    int i2 = c7021a.f57179c;
                    if (i2 != length) {
                        return;
                    }
                    c7021a.f57179c = i2 - 1;
                }
            }
        }

        /* renamed from: c */
        public final void m30182c(int i2) {
            this.f57175g = i2;
        }

        /* renamed from: b */
        private SpannableString m30174b() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f57171c);
            int length = spannableStringBuilder.length();
            int i2 = 0;
            int i3 = -1;
            int i4 = -1;
            int i5 = 0;
            int i6 = -1;
            boolean z = false;
            int i7 = -1;
            while (i2 < this.f57169a.size()) {
                C7021a c7021a = (C7021a) this.f57169a.get(i2);
                boolean z2 = c7021a.f57178b;
                int i8 = c7021a.f57177a;
                if (i8 != 8) {
                    boolean z3 = i8 == 7;
                    if (i8 != 7) {
                        i7 = C6122zg.f57143A[i8];
                    }
                    z = z3;
                }
                int i9 = c7021a.f57179c;
                i2++;
                if (i9 != (i2 < this.f57169a.size() ? ((C7021a) this.f57169a.get(i2)).f57179c : length)) {
                    if (i3 != -1 && !z2) {
                        spannableStringBuilder.setSpan(new UnderlineSpan(), i3, i9, 33);
                        i3 = -1;
                    } else if (i3 == -1 && z2) {
                        i3 = i9;
                    }
                    if (i4 != -1 && !z) {
                        spannableStringBuilder.setSpan(new StyleSpan(2), i4, i9, 33);
                        i4 = -1;
                    } else if (i4 == -1 && z) {
                        i4 = i9;
                    }
                    if (i7 != i6) {
                        if (i6 != -1) {
                            spannableStringBuilder.setSpan(new ForegroundColorSpan(i6), i5, i9, 33);
                        }
                        i5 = i9;
                        i6 = i7;
                    }
                }
            }
            if (i3 != -1 && i3 != length) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i3, length, 33);
            }
            if (i4 != -1 && i4 != length) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i4, length, 33);
            }
            if (i5 != length && i6 != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(i6), i5, length, 33);
            }
            return new SpannableString(spannableStringBuilder);
        }

        /* renamed from: a */
        public final void m30179a(char c2) {
            if (this.f57171c.length() < 32) {
                this.f57171c.append(c2);
            }
        }

        @Nullable
        /* renamed from: a */
        public final C5751sl m30177a(int i2) {
            float f2;
            int i3 = this.f57173e + this.f57174f;
            int i4 = 32 - i3;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i5 = 0; i5 < this.f57170b.size(); i5++) {
                CharSequence charSequence = (CharSequence) this.f57170b.get(i5);
                int i6 = s91.f54530a;
                if (charSequence.length() > i4) {
                    charSequence = charSequence.subSequence(0, i4);
                }
                spannableStringBuilder.append(charSequence);
                spannableStringBuilder.append('\n');
            }
            SpannableString m30174b = m30174b();
            int i7 = s91.f54530a;
            int length = m30174b.length();
            CharSequence charSequence2 = m30174b;
            if (length > i4) {
                charSequence2 = m30174b.subSequence(0, i4);
            }
            spannableStringBuilder.append(charSequence2);
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int length2 = i4 - spannableStringBuilder.length();
            int i8 = i3 - length2;
            if (i2 == Integer.MIN_VALUE) {
                if (this.f57175g != 2 || (Math.abs(i8) >= 3 && length2 >= 0)) {
                    i2 = (this.f57175g != 2 || i8 <= 0) ? 0 : 2;
                } else {
                    i2 = 1;
                }
            }
            if (i2 != 1) {
                if (i2 == 2) {
                    i3 = 32 - length2;
                }
                f2 = ((i3 / 32.0f) * 0.8f) + 0.1f;
            } else {
                f2 = 0.5f;
            }
            int i9 = this.f57172d;
            if (i9 > 7) {
                i9 = (i9 - 15) - 2;
            } else if (this.f57175g == 1) {
                i9 -= this.f57176h - 1;
            }
            return new C5751sl.a().m28304a(spannableStringBuilder).m28309b(Layout.Alignment.ALIGN_NORMAL).m28302a(1, i9).m28307b(f2).m28308b(i2).m28305a();
        }
    }

    public C6122zg(int i2, String str) {
        this.f57152h = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i2 == 1) {
            this.f57154j = 0;
            this.f57153i = 0;
        } else if (i2 == 2) {
            this.f57154j = 1;
            this.f57153i = 0;
        } else if (i2 == 3) {
            this.f57154j = 0;
            this.f57153i = 1;
        } else if (i2 != 4) {
            d90.m23842d("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            this.f57154j = 0;
            this.f57153i = 0;
        } else {
            this.f57154j = 1;
            this.f57153i = 1;
        }
        m30168a(0);
        m30171k();
        this.f57167w = true;
        this.f57168x = -9223372036854775807L;
    }

    /* renamed from: j */
    private ArrayList m30170j() {
        int size = this.f57156l.size();
        ArrayList arrayList = new ArrayList(size);
        int i2 = 2;
        for (int i3 = 0; i3 < size; i3++) {
            C5751sl m30177a = this.f57156l.get(i3).m30177a(Integer.MIN_VALUE);
            arrayList.add(m30177a);
            if (m30177a != null) {
                i2 = Math.min(i2, m30177a.f54725i);
            }
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i4 = 0; i4 < size; i4++) {
            C5751sl c5751sl = (C5751sl) arrayList.get(i4);
            if (c5751sl != null) {
                if (c5751sl.f54725i != i2) {
                    c5751sl = this.f57156l.get(i4).m30177a(i2);
                    Objects.requireNonNull(c5751sl);
                }
                arrayList2.add(c5751sl);
            }
        }
        return arrayList2;
    }

    /* renamed from: k */
    private void m30171k() {
        this.f57157m.m30181b(this.f57160p);
        this.f57156l.clear();
        this.f57156l.add(this.f57157m);
    }

    /* JADX WARN: Removed duplicated region for block: B:199:0x0015 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008f A[SYNTHETIC] */
    @Override // com.yandex.mobile.ads.impl.AbstractC4865bh
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo22503b(com.yandex.mobile.ads.impl.a51 r14) {
        /*
            Method dump skipped, instructions count: 718
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C6122zg.mo22503b(com.yandex.mobile.ads.impl.a51):void");
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC4865bh
    /* renamed from: c */
    public final w41 mo22504c() {
        List<C5751sl> list = this.f57158n;
        this.f57159o = list;
        Objects.requireNonNull(list);
        return new C4922ch(list);
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC4865bh, com.yandex.mobile.ads.impl.InterfaceC5597pm
    @Nullable
    /* renamed from: e */
    public final b51 mo22816a() throws y41 {
        b51 m22824f;
        b51 mo22816a = super.mo22816a();
        if (mo22816a != null) {
            return mo22816a;
        }
        if (!((this.f57155k == -9223372036854775807L || this.f57168x == -9223372036854775807L || m22825g() - this.f57168x < this.f57155k) ? false : true) || (m22824f = m22824f()) == null) {
            return null;
        }
        this.f57158n = Collections.emptyList();
        this.f57168x = -9223372036854775807L;
        m22824f.m22725a(m22825g(), mo22504c(), Long.MAX_VALUE);
        return m22824f;
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC4865bh, com.yandex.mobile.ads.impl.InterfaceC5597pm
    public final void flush() {
        super.flush();
        this.f57158n = null;
        this.f57159o = null;
        m30168a(0);
        this.f57161q = 4;
        this.f57157m.m30185d(4);
        m30171k();
        this.f57162r = false;
        this.f57163s = false;
        this.f57164t = (byte) 0;
        this.f57165u = (byte) 0;
        this.f57166v = 0;
        this.f57167w = true;
        this.f57168x = -9223372036854775807L;
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC4865bh
    /* renamed from: h */
    public final boolean mo22505h() {
        return this.f57158n != this.f57159o;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5597pm
    public final void release() {
    }

    /* renamed from: a */
    private void m30168a(int i2) {
        int i3 = this.f57160p;
        if (i3 == i2) {
            return;
        }
        this.f57160p = i2;
        if (i2 == 3) {
            for (int i4 = 0; i4 < this.f57156l.size(); i4++) {
                this.f57156l.get(i4).m30182c(i2);
            }
            return;
        }
        m30171k();
        if (i3 == 3 || i2 == 1 || i2 == 0) {
            this.f57158n = Collections.emptyList();
        }
    }
}
