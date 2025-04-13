package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

/* compiled from: DeserializationConfiguration.kt */
/* loaded from: classes3.dex */
public interface DeserializationConfiguration {

    /* compiled from: DeserializationConfiguration.kt */
    public static final class Default implements DeserializationConfiguration {

        /* renamed from: a */
        public static final Default f66066a = new Default();

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration
        /* renamed from: a */
        public boolean mo33563a() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration
        /* renamed from: b */
        public boolean mo33564b() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration
        /* renamed from: c */
        public boolean mo33565c() {
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration
        /* renamed from: d */
        public boolean mo33566d() {
            return false;
        }
    }

    /* compiled from: DeserializationConfiguration.kt */
    public static final class DefaultImpls {
    }

    /* renamed from: a */
    boolean mo33563a();

    /* renamed from: b */
    boolean mo33564b();

    /* renamed from: c */
    boolean mo33565c();

    /* renamed from: d */
    boolean mo33566d();
}
