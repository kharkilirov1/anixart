package com.yandex.div.core.view2.animations;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewGroupKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.SequencesKt;
import kotlin.sequences.TransformingSequence;
import kotlin.sequences.TransformingSequence$iterator$1;

/* compiled from: ViewComparator.kt */
@Metadata(m31883d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m31884d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "Landroid/view/View;", "invoke", "(Lkotlin/Pair;)Ljava/lang/Boolean;"}, m31885k = 3, m31886mv = {1, 5, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
final class ViewComparator$structureEquals$1 extends Lambda implements Function1<Pair<? extends View, ? extends View>, Boolean> {

    /* renamed from: b */
    public static final ViewComparator$structureEquals$1 f31788b = new ViewComparator$structureEquals$1();

    public ViewComparator$structureEquals$1() {
        super(1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public Boolean invoke(Pair<? extends View, ? extends View> pair) {
        Object next;
        Pair<? extends View, ? extends View> it = pair;
        Intrinsics.m32179h(it, "it");
        View view = (View) it.f63055b;
        View other = (View) it.f63056c;
        Intrinsics.m32179h(view, "<this>");
        Intrinsics.m32179h(other, "other");
        boolean z = true;
        if (Intrinsics.m32174c(view.getClass(), other.getClass())) {
            if ((view instanceof ViewGroup) && (other instanceof ViewGroup)) {
                ViewGroup viewGroup = (ViewGroup) view;
                ViewGroup viewGroup2 = (ViewGroup) other;
                if (viewGroup.getChildCount() == viewGroup2.getChildCount()) {
                    TransformingSequence$iterator$1 transformingSequence$iterator$1 = new TransformingSequence$iterator$1((TransformingSequence) SequencesKt.m33852t(SequencesKt.m33834D(ViewGroupKt.m2377b(viewGroup), ViewGroupKt.m2377b(viewGroup2)), f31788b));
                    if (transformingSequence$iterator$1.hasNext()) {
                        next = transformingSequence$iterator$1.next();
                        while (transformingSequence$iterator$1.hasNext()) {
                            next = Boolean.valueOf(((Boolean) next).booleanValue() && ((Boolean) transformingSequence$iterator$1.next()).booleanValue());
                        }
                    } else {
                        next = null;
                    }
                    Boolean bool = (Boolean) next;
                    if (bool != null) {
                        z = bool.booleanValue();
                    }
                }
            }
            return Boolean.valueOf(z);
        }
        z = false;
        return Boolean.valueOf(z);
    }
}
