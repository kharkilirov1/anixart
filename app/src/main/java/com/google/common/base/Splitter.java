package com.google.common.base;

import androidx.emoji2.text.flatbuffer.C0321a;
import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.AbstractIterator;
import com.google.common.base.CharMatcher;
import com.google.common.base.JdkPattern;
import com.google.common.base.Platform;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

@GwtCompatible
/* loaded from: classes.dex */
public final class Splitter {

    /* renamed from: a */
    public final CharMatcher f20548a;

    /* renamed from: b */
    public final boolean f20549b;

    /* renamed from: c */
    public final Strategy f20550c;

    /* renamed from: d */
    public final int f20551d;

    /* renamed from: com.google.common.base.Splitter$4 */
    class C15754 implements Strategy {
        @Override // com.google.common.base.Splitter.Strategy
        /* renamed from: a */
        public Iterator mo11210a(Splitter splitter, CharSequence charSequence) {
            return new SplittingIterator(splitter, charSequence) { // from class: com.google.common.base.Splitter.4.1
                @Override // com.google.common.base.Splitter.SplittingIterator
                /* renamed from: b */
                public int mo11211b(int i2) {
                    return i2;
                }

                @Override // com.google.common.base.Splitter.SplittingIterator
                /* renamed from: c */
                public int mo11212c(int i2) {
                    java.util.Objects.requireNonNull(C15754.this);
                    int i3 = i2 + 0;
                    if (i3 < this.f20561d.length()) {
                        return i3;
                    }
                    return -1;
                }
            };
        }
    }

    @Beta
    public static final class MapSplitter {
    }

    public static abstract class SplittingIterator extends AbstractIterator<String> {

        /* renamed from: d */
        public final CharSequence f20561d;

        /* renamed from: e */
        public final CharMatcher f20562e;

        /* renamed from: f */
        public final boolean f20563f;

        /* renamed from: g */
        public int f20564g = 0;

        /* renamed from: h */
        public int f20565h;

        public SplittingIterator(Splitter splitter, CharSequence charSequence) {
            this.f20562e = splitter.f20548a;
            this.f20563f = splitter.f20549b;
            this.f20565h = splitter.f20551d;
            this.f20561d = charSequence;
        }

        @Override // com.google.common.base.AbstractIterator
        /* renamed from: a */
        public String mo11120a() {
            int mo11212c;
            int i2 = this.f20564g;
            while (true) {
                int i3 = this.f20564g;
                if (i3 == -1) {
                    this.f20464b = AbstractIterator.State.DONE;
                    return null;
                }
                mo11212c = mo11212c(i3);
                if (mo11212c == -1) {
                    mo11212c = this.f20561d.length();
                    this.f20564g = -1;
                } else {
                    this.f20564g = mo11211b(mo11212c);
                }
                int i4 = this.f20564g;
                if (i4 == i2) {
                    int i5 = i4 + 1;
                    this.f20564g = i5;
                    if (i5 > this.f20561d.length()) {
                        this.f20564g = -1;
                    }
                } else {
                    while (i2 < mo11212c && this.f20562e.mo11139m(this.f20561d.charAt(i2))) {
                        i2++;
                    }
                    while (mo11212c > i2) {
                        int i6 = mo11212c - 1;
                        if (!this.f20562e.mo11139m(this.f20561d.charAt(i6))) {
                            break;
                        }
                        mo11212c = i6;
                    }
                    if (!this.f20563f || i2 != mo11212c) {
                        break;
                    }
                    i2 = this.f20564g;
                }
            }
            int i7 = this.f20565h;
            if (i7 == 1) {
                mo11212c = this.f20561d.length();
                this.f20564g = -1;
                while (mo11212c > i2) {
                    int i8 = mo11212c - 1;
                    if (!this.f20562e.mo11139m(this.f20561d.charAt(i8))) {
                        break;
                    }
                    mo11212c = i8;
                }
            } else {
                this.f20565h = i7 - 1;
            }
            return this.f20561d.subSequence(i2, mo11212c).toString();
        }

        /* renamed from: b */
        public abstract int mo11211b(int i2);

        /* renamed from: c */
        public abstract int mo11212c(int i2);
    }

    public interface Strategy {
        /* renamed from: a */
        Iterator<String> mo11210a(Splitter splitter, CharSequence charSequence);
    }

    public Splitter(Strategy strategy, boolean z, CharMatcher charMatcher, int i2) {
        this.f20550c = strategy;
        this.f20549b = z;
        this.f20548a = charMatcher;
        this.f20551d = i2;
    }

    /* renamed from: a */
    public static Splitter m11204a(char c2) {
        final CharMatcher.C1556Is c1556Is = new CharMatcher.C1556Is(c2);
        return new Splitter(new Strategy() { // from class: com.google.common.base.Splitter.1
            @Override // com.google.common.base.Splitter.Strategy
            /* renamed from: a */
            public Iterator mo11210a(Splitter splitter, CharSequence charSequence) {
                return new SplittingIterator(splitter, charSequence) { // from class: com.google.common.base.Splitter.1.1
                    @Override // com.google.common.base.Splitter.SplittingIterator
                    /* renamed from: b */
                    public int mo11211b(int i2) {
                        return i2 + 1;
                    }

                    @Override // com.google.common.base.Splitter.SplittingIterator
                    /* renamed from: c */
                    public int mo11212c(int i2) {
                        return CharMatcher.this.mo11138i(this.f20561d, i2);
                    }
                };
            }
        });
    }

    /* renamed from: b */
    public static Splitter m11205b(final String str) {
        Preconditions.m11179c(str.length() != 0, "The separator may not be the empty string.");
        return str.length() == 1 ? m11204a(str.charAt(0)) : new Splitter(new Strategy() { // from class: com.google.common.base.Splitter.2
            @Override // com.google.common.base.Splitter.Strategy
            /* renamed from: a */
            public Iterator mo11210a(Splitter splitter, CharSequence charSequence) {
                return new SplittingIterator(splitter, charSequence) { // from class: com.google.common.base.Splitter.2.1
                    @Override // com.google.common.base.Splitter.SplittingIterator
                    /* renamed from: b */
                    public int mo11211b(int i2) {
                        return str.length() + i2;
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
                    
                        r6 = r6 + 1;
                     */
                    @Override // com.google.common.base.Splitter.SplittingIterator
                    /* renamed from: c */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public int mo11212c(int r6) {
                        /*
                            r5 = this;
                            com.google.common.base.Splitter$2 r0 = com.google.common.base.Splitter.C15732.this
                            java.lang.String r0 = r1
                            int r0 = r0.length()
                            java.lang.CharSequence r1 = r5.f20561d
                            int r1 = r1.length()
                            int r1 = r1 - r0
                        Lf:
                            if (r6 > r1) goto L2d
                            r2 = 0
                        L12:
                            if (r2 >= r0) goto L2c
                            java.lang.CharSequence r3 = r5.f20561d
                            int r4 = r2 + r6
                            char r3 = r3.charAt(r4)
                            com.google.common.base.Splitter$2 r4 = com.google.common.base.Splitter.C15732.this
                            java.lang.String r4 = r1
                            char r4 = r4.charAt(r2)
                            if (r3 == r4) goto L29
                            int r6 = r6 + 1
                            goto Lf
                        L29:
                            int r2 = r2 + 1
                            goto L12
                        L2c:
                            return r6
                        L2d:
                            r6 = -1
                            return r6
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.google.common.base.Splitter.C15732.AnonymousClass1.mo11212c(int):int");
                    }
                };
            }
        });
    }

    @GwtIncompatible
    /* renamed from: c */
    public static Splitter m11206c(String str) {
        PatternCompiler patternCompiler = Platform.f20534a;
        java.util.Objects.requireNonNull((Platform.JdkPatternCompiler) Platform.f20534a);
        final JdkPattern jdkPattern = new JdkPattern(Pattern.compile(str));
        Preconditions.m11184h(!new JdkPattern.JdkMatcher(jdkPattern.f20520b.matcher("")).m11158d(), "The pattern may not match the empty string: %s", jdkPattern);
        return new Splitter(new Strategy() { // from class: com.google.common.base.Splitter.3
            @Override // com.google.common.base.Splitter.Strategy
            /* renamed from: a */
            public Iterator mo11210a(Splitter splitter, CharSequence charSequence) {
                final CommonMatcher mo11147a = CommonPattern.this.mo11147a(charSequence);
                return new SplittingIterator(splitter, charSequence) { // from class: com.google.common.base.Splitter.3.1
                    @Override // com.google.common.base.Splitter.SplittingIterator
                    /* renamed from: b */
                    public int mo11211b(int i2) {
                        return mo11147a.mo11144a();
                    }

                    @Override // com.google.common.base.Splitter.SplittingIterator
                    /* renamed from: c */
                    public int mo11212c(int i2) {
                        if (mo11147a.mo11145b(i2)) {
                            return mo11147a.mo11146c();
                        }
                        return -1;
                    }
                };
            }
        });
    }

    /* renamed from: d */
    public Iterable<String> m11207d(final CharSequence charSequence) {
        return new Iterable<String>() { // from class: com.google.common.base.Splitter.5
            @Override // java.lang.Iterable
            public Iterator<String> iterator() {
                Splitter splitter = Splitter.this;
                return splitter.f20550c.mo11210a(splitter, charSequence);
            }

            public String toString() {
                Joiner joiner = new Joiner(", ");
                StringBuilder m2872a = C0321a.m2872a('[');
                try {
                    joiner.mo11160a(m2872a, iterator());
                    m2872a.append(']');
                    return m2872a.toString();
                } catch (IOException e2) {
                    throw new AssertionError(e2);
                }
            }
        };
    }

    /* renamed from: e */
    public List<String> m11208e(CharSequence charSequence) {
        java.util.Objects.requireNonNull(charSequence);
        Iterator<String> mo11210a = this.f20550c.mo11210a(this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (mo11210a.hasNext()) {
            arrayList.add(mo11210a.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: f */
    public Splitter m11209f() {
        CharMatcher.Whitespace whitespace = CharMatcher.Whitespace.f20501d;
        java.util.Objects.requireNonNull(whitespace);
        return new Splitter(this.f20550c, this.f20549b, whitespace, this.f20551d);
    }

    public Splitter(Strategy strategy) {
        CharMatcher.None none = CharMatcher.None.f20494c;
        this.f20550c = strategy;
        this.f20549b = false;
        this.f20548a = none;
        this.f20551d = Integer.MAX_VALUE;
    }
}
