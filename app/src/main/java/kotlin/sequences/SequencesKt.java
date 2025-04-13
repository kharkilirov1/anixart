package kotlin.sequences;

import android.view.View;
import androidx.core.view.ViewGroupKt$children$1;
import androidx.core.view.ViewGroupKt$iterator$1;
import com.yandex.mobile.ads.C4632R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.BuilderInference;
import kotlin.Metadata;
import kotlin.OverloadResolutionByLambdaReturnType;
import kotlin.Pair;
import kotlin.SinceKotlin;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.internal.LowPriorityInOverloadResolution;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

@Metadata(m31883d1 = {"kotlin/sequences/SequencesKt__SequenceBuilderKt", "kotlin/sequences/SequencesKt__SequencesJVMKt", "kotlin/sequences/SequencesKt__SequencesKt", "kotlin/sequences/SequencesKt___SequencesJvmKt", "kotlin/sequences/SequencesKt___SequencesKt"}, m31885k = 4, m31886mv = {1, 7, 1}, m31888xi = C4632R.styleable.AppCompatTheme_checkedTextViewStyle)
/* loaded from: classes3.dex */
public final class SequencesKt extends SequencesKt___SequencesKt {
    @NotNull
    /* renamed from: A */
    public static List m33831A(@NotNull Sequence sequence) {
        return CollectionsKt.m31999L(m33832B(sequence));
    }

    @NotNull
    /* renamed from: B */
    public static List m33832B(@NotNull Sequence sequence) {
        Intrinsics.m32179h(sequence, "<this>");
        ArrayList arrayList = new ArrayList();
        SequencesKt___SequencesKt.m33860b(sequence, arrayList);
        return arrayList;
    }

    @NotNull
    /* renamed from: C */
    public static Set m33833C(@NotNull Sequence sequence) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        SequencesKt___SequencesKt.m33860b(sequence, linkedHashSet);
        return SetsKt.m32076c(linkedHashSet);
    }

    @NotNull
    /* renamed from: D */
    public static Sequence m33834D(@NotNull Sequence sequence, @NotNull Sequence sequence2) {
        return new MergingSequence(sequence, sequence2, new Function2<Object, Object, Pair<Object, Object>>() { // from class: kotlin.sequences.SequencesKt___SequencesKt$zip$1
            @Override // kotlin.jvm.functions.Function2
            public Pair<Object, Object> invoke(Object obj, Object obj2) {
                return new Pair<>(obj, obj2);
            }
        });
    }

    @NotNull
    /* renamed from: c */
    public static Iterable m33835c(@NotNull Sequence sequence) {
        return new SequencesKt___SequencesKt$asIterable$$inlined$Iterable$1(sequence);
    }

    @NotNull
    /* renamed from: d */
    public static Sequence m33836d(@NotNull final Iterator it) {
        Intrinsics.m32179h(it, "<this>");
        Sequence<Object> sequence = new Sequence<Object>() { // from class: kotlin.sequences.SequencesKt__SequencesKt$asSequence$$inlined$Sequence$1
            @Override // kotlin.sequences.Sequence
            @NotNull
            public Iterator<Object> iterator() {
                return it;
            }
        };
        return sequence instanceof ConstrainedOnceSequence ? sequence : new ConstrainedOnceSequence(sequence);
    }

    /* renamed from: e */
    public static int m33837e(@NotNull Sequence sequence) {
        Iterator it = sequence.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            it.next();
            i2++;
            if (i2 < 0) {
                CollectionsKt.m32021g0();
                throw null;
            }
        }
        return i2;
    }

    @NotNull
    /* renamed from: f */
    public static Sequence m33838f(@NotNull Sequence sequence, int i2) {
        if (i2 >= 0) {
            return i2 == 0 ? sequence : sequence instanceof DropTakeSequence ? ((DropTakeSequence) sequence).mo33822a(i2) : new DropSequence(sequence, i2);
        }
        throw new IllegalArgumentException(C0000a.m8e("Requested element count ", i2, " is less than zero.").toString());
    }

    /* renamed from: g */
    public static Object m33839g(@NotNull Sequence sequence, final int i2) {
        Function1<Integer, Object> function1 = new Function1<Integer, Object>() { // from class: kotlin.sequences.SequencesKt___SequencesKt$elementAt$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Object invoke(Integer num) {
                num.intValue();
                throw new IndexOutOfBoundsException(C0000a.m17n(C0000a.m24u("Sequence doesn't contain element at index "), i2, '.'));
            }
        };
        if (i2 < 0) {
            function1.invoke(Integer.valueOf(i2));
            throw null;
        }
        Iterator<View> it = ((ViewGroupKt$children$1) sequence).iterator();
        int i3 = 0;
        while (true) {
            ViewGroupKt$iterator$1 viewGroupKt$iterator$1 = (ViewGroupKt$iterator$1) it;
            if (!viewGroupKt$iterator$1.hasNext()) {
                function1.invoke(Integer.valueOf(i2));
                throw null;
            }
            Object next = viewGroupKt$iterator$1.next();
            int i4 = i3 + 1;
            if (i2 == i3) {
                return next;
            }
            i3 = i4;
        }
    }

    @NotNull
    /* renamed from: i */
    public static Sequence m33841i(@NotNull Sequence sequence, @NotNull Function1 predicate) {
        Intrinsics.m32179h(sequence, "<this>");
        Intrinsics.m32179h(predicate, "predicate");
        return new FilteringSequence(sequence, true, predicate);
    }

    @NotNull
    /* renamed from: j */
    public static Sequence m33842j(@NotNull Sequence sequence, @NotNull Function1 predicate) {
        Intrinsics.m32179h(sequence, "<this>");
        Intrinsics.m32179h(predicate, "predicate");
        return new FilteringSequence(sequence, false, predicate);
    }

    @NotNull
    /* renamed from: k */
    public static Sequence m33843k(@NotNull Sequence sequence) {
        return m33842j(sequence, new Function1<Object, Boolean>() { // from class: kotlin.sequences.SequencesKt___SequencesKt$filterNotNull$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object obj) {
                return Boolean.valueOf(obj == null);
            }
        });
    }

    @Nullable
    /* renamed from: l */
    public static Object m33844l(@NotNull Sequence sequence) {
        Iterator it = sequence.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    @NotNull
    /* renamed from: m */
    public static Sequence m33845m(@NotNull Sequence sequence, @NotNull Function1 transform) {
        Intrinsics.m32179h(transform, "transform");
        return new FlatteningSequence(sequence, transform, SequencesKt___SequencesKt$flatMap$2.f66739d);
    }

    @SinceKotlin
    @JvmName
    @NotNull
    @OverloadResolutionByLambdaReturnType
    /* renamed from: n */
    public static Sequence m33846n(@NotNull Sequence sequence, @NotNull Function1 function1) {
        return new FlatteningSequence(sequence, function1, SequencesKt___SequencesKt$flatMap$1.f66738d);
    }

    @LowPriorityInOverloadResolution
    @NotNull
    /* renamed from: o */
    public static Sequence m33847o(@Nullable final Object obj, @NotNull Function1 nextFunction) {
        Intrinsics.m32179h(nextFunction, "nextFunction");
        return obj == null ? EmptySequence.f66683a : new GeneratorSequence(new Function0<Object>() { // from class: kotlin.sequences.SequencesKt__SequencesKt$generateSequence$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final Object invoke() {
                return obj;
            }
        }, nextFunction);
    }

    @NotNull
    /* renamed from: p */
    public static Sequence m33848p(@NotNull final Function0 function0) {
        GeneratorSequence generatorSequence = new GeneratorSequence(function0, new Function1<Object, Object>() { // from class: kotlin.sequences.SequencesKt__SequencesKt$generateSequence$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @Nullable
            public final Object invoke(@NotNull Object it) {
                Intrinsics.m32179h(it, "it");
                return function0.invoke();
            }
        });
        return generatorSequence instanceof ConstrainedOnceSequence ? generatorSequence : new ConstrainedOnceSequence(generatorSequence);
    }

    @NotNull
    /* renamed from: q */
    public static Sequence m33849q(@NotNull Function0 function0, @NotNull Function1 nextFunction) {
        Intrinsics.m32179h(nextFunction, "nextFunction");
        return new GeneratorSequence(function0, nextFunction);
    }

    @SinceKotlin
    @NotNull
    /* renamed from: r */
    public static Iterator m33850r(@BuilderInference @NotNull Function2 block) {
        Intrinsics.m32179h(block, "block");
        SequenceBuilderIterator sequenceBuilderIterator = new SequenceBuilderIterator();
        sequenceBuilderIterator.f66712e = IntrinsicsKt.m32121a(block, sequenceBuilderIterator, sequenceBuilderIterator);
        return sequenceBuilderIterator;
    }

    /* renamed from: s */
    public static String m33851s(Sequence sequence, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, Function1 function1, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence prefix = (i3 & 2) != 0 ? "" : null;
        String postfix = (i3 & 4) == 0 ? null : "";
        if ((i3 & 8) != 0) {
            i2 = -1;
        }
        String truncated = (i3 & 16) != 0 ? "..." : null;
        Intrinsics.m32179h(sequence, "<this>");
        Intrinsics.m32179h(prefix, "prefix");
        Intrinsics.m32179h(postfix, "postfix");
        Intrinsics.m32179h(truncated, "truncated");
        StringBuilder sb = new StringBuilder();
        sb.append(prefix);
        int i4 = 0;
        for (Object obj2 : sequence) {
            i4++;
            if (i4 > 1) {
                sb.append(charSequence);
            }
            if (i2 >= 0 && i4 > i2) {
                break;
            }
            StringsKt.m33915o(sb, obj2, null);
        }
        if (i2 >= 0 && i4 > i2) {
            sb.append((CharSequence) truncated);
        }
        sb.append((CharSequence) postfix);
        String sb2 = sb.toString();
        Intrinsics.m32178g(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    @NotNull
    /* renamed from: t */
    public static Sequence m33852t(@NotNull Sequence sequence, @NotNull Function1 transform) {
        Intrinsics.m32179h(transform, "transform");
        return new TransformingSequence(sequence, transform);
    }

    @NotNull
    /* renamed from: u */
    public static Sequence m33853u(@NotNull Sequence sequence, @NotNull Function1 transform) {
        Intrinsics.m32179h(transform, "transform");
        return m33843k(new TransformingSequence(sequence, transform));
    }

    /* renamed from: v */
    public static boolean m33854v(@NotNull Sequence sequence) {
        return !new GeneratorSequence$iterator$1((GeneratorSequence) sequence).hasNext();
    }

    @NotNull
    /* renamed from: w */
    public static Sequence m33855w(@NotNull Sequence sequence, @NotNull Iterable iterable) {
        return SequencesKt__SequencesKt.m33859a(m33858z(sequence, CollectionsKt.m32028k(iterable)));
    }

    @NotNull
    /* renamed from: x */
    public static Sequence m33856x(@NotNull Sequence sequence, Object obj) {
        return SequencesKt__SequencesKt.m33859a(m33858z(sequence, m33858z(obj)));
    }

    @NotNull
    /* renamed from: y */
    public static Sequence m33857y(@NotNull Sequence sequence, @NotNull Sequence sequence2) {
        return SequencesKt__SequencesKt.m33859a(m33858z(sequence, sequence2));
    }

    @NotNull
    /* renamed from: z */
    public static Sequence m33858z(@NotNull Object... objArr) {
        return objArr.length == 0 ? EmptySequence.f66683a : ArraysKt.m31958h(objArr);
    }
}
