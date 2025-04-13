package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.DoNotMock;
import java.util.Map;

@DoNotMock
@GwtCompatible
/* loaded from: classes.dex */
public interface ClassToInstanceMap<B> extends Map<Class<? extends B>, B> {
}
