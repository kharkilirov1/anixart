package kotlinx.coroutines.selects;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: WhileSelect.kt */
@Metadata(m31885k = 3, m31886mv = {1, 6, 0}, m31888xi = 176)
@DebugMetadata(m32125c = "kotlinx.coroutines.selects.WhileSelectKt", m32126f = "WhileSelect.kt", m32127l = {37}, m32128m = "whileSelect")
/* loaded from: classes3.dex */
final class WhileSelectKt$whileSelect$1 extends ContinuationImpl {

    /* renamed from: e */
    public Object f68394e;

    /* renamed from: f */
    public /* synthetic */ Object f68395f;

    /* renamed from: g */
    public int f68396g;

    public WhileSelectKt$whileSelect$1(Continuation<? super WhileSelectKt$whileSelect$1> continuation) {
        super(continuation);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x004c -> B:8:0x004f). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo2379m(@org.jetbrains.annotations.NotNull java.lang.Object r6) {
        /*
            r5 = this;
            r5.f68395f = r6
            int r6 = r5.f68396g
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r6 | r0
            r5.f68396g = r6
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            r2 = r6 & r0
            if (r2 == 0) goto L14
            int r6 = r6 - r0
            r5.f68396g = r6
            r6 = r5
            goto L19
        L14:
            kotlinx.coroutines.selects.WhileSelectKt$whileSelect$1 r6 = new kotlinx.coroutines.selects.WhileSelectKt$whileSelect$1
            r6.<init>(r5)
        L19:
            java.lang.Object r0 = r6.f68395f
            int r2 = r6.f68396g
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            java.lang.Object r2 = r6.f68394e
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            kotlin.ResultKt.m31892b(r0)
            goto L4f
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            kotlin.ResultKt.m31892b(r0)
            r0 = 0
            r2 = r0
        L37:
            r6.f68394e = r2
            r6.f68396g = r3
            kotlinx.coroutines.selects.SelectBuilderImpl r0 = new kotlinx.coroutines.selects.SelectBuilderImpl
            r0.<init>(r6)
            r2.invoke(r0)     // Catch: java.lang.Throwable -> L44
            goto L48
        L44:
            r4 = move-exception
            r0.m34390T(r4)
        L48:
            java.lang.Object r0 = r0.m34389S()
            if (r0 != r1) goto L4f
            goto L5a
        L4f:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L58
            goto L37
        L58:
            kotlin.Unit r1 = kotlin.Unit.f63088a
        L5a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.selects.WhileSelectKt$whileSelect$1.mo2379m(java.lang.Object):java.lang.Object");
    }
}
