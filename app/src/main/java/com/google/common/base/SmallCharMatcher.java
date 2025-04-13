package com.google.common.base;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.CharMatcher;

@GwtIncompatible
/* loaded from: classes.dex */
final class SmallCharMatcher extends CharMatcher.NamedFastMatcher {
    @Override // com.google.common.base.CharMatcher
    /* renamed from: m */
    public boolean mo11139m(char c2) {
        if (c2 == 0) {
            return false;
        }
        if (1 == ((0 >> c2) & 1)) {
            throw null;
        }
        return false;
    }
}
