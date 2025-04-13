package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Predicate;
import java.util.Map;

@GwtCompatible
/* loaded from: classes.dex */
interface FilteredMultimap<K, V> extends Multimap<K, V> {
    /* renamed from: f */
    Predicate<? super Map.Entry<K, V>> mo11549f();

    /* renamed from: s */
    Multimap<K, V> mo11550s();
}
