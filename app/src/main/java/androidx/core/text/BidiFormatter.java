package androidx.core.text;

import android.text.SpannableStringBuilder;
import androidx.core.text.TextDirectionHeuristicsCompat;
import androidx.core.text.TextUtilsCompat;
import java.util.Locale;

/* loaded from: classes.dex */
public final class BidiFormatter {

    /* renamed from: d */
    public static final TextDirectionHeuristicCompat f3511d;

    /* renamed from: e */
    public static final String f3512e;

    /* renamed from: f */
    public static final String f3513f;

    /* renamed from: g */
    public static final BidiFormatter f3514g;

    /* renamed from: h */
    public static final BidiFormatter f3515h;

    /* renamed from: a */
    public final boolean f3516a;

    /* renamed from: b */
    public final int f3517b;

    /* renamed from: c */
    public final TextDirectionHeuristicCompat f3518c;

    public static final class Builder {

        /* renamed from: a */
        public boolean f3519a;

        /* renamed from: b */
        public int f3520b;

        /* renamed from: c */
        public TextDirectionHeuristicCompat f3521c;

        public Builder() {
            Locale locale = Locale.getDefault();
            TextDirectionHeuristicCompat textDirectionHeuristicCompat = BidiFormatter.f3511d;
            int i2 = TextUtilsCompat.f3549a;
            this.f3519a = TextUtilsCompat.Api17Impl.m2018a(locale) == 1;
            this.f3521c = BidiFormatter.f3511d;
            this.f3520b = 2;
        }
    }

    public static class DirectionalityEstimator {

        /* renamed from: f */
        public static final byte[] f3522f = new byte[1792];

        /* renamed from: a */
        public final CharSequence f3523a;

        /* renamed from: b */
        public final boolean f3524b;

        /* renamed from: c */
        public final int f3525c;

        /* renamed from: d */
        public int f3526d;

        /* renamed from: e */
        public char f3527e;

        static {
            for (int i2 = 0; i2 < 1792; i2++) {
                f3522f[i2] = Character.getDirectionality(i2);
            }
        }

        public DirectionalityEstimator(CharSequence charSequence, boolean z) {
            this.f3523a = charSequence;
            this.f3524b = z;
            this.f3525c = charSequence.length();
        }

        /* renamed from: a */
        public byte m2006a() {
            char charAt;
            char charAt2;
            char charAt3 = this.f3523a.charAt(this.f3526d - 1);
            this.f3527e = charAt3;
            if (Character.isLowSurrogate(charAt3)) {
                int codePointBefore = Character.codePointBefore(this.f3523a, this.f3526d);
                this.f3526d -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.f3526d--;
            char c2 = this.f3527e;
            byte directionality = c2 < 1792 ? f3522f[c2] : Character.getDirectionality(c2);
            if (!this.f3524b) {
                return directionality;
            }
            char c3 = this.f3527e;
            if (c3 != '>') {
                if (c3 != ';') {
                    return directionality;
                }
                int i2 = this.f3526d;
                do {
                    int i3 = this.f3526d;
                    if (i3 <= 0) {
                        break;
                    }
                    CharSequence charSequence = this.f3523a;
                    int i4 = i3 - 1;
                    this.f3526d = i4;
                    charAt = charSequence.charAt(i4);
                    this.f3527e = charAt;
                    if (charAt == '&') {
                        return (byte) 12;
                    }
                } while (charAt != ';');
                this.f3526d = i2;
                this.f3527e = ';';
                return (byte) 13;
            }
            int i5 = this.f3526d;
            while (true) {
                int i6 = this.f3526d;
                if (i6 <= 0) {
                    break;
                }
                CharSequence charSequence2 = this.f3523a;
                int i7 = i6 - 1;
                this.f3526d = i7;
                char charAt4 = charSequence2.charAt(i7);
                this.f3527e = charAt4;
                if (charAt4 == '<') {
                    break;
                }
                if (charAt4 == '>') {
                    break;
                }
                if (charAt4 == '\"' || charAt4 == '\'') {
                    do {
                        int i8 = this.f3526d;
                        if (i8 > 0) {
                            CharSequence charSequence3 = this.f3523a;
                            int i9 = i8 - 1;
                            this.f3526d = i9;
                            charAt2 = charSequence3.charAt(i9);
                            this.f3527e = charAt2;
                        }
                    } while (charAt2 != charAt4);
                }
            }
            this.f3526d = i5;
            this.f3527e = '>';
            return (byte) 13;
        }
    }

    static {
        TextDirectionHeuristicCompat textDirectionHeuristicCompat = TextDirectionHeuristicsCompat.f3543c;
        f3511d = textDirectionHeuristicCompat;
        f3512e = Character.toString((char) 8206);
        f3513f = Character.toString((char) 8207);
        f3514g = new BidiFormatter(false, 2, textDirectionHeuristicCompat);
        f3515h = new BidiFormatter(true, 2, textDirectionHeuristicCompat);
    }

    public BidiFormatter(boolean z, int i2, TextDirectionHeuristicCompat textDirectionHeuristicCompat) {
        this.f3516a = z;
        this.f3517b = i2;
        this.f3518c = textDirectionHeuristicCompat;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x00f3, code lost:
    
        if (r3 != r5) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:?, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:?, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00f1, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00d9, code lost:
    
        if (r3 != 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00dc, code lost:
    
        if (r4 == 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00fa, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00e2, code lost:
    
        if (r0.f3526d <= 0) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x00e8, code lost:
    
        switch(r0.m2006a()) {
            case 14: goto L107;
            case 15: goto L107;
            case 16: goto L106;
            case 17: goto L106;
            case 18: goto L105;
            default: goto L111;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x00ec, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x00ef, code lost:
    
        if (r3 != r5) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x00f7, code lost:
    
        r5 = r5 - 1;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m2002a(java.lang.CharSequence r12) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.text.BidiFormatter.m2002a(java.lang.CharSequence):int");
    }

    /* renamed from: b */
    public static int m2003b(CharSequence charSequence) {
        DirectionalityEstimator directionalityEstimator = new DirectionalityEstimator(charSequence, false);
        directionalityEstimator.f3526d = directionalityEstimator.f3525c;
        int i2 = 0;
        int i3 = 0;
        while (directionalityEstimator.f3526d > 0) {
            byte m2006a = directionalityEstimator.m2006a();
            if (m2006a != 0) {
                if (m2006a == 1 || m2006a == 2) {
                    if (i2 == 0) {
                        return 1;
                    }
                    if (i3 == 0) {
                        i3 = i2;
                    }
                } else if (m2006a != 9) {
                    switch (m2006a) {
                        case 14:
                        case 15:
                            if (i3 == i2) {
                                return -1;
                            }
                            i2--;
                            break;
                        case 16:
                        case 17:
                            if (i3 == i2) {
                                return 1;
                            }
                            i2--;
                            break;
                        case 18:
                            i2++;
                            break;
                        default:
                            if (i3 != 0) {
                                break;
                            } else {
                                i3 = i2;
                                break;
                            }
                    }
                } else {
                    continue;
                }
            } else {
                if (i2 == 0) {
                    return -1;
                }
                if (i3 == 0) {
                    i3 = i2;
                }
            }
        }
        return 0;
    }

    /* renamed from: c */
    public static BidiFormatter m2004c() {
        Builder builder = new Builder();
        int i2 = builder.f3520b;
        return (i2 == 2 && builder.f3521c == f3511d) ? builder.f3519a ? f3515h : f3514g : new BidiFormatter(builder.f3519a, i2, builder.f3521c);
    }

    /* renamed from: d */
    public CharSequence m2005d(CharSequence charSequence, TextDirectionHeuristicCompat textDirectionHeuristicCompat, boolean z) {
        if (charSequence == null) {
            return null;
        }
        boolean mo2015a = textDirectionHeuristicCompat.mo2015a(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String str = "";
        if (((this.f3517b & 2) != 0) && z) {
            boolean mo2015a2 = ((TextDirectionHeuristicsCompat.TextDirectionHeuristicImpl) (mo2015a ? TextDirectionHeuristicsCompat.f3542b : TextDirectionHeuristicsCompat.f3541a)).mo2015a(charSequence, 0, charSequence.length());
            spannableStringBuilder.append((CharSequence) ((this.f3516a || !(mo2015a2 || m2002a(charSequence) == 1)) ? (!this.f3516a || (mo2015a2 && m2002a(charSequence) != -1)) ? "" : f3513f : f3512e));
        }
        if (mo2015a != this.f3516a) {
            spannableStringBuilder.append(mo2015a ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z) {
            boolean mo2015a3 = ((TextDirectionHeuristicsCompat.TextDirectionHeuristicImpl) (mo2015a ? TextDirectionHeuristicsCompat.f3542b : TextDirectionHeuristicsCompat.f3541a)).mo2015a(charSequence, 0, charSequence.length());
            if (!this.f3516a && (mo2015a3 || m2003b(charSequence) == 1)) {
                str = f3512e;
            } else if (this.f3516a && (!mo2015a3 || m2003b(charSequence) == -1)) {
                str = f3513f;
            }
            spannableStringBuilder.append((CharSequence) str);
        }
        return spannableStringBuilder;
    }
}
