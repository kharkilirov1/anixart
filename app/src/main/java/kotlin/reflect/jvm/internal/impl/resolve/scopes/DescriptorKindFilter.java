package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import androidx.room.util.C0576a;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p000a.C0000a;

/* compiled from: MemberScope.kt */
/* loaded from: classes3.dex */
public final class DescriptorKindFilter {

    /* renamed from: c */
    public static int f65963c = 1;

    /* renamed from: d */
    public static final int f65964d;

    /* renamed from: e */
    public static final int f65965e;

    /* renamed from: f */
    public static final int f65966f;

    /* renamed from: g */
    public static final int f65967g;

    /* renamed from: h */
    public static final int f65968h;

    /* renamed from: i */
    public static final int f65969i;

    /* renamed from: j */
    public static final int f65970j;

    /* renamed from: k */
    public static final int f65971k;

    /* renamed from: l */
    @JvmField
    @NotNull
    public static final DescriptorKindFilter f65972l;

    /* renamed from: m */
    @JvmField
    @NotNull
    public static final DescriptorKindFilter f65973m;

    /* renamed from: n */
    @JvmField
    @NotNull
    public static final DescriptorKindFilter f65974n;

    /* renamed from: o */
    @JvmField
    @NotNull
    public static final DescriptorKindFilter f65975o;

    /* renamed from: p */
    @JvmField
    @NotNull
    public static final DescriptorKindFilter f65976p;

    /* renamed from: q */
    public static final List<Companion.MaskToName> f65977q;

    /* renamed from: r */
    public static final List<Companion.MaskToName> f65978r;

    /* renamed from: s */
    public static final Companion f65979s = new Companion(null);

    /* renamed from: a */
    public final int f65980a;

    /* renamed from: b */
    @NotNull
    public final List<DescriptorKindExclude> f65981b;

    /* compiled from: MemberScope.kt */
    public static final class Companion {

        /* compiled from: MemberScope.kt */
        public static final class MaskToName {

            /* renamed from: a */
            public final int f65982a;

            /* renamed from: b */
            @NotNull
            public final String f65983b;

            public MaskToName(int i2, @NotNull String str) {
                this.f65982a = i2;
                this.f65983b = str;
            }
        }

        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        Companion.MaskToName maskToName;
        Companion.MaskToName maskToName2;
        List list = null;
        int i2 = f65963c;
        int i3 = i2 << 1;
        f65963c = i3;
        f65964d = i2;
        int i4 = i3 << 1;
        f65963c = i4;
        f65965e = i3;
        int i5 = i4 << 1;
        f65963c = i5;
        f65966f = i4;
        int i6 = i5 << 1;
        f65963c = i6;
        f65967g = i5;
        int i7 = i6 << 1;
        f65963c = i7;
        f65968h = i6;
        int i8 = i7 << 1;
        f65963c = i8;
        f65969i = i7;
        f65963c = i8 << 1;
        int i9 = i8 - 1;
        f65970j = i9;
        int i10 = i2 | i3 | i4;
        f65971k = i10;
        int i11 = 2;
        f65972l = new DescriptorKindFilter(i9, list, i11);
        f65973m = new DescriptorKindFilter(i6 | i7, list, i11);
        new DescriptorKindFilter(i2, list, i11);
        new DescriptorKindFilter(i3, list, i11);
        new DescriptorKindFilter(i4, list, i11);
        f65974n = new DescriptorKindFilter(i10, list, i11);
        new DescriptorKindFilter(i5, list, i11);
        f65975o = new DescriptorKindFilter(i6, list, i11);
        f65976p = new DescriptorKindFilter(i7, list, i11);
        new DescriptorKindFilter(i3 | i6 | i7, list, i11);
        Field[] fields = DescriptorKindFilter.class.getFields();
        Intrinsics.m32175d(fields, "T::class.java.fields");
        ArrayList arrayList = new ArrayList();
        for (Field it : fields) {
            Intrinsics.m32175d(it, "it");
            if (Modifier.isStatic(it.getModifiers())) {
                arrayList.add(it);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Field field = (Field) it2.next();
            Object obj = field.get(null);
            if (!(obj instanceof DescriptorKindFilter)) {
                obj = null;
            }
            DescriptorKindFilter descriptorKindFilter = (DescriptorKindFilter) obj;
            if (descriptorKindFilter != null) {
                int i12 = descriptorKindFilter.f65980a;
                String name = field.getName();
                Intrinsics.m32175d(name, "field.name");
                maskToName2 = new Companion.MaskToName(i12, name);
            } else {
                maskToName2 = null;
            }
            if (maskToName2 != null) {
                arrayList2.add(maskToName2);
            }
        }
        f65977q = CollectionsKt.m32027j0(arrayList2);
        Field[] fields2 = DescriptorKindFilter.class.getFields();
        Intrinsics.m32175d(fields2, "T::class.java.fields");
        ArrayList arrayList3 = new ArrayList();
        for (Field it3 : fields2) {
            Intrinsics.m32175d(it3, "it");
            if (Modifier.isStatic(it3.getModifiers())) {
                arrayList3.add(it3);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            Object next = it4.next();
            Field it5 = (Field) next;
            Intrinsics.m32175d(it5, "it");
            if (Intrinsics.m32174c(it5.getType(), Integer.TYPE)) {
                arrayList4.add(next);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator it6 = arrayList4.iterator();
        while (it6.hasNext()) {
            Field field2 = (Field) it6.next();
            Object obj2 = field2.get(null);
            if (obj2 == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
            }
            int intValue = ((Integer) obj2).intValue();
            if (intValue == ((-intValue) & intValue)) {
                String name2 = field2.getName();
                Intrinsics.m32175d(name2, "field.name");
                maskToName = new Companion.MaskToName(intValue, name2);
            } else {
                maskToName = null;
            }
            if (maskToName != null) {
                arrayList5.add(maskToName);
            }
        }
        f65978r = CollectionsKt.m32027j0(arrayList5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DescriptorKindFilter(int i2, @NotNull List<? extends DescriptorKindExclude> excludes) {
        Intrinsics.m32180i(excludes, "excludes");
        this.f65981b = excludes;
        Iterator it = excludes.iterator();
        while (it.hasNext()) {
            i2 &= ~((DescriptorKindExclude) it.next()).mo33546a();
        }
        this.f65980a = i2;
    }

    /* renamed from: a */
    public final boolean m33547a(int i2) {
        return (i2 & this.f65980a) != 0;
    }

    @NotNull
    public String toString() {
        Object obj;
        Iterator<T> it = f65977q.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((Companion.MaskToName) obj).f65982a == this.f65980a) {
                break;
            }
        }
        Companion.MaskToName maskToName = (Companion.MaskToName) obj;
        String str = maskToName != null ? maskToName.f65983b : null;
        if (str == null) {
            List<Companion.MaskToName> list = f65978r;
            ArrayList arrayList = new ArrayList();
            for (Companion.MaskToName maskToName2 : list) {
                String str2 = m33547a(maskToName2.f65982a) ? maskToName2.f65983b : null;
                if (str2 != null) {
                    arrayList.add(str2);
                }
            }
            str = CollectionsKt.m31989B(arrayList, " | ", null, null, 0, null, null, 62, null);
        }
        return C0576a.m4119r(C0000a.m28y("DescriptorKindFilter(", str, ", "), this.f65981b, ')');
    }

    public /* synthetic */ DescriptorKindFilter(int i2, List list, int i3) {
        this(i2, (i3 & 2) != 0 ? EmptyList.f63144b : null);
    }
}
