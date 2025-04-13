package com.ncapdevi.fragnav.tabhistory;

import android.os.Bundle;
import com.ncapdevi.fragnav.FragNavPopController;
import com.ncapdevi.fragnav.FragNavTransactionOptions;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CurrentTabHistoryController.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/ncapdevi/fragnav/tabhistory/CurrentTabHistoryController;", "Lcom/ncapdevi/fragnav/tabhistory/BaseFragNavTabHistoryController;", "frag-nav_release"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes2.dex */
public final class CurrentTabHistoryController extends BaseFragNavTabHistoryController {
    public CurrentTabHistoryController(@NotNull FragNavPopController fragNavPopController) {
        super(fragNavPopController);
    }

    @Override // com.ncapdevi.fragnav.tabhistory.FragNavTabHistoryController
    /* renamed from: t0 */
    public void mo13843t0(int i2) {
    }

    @Override // com.ncapdevi.fragnav.tabhistory.FragNavTabHistoryController
    /* renamed from: u0 */
    public void mo13840u0(@Nullable Bundle bundle) {
    }

    @Override // com.ncapdevi.fragnav.tabhistory.FragNavTabHistoryController
    /* renamed from: v0 */
    public boolean mo13841v0(int i2, @Nullable FragNavTransactionOptions fragNavTransactionOptions) throws UnsupportedOperationException {
        return this.f24576a.mo13831a(i2, fragNavTransactionOptions) > 0;
    }

    @Override // com.ncapdevi.fragnav.tabhistory.FragNavTabHistoryController
    /* renamed from: w0 */
    public void mo13842w0(@NotNull Bundle bundle) {
    }
}
