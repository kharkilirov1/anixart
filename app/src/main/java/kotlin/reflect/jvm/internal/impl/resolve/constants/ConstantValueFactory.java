package kotlin.reflect.jvm.internal.impl.resolve.constants;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ConstantValueFactory.kt */
/* loaded from: classes3.dex */
public final class ConstantValueFactory {

    /* renamed from: a */
    public static final ConstantValueFactory f65922a = new ConstantValueFactory();

    /* renamed from: a */
    public final ArrayValue m33523a(List<?> list, final PrimitiveType primitiveType) {
        List m32027j0 = CollectionsKt.m32027j0(list);
        ArrayList arrayList = new ArrayList();
        Iterator it = m32027j0.iterator();
        while (it.hasNext()) {
            ConstantValue<?> m33525c = m33525c(it.next());
            if (m33525c != null) {
                arrayList.add(m33525c);
            }
        }
        return new ArrayValue(arrayList, new Function1<ModuleDescriptor, SimpleType>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValueFactory$createArrayValue$3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public SimpleType invoke(ModuleDescriptor moduleDescriptor) {
                ModuleDescriptor module = moduleDescriptor;
                Intrinsics.m32180i(module, "module");
                SimpleType m32410t = module.mo32547n().m32410t(PrimitiveType.this);
                Intrinsics.m32175d(m32410t, "module.builtIns.getPrimi…KotlinType(componentType)");
                return m32410t;
            }
        });
    }

    @NotNull
    /* renamed from: b */
    public final ArrayValue m33524b(@NotNull List<? extends ConstantValue<?>> list, @NotNull final KotlinType kotlinType) {
        return new ArrayValue(list, new Function1<ModuleDescriptor, KotlinType>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValueFactory$createArrayValue$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public KotlinType invoke(ModuleDescriptor moduleDescriptor) {
                ModuleDescriptor it = moduleDescriptor;
                Intrinsics.m32180i(it, "it");
                return KotlinType.this;
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v26, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v33, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v39, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v42, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v43, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v47, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r0v48, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v50, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v51, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v53, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r0v54, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v56, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v57, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v59, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r0v60, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v62, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v63, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValueFactory] */
    @Nullable
    /* renamed from: c */
    public final ConstantValue<?> m33525c(@Nullable Object obj) {
        ?? r0;
        ?? r02;
        ?? r03;
        ?? r04;
        ?? r05;
        ?? r06;
        ?? r07;
        if (obj instanceof Byte) {
            return new ByteValue(((Number) obj).byteValue());
        }
        if (obj instanceof Short) {
            return new ShortValue(((Number) obj).shortValue());
        }
        if (obj instanceof Integer) {
            return new IntValue(((Number) obj).intValue());
        }
        if (obj instanceof Long) {
            return new LongValue(((Number) obj).longValue());
        }
        if (obj instanceof Character) {
            return new CharValue(((Character) obj).charValue());
        }
        if (obj instanceof Float) {
            return new FloatValue(((Number) obj).floatValue());
        }
        if (obj instanceof Double) {
            return new DoubleValue(((Number) obj).doubleValue());
        }
        if (obj instanceof Boolean) {
            return new BooleanValue(((Boolean) obj).booleanValue());
        }
        if (obj instanceof String) {
            return new StringValue((String) obj);
        }
        int i2 = 0;
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            Intrinsics.m32179h(bArr, "<this>");
            int length = bArr.length;
            if (length == 0) {
                r07 = EmptyList.f63144b;
            } else if (length != 1) {
                r07 = new ArrayList(bArr.length);
                int length2 = bArr.length;
                while (i2 < length2) {
                    r07.add(Byte.valueOf(bArr[i2]));
                    i2++;
                }
            } else {
                r07 = CollectionsKt.m31993F(Byte.valueOf(bArr[0]));
            }
            return m33523a(r07, PrimitiveType.BYTE);
        }
        if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            Intrinsics.m32179h(sArr, "<this>");
            int length3 = sArr.length;
            if (length3 == 0) {
                r06 = EmptyList.f63144b;
            } else if (length3 != 1) {
                r06 = new ArrayList(sArr.length);
                int length4 = sArr.length;
                while (i2 < length4) {
                    r06.add(Short.valueOf(sArr[i2]));
                    i2++;
                }
            } else {
                r06 = CollectionsKt.m31993F(Short.valueOf(sArr[0]));
            }
            return m33523a(r06, PrimitiveType.SHORT);
        }
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            Intrinsics.m32179h(iArr, "<this>");
            int length5 = iArr.length;
            if (length5 == 0) {
                r05 = EmptyList.f63144b;
            } else if (length5 != 1) {
                r05 = new ArrayList(iArr.length);
                int length6 = iArr.length;
                while (i2 < length6) {
                    r05.add(Integer.valueOf(iArr[i2]));
                    i2++;
                }
            } else {
                r05 = CollectionsKt.m31993F(Integer.valueOf(iArr[0]));
            }
            return m33523a(r05, PrimitiveType.INT);
        }
        if (obj instanceof long[]) {
            return m33523a(ArraysKt.m31951a0((long[]) obj), PrimitiveType.LONG);
        }
        if (obj instanceof char[]) {
            char[] cArr = (char[]) obj;
            Intrinsics.m32179h(cArr, "<this>");
            int length7 = cArr.length;
            if (length7 == 0) {
                r04 = EmptyList.f63144b;
            } else if (length7 != 1) {
                r04 = new ArrayList(cArr.length);
                int length8 = cArr.length;
                while (i2 < length8) {
                    r04.add(Character.valueOf(cArr[i2]));
                    i2++;
                }
            } else {
                r04 = CollectionsKt.m31993F(Character.valueOf(cArr[0]));
            }
            return m33523a(r04, PrimitiveType.CHAR);
        }
        if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            Intrinsics.m32179h(fArr, "<this>");
            int length9 = fArr.length;
            if (length9 == 0) {
                r03 = EmptyList.f63144b;
            } else if (length9 != 1) {
                r03 = new ArrayList(fArr.length);
                int length10 = fArr.length;
                while (i2 < length10) {
                    r03.add(Float.valueOf(fArr[i2]));
                    i2++;
                }
            } else {
                r03 = CollectionsKt.m31993F(Float.valueOf(fArr[0]));
            }
            return m33523a(r03, PrimitiveType.FLOAT);
        }
        if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            Intrinsics.m32179h(dArr, "<this>");
            int length11 = dArr.length;
            if (length11 == 0) {
                r02 = EmptyList.f63144b;
            } else if (length11 != 1) {
                r02 = new ArrayList(dArr.length);
                int length12 = dArr.length;
                while (i2 < length12) {
                    r02.add(Double.valueOf(dArr[i2]));
                    i2++;
                }
            } else {
                r02 = CollectionsKt.m31993F(Double.valueOf(dArr[0]));
            }
            return m33523a(r02, PrimitiveType.DOUBLE);
        }
        if (!(obj instanceof boolean[])) {
            if (obj == null) {
                return new NullValue();
            }
            return null;
        }
        boolean[] zArr = (boolean[]) obj;
        Intrinsics.m32179h(zArr, "<this>");
        int length13 = zArr.length;
        if (length13 == 0) {
            r0 = EmptyList.f63144b;
        } else if (length13 != 1) {
            r0 = new ArrayList(zArr.length);
            int length14 = zArr.length;
            while (i2 < length14) {
                r0.add(Boolean.valueOf(zArr[i2]));
                i2++;
            }
        } else {
            r0 = CollectionsKt.m31993F(Boolean.valueOf(zArr[0]));
        }
        return m33523a(r0, PrimitiveType.BOOLEAN);
    }
}
