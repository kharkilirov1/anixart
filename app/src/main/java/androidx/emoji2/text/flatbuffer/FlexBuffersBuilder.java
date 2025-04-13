package androidx.emoji2.text.flatbuffer;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Objects;

/* loaded from: classes.dex */
public class FlexBuffersBuilder {

    /* renamed from: a */
    public final ReadWriteBuf f4101a;

    /* renamed from: androidx.emoji2.text.flatbuffer.FlexBuffersBuilder$1 */
    public class C03191 implements Comparator<Value> {

        /* renamed from: b */
        public final /* synthetic */ FlexBuffersBuilder f4102b;

        @Override // java.util.Comparator
        public int compare(Value value, Value value2) {
            byte b;
            byte b2;
            Objects.requireNonNull(value);
            Objects.requireNonNull(value2);
            int i2 = 0;
            int i3 = 0;
            do {
                b = this.f4102b.f4101a.get(i2);
                b2 = this.f4102b.f4101a.get(i3);
                if (b == 0) {
                    break;
                }
                i2++;
                i3++;
            } while (b == b2);
            return b - b2;
        }
    }

    public static class Value {
    }

    public FlexBuffersBuilder() {
        ArrayReadWriteBuf arrayReadWriteBuf = new ArrayReadWriteBuf(256);
        new ArrayList();
        new HashMap();
        new HashMap();
        this.f4101a = arrayReadWriteBuf;
    }
}
