package com.google.common.base;

import com.google.common.annotations.GwtIncompatible;
import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@GwtIncompatible
/* loaded from: classes.dex */
final class JdkPattern extends CommonPattern implements Serializable {

    /* renamed from: b */
    public final Pattern f20520b;

    public static final class JdkMatcher extends CommonMatcher {

        /* renamed from: a */
        public final Matcher f20521a;

        public JdkMatcher(Matcher matcher) {
            java.util.Objects.requireNonNull(matcher);
            this.f20521a = matcher;
        }

        @Override // com.google.common.base.CommonMatcher
        /* renamed from: a */
        public int mo11144a() {
            return this.f20521a.end();
        }

        @Override // com.google.common.base.CommonMatcher
        /* renamed from: b */
        public boolean mo11145b(int i2) {
            return this.f20521a.find(i2);
        }

        @Override // com.google.common.base.CommonMatcher
        /* renamed from: c */
        public int mo11146c() {
            return this.f20521a.start();
        }

        /* renamed from: d */
        public boolean m11158d() {
            return this.f20521a.matches();
        }
    }

    public JdkPattern(Pattern pattern) {
        java.util.Objects.requireNonNull(pattern);
        this.f20520b = pattern;
    }

    @Override // com.google.common.base.CommonPattern
    /* renamed from: a */
    public CommonMatcher mo11147a(CharSequence charSequence) {
        return new JdkMatcher(this.f20520b.matcher(charSequence));
    }

    public String toString() {
        return this.f20520b.toString();
    }
}
