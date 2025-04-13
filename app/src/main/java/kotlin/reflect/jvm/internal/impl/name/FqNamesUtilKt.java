package kotlin.reflect.jvm.internal.impl.name;

import org.jetbrains.annotations.Nullable;

/* compiled from: FqNamesUtil.kt */
/* loaded from: classes3.dex */
public final class FqNamesUtilKt {

    public final /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[State.values().length];
            iArr[0] = 1;
            iArr[2] = 2;
            iArr[1] = 3;
        }
    }

    /* renamed from: a */
    public static final boolean m33208a(@Nullable String str) {
        State state = State.AFTER_DOT;
        State state2 = State.BEGINNING;
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            int ordinal = state2.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        continue;
                    }
                } else if (charAt == '.') {
                    state2 = state;
                } else if (!Character.isJavaIdentifierPart(charAt)) {
                    return false;
                }
            }
            if (!Character.isJavaIdentifierPart(charAt)) {
                return false;
            }
            state2 = State.MIDDLE;
        }
        return state2 != state;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0034, code lost:
    
        if (r0.charAt(r3.length()) == '.') goto L12;
     */
    @org.jetbrains.annotations.NotNull
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.reflect.jvm.internal.impl.name.FqName m33209b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.FqName r6, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.FqName r7) {
        /*
            boolean r0 = kotlin.jvm.internal.Intrinsics.m32174c(r6, r7)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L9
            goto L36
        L9:
            boolean r0 = r7.m33197b()
            if (r0 == 0) goto L10
            goto L36
        L10:
            kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe r0 = r6.f65597a
            java.lang.String r0 = r0.f65602a
            java.lang.String r3 = "this.asString()"
            kotlin.jvm.internal.Intrinsics.m32175d(r0, r3)
            kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe r3 = r7.f65597a
            java.lang.String r3 = r3.f65602a
            java.lang.String r4 = "packageName.asString()"
            kotlin.jvm.internal.Intrinsics.m32175d(r3, r4)
            r4 = 2
            r5 = 0
            boolean r4 = kotlin.text.StringsKt.m33898X(r0, r3, r2, r4, r5)
            if (r4 == 0) goto L37
            int r3 = r3.length()
            char r0 = r0.charAt(r3)
            r3 = 46
            if (r0 != r3) goto L37
        L36:
            r2 = 1
        L37:
            if (r2 == 0) goto L6f
            boolean r0 = r7.m33197b()
            if (r0 == 0) goto L40
            goto L6f
        L40:
            boolean r0 = kotlin.jvm.internal.Intrinsics.m32174c(r6, r7)
            if (r0 == 0) goto L4e
            kotlin.reflect.jvm.internal.impl.name.FqName r6 = kotlin.reflect.jvm.internal.impl.name.FqName.f65596c
            java.lang.String r7 = "FqName.ROOT"
            kotlin.jvm.internal.Intrinsics.m32175d(r6, r7)
            goto L6f
        L4e:
            kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe r6 = r6.f65597a
            java.lang.String r6 = r6.f65602a
            java.lang.String r0 = "asString()"
            kotlin.jvm.internal.Intrinsics.m32175d(r6, r0)
            kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe r7 = r7.f65597a
            java.lang.String r7 = r7.f65602a
            int r7 = r7.length()
            int r7 = r7 + r1
            java.lang.String r6 = r6.substring(r7)
            java.lang.String r7 = "(this as java.lang.String).substring(startIndex)"
            kotlin.jvm.internal.Intrinsics.m32175d(r6, r7)
            kotlin.reflect.jvm.internal.impl.name.FqName r7 = new kotlin.reflect.jvm.internal.impl.name.FqName
            r7.<init>(r6)
            r6 = r7
        L6f:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.name.FqNamesUtilKt.m33209b(kotlin.reflect.jvm.internal.impl.name.FqName, kotlin.reflect.jvm.internal.impl.name.FqName):kotlin.reflect.jvm.internal.impl.name.FqName");
    }
}
