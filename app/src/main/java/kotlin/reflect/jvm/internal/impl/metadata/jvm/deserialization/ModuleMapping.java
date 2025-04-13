package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: ModuleMapping.kt */
/* loaded from: classes3.dex */
public final class ModuleMapping {

    /* renamed from: c */
    @JvmField
    @NotNull
    public static final ModuleMapping f65585c;

    /* renamed from: d */
    @JvmField
    @NotNull
    public static final ModuleMapping f65586d;

    /* renamed from: e */
    public static final Companion f65587e = new Companion(null);

    /* renamed from: a */
    @NotNull
    public final Map<String, PackageParts> f65588a;

    /* renamed from: b */
    public final String f65589b;

    /* compiled from: ModuleMapping.kt */
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        Map map;
        Map map2;
        map = EmptyMap.f63145b;
        EmptyList emptyList = EmptyList.f63144b;
        f65585c = new ModuleMapping(map, new BinaryModuleData(emptyList), "EMPTY");
        map2 = EmptyMap.f63145b;
        f65586d = new ModuleMapping(map2, new BinaryModuleData(emptyList), "CORRUPTED");
    }

    public ModuleMapping(Map<String, PackageParts> map, BinaryModuleData binaryModuleData, String str) {
        this.f65588a = map;
        this.f65589b = str;
    }

    @NotNull
    public String toString() {
        return this.f65589b;
    }

    public ModuleMapping(@NotNull Map map, @NotNull BinaryModuleData binaryModuleData, @NotNull String str, DefaultConstructorMarker defaultConstructorMarker) {
        this.f65588a = map;
        this.f65589b = str;
    }
}
