package androidx.core.text;

import androidx.core.text.TextUtilsCompat;
import java.util.Locale;

/* loaded from: classes.dex */
public final class TextDirectionHeuristicsCompat {

    /* renamed from: a */
    public static final TextDirectionHeuristicCompat f3541a = new TextDirectionHeuristicInternal(null, false);

    /* renamed from: b */
    public static final TextDirectionHeuristicCompat f3542b = new TextDirectionHeuristicInternal(null, true);

    /* renamed from: c */
    public static final TextDirectionHeuristicCompat f3543c;

    /* renamed from: d */
    public static final TextDirectionHeuristicCompat f3544d;

    public static class AnyStrong implements TextDirectionAlgorithm {

        /* renamed from: a */
        public final boolean f3545a;

        @Override // androidx.core.text.TextDirectionHeuristicsCompat.TextDirectionAlgorithm
        /* renamed from: a */
        public int mo2016a(CharSequence charSequence, int i2, int i3) {
            int i4 = i3 + i2;
            boolean z = false;
            while (true) {
                char c2 = 2;
                if (i2 >= i4) {
                    if (z) {
                        return this.f3545a ? 1 : 0;
                    }
                    return 2;
                }
                byte directionality = Character.getDirectionality(charSequence.charAt(i2));
                TextDirectionHeuristicCompat textDirectionHeuristicCompat = TextDirectionHeuristicsCompat.f3541a;
                if (directionality == 0) {
                    c2 = 1;
                } else if (directionality == 1 || directionality == 2) {
                    c2 = 0;
                }
                if (c2 != 0) {
                    if (c2 != 1) {
                        continue;
                        i2++;
                    } else if (!this.f3545a) {
                        return 1;
                    }
                } else if (this.f3545a) {
                    return 0;
                }
                z = true;
                i2++;
            }
        }
    }

    public static class FirstStrong implements TextDirectionAlgorithm {

        /* renamed from: a */
        public static final FirstStrong f3546a = new FirstStrong();

        @Override // androidx.core.text.TextDirectionHeuristicsCompat.TextDirectionAlgorithm
        /* renamed from: a */
        public int mo2016a(CharSequence charSequence, int i2, int i3) {
            int i4 = i3 + i2;
            int i5 = 2;
            while (i2 < i4 && i5 == 2) {
                byte directionality = Character.getDirectionality(charSequence.charAt(i2));
                TextDirectionHeuristicCompat textDirectionHeuristicCompat = TextDirectionHeuristicsCompat.f3541a;
                if (directionality != 0) {
                    if (directionality != 1 && directionality != 2) {
                        switch (directionality) {
                            case 14:
                            case 15:
                                break;
                            case 16:
                            case 17:
                                break;
                            default:
                                i5 = 2;
                                break;
                        }
                        i2++;
                    }
                    i5 = 0;
                    i2++;
                }
                i5 = 1;
                i2++;
            }
            return i5;
        }
    }

    public interface TextDirectionAlgorithm {
        /* renamed from: a */
        int mo2016a(CharSequence charSequence, int i2, int i3);
    }

    public static abstract class TextDirectionHeuristicImpl implements TextDirectionHeuristicCompat {

        /* renamed from: a */
        public final TextDirectionAlgorithm f3547a;

        public TextDirectionHeuristicImpl(TextDirectionAlgorithm textDirectionAlgorithm) {
            this.f3547a = textDirectionAlgorithm;
        }

        @Override // androidx.core.text.TextDirectionHeuristicCompat
        /* renamed from: a */
        public boolean mo2015a(CharSequence charSequence, int i2, int i3) {
            if (i2 < 0 || i3 < 0 || charSequence.length() - i3 < i2) {
                throw new IllegalArgumentException();
            }
            TextDirectionAlgorithm textDirectionAlgorithm = this.f3547a;
            if (textDirectionAlgorithm == null) {
                return mo2017b();
            }
            int mo2016a = textDirectionAlgorithm.mo2016a(charSequence, i2, i3);
            if (mo2016a == 0) {
                return true;
            }
            if (mo2016a != 1) {
                return mo2017b();
            }
            return false;
        }

        /* renamed from: b */
        public abstract boolean mo2017b();
    }

    public static class TextDirectionHeuristicInternal extends TextDirectionHeuristicImpl {

        /* renamed from: b */
        public final boolean f3548b;

        public TextDirectionHeuristicInternal(TextDirectionAlgorithm textDirectionAlgorithm, boolean z) {
            super(textDirectionAlgorithm);
            this.f3548b = z;
        }

        @Override // androidx.core.text.TextDirectionHeuristicsCompat.TextDirectionHeuristicImpl
        /* renamed from: b */
        public boolean mo2017b() {
            return this.f3548b;
        }
    }

    public static class TextDirectionHeuristicLocale extends TextDirectionHeuristicImpl {
        public TextDirectionHeuristicLocale() {
            super(null);
        }

        @Override // androidx.core.text.TextDirectionHeuristicsCompat.TextDirectionHeuristicImpl
        /* renamed from: b */
        public boolean mo2017b() {
            Locale locale = Locale.getDefault();
            int i2 = TextUtilsCompat.f3549a;
            return TextUtilsCompat.Api17Impl.m2018a(locale) == 1;
        }
    }

    static {
        FirstStrong firstStrong = FirstStrong.f3546a;
        f3543c = new TextDirectionHeuristicInternal(firstStrong, false);
        f3544d = new TextDirectionHeuristicInternal(firstStrong, true);
    }
}
