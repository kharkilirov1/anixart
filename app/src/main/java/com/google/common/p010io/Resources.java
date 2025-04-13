package com.google.common.p010io;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

@Beta
@GwtIncompatible
/* loaded from: classes2.dex */
public final class Resources {

    /* renamed from: com.google.common.io.Resources$1 */
    class C19011 implements LineProcessor<List<String>> {
        public C19011() {
            new ArrayList();
        }
    }

    public static final class UrlByteSource extends ByteSource {
        @Override // com.google.common.p010io.ByteSource
        /* renamed from: a */
        public InputStream mo12038a() throws IOException {
            throw null;
        }

        public String toString() {
            return "Resources.asByteSource(null)";
        }
    }
}
