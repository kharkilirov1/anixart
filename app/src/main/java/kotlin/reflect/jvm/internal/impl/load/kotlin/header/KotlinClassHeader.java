package kotlin.reflect.jvm.internal.impl.load.kotlin.header;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmBytecodeBinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: KotlinClassHeader.kt */
/* loaded from: classes3.dex */
public final class KotlinClassHeader {

    /* renamed from: a */
    @NotNull
    public final Kind f64819a;

    /* renamed from: b */
    @NotNull
    public final JvmMetadataVersion f64820b;

    /* renamed from: c */
    @Nullable
    public final String[] f64821c;

    /* renamed from: d */
    @Nullable
    public final String[] f64822d;

    /* renamed from: e */
    @Nullable
    public final String[] f64823e;

    /* renamed from: f */
    @Nullable
    public final String f64824f;

    /* renamed from: g */
    public final int f64825g;

    /* compiled from: KotlinClassHeader.kt */
    public enum Kind {
        UNKNOWN(0),
        CLASS(1),
        FILE_FACADE(2),
        SYNTHETIC_CLASS(3),
        MULTIFILE_CLASS(4),
        MULTIFILE_CLASS_PART(5);


        /* renamed from: j */
        public static final Map<Integer, Kind> f64833j;

        /* renamed from: b */
        public final int f64834b;

        /* compiled from: KotlinClassHeader.kt */
        public static final class Companion {
        }

        static {
            Kind[] values = values();
            int m32062g = MapsKt.m32062g(values.length);
            LinkedHashMap linkedHashMap = new LinkedHashMap(m32062g < 16 ? 16 : m32062g);
            for (Kind kind : values) {
                linkedHashMap.put(Integer.valueOf(kind.f64834b), kind);
            }
            f64833j = linkedHashMap;
        }

        Kind(int i2) {
            this.f64834b = i2;
        }
    }

    public KotlinClassHeader(@NotNull Kind kind, @NotNull JvmMetadataVersion jvmMetadataVersion, @NotNull JvmBytecodeBinaryVersion bytecodeVersion, @Nullable String[] strArr, @Nullable String[] strArr2, @Nullable String[] strArr3, @Nullable String str, int i2, @Nullable String str2) {
        Intrinsics.m32180i(kind, "kind");
        Intrinsics.m32180i(bytecodeVersion, "bytecodeVersion");
        this.f64819a = kind;
        this.f64820b = jvmMetadataVersion;
        this.f64821c = strArr;
        this.f64822d = strArr2;
        this.f64823e = strArr3;
        this.f64824f = str;
        this.f64825g = i2;
    }

    @Nullable
    /* renamed from: a */
    public final String m32954a() {
        String str = this.f64824f;
        if (this.f64819a == Kind.MULTIFILE_CLASS_PART) {
            return str;
        }
        return null;
    }

    @NotNull
    public String toString() {
        return this.f64819a + " version=" + this.f64820b;
    }
}
