package com.google.protobuf;

import com.google.protobuf.WireFormat;
import java.io.IOException;

/* loaded from: classes2.dex */
public class MapEntryLite<K, V> {

    /* renamed from: a */
    public final Metadata<K, V> f24261a;

    /* renamed from: b */
    public final K f24262b;

    /* renamed from: c */
    public final V f24263c;

    /* renamed from: com.google.protobuf.MapEntryLite$1 */
    public static /* synthetic */ class C23841 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f24264a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f24264a = iArr;
            try {
                iArr[WireFormat.FieldType.f24411n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24264a[WireFormat.FieldType.f24414q.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24264a[WireFormat.FieldType.f24410m.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static class Metadata<K, V> {

        /* renamed from: a */
        public final WireFormat.FieldType f24265a;

        /* renamed from: b */
        public final K f24266b;

        /* renamed from: c */
        public final WireFormat.FieldType f24267c;

        /* renamed from: d */
        public final V f24268d;

        public Metadata(WireFormat.FieldType fieldType, K k2, WireFormat.FieldType fieldType2, V v) {
            this.f24265a = fieldType;
            this.f24266b = k2;
            this.f24267c = fieldType2;
            this.f24268d = v;
        }
    }

    public MapEntryLite(WireFormat.FieldType fieldType, K k2, WireFormat.FieldType fieldType2, V v) {
        this.f24261a = new Metadata<>(fieldType, k2, fieldType2, v);
        this.f24262b = k2;
        this.f24263c = v;
    }

    /* renamed from: a */
    public static <K, V> int m13488a(Metadata<K, V> metadata, K k2, V v) {
        return FieldSet.m13384d(metadata.f24265a, 1, k2) + FieldSet.m13384d(metadata.f24267c, 2, v);
    }

    /* renamed from: b */
    public static <K, V> void m13489b(CodedOutputStream codedOutputStream, Metadata<K, V> metadata, K k2, V v) throws IOException {
        FieldSet.m13388q(codedOutputStream, metadata.f24265a, 1, k2);
        FieldSet.m13388q(codedOutputStream, metadata.f24267c, 2, v);
    }
}
