package com.ncapdevi.fragnav.tabhistory;

import android.os.Bundle;
import com.ncapdevi.fragnav.FragNavPopController;
import com.ncapdevi.fragnav.FragNavSwitchController;
import java.util.ArrayList;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CollectionFragNavTabHistoryController.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/ncapdevi/fragnav/tabhistory/CollectionFragNavTabHistoryController;", "Lcom/ncapdevi/fragnav/tabhistory/BaseFragNavTabHistoryController;", "Companion", "frag-nav_release"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes2.dex */
public abstract class CollectionFragNavTabHistoryController extends BaseFragNavTabHistoryController {

    /* renamed from: b */
    public final FragNavSwitchController f24577b;

    /* compiled from: CollectionFragNavTabHistoryController.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/ncapdevi/fragnav/tabhistory/CollectionFragNavTabHistoryController$Companion;", "", "", "EXTRA_STACK_HISTORY", "Ljava/lang/String;", "frag-nav_release"}, m31885k = 1, m31886mv = {1, 4, 0})
    public static final class Companion {
    }

    public CollectionFragNavTabHistoryController(@NotNull FragNavPopController fragNavPopController, @NotNull FragNavSwitchController fragNavSwitchController) {
        super(fragNavPopController);
        this.f24577b = fragNavSwitchController;
    }

    /* renamed from: a */
    public abstract int mo13836a();

    /* renamed from: b */
    public abstract int mo13837b();

    @NotNull
    /* renamed from: c */
    public abstract ArrayList<Integer> mo13838c();

    /* renamed from: d */
    public abstract void mo13839d(@NotNull ArrayList<Integer> arrayList);

    @Override // com.ncapdevi.fragnav.tabhistory.FragNavTabHistoryController
    /* renamed from: u0 */
    public void mo13840u0(@Nullable Bundle bundle) {
        ArrayList<Integer> integerArrayList;
        if (bundle == null || (integerArrayList = bundle.getIntegerArrayList("EXTRA_STACK_HISTORY")) == null) {
            return;
        }
        mo13839d(integerArrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0025 A[EDGE_INSN: B:12:0x0025->B:9:0x0025 BREAK  A[LOOP:0: B:2:0x0002->B:11:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0023 A[ADDED_TO_REGION] */
    @Override // com.ncapdevi.fragnav.tabhistory.FragNavTabHistoryController
    /* renamed from: v0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean mo13841v0(int r5, @org.jetbrains.annotations.Nullable com.ncapdevi.fragnav.FragNavTransactionOptions r6) throws java.lang.UnsupportedOperationException {
        /*
            r4 = this;
            r0 = 0
            r1 = 0
        L2:
            com.ncapdevi.fragnav.FragNavPopController r2 = r4.f24576a
            int r2 = r2.mo13831a(r5, r6)
            r3 = 1
            if (r2 <= 0) goto Ld
            int r5 = r5 - r2
            goto L1e
        Ld:
            int r2 = r4.mo13837b()
            if (r2 <= r3) goto L20
            com.ncapdevi.fragnav.FragNavSwitchController r1 = r4.f24577b
            int r2 = r4.mo13836a()
            r1.mo13835a(r2, r6)
            int r5 = r5 + (-1)
        L1e:
            r1 = 1
            goto L21
        L20:
            r3 = 0
        L21:
            if (r5 <= 0) goto L25
            if (r3 != 0) goto L2
        L25:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ncapdevi.fragnav.tabhistory.CollectionFragNavTabHistoryController.mo13841v0(int, com.ncapdevi.fragnav.FragNavTransactionOptions):boolean");
    }

    @Override // com.ncapdevi.fragnav.tabhistory.FragNavTabHistoryController
    /* renamed from: w0 */
    public void mo13842w0(@NotNull Bundle bundle) {
        ArrayList<Integer> mo13838c = mo13838c();
        if (mo13838c.isEmpty()) {
            return;
        }
        bundle.putIntegerArrayList("EXTRA_STACK_HISTORY", mo13838c);
    }
}
