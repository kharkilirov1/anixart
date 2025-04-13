package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.errorprone.annotations.DoNotMock;
import java.lang.Comparable;
import java.util.Map;

@DoNotMock
@Beta
@GwtIncompatible
/* loaded from: classes.dex */
public interface RangeMap<K extends Comparable, V> {
    /* renamed from: a */
    Map<Range<K>, V> mo11665a();
}
