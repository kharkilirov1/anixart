package kotlin.text;

import kotlin.Metadata;
import kotlin.collections.CharIterator;

/* compiled from: Strings.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"kotlin/text/StringsKt__StringsKt$iterator$1", "Lkotlin/collections/CharIterator;", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class StringsKt__StringsKt$iterator$1 extends CharIterator {

    /* renamed from: b */
    public int f66902b;

    /* renamed from: c */
    public final /* synthetic */ CharSequence f66903c;

    @Override // kotlin.collections.CharIterator
    /* renamed from: a */
    public char mo31987a() {
        CharSequence charSequence = this.f66903c;
        int i2 = this.f66902b;
        this.f66902b = i2 + 1;
        return charSequence.charAt(i2);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f66902b < this.f66903c.length();
    }
}
