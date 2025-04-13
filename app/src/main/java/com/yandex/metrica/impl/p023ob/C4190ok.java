package com.yandex.metrica.impl.p023ob;

import android.annotation.TargetApi;
import android.telephony.CellIdentityGsm;
import com.yandex.metrica.DoNotInline;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(m31882bv = {1, 0, 3}, m31883d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\n"}, m31884d2 = {"Lcom/yandex/metrica/impl/ob/ok;", "Lcom/yandex/metrica/impl/ob/nk;", "Landroid/telephony/CellIdentityGsm;", "cellIdentity", "", "a", "(Landroid/telephony/CellIdentityGsm;)Ljava/lang/Integer;", "b", "<init>", "()V", "mobmetricalib_publicBinaryProdRelease"}, m31885k = 1, m31886mv = {1, 1, 15})
@TargetApi
@DoNotInline
/* renamed from: com.yandex.metrica.impl.ob.ok */
/* loaded from: classes2.dex */
public final class C4190ok implements InterfaceC4164nk<CellIdentityGsm> {
    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4164nk
    @NotNull
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public Integer mo20466b(@NotNull CellIdentityGsm cellIdentity) {
        return Integer.valueOf(cellIdentity.getMcc());
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4164nk
    @NotNull
    /* renamed from: b, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public Integer mo20465a(@NotNull CellIdentityGsm cellIdentity) {
        return Integer.valueOf(cellIdentity.getMnc());
    }
}
