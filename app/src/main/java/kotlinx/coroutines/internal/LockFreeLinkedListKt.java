package kotlinx.coroutines.internal;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: LockFreeLinkedList.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\n\u0010\u0001\"\u00020\u00002\u00020\u0000*\u001c\u0010\u0004\u001a\u0004\b\u0000\u0010\u0002\"\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u0003*\f\b\u0002\u0010\u0006\"\u00020\u00052\u00020\u0005*\n\u0010\b\"\u00020\u00072\u00020\u0007*\u001c\u0010\n\u001a\u0004\b\u0000\u0010\u0002\"\b\u0012\u0004\u0012\u00028\u00000\t2\b\u0012\u0004\u0012\u00028\u00000\t¨\u0006\u000b"}, m31884d2 = {"Lkotlinx/coroutines/internal/LockFreeLinkedListNode$AbstractAtomicDesc;", "AbstractAtomicDesc", "T", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$AddLastDesc;", "AddLastDesc", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "Node", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;", "PrepareOp", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$RemoveFirstDesc;", "RemoveFirstDesc", "kotlinx-coroutines-core"}, m31885k = 2, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class LockFreeLinkedListKt {

    /* renamed from: a */
    @NotNull
    public static final Object f68266a = new Symbol("CONDITION_FALSE");

    /* renamed from: b */
    @NotNull
    public static final Object f68267b = new Symbol("LIST_EMPTY");
}
