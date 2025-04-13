package com.google.common.base;

import com.google.common.annotations.GwtCompatible;

@GwtCompatible
/* loaded from: classes.dex */
public abstract class Ticker {

    /* renamed from: a */
    public static final Ticker f20608a = new Ticker() { // from class: com.google.common.base.Ticker.1
        @Override // com.google.common.base.Ticker
        /* renamed from: a */
        public long mo11226a() {
            PatternCompiler patternCompiler = Platform.f20534a;
            return System.nanoTime();
        }
    };

    /* renamed from: a */
    public abstract long mo11226a();
}
