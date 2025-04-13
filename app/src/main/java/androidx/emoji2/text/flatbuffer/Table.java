package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;
import java.util.Comparator;
import java.util.Objects;

/* loaded from: classes.dex */
public class Table {

    /* renamed from: a */
    public int f4103a;

    /* renamed from: b */
    public ByteBuffer f4104b;

    /* renamed from: c */
    public int f4105c;

    /* renamed from: d */
    public int f4106d;

    /* renamed from: androidx.emoji2.text.flatbuffer.Table$1 */
    class C03201 implements Comparator<Integer> {
        @Override // java.util.Comparator
        public int compare(Integer num, Integer num2) {
            Objects.requireNonNull(null);
            throw null;
        }
    }

    public Table() {
        Utf8.m2866a();
    }

    /* renamed from: a */
    public int m2864a(int i2) {
        if (i2 < this.f4106d) {
            return this.f4104b.getShort(this.f4105c + i2);
        }
        return 0;
    }

    /* renamed from: b */
    public void m2865b(int i2, ByteBuffer byteBuffer) {
        this.f4104b = byteBuffer;
        if (byteBuffer == null) {
            this.f4103a = 0;
            this.f4105c = 0;
            this.f4106d = 0;
        } else {
            this.f4103a = i2;
            int i3 = i2 - byteBuffer.getInt(i2);
            this.f4105c = i3;
            this.f4106d = this.f4104b.getShort(i3);
        }
    }
}
