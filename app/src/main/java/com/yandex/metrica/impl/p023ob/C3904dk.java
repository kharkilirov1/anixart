package com.yandex.metrica.impl.p023ob;

import android.annotation.TargetApi;
import android.telephony.CellIdentityLte;
import android.telephony.CellIdentityWcdma;
import com.yandex.metrica.DoNotInline;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

@Metadata(m31882bv = {1, 0, 3}, m31883d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0005\u0010\b¨\u0006\u000b"}, m31884d2 = {"Lcom/yandex/metrica/impl/ob/dk;", "", "Landroid/telephony/CellIdentityWcdma;", "cellIdentity", "", "a", "(Landroid/telephony/CellIdentityWcdma;)I", "Landroid/telephony/CellIdentityLte;", "(Landroid/telephony/CellIdentityLte;)I", "<init>", "()V", "mobmetricalib_publicBinaryProdRelease"}, m31885k = 1, m31886mv = {1, 1, 15})
@TargetApi
@DoNotInline
/* renamed from: com.yandex.metrica.impl.ob.dk */
/* loaded from: classes2.dex */
public final class C3904dk {

    /* renamed from: a */
    @NotNull
    public static final C3904dk f44971a = new C3904dk();

    private C3904dk() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final int m19772a(@NotNull CellIdentityWcdma cellIdentity) {
        return cellIdentity.getUarfcn();
    }

    @JvmStatic
    /* renamed from: a */
    public static final int m19771a(@NotNull CellIdentityLte cellIdentity) {
        return cellIdentity.getEarfcn();
    }
}
