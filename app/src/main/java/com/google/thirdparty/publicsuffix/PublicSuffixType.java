package com.google.thirdparty.publicsuffix;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;

@Beta
@GwtCompatible
/* loaded from: classes2.dex */
public enum PublicSuffixType {
    PRIVATE(':', ','),
    REGISTRY('!', '?');


    /* renamed from: b */
    public final char f24477b;

    /* renamed from: c */
    public final char f24478c;

    PublicSuffixType(char c2, char c3) {
        this.f24477b = c2;
        this.f24478c = c3;
    }
}
