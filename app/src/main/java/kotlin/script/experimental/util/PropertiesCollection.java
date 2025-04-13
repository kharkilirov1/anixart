package kotlin.script.experimental.util;

import androidx.room.util.C0576a;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: propertiesCollection.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, m31884d2 = {"Lkotlin/script/experimental/util/PropertiesCollection;", "Ljava/io/Serializable;", "Builder", "Companion", "Key", "PropertyKeyCopyDelegate", "PropertyKeyDelegate", "kotlin-scripting-common"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public class PropertiesCollection implements Serializable {

    /* renamed from: b */
    public final Map<Key<?>, Object> f66670b;

    /* compiled from: propertiesCollection.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0002X\u0083D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m31884d2 = {"Lkotlin/script/experimental/util/PropertiesCollection$Companion;", "", "", "serialVersionUID", "J", "serialVersionUID$annotations", "()V", "kotlin-scripting-common"}, m31885k = 1, m31886mv = {1, 4, 0})
    public static final class Companion {
    }

    /* compiled from: propertiesCollection.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, m31884d2 = {"Lkotlin/script/experimental/util/PropertiesCollection$Key;", "T", "Ljava/io/Serializable;", "Companion", "kotlin-scripting-common"}, m31885k = 1, m31886mv = {1, 4, 0})
    public static final class Key<T> implements Serializable {

        /* renamed from: b */
        @NotNull
        public final String f66672b;

        /* renamed from: c */
        @Nullable
        public final transient T f66673c;

        /* compiled from: propertiesCollection.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0002X\u0083D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m31884d2 = {"Lkotlin/script/experimental/util/PropertiesCollection$Key$Companion;", "", "", "serialVersionUID", "J", "serialVersionUID$annotations", "()V", "kotlin-scripting-common"}, m31885k = 1, m31886mv = {1, 4, 0})
        public static final class Companion {
        }

        public Key(@NotNull String name, @Nullable T t) {
            Intrinsics.m32180i(name, "name");
            this.f66672b = name;
            this.f66673c = t;
        }

        public boolean equals(@Nullable Object obj) {
            if (obj instanceof Key) {
                return Intrinsics.m32174c(this.f66672b, ((Key) obj).f66672b);
            }
            return false;
        }

        public int hashCode() {
            return this.f66672b.hashCode();
        }

        @NotNull
        public String toString() {
            return C0576a.m4118q(C0000a.m24u("Key("), this.f66672b, ')');
        }
    }

    /* compiled from: propertiesCollection.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, m31884d2 = {"Lkotlin/script/experimental/util/PropertiesCollection$PropertyKeyCopyDelegate;", "T", "", "kotlin-scripting-common"}, m31885k = 1, m31886mv = {1, 4, 0})
    public static final class PropertyKeyCopyDelegate<T> {
        public PropertyKeyCopyDelegate(@NotNull Key<T> key) {
        }
    }

    /* compiled from: propertiesCollection.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, m31884d2 = {"Lkotlin/script/experimental/util/PropertiesCollection$PropertyKeyDelegate;", "T", "", "kotlin-scripting-common"}, m31885k = 1, m31886mv = {1, 4, 0})
    public static final class PropertyKeyDelegate<T> {

        /* renamed from: a */
        public final T f66674a;

        public PropertyKeyDelegate() {
            this.f66674a = null;
        }

        @NotNull
        /* renamed from: a */
        public final Key m33821a(@NotNull KProperty property) {
            Intrinsics.m32180i(property, "property");
            return new Key(property.getName(), this.f66674a);
        }

        public PropertyKeyDelegate(@Nullable T t) {
            this.f66674a = t;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public PropertiesCollection() {
        /*
            r1 = this;
            java.util.Map r0 = kotlin.collections.MapsKt.m32059d()
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.script.experimental.util.PropertiesCollection.<init>():void");
    }

    public PropertiesCollection(@NotNull Map<Key<?>, ? extends Object> properties) {
        Intrinsics.m32180i(properties, "properties");
        this.f66670b = properties;
    }

    /* compiled from: propertiesCollection.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlin/script/experimental/util/PropertiesCollection$Builder;", "", "kotlin-scripting-common"}, m31885k = 1, m31886mv = {1, 4, 0})
    public static class Builder {

        /* renamed from: a */
        @NotNull
        public final Map<Key<?>, Object> f66671a;

        public Builder() {
            this(null, 1);
        }

        public Builder(@NotNull Iterable<? extends PropertiesCollection> baseProperties) {
            Intrinsics.m32180i(baseProperties, "baseProperties");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator<? extends PropertiesCollection> it = baseProperties.iterator();
            while (it.hasNext()) {
                linkedHashMap.putAll(it.next().f66670b);
            }
            this.f66671a = linkedHashMap;
        }

        @Nullable
        /* renamed from: a */
        public final <T> T m33819a(@NotNull Key<T> key) {
            T t = (T) this.f66671a.get(key);
            if (t != null) {
                return t;
            }
            return null;
        }

        /* renamed from: b */
        public final <T> void m33820b(@NotNull Key<T> key, @NotNull T t) {
            Intrinsics.m32180i(null, "v");
            throw null;
        }

        public /* synthetic */ Builder(Iterable iterable, int i2) {
            this((i2 & 1) != 0 ? EmptyList.f63144b : null);
        }
    }
}
