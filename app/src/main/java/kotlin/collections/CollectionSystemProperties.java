package kotlin.collections;

import kotlin.Metadata;
import kotlin.jvm.JvmField;

/* compiled from: CollectionsJVM.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlin/collections/CollectionSystemProperties;", "", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class CollectionSystemProperties {

    /* renamed from: a */
    @JvmField
    public static final boolean f63138a;

    static {
        String property = System.getProperty("kotlin.collections.convert_arg_to_set_in_removeAll");
        f63138a = property != null ? Boolean.parseBoolean(property) : false;
    }
}
