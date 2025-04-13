package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.errorprone.annotations.DoNotMock;
import java.lang.Comparable;
import java.util.Set;

@DoNotMock
@Beta
@GwtIncompatible
/* loaded from: classes.dex */
public interface RangeSet<C extends Comparable> {
    /* renamed from: a */
    Set<Range<C>> mo11667a();
}
