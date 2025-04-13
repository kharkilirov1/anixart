package com.bumptech.glide.load.model;

import com.bumptech.glide.load.model.LazyHeaders;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public interface Headers {

    /* renamed from: a */
    public static final Headers f8442a = new LazyHeaders(new LazyHeaders.Builder().f8446a);

    /* renamed from: com.bumptech.glide.load.model.Headers$1 */
    public class C08141 implements Headers {
        @Override // com.bumptech.glide.load.model.Headers
        /* renamed from: a */
        public Map<String, String> mo5141a() {
            return Collections.emptyMap();
        }
    }

    /* renamed from: a */
    Map<String, String> mo5141a();
}
