package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import androidx.annotation.WorkerThread;
import java.io.File;
import java.io.FileNotFoundException;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.p033io.FilesKt;
import kotlin.sequences.FilteringSequence;
import kotlin.sequences.FilteringSequence$iterator$1;
import kotlin.sequences.SequencesKt;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.J8 */
/* loaded from: classes2.dex */
public abstract class AbstractC3390J8 {

    /* renamed from: a */
    private JSONObject f43192a;

    /* renamed from: b */
    private final Context f43193b;

    /* renamed from: c */
    private final String f43194c;

    /* renamed from: d */
    private final C3432L0 f43195d;

    /* renamed from: com.yandex.metrica.impl.ob.J8$a */
    public static final class a extends Lambda implements Function1<String, Boolean> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public Boolean invoke(String str) {
            return Boolean.valueOf(!AbstractC3390J8.this.mo18201a().contains(str));
        }
    }

    public AbstractC3390J8(@NotNull Context context, @NotNull String str, @NotNull C3432L0 c3432l0) {
        this.f43193b = context;
        this.f43194c = str;
        this.f43195d = c3432l0;
    }

    @NotNull
    /* renamed from: a */
    public abstract Set<String> mo18201a();

    @WorkerThread
    /* renamed from: a */
    public final synchronized void m18390a(@NotNull JSONObject jSONObject) {
        try {
            File m18469a = this.f43195d.m18469a(this.f43193b, this.f43194c);
            if (m18469a != null) {
                String jSONObject2 = jSONObject.toString();
                Intrinsics.m32178g(jSONObject2, "contents.toString()");
                Charset charset = Charsets.f66855b;
                Intrinsics.m32179h(charset, "charset");
                byte[] bytes = jSONObject2.getBytes(charset);
                Intrinsics.m32178g(bytes, "this as java.lang.String).getBytes(charset)");
                FilesKt.m32142c(m18469a, bytes);
            }
        } catch (Throwable unused) {
        }
    }

    @WorkerThread
    @NotNull
    /* renamed from: b */
    public final synchronized JSONObject m18391b() {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        if (this.f43192a == null) {
            try {
                try {
                    File m18469a = this.f43195d.m18469a(this.f43193b, this.f43194c);
                    jSONObject = new JSONObject(m18469a != null ? FilesKt.m32141b(m18469a, null, 1, null) : "{}");
                    Iterator<String> keys = jSONObject.keys();
                    Intrinsics.m32178g(keys, "json.keys()");
                    FilteringSequence$iterator$1 filteringSequence$iterator$1 = new FilteringSequence$iterator$1((FilteringSequence) SequencesKt.m33841i(SequencesKt.m33836d(keys), new a()));
                    while (filteringSequence$iterator$1.hasNext()) {
                        jSONObject.remove((String) filteringSequence$iterator$1.next());
                    }
                } catch (FileNotFoundException unused) {
                    jSONObject = new JSONObject();
                }
            } catch (Throwable unused2) {
                jSONObject = new JSONObject();
            }
            this.f43192a = jSONObject;
        }
        jSONObject2 = this.f43192a;
        if (jSONObject2 == null) {
            Intrinsics.m32189r("fileContents");
            throw null;
        }
        return jSONObject2;
    }
}
