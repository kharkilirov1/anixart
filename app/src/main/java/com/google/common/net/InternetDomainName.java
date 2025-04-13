package com.google.common.net;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.CharMatcher;
import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import com.google.errorprone.annotations.Immutable;
import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@Immutable
@Beta
@GwtCompatible
/* loaded from: classes2.dex */
public final class InternetDomainName {
    static {
        CharMatcher.m11128c(".。．｡");
        Splitter.m11204a('.');
        Joiner.m11159c('.');
        CharMatcher.m11130g('0', '9').mo11143q(CharMatcher.m11130g('a', 'z').mo11143q(CharMatcher.m11130g('A', 'Z'))).mo11143q(CharMatcher.m11128c("-_"));
    }

    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InternetDomainName)) {
            return false;
        }
        Objects.requireNonNull((InternetDomainName) obj);
        throw null;
    }

    public int hashCode() {
        throw null;
    }

    public String toString() {
        return null;
    }
}
