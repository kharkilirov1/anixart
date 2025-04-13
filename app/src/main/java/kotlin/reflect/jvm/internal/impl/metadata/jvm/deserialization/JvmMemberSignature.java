package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: JvmMemberSignature.kt */
/* loaded from: classes3.dex */
public abstract class JvmMemberSignature {

    /* compiled from: JvmMemberSignature.kt */
    public static final class Field extends JvmMemberSignature {

        /* renamed from: a */
        @NotNull
        public final String f65573a;

        /* renamed from: b */
        @NotNull
        public final String f65574b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Field(@NotNull String name, @NotNull String desc) {
            super(null);
            Intrinsics.m32180i(name, "name");
            Intrinsics.m32180i(desc, "desc");
            this.f65573a = name;
            this.f65574b = desc;
        }

        @Override // kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature
        @NotNull
        /* renamed from: a */
        public String mo33173a() {
            return this.f65573a + ':' + this.f65574b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature
        @NotNull
        /* renamed from: b */
        public String mo33174b() {
            return this.f65574b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature
        @NotNull
        /* renamed from: c */
        public String mo33175c() {
            return this.f65573a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Field)) {
                return false;
            }
            Field field = (Field) obj;
            return Intrinsics.m32174c(this.f65573a, field.f65573a) && Intrinsics.m32174c(this.f65574b, field.f65574b);
        }

        public int hashCode() {
            String str = this.f65573a;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f65574b;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }
    }

    /* compiled from: JvmMemberSignature.kt */
    public static final class Method extends JvmMemberSignature {

        /* renamed from: a */
        @NotNull
        public final String f65575a;

        /* renamed from: b */
        @NotNull
        public final String f65576b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Method(@NotNull String name, @NotNull String desc) {
            super(null);
            Intrinsics.m32180i(name, "name");
            Intrinsics.m32180i(desc, "desc");
            this.f65575a = name;
            this.f65576b = desc;
        }

        @Override // kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature
        @NotNull
        /* renamed from: a */
        public String mo33173a() {
            return this.f65575a + this.f65576b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature
        @NotNull
        /* renamed from: b */
        public String mo33174b() {
            return this.f65576b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature
        @NotNull
        /* renamed from: c */
        public String mo33175c() {
            return this.f65575a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Method)) {
                return false;
            }
            Method method = (Method) obj;
            return Intrinsics.m32174c(this.f65575a, method.f65575a) && Intrinsics.m32174c(this.f65576b, method.f65576b);
        }

        public int hashCode() {
            String str = this.f65575a;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f65576b;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }
    }

    public JvmMemberSignature() {
    }

    @NotNull
    /* renamed from: a */
    public abstract String mo33173a();

    @NotNull
    /* renamed from: b */
    public abstract String mo33174b();

    @NotNull
    /* renamed from: c */
    public abstract String mo33175c();

    @NotNull
    public final String toString() {
        return mo33173a();
    }

    public JvmMemberSignature(DefaultConstructorMarker defaultConstructorMarker) {
    }
}
