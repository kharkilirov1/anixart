package kotlin.reflect.jvm.internal.impl.renderer;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;

/* compiled from: RenderingUtils.kt */
/* loaded from: classes3.dex */
public final class RenderingUtilsKt {
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003d, code lost:
    
        if (r0 != false) goto L21;
     */
    @org.jetbrains.annotations.NotNull
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String m33450a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.Name r7) {
        /*
            java.lang.String r0 = "receiver$0"
            kotlin.jvm.internal.Intrinsics.m32180i(r7, r0)
            boolean r0 = r7.f65607c
            java.lang.String r1 = "asString()"
            r2 = 0
            if (r0 == 0) goto Ld
            goto L40
        Ld:
            java.lang.String r0 = r7.f65606b
            kotlin.jvm.internal.Intrinsics.m32175d(r0, r1)
            java.util.Set<java.lang.String> r3 = kotlin.reflect.jvm.internal.impl.renderer.KeywordStringsGenerated.f65854a
            java.util.HashSet r3 = (java.util.HashSet) r3
            boolean r3 = r3.contains(r0)
            r4 = 1
            if (r3 != 0) goto L3f
            r3 = 0
        L1e:
            int r5 = r0.length()
            if (r3 >= r5) goto L3c
            char r5 = r0.charAt(r3)
            boolean r6 = java.lang.Character.isLetterOrDigit(r5)
            if (r6 != 0) goto L34
            r6 = 95
            if (r5 == r6) goto L34
            r5 = 1
            goto L35
        L34:
            r5 = 0
        L35:
            if (r5 == 0) goto L39
            r0 = 1
            goto L3d
        L39:
            int r3 = r3 + 1
            goto L1e
        L3c:
            r0 = 0
        L3d:
            if (r0 == 0) goto L40
        L3f:
            r2 = 1
        L40:
            if (r2 == 0) goto L6c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r7 = r7.f65606b
            kotlin.jvm.internal.Intrinsics.m32175d(r7, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 96
            java.lang.String r3 = java.lang.String.valueOf(r2)
            r1.append(r3)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r0.append(r7)
            r0.append(r2)
            java.lang.String r7 = r0.toString()
            goto L71
        L6c:
            java.lang.String r7 = r7.f65606b
            kotlin.jvm.internal.Intrinsics.m32175d(r7, r1)
        L71:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.renderer.RenderingUtilsKt.m33450a(kotlin.reflect.jvm.internal.impl.name.Name):java.lang.String");
    }

    @NotNull
    /* renamed from: b */
    public static final String m33451b(@NotNull List<Name> pathSegments) {
        Intrinsics.m32180i(pathSegments, "pathSegments");
        StringBuilder sb = new StringBuilder();
        for (Name name : pathSegments) {
            if (sb.length() > 0) {
                sb.append(".");
            }
            sb.append(m33450a(name));
        }
        String sb2 = sb.toString();
        Intrinsics.m32175d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
