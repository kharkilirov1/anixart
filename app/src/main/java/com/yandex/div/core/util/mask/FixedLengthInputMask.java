package com.yandex.div.core.util.mask;

import com.yandex.div.core.util.mask.BaseInputMask;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* compiled from: FixedLengthInputMask.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/util/mask/FixedLengthInputMask;", "Lcom/yandex/div/core/util/mask/BaseInputMask;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class FixedLengthInputMask extends BaseInputMask {

    /* renamed from: e */
    @NotNull
    public final Function1<Exception, Unit> f31492e;

    /* JADX WARN: Multi-variable type inference failed */
    public FixedLengthInputMask(@NotNull BaseInputMask.MaskData maskData, @NotNull Function1<? super Exception, Unit> function1) {
        super(maskData);
        this.f31492e = function1;
    }

    @Override // com.yandex.div.core.util.mask.BaseInputMask
    /* renamed from: j */
    public void mo16779j(@NotNull Exception exc) {
        this.f31492e.invoke(exc);
    }
}
