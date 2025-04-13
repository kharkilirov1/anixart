package androidx.emoji2.text.flatbuffer;

/* loaded from: classes.dex */
public final class MetadataList extends Table {

    public static final class Vector extends BaseVector {
    }

    /* renamed from: c */
    public int m2863c() {
        int m2864a = m2864a(6);
        if (m2864a == 0) {
            return 0;
        }
        int i2 = m2864a + this.f4103a;
        return this.f4104b.getInt(this.f4104b.getInt(i2) + i2);
    }
}
