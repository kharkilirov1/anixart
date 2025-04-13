package com.google.common.base;

import androidx.room.util.C0576a;
import com.google.android.exoplayer2.extractor.C1008a;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import java.util.Arrays;

@GwtCompatible
/* loaded from: classes.dex */
public abstract class CharMatcher implements Predicate<Character> {

    /* renamed from: com.google.common.base.CharMatcher$1 */
    class C15551 extends NegatedFastMatcher {
        @Override // com.google.common.base.CharMatcher.Negated, com.google.common.base.CharMatcher
        public String toString() {
            return null;
        }
    }

    public static final class And extends CharMatcher {

        /* renamed from: b */
        public final CharMatcher f20480b;

        /* renamed from: c */
        public final CharMatcher f20481c;

        public And(CharMatcher charMatcher, CharMatcher charMatcher2) {
            this.f20480b = charMatcher;
            java.util.Objects.requireNonNull(charMatcher2);
            this.f20481c = charMatcher2;
        }

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return apply(ch);
        }

        @Override // com.google.common.base.CharMatcher
        /* renamed from: m */
        public boolean mo11139m(char c2) {
            return this.f20480b.mo11139m(c2) && this.f20481c.mo11139m(c2);
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
            String valueOf = String.valueOf(this.f20480b);
            String valueOf2 = String.valueOf(this.f20481c);
            StringBuilder m4122u = C0576a.m4122u(valueOf2.length() + valueOf.length() + 19, "CharMatcher.and(", valueOf, ", ", valueOf2);
            m4122u.append(")");
            return m4122u.toString();
        }
    }

    public static final class Any extends NamedFastMatcher {

        /* renamed from: c */
        public static final Any f20482c = new Any();

        public Any() {
            super("CharMatcher.any()");
        }

        @Override // com.google.common.base.CharMatcher
        /* renamed from: b */
        public CharMatcher mo11134b(CharMatcher charMatcher) {
            java.util.Objects.requireNonNull(charMatcher);
            return charMatcher;
        }

        @Override // com.google.common.base.CharMatcher
        /* renamed from: f */
        public int mo11136f(CharSequence charSequence) {
            return charSequence.length();
        }

        @Override // com.google.common.base.CharMatcher
        /* renamed from: h */
        public int mo11137h(CharSequence charSequence) {
            return charSequence.length() == 0 ? -1 : 0;
        }

        @Override // com.google.common.base.CharMatcher
        /* renamed from: i */
        public int mo11138i(CharSequence charSequence, int i2) {
            int length = charSequence.length();
            Preconditions.m11189m(i2, length);
            if (i2 == length) {
                return -1;
            }
            return i2;
        }

        @Override // com.google.common.base.CharMatcher
        /* renamed from: m */
        public boolean mo11139m(char c2) {
            return true;
        }

        @Override // com.google.common.base.CharMatcher
        /* renamed from: n */
        public boolean mo11140n(CharSequence charSequence) {
            java.util.Objects.requireNonNull(charSequence);
            return true;
        }

        @Override // com.google.common.base.CharMatcher
        /* renamed from: o */
        public boolean mo11141o(CharSequence charSequence) {
            return charSequence.length() == 0;
        }

        @Override // com.google.common.base.CharMatcher.FastMatcher, com.google.common.base.CharMatcher
        /* renamed from: p */
        public CharMatcher mo11142p() {
            return None.f20494c;
        }

        @Override // com.google.common.base.CharMatcher
        /* renamed from: q */
        public CharMatcher mo11143q(CharMatcher charMatcher) {
            java.util.Objects.requireNonNull(charMatcher);
            return this;
        }
    }

    public static final class AnyOf extends CharMatcher {

        /* renamed from: b */
        public final char[] f20483b;

        public AnyOf(CharSequence charSequence) {
            char[] charArray = charSequence.toString().toCharArray();
            this.f20483b = charArray;
            Arrays.sort(charArray);
        }

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return apply(ch);
        }

        @Override // com.google.common.base.CharMatcher
        /* renamed from: m */
        public boolean mo11139m(char c2) {
            return Arrays.binarySearch(this.f20483b, c2) >= 0;
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
            StringBuilder sb = new StringBuilder("CharMatcher.anyOf(\"");
            for (char c2 : this.f20483b) {
                sb.append(CharMatcher.m11127a(c2));
            }
            sb.append("\")");
            return sb.toString();
        }
    }

    public static final class Ascii extends NamedFastMatcher {

        /* renamed from: c */
        public static final Ascii f20484c = new Ascii();

        public Ascii() {
            super("CharMatcher.ascii()");
        }

        @Override // com.google.common.base.CharMatcher
        /* renamed from: m */
        public boolean mo11139m(char c2) {
            return c2 <= 127;
        }
    }

    @GwtIncompatible
    public static final class BitSetMatcher extends NamedFastMatcher {
        @Override // com.google.common.base.CharMatcher
        /* renamed from: m */
        public boolean mo11139m(char c2) {
            throw null;
        }
    }

    public static final class BreakingWhitespace extends CharMatcher {
        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return apply(ch);
        }

        @Override // com.google.common.base.CharMatcher
        /* renamed from: m */
        public boolean mo11139m(char c2) {
            if (c2 != ' ' && c2 != 133 && c2 != 5760) {
                if (c2 == 8199) {
                    return false;
                }
                if (c2 != 8287 && c2 != 12288 && c2 != 8232 && c2 != 8233) {
                    switch (c2) {
                        case '\t':
                        case '\n':
                        case 11:
                        case '\f':
                        case '\r':
                            break;
                        default:
                            return c2 >= 8192 && c2 <= 8202;
                    }
                }
            }
            return true;
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.breakingWhitespace()";
        }
    }

    public static final class Digit extends RangesMatcher {
        static {
            new Digit();
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public Digit() {
            /*
                r6 = this;
                java.lang.String r0 = "0٠۰߀०০੦૦୦௦౦೦൦෦๐໐༠၀႐០᠐᥆᧐᪀᪐᭐᮰᱀᱐꘠꣐꤀꧐꧰꩐꯰０"
                char[] r1 = r0.toCharArray()
                r2 = 37
                char[] r3 = new char[r2]
                r4 = 0
            Lb:
                if (r4 >= r2) goto L19
                char r5 = r0.charAt(r4)
                int r5 = r5 + 9
                char r5 = (char) r5
                r3[r4] = r5
                int r4 = r4 + 1
                goto Lb
            L19:
                java.lang.String r0 = "CharMatcher.digit()"
                r6.<init>(r0, r1, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.base.CharMatcher.Digit.<init>():void");
        }
    }

    public static abstract class FastMatcher extends CharMatcher {
        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return apply(ch);
        }

        @Override // com.google.common.base.CharMatcher
        /* renamed from: p */
        public CharMatcher mo11142p() {
            return new NegatedFastMatcher(this);
        }
    }

    public static final class ForPredicate extends CharMatcher {
        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        public boolean apply(Character ch) {
            java.util.Objects.requireNonNull(ch);
            throw null;
        }

        @Override // com.google.common.base.CharMatcher
        /* renamed from: d */
        public boolean apply(Character ch) {
            java.util.Objects.requireNonNull(ch);
            throw null;
        }

        @Override // com.google.common.base.CharMatcher
        /* renamed from: m */
        public boolean mo11139m(char c2) {
            throw null;
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.forPredicate(null)";
        }
    }

    public static final class InRange extends FastMatcher {

        /* renamed from: b */
        public final char f20485b;

        /* renamed from: c */
        public final char f20486c;

        public InRange(char c2, char c3) {
            Preconditions.m11178b(c3 >= c2);
            this.f20485b = c2;
            this.f20486c = c3;
        }

        @Override // com.google.common.base.CharMatcher
        /* renamed from: m */
        public boolean mo11139m(char c2) {
            return this.f20485b <= c2 && c2 <= this.f20486c;
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
            String m11127a = CharMatcher.m11127a(this.f20485b);
            String m11127a2 = CharMatcher.m11127a(this.f20486c);
            StringBuilder m4122u = C0576a.m4122u(C0576a.m4106e(m11127a2, C0576a.m4106e(m11127a, 27)), "CharMatcher.inRange('", m11127a, "', '", m11127a2);
            m4122u.append("')");
            return m4122u.toString();
        }
    }

    public static final class Invisible extends RangesMatcher {
        static {
            new Invisible();
        }

        public Invisible() {
            super("CharMatcher.invisible()", "\u0000\u007f\u00ad\u0600\u061c\u06dd\u070f\u08e2\u1680\u180e\u2000\u2028\u205f\u2066\u3000\ud800\ufeff\ufff9".toCharArray(), "  \u00ad\u0605\u061c\u06dd\u070f\u08e2\u1680\u180e\u200f \u2064\u206f\u3000\uf8ff\ufeff\ufffb".toCharArray());
        }
    }

    /* renamed from: com.google.common.base.CharMatcher$Is */
    public static final class C1556Is extends FastMatcher {

        /* renamed from: b */
        public final char f20487b;

        public C1556Is(char c2) {
            this.f20487b = c2;
        }

        @Override // com.google.common.base.CharMatcher
        /* renamed from: b */
        public CharMatcher mo11134b(CharMatcher charMatcher) {
            return charMatcher.mo11139m(this.f20487b) ? this : None.f20494c;
        }

        @Override // com.google.common.base.CharMatcher
        /* renamed from: m */
        public boolean mo11139m(char c2) {
            return c2 == this.f20487b;
        }

        @Override // com.google.common.base.CharMatcher.FastMatcher, com.google.common.base.CharMatcher
        /* renamed from: p */
        public CharMatcher mo11142p() {
            return new IsNot(this.f20487b);
        }

        @Override // com.google.common.base.CharMatcher
        /* renamed from: q */
        public CharMatcher mo11143q(CharMatcher charMatcher) {
            return charMatcher.mo11139m(this.f20487b) ? charMatcher : new C1557Or(this, charMatcher);
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
            String m11127a = CharMatcher.m11127a(this.f20487b);
            return C0576a.m4115n(C0576a.m4106e(m11127a, 18), "CharMatcher.is('", m11127a, "')");
        }
    }

    public static final class IsEither extends FastMatcher {

        /* renamed from: b */
        public final char f20488b;

        /* renamed from: c */
        public final char f20489c;

        public IsEither(char c2, char c3) {
            this.f20488b = c2;
            this.f20489c = c3;
        }

        @Override // com.google.common.base.CharMatcher
        /* renamed from: m */
        public boolean mo11139m(char c2) {
            return c2 == this.f20488b || c2 == this.f20489c;
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
            String m11127a = CharMatcher.m11127a(this.f20488b);
            String m11127a2 = CharMatcher.m11127a(this.f20489c);
            return C1008a.m6437d(C0576a.m4106e(m11127a2, C0576a.m4106e(m11127a, 21)), "CharMatcher.anyOf(\"", m11127a, m11127a2, "\")");
        }
    }

    public static final class IsNot extends FastMatcher {

        /* renamed from: b */
        public final char f20490b;

        public IsNot(char c2) {
            this.f20490b = c2;
        }

        @Override // com.google.common.base.CharMatcher
        /* renamed from: b */
        public CharMatcher mo11134b(CharMatcher charMatcher) {
            return charMatcher.mo11139m(this.f20490b) ? new And(this, charMatcher) : charMatcher;
        }

        @Override // com.google.common.base.CharMatcher
        /* renamed from: m */
        public boolean mo11139m(char c2) {
            return c2 != this.f20490b;
        }

        @Override // com.google.common.base.CharMatcher.FastMatcher, com.google.common.base.CharMatcher
        /* renamed from: p */
        public CharMatcher mo11142p() {
            return new C1556Is(this.f20490b);
        }

        @Override // com.google.common.base.CharMatcher
        /* renamed from: q */
        public CharMatcher mo11143q(CharMatcher charMatcher) {
            return charMatcher.mo11139m(this.f20490b) ? Any.f20482c : this;
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
            String m11127a = CharMatcher.m11127a(this.f20490b);
            return C0576a.m4115n(C0576a.m4106e(m11127a, 21), "CharMatcher.isNot('", m11127a, "')");
        }
    }

    public static final class JavaDigit extends CharMatcher {
        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return apply(ch);
        }

        @Override // com.google.common.base.CharMatcher
        /* renamed from: m */
        public boolean mo11139m(char c2) {
            return Character.isDigit(c2);
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.javaDigit()";
        }
    }

    public static final class JavaIsoControl extends NamedFastMatcher {

        /* renamed from: c */
        public static final JavaIsoControl f20491c = new JavaIsoControl();

        public JavaIsoControl() {
            super("CharMatcher.javaIsoControl()");
        }

        @Override // com.google.common.base.CharMatcher
        /* renamed from: m */
        public boolean mo11139m(char c2) {
            return c2 <= 31 || (c2 >= 127 && c2 <= 159);
        }
    }

    public static final class JavaLetter extends CharMatcher {
        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return apply(ch);
        }

        @Override // com.google.common.base.CharMatcher
        /* renamed from: m */
        public boolean mo11139m(char c2) {
            return Character.isLetter(c2);
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.javaLetter()";
        }
    }

    public static final class JavaLetterOrDigit extends CharMatcher {
        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return apply(ch);
        }

        @Override // com.google.common.base.CharMatcher
        /* renamed from: m */
        public boolean mo11139m(char c2) {
            return Character.isLetterOrDigit(c2);
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.javaLetterOrDigit()";
        }
    }

    public static final class JavaLowerCase extends CharMatcher {
        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return apply(ch);
        }

        @Override // com.google.common.base.CharMatcher
        /* renamed from: m */
        public boolean mo11139m(char c2) {
            return Character.isLowerCase(c2);
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.javaLowerCase()";
        }
    }

    public static final class JavaUpperCase extends CharMatcher {
        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return apply(ch);
        }

        @Override // com.google.common.base.CharMatcher
        /* renamed from: m */
        public boolean mo11139m(char c2) {
            return Character.isUpperCase(c2);
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.javaUpperCase()";
        }
    }

    public static abstract class NamedFastMatcher extends FastMatcher {

        /* renamed from: b */
        public final String f20492b;

        public NamedFastMatcher(String str) {
            this.f20492b = str;
        }

        @Override // com.google.common.base.CharMatcher
        public final String toString() {
            return this.f20492b;
        }
    }

    public static class Negated extends CharMatcher {

        /* renamed from: b */
        public final CharMatcher f20493b;

        public Negated(CharMatcher charMatcher) {
            java.util.Objects.requireNonNull(charMatcher);
            this.f20493b = charMatcher;
        }

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return apply(ch);
        }

        @Override // com.google.common.base.CharMatcher
        /* renamed from: f */
        public int mo11136f(CharSequence charSequence) {
            return charSequence.length() - this.f20493b.mo11136f(charSequence);
        }

        @Override // com.google.common.base.CharMatcher
        /* renamed from: m */
        public boolean mo11139m(char c2) {
            return !this.f20493b.mo11139m(c2);
        }

        @Override // com.google.common.base.CharMatcher
        /* renamed from: n */
        public boolean mo11140n(CharSequence charSequence) {
            return this.f20493b.mo11141o(charSequence);
        }

        @Override // com.google.common.base.CharMatcher
        /* renamed from: o */
        public boolean mo11141o(CharSequence charSequence) {
            return this.f20493b.mo11140n(charSequence);
        }

        @Override // com.google.common.base.CharMatcher
        /* renamed from: p */
        public CharMatcher mo11142p() {
            return this.f20493b;
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
            String valueOf = String.valueOf(this.f20493b);
            return C0576a.m4114m(valueOf.length() + 9, valueOf, ".negate()");
        }
    }

    public static class NegatedFastMatcher extends Negated {
        public NegatedFastMatcher(CharMatcher charMatcher) {
            super(charMatcher);
        }
    }

    public static final class None extends NamedFastMatcher {

        /* renamed from: c */
        public static final None f20494c = new None();

        public None() {
            super("CharMatcher.none()");
        }

        @Override // com.google.common.base.CharMatcher
        /* renamed from: b */
        public CharMatcher mo11134b(CharMatcher charMatcher) {
            java.util.Objects.requireNonNull(charMatcher);
            return this;
        }

        @Override // com.google.common.base.CharMatcher
        /* renamed from: f */
        public int mo11136f(CharSequence charSequence) {
            java.util.Objects.requireNonNull(charSequence);
            return 0;
        }

        @Override // com.google.common.base.CharMatcher
        /* renamed from: h */
        public int mo11137h(CharSequence charSequence) {
            java.util.Objects.requireNonNull(charSequence);
            return -1;
        }

        @Override // com.google.common.base.CharMatcher
        /* renamed from: i */
        public int mo11138i(CharSequence charSequence, int i2) {
            Preconditions.m11189m(i2, charSequence.length());
            return -1;
        }

        @Override // com.google.common.base.CharMatcher
        /* renamed from: m */
        public boolean mo11139m(char c2) {
            return false;
        }

        @Override // com.google.common.base.CharMatcher
        /* renamed from: n */
        public boolean mo11140n(CharSequence charSequence) {
            return charSequence.length() == 0;
        }

        @Override // com.google.common.base.CharMatcher
        /* renamed from: o */
        public boolean mo11141o(CharSequence charSequence) {
            java.util.Objects.requireNonNull(charSequence);
            return true;
        }

        @Override // com.google.common.base.CharMatcher.FastMatcher, com.google.common.base.CharMatcher
        /* renamed from: p */
        public CharMatcher mo11142p() {
            return Any.f20482c;
        }

        @Override // com.google.common.base.CharMatcher
        /* renamed from: q */
        public CharMatcher mo11143q(CharMatcher charMatcher) {
            java.util.Objects.requireNonNull(charMatcher);
            return charMatcher;
        }
    }

    /* renamed from: com.google.common.base.CharMatcher$Or */
    public static final class C1557Or extends CharMatcher {

        /* renamed from: b */
        public final CharMatcher f20495b;

        /* renamed from: c */
        public final CharMatcher f20496c;

        public C1557Or(CharMatcher charMatcher, CharMatcher charMatcher2) {
            this.f20495b = charMatcher;
            java.util.Objects.requireNonNull(charMatcher2);
            this.f20496c = charMatcher2;
        }

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return apply(ch);
        }

        @Override // com.google.common.base.CharMatcher
        /* renamed from: m */
        public boolean mo11139m(char c2) {
            return this.f20495b.mo11139m(c2) || this.f20496c.mo11139m(c2);
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
            String valueOf = String.valueOf(this.f20495b);
            String valueOf2 = String.valueOf(this.f20496c);
            StringBuilder m4122u = C0576a.m4122u(valueOf2.length() + valueOf.length() + 18, "CharMatcher.or(", valueOf, ", ", valueOf2);
            m4122u.append(")");
            return m4122u.toString();
        }
    }

    public static class RangesMatcher extends CharMatcher {

        /* renamed from: b */
        public final String f20497b;

        /* renamed from: c */
        public final char[] f20498c;

        /* renamed from: d */
        public final char[] f20499d;

        public RangesMatcher(String str, char[] cArr, char[] cArr2) {
            this.f20497b = str;
            this.f20498c = cArr;
            this.f20499d = cArr2;
            Preconditions.m11178b(cArr.length == cArr2.length);
            int i2 = 0;
            while (i2 < cArr.length) {
                Preconditions.m11178b(cArr[i2] <= cArr2[i2]);
                int i3 = i2 + 1;
                if (i3 < cArr.length) {
                    Preconditions.m11178b(cArr2[i2] < cArr[i3]);
                }
                i2 = i3;
            }
        }

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return apply(ch);
        }

        @Override // com.google.common.base.CharMatcher
        /* renamed from: m */
        public boolean mo11139m(char c2) {
            int binarySearch = Arrays.binarySearch(this.f20498c, c2);
            if (binarySearch >= 0) {
                return true;
            }
            int i2 = (~binarySearch) - 1;
            return i2 >= 0 && c2 <= this.f20499d[i2];
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
            return this.f20497b;
        }
    }

    public static final class SingleWidth extends RangesMatcher {
        static {
            new SingleWidth();
        }

        public SingleWidth() {
            super("CharMatcher.singleWidth()", "\u0000־א׳\u0600ݐ\u0e00Ḁ℀ﭐﹰ｡".toCharArray(), "ӹ־ת״ۿݿ\u0e7f₯℺﷿\ufeffￜ".toCharArray());
        }
    }

    @VisibleForTesting
    public static final class Whitespace extends NamedFastMatcher {

        /* renamed from: c */
        public static final int f20500c = Integer.numberOfLeadingZeros(31);

        /* renamed from: d */
        public static final Whitespace f20501d = new Whitespace();

        public Whitespace() {
            super("CharMatcher.whitespace()");
        }

        @Override // com.google.common.base.CharMatcher
        /* renamed from: m */
        public boolean mo11139m(char c2) {
            return "\u2002\u3000\r\u0085\u200a\u2005\u2000\u3000\u2029\u000b\u3000\u2008\u2003\u205f\u3000\u1680\t \u2006\u2001  \f\u2009\u3000\u2004\u3000\u3000\u2028\n \u3000".charAt((48906 * c2) >>> f20500c) == c2;
        }
    }

    /* renamed from: a */
    public static String m11127a(char c2) {
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        for (int i2 = 0; i2 < 4; i2++) {
            cArr[5 - i2] = "0123456789ABCDEF".charAt(c2 & 15);
            c2 = (char) (c2 >> 4);
        }
        return String.copyValueOf(cArr);
    }

    /* renamed from: c */
    public static CharMatcher m11128c(CharSequence charSequence) {
        int length = charSequence.length();
        return length != 0 ? length != 1 ? length != 2 ? new AnyOf(charSequence) : new IsEither(charSequence.charAt(0), charSequence.charAt(1)) : new C1556Is(charSequence.charAt(0)) : None.f20494c;
    }

    /* renamed from: e */
    public static CharMatcher m11129e() {
        return Ascii.f20484c;
    }

    /* renamed from: g */
    public static CharMatcher m11130g(char c2, char c3) {
        return new InRange(c2, c3);
    }

    /* renamed from: j */
    public static CharMatcher m11131j(char c2) {
        return new C1556Is(c2);
    }

    /* renamed from: k */
    public static CharMatcher m11132k(char c2) {
        return new IsNot(c2);
    }

    /* renamed from: l */
    public static CharMatcher m11133l() {
        return JavaIsoControl.f20491c;
    }

    /* renamed from: b */
    public CharMatcher mo11134b(CharMatcher charMatcher) {
        return new And(this, charMatcher);
    }

    @Override // com.google.common.base.Predicate
    @Deprecated
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean apply(Character ch) {
        return mo11139m(ch.charValue());
    }

    /* renamed from: f */
    public int mo11136f(CharSequence charSequence) {
        int i2 = 0;
        for (int i3 = 0; i3 < charSequence.length(); i3++) {
            if (mo11139m(charSequence.charAt(i3))) {
                i2++;
            }
        }
        return i2;
    }

    /* renamed from: h */
    public int mo11137h(CharSequence charSequence) {
        return mo11138i(charSequence, 0);
    }

    /* renamed from: i */
    public int mo11138i(CharSequence charSequence, int i2) {
        int length = charSequence.length();
        Preconditions.m11189m(i2, length);
        while (i2 < length) {
            if (mo11139m(charSequence.charAt(i2))) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    /* renamed from: m */
    public abstract boolean mo11139m(char c2);

    /* renamed from: n */
    public boolean mo11140n(CharSequence charSequence) {
        for (int length = charSequence.length() - 1; length >= 0; length--) {
            if (!mo11139m(charSequence.charAt(length))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: o */
    public boolean mo11141o(CharSequence charSequence) {
        return mo11137h(charSequence) == -1;
    }

    /* renamed from: p */
    public CharMatcher mo11142p() {
        return new Negated(this);
    }

    /* renamed from: q */
    public CharMatcher mo11143q(CharMatcher charMatcher) {
        return new C1557Or(this, charMatcher);
    }

    public String toString() {
        return super.toString();
    }
}
