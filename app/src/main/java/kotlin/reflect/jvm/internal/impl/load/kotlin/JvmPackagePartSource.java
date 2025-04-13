package kotlin.reflect.jvm.internal.impl.load.kotlin;

import com.fasterxml.jackson.core.JsonPointer;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceFile;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: JvmPackagePartSource.kt */
/* loaded from: classes3.dex */
public final class JvmPackagePartSource implements DeserializedContainerSource {

    /* renamed from: b */
    @NotNull
    public final JvmClassName f64793b;

    /* renamed from: c */
    @Nullable
    public final JvmClassName f64794c;

    /* renamed from: d */
    @Nullable
    public final KotlinJvmBinaryClass f64795d;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public JvmPackagePartSource(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package r3, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver r4, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.serialization.deserialization.IncompatibleVersionErrorData<kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion> r5, boolean r6) {
        /*
            r1 = this;
            java.lang.String r5 = "packageProto"
            kotlin.jvm.internal.Intrinsics.m32180i(r3, r5)
            java.lang.String r5 = "nameResolver"
            kotlin.jvm.internal.Intrinsics.m32180i(r4, r5)
            kotlin.reflect.jvm.internal.impl.name.ClassId r5 = r2.mo32352g()
            kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName r5 = kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName.m33543a(r5)
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader r6 = r2.getF63698b()
            java.lang.String r6 = r6.m32954a()
            if (r6 == 0) goto L2d
            int r0 = r6.length()
            if (r0 <= 0) goto L24
            r0 = 1
            goto L25
        L24:
            r0 = 0
        L25:
            if (r0 == 0) goto L2d
            kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName r0 = new kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName
            r0.<init>(r6)
            goto L2e
        L2d:
            r0 = 0
        L2e:
            r1.<init>()
            r1.f64793b = r5
            r1.f64794c = r0
            r1.f64795d = r2
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$GeneratedExtension<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package, java.lang.Integer> r2 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.f65491l
            java.lang.String r5 = "JvmProtoBuf.packageModuleName"
            kotlin.jvm.internal.Intrinsics.m32175d(r2, r5)
            java.lang.Object r2 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt.m33120a(r3, r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 == 0) goto L4f
            int r2 = r2.intValue()
            kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmNameResolver r4 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmNameResolver) r4
            r4.getString(r2)
        L4f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.kotlin.JvmPackagePartSource.<init>(kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package, kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver, kotlin.reflect.jvm.internal.impl.serialization.deserialization.IncompatibleVersionErrorData, boolean):void");
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.SourceElement
    @NotNull
    /* renamed from: a */
    public SourceFile mo32339a() {
        return SourceFile.f63980a;
    }

    @NotNull
    /* renamed from: c */
    public final Name m32914c() {
        String m33902b0;
        String str = this.f64793b.f65940a;
        Intrinsics.m32175d(str, "className.internalName");
        m33902b0 = StringsKt.m33902b0(str, JsonPointer.SEPARATOR, (r3 & 2) != 0 ? str : null);
        return Name.m33211d(m33902b0);
    }

    @NotNull
    public String toString() {
        StringBuilder m27x = C0000a.m27x("JvmPackagePartSource", ": ");
        m27x.append(this.f64793b);
        return m27x.toString();
    }
}
