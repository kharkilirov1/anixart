package kotlin.internal;

import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;

/* compiled from: PlatformImplementations.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"kotlin-stdlib"}, m31885k = 2, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class PlatformImplementationsKt {

    /* renamed from: a */
    @JvmField
    @NotNull
    public static final PlatformImplementations f63254a;

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(11:3|4|(2:6|7)(5:64|(1:66)|67|68|69)|8|9|(6:41|42|43|44|16|17)|12|(6:19|20|21|22|16|17)|15|16|17)|71|9|(0)|41|42|43|44|16|17|(2:(1:34)|(1:56))) */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x009d, code lost:
    
        r2 = java.lang.Class.forName("kotlin.internal.JRE8PlatformImplementations").newInstance();
        kotlin.jvm.internal.Intrinsics.m32178g(r2, "forName(\"kotlin.internal…entations\").newInstance()");
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00aa, code lost:
    
        r2 = (kotlin.internal.PlatformImplementations) r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00ae, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00af, code lost:
    
        r2 = r2.getClass().getClassLoader();
        r7 = kotlin.internal.PlatformImplementations.class.getClassLoader();
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00bf, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.m32174c(r2, r7) == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00db, code lost:
    
        throw new java.lang.ClassNotFoundException("Instance class was loaded from a different classloader: " + r2 + ", base type classloader: " + r7, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00dc, code lost:
    
        throw r6;
     */
    static {
        /*
            Method dump skipped, instructions count: 361
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.internal.PlatformImplementationsKt.<clinit>():void");
    }
}
