package kotlin.reflect.jvm;

import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;

/* compiled from: ReflectJvmMapping.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"kotlin-reflect-api"}, m31885k = 2, m31886mv = {1, 4, 0})
@JvmName
/* loaded from: classes3.dex */
public final class ReflectJvmMapping {

    @Metadata(m31882bv = {1, 0, 3}, m31885k = 3, m31886mv = {1, 1, 13})
    public final /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[KotlinClassHeader.Kind.values().length];
            KotlinClassHeader.Kind kind = KotlinClassHeader.Kind.FILE_FACADE;
            iArr[2] = 1;
            KotlinClassHeader.Kind kind2 = KotlinClassHeader.Kind.MULTIFILE_CLASS;
            iArr[4] = 2;
            KotlinClassHeader.Kind kind3 = KotlinClassHeader.Kind.MULTIFILE_CLASS_PART;
            iArr[5] = 3;
        }
    }
}
