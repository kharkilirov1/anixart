package androidx.emoji2.text.flatbuffer;

import androidx.emoji2.text.flatbuffer.Utf8Old;
import java.nio.charset.StandardCharsets;
import java.util.function.Supplier;

/* loaded from: classes.dex */
public class Utf8Old extends Utf8 {

    /* renamed from: b */
    public static final /* synthetic */ int f4108b = 0;

    public static class Cache {
        public Cache() {
            StandardCharsets.UTF_8.newEncoder();
            StandardCharsets.UTF_8.newDecoder();
        }
    }

    static {
        ThreadLocal.withInitial(new Supplier() { // from class: androidx.emoji2.text.flatbuffer.b
            @Override // java.util.function.Supplier
            public final Object get() {
                int i2 = Utf8Old.f4108b;
                return new Utf8Old.Cache();
            }
        });
    }
}
