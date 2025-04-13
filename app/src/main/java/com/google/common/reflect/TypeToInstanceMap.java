package com.google.common.reflect;

import com.google.common.annotations.Beta;
import com.google.errorprone.annotations.DoNotMock;
import java.util.Map;

@DoNotMock
@Beta
/* loaded from: classes2.dex */
public interface TypeToInstanceMap<B> extends Map<TypeToken<? extends B>, B> {
}
