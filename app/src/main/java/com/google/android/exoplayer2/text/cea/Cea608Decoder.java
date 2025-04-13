package com.google.android.exoplayer2.text.cea;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.google.android.exoplayer2.text.SubtitleOutputBuffer;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import com.google.apphosting.datastore.testing.DatastoreTestTrace;
import com.yandex.mobile.ads.C4632R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class Cea608Decoder extends CeaDecoder {

    /* renamed from: h */
    public final int f13520h;

    /* renamed from: i */
    public final int f13521i;

    /* renamed from: j */
    public final int f13522j;

    /* renamed from: k */
    public final long f13523k;

    /* renamed from: n */
    @Nullable
    public List<Cue> f13526n;

    /* renamed from: o */
    @Nullable
    public List<Cue> f13527o;

    /* renamed from: p */
    public int f13528p;

    /* renamed from: q */
    public int f13529q;

    /* renamed from: r */
    public boolean f13530r;

    /* renamed from: s */
    public boolean f13531s;

    /* renamed from: t */
    public byte f13532t;

    /* renamed from: u */
    public byte f13533u;

    /* renamed from: w */
    public boolean f13535w;

    /* renamed from: x */
    public long f13536x;

    /* renamed from: y */
    public static final int[] f13517y = {11, 1, 3, 12, 14, 5, 7, 9};

    /* renamed from: z */
    public static final int[] f13518z = {0, 4, 8, 12, 16, 20, 24, 28};

    /* renamed from: A */
    public static final int[] f13511A = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};

    /* renamed from: B */
    public static final int[] f13512B = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, C4632R.styleable.AppCompatTheme_textAppearanceLargePopupMenu, C4632R.styleable.AppCompatTheme_textAppearanceListItem, C4632R.styleable.AppCompatTheme_textAppearanceListItemSecondary, C4632R.styleable.AppCompatTheme_textAppearanceListItemSmall, C4632R.styleable.AppCompatTheme_textAppearancePopupMenuHeader, C4632R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle, C4632R.styleable.AppCompatTheme_textAppearanceSearchResultTitle, C4632R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu, C4632R.styleable.AppCompatTheme_textColorAlertDialogListItem, C4632R.styleable.AppCompatTheme_textColorSearchUrl, C4632R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, C4632R.styleable.AppCompatTheme_toolbarStyle, C4632R.styleable.AppCompatTheme_tooltipForegroundColor, C4632R.styleable.AppCompatTheme_tooltipFrameBackground, C4632R.styleable.AppCompatTheme_viewInflaterClass, C4632R.styleable.AppCompatTheme_windowActionBar, C4632R.styleable.AppCompatTheme_windowActionBarOverlay, C4632R.styleable.AppCompatTheme_windowActionModeOverlay, C4632R.styleable.AppCompatTheme_windowFixedHeightMajor, C4632R.styleable.AppCompatTheme_windowFixedHeightMinor, C4632R.styleable.AppCompatTheme_windowFixedWidthMajor, 231, 247, 209, 241, 9632};

    /* renamed from: C */
    public static final int[] f13513C = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};

    /* renamed from: D */
    public static final int[] f13514D = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, DatastoreTestTrace.DatastoreAction.ACTION_ID_FIELD_NUMBER, DatastoreTestTrace.FirestoreV1Action.DATABASE_CONTENTS_BEFORE_ACTION_FIELD_NUMBER, DatastoreTestTrace.FirestoreV1Action.MATCHING_DOCUMENTS_FIELD_NUMBER, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};

    /* renamed from: E */
    public static final int[] f13515E = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, C4632R.styleable.AppCompatTheme_windowMinWidthMajor, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};

    /* renamed from: F */
    public static final boolean[] f13516F = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* renamed from: g */
    public final ParsableByteArray f13519g = new ParsableByteArray();

    /* renamed from: l */
    public final ArrayList<CueBuilder> f13524l = new ArrayList<>();

    /* renamed from: m */
    public CueBuilder f13525m = new CueBuilder(0, 4);

    /* renamed from: v */
    public int f13534v = 0;

    public static final class CueBuilder {

        /* renamed from: a */
        public final List<CueStyle> f13537a = new ArrayList();

        /* renamed from: b */
        public final List<SpannableString> f13538b = new ArrayList();

        /* renamed from: c */
        public final StringBuilder f13539c = new StringBuilder();

        /* renamed from: d */
        public int f13540d;

        /* renamed from: e */
        public int f13541e;

        /* renamed from: f */
        public int f13542f;

        /* renamed from: g */
        public int f13543g;

        /* renamed from: h */
        public int f13544h;

        public static class CueStyle {

            /* renamed from: a */
            public final int f13545a;

            /* renamed from: b */
            public final boolean f13546b;

            /* renamed from: c */
            public int f13547c;

            public CueStyle(int i2, boolean z, int i3) {
                this.f13545a = i2;
                this.f13546b = z;
                this.f13547c = i3;
            }
        }

        public CueBuilder(int i2, int i3) {
            m7209f(i2);
            this.f13544h = i3;
        }

        /* renamed from: a */
        public void m7204a(char c2) {
            if (this.f13539c.length() < 32) {
                this.f13539c.append(c2);
            }
        }

        /* renamed from: b */
        public void m7205b() {
            int length = this.f13539c.length();
            if (length > 0) {
                this.f13539c.delete(length - 1, length);
                for (int size = this.f13537a.size() - 1; size >= 0; size--) {
                    CueStyle cueStyle = this.f13537a.get(size);
                    int i2 = cueStyle.f13547c;
                    if (i2 != length) {
                        return;
                    }
                    cueStyle.f13547c = i2 - 1;
                }
            }
        }

        @Nullable
        /* renamed from: c */
        public Cue m7206c(int i2) {
            float f2;
            int i3 = this.f13541e + this.f13542f;
            int i4 = 32 - i3;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i5 = 0; i5 < this.f13538b.size(); i5++) {
                SpannableString spannableString = this.f13538b.get(i5);
                int i6 = Util.f14736a;
                if (spannableString.length() > i4) {
                    spannableString = spannableString.subSequence(0, i4);
                }
                spannableStringBuilder.append(spannableString);
                spannableStringBuilder.append('\n');
            }
            SpannableString m7207d = m7207d();
            int i7 = Util.f14736a;
            int length = m7207d.length();
            CharSequence charSequence = m7207d;
            if (length > i4) {
                charSequence = m7207d.subSequence(0, i4);
            }
            spannableStringBuilder.append(charSequence);
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int length2 = i4 - spannableStringBuilder.length();
            int i8 = i3 - length2;
            if (i2 == Integer.MIN_VALUE) {
                i2 = (this.f13543g != 2 || (Math.abs(i8) >= 3 && length2 >= 0)) ? (this.f13543g != 2 || i8 <= 0) ? 0 : 2 : 1;
            }
            if (i2 != 1) {
                if (i2 == 2) {
                    i3 = 32 - length2;
                }
                f2 = ((i3 / 32.0f) * 0.8f) + 0.1f;
            } else {
                f2 = 0.5f;
            }
            int i9 = this.f13540d;
            if (i9 > 7) {
                i9 = (i9 - 15) - 2;
            } else if (this.f13543g == 1) {
                i9 -= this.f13544h - 1;
            }
            Cue.Builder builder = new Cue.Builder();
            builder.f13454a = spannableStringBuilder;
            builder.f13456c = Layout.Alignment.ALIGN_NORMAL;
            builder.f13458e = i9;
            builder.f13459f = 1;
            builder.f13461h = f2;
            builder.f13462i = i2;
            return builder.m7178a();
        }

        /* renamed from: d */
        public final SpannableString m7207d() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f13539c);
            int length = spannableStringBuilder.length();
            int i2 = 0;
            int i3 = -1;
            int i4 = -1;
            int i5 = 0;
            int i6 = -1;
            boolean z = false;
            int i7 = -1;
            while (i2 < this.f13537a.size()) {
                CueStyle cueStyle = this.f13537a.get(i2);
                boolean z2 = cueStyle.f13546b;
                int i8 = cueStyle.f13545a;
                if (i8 != 8) {
                    boolean z3 = i8 == 7;
                    if (i8 != 7) {
                        i7 = Cea608Decoder.f13511A[i8];
                    }
                    z = z3;
                }
                int i9 = cueStyle.f13547c;
                i2++;
                if (i9 != (i2 < this.f13537a.size() ? this.f13537a.get(i2).f13547c : length)) {
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

        /* renamed from: e */
        public boolean m7208e() {
            return this.f13537a.isEmpty() && this.f13538b.isEmpty() && this.f13539c.length() == 0;
        }

        /* renamed from: f */
        public void m7209f(int i2) {
            this.f13543g = i2;
            this.f13537a.clear();
            this.f13538b.clear();
            this.f13539c.setLength(0);
            this.f13540d = 15;
            this.f13541e = 0;
            this.f13542f = 0;
        }
    }

    public Cea608Decoder(String str, int i2, long j2) {
        this.f13523k = j2 > 0 ? j2 * 1000 : -9223372036854775807L;
        this.f13520h = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i2 == 1) {
            this.f13522j = 0;
            this.f13521i = 0;
        } else if (i2 == 2) {
            this.f13522j = 1;
            this.f13521i = 0;
        } else if (i2 == 3) {
            this.f13522j = 0;
            this.f13521i = 1;
        } else if (i2 != 4) {
            Log.w("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            this.f13522j = 0;
            this.f13521i = 0;
        } else {
            this.f13522j = 1;
            this.f13521i = 1;
        }
        m7202l(0);
        m7201k();
        this.f13535w = true;
        this.f13536x = -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.text.cea.CeaDecoder
    /* renamed from: e */
    public Subtitle mo7196e() {
        List<Cue> list = this.f13526n;
        this.f13527o = list;
        Objects.requireNonNull(list);
        return new CeaSubtitle(list);
    }

    /* JADX WARN: Removed duplicated region for block: B:203:0x0015 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008f A[SYNTHETIC] */
    @Override // com.google.android.exoplayer2.text.cea.CeaDecoder
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo7197f(com.google.android.exoplayer2.text.SubtitleInputBuffer r14) {
        /*
            Method dump skipped, instructions count: 758
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.cea.Cea608Decoder.mo7197f(com.google.android.exoplayer2.text.SubtitleInputBuffer):void");
    }

    @Override // com.google.android.exoplayer2.text.cea.CeaDecoder, com.google.android.exoplayer2.decoder.Decoder
    public void flush() {
        super.flush();
        this.f13526n = null;
        this.f13527o = null;
        m7202l(0);
        m7203m(4);
        m7201k();
        this.f13530r = false;
        this.f13531s = false;
        this.f13532t = (byte) 0;
        this.f13533u = (byte) 0;
        this.f13534v = 0;
        this.f13535w = true;
        this.f13536x = -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.text.cea.CeaDecoder, com.google.android.exoplayer2.decoder.Decoder
    @Nullable
    /* renamed from: g */
    public SubtitleOutputBuffer mo6245b() throws SubtitleDecoderException {
        SubtitleOutputBuffer pollFirst;
        SubtitleOutputBuffer mo6245b = super.mo6245b();
        if (mo6245b != null) {
            return mo6245b;
        }
        long j2 = this.f13523k;
        boolean z = false;
        if (j2 != -9223372036854775807L) {
            long j3 = this.f13536x;
            if (j3 != -9223372036854775807L && this.f13600e - j3 >= j2) {
                z = true;
            }
        }
        if (!z || (pollFirst = this.f13597b.pollFirst()) == null) {
            return null;
        }
        List<Cue> emptyList = Collections.emptyList();
        this.f13526n = emptyList;
        this.f13536x = -9223372036854775807L;
        this.f13527o = emptyList;
        Objects.requireNonNull(emptyList);
        pollFirst.m7190n(this.f13600e, new CeaSubtitle(emptyList), Long.MAX_VALUE);
        return pollFirst;
    }

    @Override // com.google.android.exoplayer2.decoder.Decoder
    public String getName() {
        return "Cea608Decoder";
    }

    @Override // com.google.android.exoplayer2.text.cea.CeaDecoder
    /* renamed from: h */
    public boolean mo7199h() {
        return this.f13526n != this.f13527o;
    }

    /* renamed from: j */
    public final List<Cue> m7200j() {
        int size = this.f13524l.size();
        ArrayList arrayList = new ArrayList(size);
        int i2 = 2;
        for (int i3 = 0; i3 < size; i3++) {
            Cue m7206c = this.f13524l.get(i3).m7206c(Integer.MIN_VALUE);
            arrayList.add(m7206c);
            if (m7206c != null) {
                i2 = Math.min(i2, m7206c.f13445j);
            }
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i4 = 0; i4 < size; i4++) {
            Cue cue = (Cue) arrayList.get(i4);
            if (cue != null) {
                if (cue.f13445j != i2) {
                    cue = this.f13524l.get(i4).m7206c(i2);
                    Objects.requireNonNull(cue);
                }
                arrayList2.add(cue);
            }
        }
        return arrayList2;
    }

    /* renamed from: k */
    public final void m7201k() {
        this.f13525m.m7209f(this.f13528p);
        this.f13524l.clear();
        this.f13524l.add(this.f13525m);
    }

    /* renamed from: l */
    public final void m7202l(int i2) {
        int i3 = this.f13528p;
        if (i3 == i2) {
            return;
        }
        this.f13528p = i2;
        if (i2 == 3) {
            for (int i4 = 0; i4 < this.f13524l.size(); i4++) {
                this.f13524l.get(i4).f13543g = i2;
            }
            return;
        }
        m7201k();
        if (i3 == 3 || i2 == 1 || i2 == 0) {
            this.f13526n = Collections.emptyList();
        }
    }

    /* renamed from: m */
    public final void m7203m(int i2) {
        this.f13529q = i2;
        this.f13525m.f13544h = i2;
    }

    @Override // com.google.android.exoplayer2.text.cea.CeaDecoder, com.google.android.exoplayer2.decoder.Decoder
    public void release() {
    }
}
