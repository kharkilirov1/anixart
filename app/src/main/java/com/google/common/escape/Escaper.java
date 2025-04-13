package com.google.common.escape;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Function;
import com.google.errorprone.annotations.DoNotMock;

@DoNotMock
@GwtCompatible
/* loaded from: classes.dex */
public abstract class Escaper {

    /* renamed from: com.google.common.escape.Escaper$1 */
    public class C18131 implements Function<String, String> {

        /* renamed from: b */
        public final /* synthetic */ Escaper f21663b;

        @Override // com.google.common.base.Function
        public String apply(String str) {
            return this.f21663b.mo11970a(str);
        }
    }

    /* renamed from: a */
    public abstract String mo11970a(String str);
}
